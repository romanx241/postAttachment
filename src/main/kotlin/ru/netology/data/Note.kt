package ru.netology.data

data class Note (
    val id: Int,
    val ownerId: Int,
    val text: String,
    val comments: List<Comment> = emptyList()
    )

data class Comment(
    val id: Int,
    val noteId: Int,
    val ownerId: Int,
    val text: String)

data class NoteClassT<A, B>(var first: A, var second: B)

fun t () {
    var notesArray = emptyArray<NoteClassT<Int, Comment>>()
    val id = 1
    val notes = NoteClassT(id, Comment(1, 1, 1, " "))
    notesArray += notes
}