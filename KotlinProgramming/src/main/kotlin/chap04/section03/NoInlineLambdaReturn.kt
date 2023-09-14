package chap04.section03

fun main() {
    retFunc2()
}

fun inlineLambda2(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc2() {
    println("start of retFunc")
    /* 라벨을 사용한 람다식의 변화
    inlineLambda2(13, 3) lit@{ a, b ->
        val result = a + b
        if(result > 10) return@lit
        println("result = ${result}")
    }*/

    /* 암묵적 라멜
    inlineLambda2(13, 3) { a, b ->
        val result = a + b
        if(result > 10) return@inlineLambda2
        println("result = ${result}")
    }*/

    inlineLambda2(13, 3, fun(a,b) {
        val result = a + b
        if (result > 10) return
        println("result = ${result}")
    })

    println("end of retFunc")
}