package com.technibyte.celsiustofahrenheit_smartconv.ui.mathBehind

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MathBehindViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is mathBehind Fragment"
    }
    val text: LiveData<String> = _text
}