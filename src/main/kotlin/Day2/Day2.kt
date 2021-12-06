package Day2

import java.io.File

fun main() {

    val lines = File("src/main/kotlin/Day2/Day3PuzzleInput").readLines()
    val groups = lines.map { it.split(" ") }.groupBy ({it[0].trim()} , {it[1].trim().toInt()})
    val horizontalPosition = groups["forward"]!!.sum()
    val verticalPosition = groups["down"]!!.sum() - groups["up"]!!.sum()
    println("$horizontalPosition  $verticalPosition")
    println(horizontalPosition * verticalPosition)


}
