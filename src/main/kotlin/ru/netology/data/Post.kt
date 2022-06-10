package ru.netology.data

import ru.netology.ru.netology.data.Comments
import ru.netology.ru.netology.data.Copyright
import ru.netology.ru.netology.data.Likes


open class Post(

    var id: Int,
    val date: Int,
    var ownerId: Int,
    var fromId: Int,
    val createdBy: Int,
    val authorName: String,
    val text: String?,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    var comments: Comments?,
    var copyright: Copyright?,
    var reposts: Repost?,
    val views: Long,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int,
    var items: Unit,
    var original: Post?,
    likes: Likes,

    ) {


    var likes = likes
        set (value) {
        if (value < 0) {
            return
        }
    field = value
    }
     get() = field + (original?.likes ?: 0)
}




