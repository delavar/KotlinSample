package ir.sharif.function_7

private fun repeatN(n: Int, action: () -> Unit) {
    /*(1..n).forEach {
        action.invoke()
    }*/
    for (i in 1..n){
        action()
    }
}

fun main() {
    /*repeatN(n = 5, action = {
    })*/
    repeatN(n = 5) {
        println("ok")
    }
}