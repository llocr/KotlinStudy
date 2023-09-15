package chap05.section05.privatetest

private class PrivateClass {
    private  var i = 1
    private  fun pritvateFunc() {
        i += 1
    }
    fun access() {
        pritvateFunc()
    }
}

class OtherClass {
//    val opc = PrivateClass() 불가, 프로퍼티 opc는 private 되어야 함
    fun test() {
        val pc = PrivateClass() // 생성 가능
    }
}

fun main() {
    val pc = PrivateClass()
//    pc.i 접근 불가
//    pc.privateFunc() 접근 불가
}

fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}
