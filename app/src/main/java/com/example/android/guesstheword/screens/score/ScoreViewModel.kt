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

    init {
        _score.value = finalScore
    }
}