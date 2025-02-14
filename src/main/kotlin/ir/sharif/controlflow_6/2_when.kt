package ir.sharif.controlflow_6

fun main() {
    withSubject()
    withoutSubject()
}

private fun withSubject() {
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> {
            "Slow down"
        }

        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    // Stop
}

private fun withoutSubject() {
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> {
            "Stop"
        }

        else -> "Malfunction"
    }

    println(trafficAction)
    // Stop
}
