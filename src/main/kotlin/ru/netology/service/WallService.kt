package ru.netology.service
import ru.netology.PostNotFoundException
import ru.netology.data.Post
import ru.netology.ru.netology.data.Comments
import ru.netology.ru.netology.data.Likes


class WallService(

    var original1: Post,
    var original2: Post,
    var original3: Post,
    var postArray: Array<Post> = arrayOf(original1, original2, original3)

) {


    init {
        postArray[0] = original1
        postArray[1] = original2
        postArray[2] = original3

    }


    var posts: Array<Post> = arrayOf(original1, original2, original3)
    val comm1 = Comments(2, 3, 4092009, "популярный пост", 5, 7)
    val comm2 = Comments(2, 3, 4092009, "популярный пост", 5, 7)
    val comm3 = Comments(2, 3, 4092009, "популярный пост", 5, 7)

    var comments: Array<Comments> = arrayOf(comm1, comm2, comm3)

    var propertyId = 0


    private fun <T> Array<T>.copy(likes: Likes) {}


    fun add(post: Post): Post {
        propertyId++
        post.id = propertyId
        posts += post
        return posts.last()
    }


    fun update(post: Post, updateWork: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index].ownerId = updateWork.ownerId
                posts[index].fromId = updateWork.fromId
                return true
            }
        }
        return false
    }

        fun createComment(posts: Array<Post>, comment: Comments): Comments {
            var flag = false
                try {
                    for (post in posts) {
                        if (post.id != comment.id) {
                            flag = true
                        } else {
                            println("id совпадает")
                        }
                    }
                    if(flag) {
                        println("id не совпадает")
                        throw PostNotFoundException()
                    }
                }
                catch (e : PostNotFoundException) {
                }
            return comment
        }
    }





