package ru.netology.service
import org.junit.Assert.assertEquals
import org.junit.Test
import ru.netology.Array
import ru.netology.PostNotFoundException
import ru.netology.data.Comment
import ru.netology.data.Post
import ru.netology.data.Repost
import ru.netology.domain.Attachment
import ru.netology.ru.netology.data.Comments
import ru.netology.ru.netology.data.Copyright
import ru.netology.ru.netology.data.Likes


class WallServiceTest() {
    val original1 = Post(
        id = 1,
        date = 4122003,
        ownerId = 1,
        fromId = 1,
        createdBy = 1590075360,
        authorName = "Нетология",
        text = "Новая Нетология",
        replyOwnerId = 2,
        replyPostId = 3,
        friendsOnly = 5,
        comments = Array<Comment>(),
        copyright = Copyright(1, " ", " ", " "),
        reposts = Repost(1, 4122003, 3, 4, 5, "Нетология", "Новая Нетология", 22),
        views = 30,
        postType = "copy",
        signerId = 5,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = 2,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 6,
        items = Array<Attachment>(),
        original = null,
        likes = Likes(4, true, true, false)
    )

    val original2 = Post(
        id = 2,
        date = 4122003,
        ownerId = 6,
        fromId = 7,
        createdBy = 1590075360,
        authorName = "Нетология",
        text = "Новая Нетология",
        replyOwnerId = 2,
        replyPostId = 3,
        friendsOnly = 5,
        comments = Array<Comment>(),
        copyright = Copyright(1, " ", " ", " "),
        reposts = Repost(1, 4122003, 3, 4, 5, "Нетология", "Новая Нетология", 21),
        views = 30,
        postType = "copy",
        signerId = 5,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = 2,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 6,
        items = Array<Attachment>(),
        original = null,
        likes = Likes(4, true, true, false)
    )

    val original3 = Post(
        id = 3,
        date = 4122003,
        ownerId = 5,
        fromId = 2,
        createdBy = 1590075360,
        authorName = "Нетология",
        text = "Новая Нетология",
        replyOwnerId = 2,
        replyPostId = 3,
        friendsOnly = 5,
        comments = Array<Comment>(),
        copyright = Copyright(1, " ", " ", " "),
        reposts = Repost(1, 4122003, 3, 4, 5, "Нетология", "Новая Нетология", 20),
        views = 30,
        postType = "copy",
        signerId = 5,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = 2,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 6,
        items = Array<Attachment>(),
        original = null,
        likes = Likes(4, true, true, false)
    )
    var wallService = WallService(original1, original2, original3)
    var comment1 = Comments(1, 3, 4092009, "популярный пост", 5, 7)
    var comment2 = Comments(4, 3, 4092009, "популярный пост", 5, 7)

    @Test

    fun shouldThrow() {
        val commentBoolean = wallService.createComment(comment1)
        assertEquals(true, commentBoolean)
    }


    @Test(expected = PostNotFoundException::class)

    fun shouldThrowException() {
        val commentBoolean = wallService.createComment(comment2)
        println(commentBoolean)

        if(commentBoolean == false) {
            throw PostNotFoundException()
        }
    }
}