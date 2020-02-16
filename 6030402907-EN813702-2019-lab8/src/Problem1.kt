import java.util.*

fun main(args: Array<String>) {
    print(getFortuneCookie())
}

fun getFortuneCookie(): String {
    val list = listOf<String>("You will have a great day!", "Things will go well for you today."
        , "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!", "Treasure your friends because they are they greatest fortune")
    print("Enter your birthday: ")
    var birthday = readLine()
    val birthday2 : Int = if (birthday?.toIntOrNull() !== null) birthday.toInt() else -1
    return if (birthday2 == -1 ) {
        "Please enter your birthday"
    } else {
        val  fortune = ("Your fortune is: ${list[birthday2.rem(list.size)]}")
        fortune
    }
}
