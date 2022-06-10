package ru.netology.service
import ru.netology.data.Post


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


    var posts = emptyArray<Post>()
    var propertyId = 0

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


//    fun findById(id: Int) {
//        for ((index, post) in  posts.withIndex())
//            if (post.id == id) {
//                posts[index] = post.copy(likes = post.likes + 1)
//            }
//        }
    }


