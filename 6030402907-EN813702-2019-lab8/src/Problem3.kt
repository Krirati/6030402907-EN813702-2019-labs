fun main(args: Array<String>) {
    println("canAddFish(10.0, listOf(3,3,3)) ---> ${canAddFish(10.0, listOf(3,3,3))}")
    println("canAddFish(8.0, listOf(2,2,2), hasDecorations = false) ---> ${canAddFish(8.0, listOf(2,2,2), hasDecorations = false)}")
    println("cadAddFish(9.0, listOf(1,1,3),3) ---> ${canAddFish(9.0, listOf(1,1,3), 3)}")
    println("canAddFish(9.0, listOf(),7,true ---> ${canAddFish(9.0, listOf(),7,true)}")
}
fun canAddFish (tank: Double, currentFish: List<Int>, fishSize: Int =2 , hasDecorations: Boolean = true): Boolean {
    var sizeTank : Double = if (hasDecorations) tank*0.8 else tank
    for (i in currentFish) sizeTank -= i
    sizeTank -= fishSize
    val calculate: Boolean = sizeTank>=0
    return calculate
}