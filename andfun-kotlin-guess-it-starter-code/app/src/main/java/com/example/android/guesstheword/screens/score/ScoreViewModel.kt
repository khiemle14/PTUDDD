package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    /** Bool to check if restart? */
    // internal
    private val _eventPlayAgain = MutableLiveData<Boolean>()
    // external
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    /** The current score */
    // internal
    private val _score = MutableLiveData<Int>()
    // external
    val score: LiveData<Int>
        get() = _score

    init {
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }

    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}