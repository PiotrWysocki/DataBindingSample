package com.example.databindingsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LikesViewModel : ViewModel() {

    private val _name = MutableLiveData("Android Coding")
    val name: LiveData<String> = _name

    private val _yourLikes = MutableLiveData(0)
    val yourLikes: LiveData<Int> = _yourLikes

    fun increaseLikes() {
        _yourLikes.value = (_yourLikes.value ?: 0) + 1
    }
}