package ir.sharif.retrofit_14

import kotlinx.coroutines.runBlocking
import retrofit2.HttpException
import java.lang.Exception

suspend fun getUserInfo(username: String) {
    try {
        val user = Dependencies.gitHub.getUserInfo(username)
        println(user)
    } catch (e: HttpException) {
        // if backend respond with error
        // convert json to `ApiError` and print
        val error = Dependencies.gson.fromJson(
            e.response()?.errorBody()?.string(),
            ApiError::class.java
        )
        println(error)
    } catch (e: Exception) {
        println(e)
    }
}

fun main(): Unit = runBlocking {
    getUserInfo("pouyayarandi") // success request
    getUserInfo("kjncdksjnkjd") // failure request
    kotlin.system.exitProcess(0)
}
