package ru.netology.ru.netology.data

import ru.netology.data.Post
import ru.netology.data.Repost
import ru.netology.domain.Attachment

class Comments (
    val count: Int,
    val canPost: Boolean,
    val groupCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
        )

{

    operator fun plus(any: Any): Comments? { TODO() }
    operator fun compareTo(i: Int): Int { TODO() }


    constructor() : this(4, true, false, false, true)
}


  class Post(

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
      comments: Comments?,
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
      var items: Array<Attachment>,
      var original: Post?,
      likes : Likes?,

      ) {

var comments = comments
    set(value) {
        if (value!! < 0) {
            return
        }
        field = value
    }
    get() = field?.plus((original?.comments ?: 0))



 fun comment(post: Post) {
    var comments = ((post.comments ?: post) as Comments?)

 }
}