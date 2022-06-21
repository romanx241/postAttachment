package ru.netology.ru.netology.data

import ru.netology.PostNotFoundException

import ru.netology.data.Post
import ru.netology.data.Repost
import ru.netology.domain.Attachment

class Comments(

    var id: Int,   //Идентификатор комментария.
    val from_id: Int,   //Идентификатор автора комментария.
    val data: Int,    //Дата создания комментария в формате Unixtime.
    var text: String,   //Текст комментария.
    val reply_to_user: Int,   //Идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
    val reply_to_comment: Int,  //Идентификатор комментария, в ответ на который оставлен текущий (если применимо).

) {

    override fun toString(): String {
        return ("$id, $from_id, $data, $text, $reply_to_user, $reply_to_comment")
    }
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
       comments: Array<Comments>,
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
      var likes : Likes?,
      var original1: Post,
      var original2: Post,
      var original3: Post,
      var posts: Array<Post> = arrayOf(original1, original2, original3)
      ) {



 fun comment(post: Post) {
    var comments = ((post.comments ?: post) as Comments?)

 }

    val comm1 = Comments(2, 3, 4092009, "популярный пост", 5, 7)
    val comm2 = Comments(2, 3, 4092009, "популярный пост", 5, 7)
    val comm3 = Comments(2, 3, 4092009, "популярный пост", 5, 7)

   var comments: Array<Comments> = arrayOf(comm1, comm2, comm3)



//    fun createComment(postId: Int, comment: Comments): Comments {
//        try {
//            for (post in posts) {
//                println(post.id)
//                if (post.id == postId) {
//                    comments[postId] = comment
//                    println("id совпадает")
//                } else {
//                    throw PostNotFoundException()
//                }
//            }
//        } catch (e : PostNotFoundException) {
//            println("id не совпадает")
//
//        }
//        return comment
//    }
}