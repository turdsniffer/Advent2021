package Day2

import java.io.File

fun main() {
    val lines = File("src/main/kotlin/Day2/Day3PuzzleInput").readLines().map { it.split(" ") }
    val res = lines.fold(object{ var aim= 0; var depth = 0; var xPos = 0}) { acc, cur ->
        val value = cur[1].toInt();
        when (cur[0]) {
            "forward" -> {
                acc.xPos += value
                acc.depth += value * acc.aim
            }
            "down" -> acc.aim += value.toInt()
            "up" -> acc.aim -= value.toInt()
        }
        acc
    }
    println("${res.xPos}  ${res.depth}")
    println(res.xPos * res.depth)


}
