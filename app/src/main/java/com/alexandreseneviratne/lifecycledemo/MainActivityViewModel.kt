package com.alexandreseneviratne.lifecycledemo

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var clickedCount = 0

    fun getInitialCount(): Int {
        return clickedCount
    }

    fun getCurrentCount(): Int {
        clickedCount += 1
        return clickedCount
    }
}