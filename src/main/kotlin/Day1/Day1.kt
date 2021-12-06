package Day1

import java.io.File

fun main() {

    val lines = File("src/main/kotlin/Day1/Day1PuzzleInput").readLines().map { t-> t.toInt() }
    val res = lines.zipWithNext().fold(0) { acc, pair -> if (pair.second > pair.first) acc + 1 else acc };
    println(res)

}
