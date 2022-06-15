package ru.netology.service

import org.junit.Test
import ru.netology.PostNotFoundException
import ru.netology.ru.netology.data.Comments



class WallServiceTest(var wallService: WallService, var comments: Comments) {

    @Test

    fun shouldThrow(wallService: WallService, comments: Comments): String {
       val post = wallService.posts[1]
        val id = post.id
        val comment = wallService.createComment(id, comments)
        return comment.toString()
    }

    @Test(expected = PostNotFoundException::class)

    fun shouldThrowException(wallService: WallService, comments: Comments): PostNotFoundException {
        val post = wallService.posts[9]
        val id = post.id
        wallService.createComment(id, comments)
        return PostNotFoundException()
    }
}



