package chap02.section03

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null


    println("str1 = ${str1}")
    println("str1.length = ${str1?.length}") //str1을 세이프콜로 안전하게 호출
//    println("str1.length = ${str1!!.length}") //NPE 강제 발생

    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 lenth: ${len}")
}