package Day3

import java.io.File

fun main() {
    var lines = File("src/main/kotlin/Day3/Day3PuzzleInput").readLines()
        .map { it.toList().map { Character.getNumericValue(it) } }

    var oxygen = getReading(lines)
    var co2 = getReading(lines, { x -> if(x==1) 0 else 1})

    println("$oxygen $co2  ${oxygen * co2}")
}
fun getReading(data: List<List<Int>>, xorMask:(Int)->Int = { x->x}): Int{
    var readings = data
    var i = 0
    while(readings.size>1) {
        var mcb = getMostCommonBits(readings).map(xorMask)
        readings = readings.filter { it[i] == mcb[i] }
        i++;
    }
    return readings[0].joinToString("").toInt(2)
}

fun getMostCommonBits(lines: List<List<Int>>):List<Int>{
    val collapsed = lines.fold(List(lines[0].size,{0})) { acc, l ->
        acc.zip(l) { x1, x2 -> x1 + x2 }
    }
    return collapsed.map { if (it >= (lines.size / 2.0)) 1 else 0 }
}
