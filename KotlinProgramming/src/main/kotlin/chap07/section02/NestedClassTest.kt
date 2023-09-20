package chap07.section02

class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv"
        fun accessOuter() { //컴패니언 객체는 접근할 수 있음
            println(country)
            getSomething()
        }
    }

    fun outside() {
        val msg = Nested().greeting()
        println("[Outer]: $msg, ${Nested().nv}")
    }

    companion object { //컴패니언 객체는 static처럼 접근 가능
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}

fun main() {
    val output = Outer.Nested().greeting()
    println(output)

//    Outer.outside()   외부 클래스의 경우는 객체를 생성해야 함
    val outer = Outer()
    outer.outside()
}
