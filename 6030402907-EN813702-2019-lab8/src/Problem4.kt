fun main(args: Array<String>) {
    print(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperatur: Int = 24): Any? {
    return when {
        mood =="happy" && weather =="sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}
