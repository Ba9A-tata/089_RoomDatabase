package com.example.roomdatabase.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.roomdatabase.repositori.RepositoriSiswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())

}