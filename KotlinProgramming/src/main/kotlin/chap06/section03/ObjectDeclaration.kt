package chap06.section03

object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!")
    }
}

class CCustomer {
    companion object {
        const val HELLO = "hello"
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World!")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("OCustomer.name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("CCustomer.name = ${CCustomer.name}")
    println("CCustomer.HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)

}