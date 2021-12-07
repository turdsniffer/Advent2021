package Day3

import java.io.File

fun main() {

    val lines = File("src/main/kotlin/Day3/Day3PuzzleInput").readLines()
        .map { it.toList().map { Character.getNumericValue(it) } }
    val collapsed = lines.fold(List(lines[0].size,{0})) { acc, l ->
        acc.zip(l) { x1, x2 -> x1 + x2 }
    }
    val res = collapsed.map { if (it > (lines.size / 2)) 1 else 0 }
    val gamma = res.joinToString(separator = "").toInt(2)
    val epsilon = gamma xor 4095


    println("$gamma $epsilon  ${gamma * epsilon}")


}
