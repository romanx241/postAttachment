package ru.netology.service
import org.junit.Assert.assertEquals
import org.junit.Test
import ru.netology.PostNotFoundException
import ru.netology.ru.netology.data.Comments




class WallServiceTest(val wallService: WallService, val comment: Comments) {


    @Test

    fun shouldThrow(wallService: WallService, comment: Comments) {
        val post = wallService.posts[1]
        comment.id = post.id
        wallService.createComment(wallService.posts, comment)
        assertEquals(comment.id, post.id)
    }


    @Test(expected = PostNotFoundException::class)

    fun shouldThrowException(wallService: WallService, comment: Comments) {
        val post = wallService.posts[4]
        if(comment.id != post.id) {
            throw PostNotFoundException()
        }
        wallService.createComment(wallService.posts, comment)
    }
}

