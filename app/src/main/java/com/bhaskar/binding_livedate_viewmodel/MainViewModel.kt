package com.bhaskar.binding_livedate_viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val quoteLiveDateObject = MutableLiveData("This is default data")

    fun updateLiveDate(){
        quoteLiveDateObject.value = "This is updated live data"
    }

}