package chap07.section01

interface Pet {
    var category: String //abstract 키워드가 없어도 기본은 추상 프로퍼티
    val msgTag: String  //val 선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet"

    var species: String

    fun feeding()       //추상 메서드
    fun patting() {     //일반 메서드 : 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep patting!") //구현부
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override var species: String = "cat"

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
//    val obj = Cat("small")
//    println("obj.category = ${obj.category}")
//    println("obj.msgTag = ${obj.msgTag}")
//    obj.feeding()
//    obj.patting()
}