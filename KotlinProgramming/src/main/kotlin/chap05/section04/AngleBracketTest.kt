package chap05.section04

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A class a()")
}

interface B {
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}

class C : A(), B {
    // 컴파일 되려면 f() 오버라이딩 되어야 함 | A와 B에 f() 메서드의 이름이 중복되기 때문
    override  fun f() = println("C class f()")

    fun test() {
        f()
        b()
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c = C()
    c.test()
}