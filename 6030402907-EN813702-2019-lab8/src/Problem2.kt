fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is : $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortune(birthday: String): String {
    val list = listOf("You will have a great day!", "Things will go well for you today."
        , "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!", "Treasure your friends because they are they greatest fortune")
    return when (birthday.toIntOrNull()) {
        in 1..7 -> "Have a good start the first week of month"
        in 8..27 -> list[birthday.toInt()%list.size]
        in 28..31 -> "Enjoy that last days of mouth"
        else -> "Please enter a valid birthday (1-31)"
    }
}

fun getBirthday(): String {
    print("Enter your birthday: ")
    return readLine().toString()
}