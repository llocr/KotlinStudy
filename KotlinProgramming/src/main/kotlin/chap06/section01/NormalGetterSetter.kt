package chap06.section01

class User2(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User2(1, "Kildong", 30)
    //user1.id = 2
    user1.age = 35
    println("user1.age = ${user1.age}")
}