package chap02.section02

fun main() {
    val number = 10
    var language = "Korean"
    val secondNumber : Int = 20
    language = "English"


    println("number = ${number}")
    println("language = ${language}")
    println("secondNumber = ${secondNumber}")

    var num: Double = 0.1

    for (x in 0..999) {
        num += 0.1
    }

    println(num) //100.09999999999859
}