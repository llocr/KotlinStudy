package chap02.section04

fun main() {
    var x = 4
    var y = 0b000_1010 //10진수 5
    var z = 0x0f //10진수 15

    println("x shl 2 = ${x shl 2}")
    println("x.inv() = ${x.inv()}")

    println("y shr 2 -> ${y/4} ${y shr 2}")
    println("x shl 4 -> ${x*16} ${x shl 4}")
    println("z shl 4 -> ${z*16} ${z shl 4}")

    x = 64
    println("x shr 2 -> ${x/4} ${x shr 2}")
}