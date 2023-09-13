package chap02.section03

fun main() {
    var a : Any = 1
    a = 20L
    println("a = ${a} " + "type = ${a.javaClass}") //a의 자바 기본형을 출력
}