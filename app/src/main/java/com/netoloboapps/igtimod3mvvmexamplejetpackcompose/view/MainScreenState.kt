package com.netoloboapps.igtimod3mvvmexamplejetpackcompose.view

import com.netoloboapps.igtimod3mvvmexamplejetpackcompose.model.Note

data class MainScreenState(
    val notes: List<Note>,
    val isLoading: Boolean,
    val error: String? = null
)
