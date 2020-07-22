package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import javax.xml.transform.Transformer

class ScoreViewModel(finalScore: Int) : ViewModel() {
    private val _score = MutableLiveData<Int>()
    val scoreText: LiveData<String> = Transformations.map(_score) {
        it.toString()
    }

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init {
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }

    fun onPlayAgainFinished() {
        _eventPlayAgain.value = false
    }
}