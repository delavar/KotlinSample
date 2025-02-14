package ir.sharif.class_8

interface DataProvider{
    fun restoreData():String
}

object DefaultDataProvider : DataProvider {
    override fun restoreData(): String {
        return  "Data"
    }
}

// Declares a Singleton object to manage data providers
object DataProviderManager {
    private val providers = mutableListOf<DataProvider>()

    // Registers a new data provider
    fun registerDataProvider(provider: DataProvider) {
        providers.add(provider)
    }

    // Retrieves all registered data providers
    val allDataProviders: Collection<DataProvider>
        get() = providers
}

class User(val name: String) {
    // Defines a companion object that acts as a factory for creating User instances
    companion object Factory {
        fun create(name: String): User = User(name)
    }
}

fun main() {
    println(DefaultDataProvider.restoreData())
    DataProviderManager.registerDataProvider(DefaultDataProvider)

    val userInstance = User.create("John Doe")
    println(userInstance.name)
}
