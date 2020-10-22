package ru.netology.data

sealed class Post {
    abstract val id: Long
}

data class RegularPost(
    override val id : Long,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: Long,
    val likes: Int,
    val orignal: Post?
) : Post()

data class Repost(
    override val id: Long,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: Long,
    val likes: Int,
    val orignal: Post?
) : Post()

object NewPost: Post() {
    override val id: Long
        get() = 100L
}