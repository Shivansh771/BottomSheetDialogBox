package com.example.bottomsheetmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskVeiewModel :ViewModel(){
    var name=MutableLiveData<String>()
    var desc=MutableLiveData<String>()

}