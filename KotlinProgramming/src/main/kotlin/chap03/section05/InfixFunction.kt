package chap03.section05

fun main() {
    //일반 표현법
//    val multi = 3.multiply(10)

    //중위 표현법
    val multi = 3 multiply 10
    println("multi = ${multi}")
}

// 중위함수
infix fun Int.multiply(x: Int): Int {
    return this * x
}
