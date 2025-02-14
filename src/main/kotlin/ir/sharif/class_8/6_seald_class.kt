package ir.sharif.class_8.data_class

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("✅ Success: ${result.data}")
        is Result.Error -> println("❌ Error: ${result.message}")
        Result.Loading -> println("⏳ Loading...")
    }
}

fun main() {
    val success = Result.Success("Data Loaded")
    val error = Result.Error("Network Error")
    val loading = Result.Loading

    handleResult(success)
    handleResult(error)
    handleResult(loading)
}
