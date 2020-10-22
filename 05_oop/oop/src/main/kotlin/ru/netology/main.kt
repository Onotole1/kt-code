package ru.netology

import ru.netology.data.NewPost
import ru.netology.data.Post
import ru.netology.data.RegularPost
import ru.netology.data.Repost
import ru.netology.service.WallService

fun main() {
//    val original = Post(
//        id = 1,
//        authorId = 1,
//        authorName = "Нетология",
//        content = "Новая Нетология",
//        created = 1590075360,
//        likes = 22
//    )
//    val liked = original.copy(likes = original.likes + 1)
//    println(liked)
//
//    val (id, _, author) = original
//    println("$id, $author")

    val original: Post = RegularPost(
        id = 1,
        authorId = 1,
        authorName = "Нетология",
        content = "Новая Нетология",
        created = 1590075360,
        likes = 22,
        null
        )

    val repost: Post = Repost(
        id = 1,
        authorId = 1,
        authorName = "Нетология",
        content = "Новая Нетология",
        created = 1590075360,
        likes = 22,
        original
    )

    val authorId = when (repost) {
        is RegularPost -> repost.authorId
        is Repost -> repost.authorId
        NewPost -> repost.id
    }
}



