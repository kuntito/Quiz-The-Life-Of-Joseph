package com.tito.camp22quiz.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tito.camp22quiz.data.quiz_questions.Questions.allQuestions
//const val questions_per_set = 212

/** minimum of three questions per set*/
const val questions_per_set = 15
const val comma = ","
class QuizViewModel: ViewModel() {
    /**all questions minus the ones that have been chosen*/
    private lateinit var totalQuestionsLeft: MutableList<Question>

    private val _quizStarted = MutableLiveData(false)
    val quizStarted: LiveData<Boolean>
        get() = _quizStarted

    private val _currentQuestionPosition = MutableLiveData(0)
    val currentQuestionPosition: LiveData<Int>
        get() = _currentQuestionPosition

    fun setCurrentChapterPosition(value: Int){
        _currentQuestionPosition.value = value
    }

    var chosenQuestionIds = mutableSetOf<String>()

    private var _idsCurrentQuestions = ""
    val idsCurrentQuestions: String
        get() = _idsCurrentQuestions


    val questionSet: List<Question>
        get(){
            val questions = mutableListOf<Question>()
            for (questionId in _idsCurrentQuestions.split(comma)){
                allQuestions.find { questionId == it.id.toString() }?.let {
                    questions.add(
                        it
                    )
                }
            }
            return questions
        }

    fun setQuizStarted(x: Boolean){
        _quizStarted.value = x
    }

    fun setChosenQuestions(questionIds: MutableSet<String>){
        chosenQuestionIds.addAll(questionIds)
        totalQuestionsLeft = allQuestions.filterNot {
//            chosenQuestionIds.contains(it.id.toString())
            it.id.toString() in chosenQuestionIds
        }.toMutableList()
    }

    private fun resetQuestions(){
        questionSet.let{
            if (it.isNotEmpty()){
                for (question in it){
                    question.selectedOptionId = null
                    question.selectedAnswer = null
                }
            }
        }
    }


    fun setNewQuestions(){
        resetQuestions()
        if (totalQuestionsLeft.size < questions_per_set){
            totalQuestionsLeft.clear()
            totalQuestionsLeft.addAll(allQuestions)
            chosenQuestionIds.clear()
        }
        val tempQuestionSet = totalQuestionsLeft.shuffled().take(questions_per_set)
        val setQuestionIds = tempQuestionSet.map{it.id.toString()}.toMutableSet()
        setChosenQuestions(setQuestionIds)
        setIdsCurrentQuestions(setQuestionIds.joinToString(comma))
//        totalQuestionsLeft.removeAll(questionSet)
    }


    fun setIdsCurrentQuestions(questionIds: String){
        val questionIdsList = questionIds.split(comma)
        if (questionIdsList.size == questions_per_set){
            _idsCurrentQuestions = questionIds
            setChosenQuestions(questionIdsList.toMutableSet())
        }else{
            setNewQuestions()
        }
    }
}