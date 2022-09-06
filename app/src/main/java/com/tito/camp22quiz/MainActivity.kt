package com.tito.camp22quiz

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.tito.camp22quiz.databinding.ActivityMainBinding
import com.tito.camp22quiz.model.QuizViewModel
import com.tito.camp22quiz.model.SharedViewModel


class MainActivity : AppCompatActivity() {
    private val sharedViewModel: SharedViewModel by viewModels()
    private val quizViewModel: QuizViewModel by viewModels()
    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        sharedPref.apply{
            getString(getString(R.string.pref_key_version), null)?.let{ sharedViewModel.setVersion(it) }
            getStringSet(getString(R.string.pref_key_chosen_question_ids), emptySet()).let{quizViewModel.setChosenQuestions(it!!)}
            getString(getString(R.string.ids_current_questions), "").let{quizViewModel.setIdsCurrentQuestions(it!!)}
            Log.d("Camp22", "questions loaded ${getString(getString(R.string.ids_current_questions), "")}")
        }

        (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment)
            .also{
                navController = it.navController
            }

        appBarConfiguration = AppBarConfiguration(setOf(R.id.homeScreenFragment), drawerLayout = null)
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onStop() {
        super.onStop()
        sharedPref.edit().apply{
            sharedViewModel.version.value?.let {
                putString("version", it.versionName)
            }
            putStringSet(getString(R.string.pref_key_chosen_question_ids),
//                quizViewModel.chosenQuestionIds
                emptySet()
            )
            putString(getString(R.string.ids_current_questions),
                quizViewModel.idsCurrentQuestions
//                ""
            )
            apply()
        }
    }
}