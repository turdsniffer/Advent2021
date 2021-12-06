package Day1

import java.io.File

fun main() {

    val lines = File("src/main/kotlin/Day1/Day1PuzzleInput").readLines().map { l -> l.toInt() }
    val res = lines.windowed(3)
        .map { l-> l.reduce{ prev,cur -> prev+cur}}
        .zipWithNext()
        .fold(0) { acc, pair -> if (pair.second.toInt() > pair.first.toInt()) acc + 1 else acc };
    println(res)

}
