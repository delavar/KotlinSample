package ir.sharif.retrofit_14

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("/users/{user}")
    suspend fun getUserInfo(@Path("user") user: String): GitHubUser
}
