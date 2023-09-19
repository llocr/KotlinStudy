package chap06.section03

class Person {
    val id: Int = 0
    var name: String = "Yongdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
//    println(Person.name) name은 컴패니언 객체가 아니므로 오류가 남
}