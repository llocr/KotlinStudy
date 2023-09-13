package chap03.section05.crossinline

fun main() {
    shortFunc(3) {
        println("first call: $it")
    }
}

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc{ out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}