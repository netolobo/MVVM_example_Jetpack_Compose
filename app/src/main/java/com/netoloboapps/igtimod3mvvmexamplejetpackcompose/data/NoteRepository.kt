package com.netoloboapps.igtimod3mvvmexamplejetpackcompose.data

import com.netoloboapps.igtimod3mvvmexamplejetpackcompose.model.Note

class NoteRepository {
    private val noteList: MutableList<Note> = arrayListOf()

    fun save(note: Note) {
        noteList.add(note)
    }

    fun delete(note: Note) {
        noteList.remove(note)
    }

    fun returnList() = noteList.toList()
}