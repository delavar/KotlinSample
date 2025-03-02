package ir.sharif.retrofit_14

import com.google.gson.annotations.SerializedName

data class GitHubUser(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("bio") val bio: String,
    @SerializedName("company") val company: String,
)
