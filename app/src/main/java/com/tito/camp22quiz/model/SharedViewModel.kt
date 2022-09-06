package com.tito.camp22quiz.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tito.camp22quiz.data.BibleVersions.selectedBibleVersions


class SharedViewModel: ViewModel() {

    private var _currentQuery = MutableLiveData<String>()
    val currentQuery: LiveData<String>
        get() = _currentQuery

    private var _version = MutableLiveData<BibleVersion>()
    val version: LiveData<BibleVersion>
        get() = _version


    private var _currentChapterPosition = MutableLiveData<Int>()
    val currentChapterPosition: LiveData<Int>
        get() = _currentChapterPosition

    init{
        _currentQuery.value = ""
        _version.value = selectedBibleVersions[0]
    }

    fun setCurrentChapterPosition(currentPosition: Int){
        _currentChapterPosition.value = currentPosition
    }

    fun setVersion(versionName: String){
        _version.value =
            selectedBibleVersions.find { it.versionName.equals(versionName, true) }
    }

    fun setCurrentQuery(query: String){
        _currentQuery.value = query
    }
}