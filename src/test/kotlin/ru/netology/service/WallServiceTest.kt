package ru.netology.service

import org.junit.Test
import ru.netology.PostNotFoundException
import ru.netology.ru.netology.data.Comments




class WallServiceTest(val wallService: WallService, val comment: Comments) {

    @Test

    fun shouldThrow(wallService: WallService, comment: Comments) {
       val post = wallService.posts[0]
        comment.id = post.id
        wallService.createComment(wallService.posts, comment)
    }

    @Test(expected = PostNotFoundException::class)

    fun shouldThrowException(wallService: WallService, comment: Comments) {
        val post = wallService.posts[0]
        comment.id = post.id
        wallService.createComment(wallService.posts, comment)
        throw PostNotFoundException()
    }
}

