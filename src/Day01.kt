import java.lang.Character.isDigit

fun main() {
    fun part1(input: List<String>): Int {
        var totalCal: Int = 0;
        for (line in input) {
            val firstNum = (line.first() { it.isDigit() })
            val lastNum = (line.last() { it.isDigit() })
            totalCal += ("$firstNum$lastNum").toInt()
        }
        return totalCal
    }

    fun part2(input: List<String>): Int {
        val numbersMap = mapOf(
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9
        )
        var totalCal: Int = 0;
        var numberArray = emptyArray<Int>()

        for (line in input) {
            val result = line.partition(::isDigit)


//            val match = numbersMap.keys.find { it in line}
            val stringNums = result.second.findAnyOf(numbersMap.keys).second
            val stringNums2 = result.second.findLastAnyOf(numbersMap.keys).second
            println(stringNums)
            println(stringNums2)

//            result.second.filterIndexedTo(numbersOnSameIndexAsValue) {  }
//            val test = line.takeLastWhile { !it.isDigit() }
//            println(result)
        }


//
//        for ((index, value) in input.withIndex()) {
//            if (value.toIntOrNull() != null) {
//                numberArray += if (value.toIntOrNull() != null) value.toInt() else calculateStringNumToInt()
//                    substringAfterLast
//            }
//            println(totalCal)
//        }
        return totalCal
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    part2(testInput)
//    check(part2(testInput) == 281)

    val input = readInput("Day01")
//    part1(input).println()
//    part2(input).println()
}
