package chap03.section03

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean { //람다식 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}