package com.technibyte.celsiustofahrenheit_smartconv.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is SmartConv Fragment"
    }
    val text: LiveData<String> = _text
}