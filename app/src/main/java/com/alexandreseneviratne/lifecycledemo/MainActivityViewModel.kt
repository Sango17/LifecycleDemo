package com.alexandreseneviratne.lifecycledemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var clickedCount = 0
    private val countLiveData = MutableLiveData<Int>()

    fun getInitialCount(): MutableLiveData<Int> {
        countLiveData.value = clickedCount
        return countLiveData
    }

    fun getCurrentCount() {
        clickedCount += 1
        countLiveData.value = clickedCount
    }
}