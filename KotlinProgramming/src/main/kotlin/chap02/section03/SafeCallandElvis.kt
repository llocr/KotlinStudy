package chap02.section03

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: $str1?.length ?: -1")
}