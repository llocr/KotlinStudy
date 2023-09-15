package chap05.section04.prisecon

class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) { // 주생성자
    val fName = println("[Property] Person fname :$firstName") //프로퍼티 할당

    init {
        println("[init] Person init block") //초기화 블록
    }

    //부생성자
    constructor(firstName: String, age : Int,
                out: Unit = println("[Secondary Constructor] Parameter")) : this(firstName) { //this는 주 생성자를 가리킴
        println("[Secondary Constructor] Body: $firstName, $age") //부생성자 본문
                }
}

fun main() {
    val p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}