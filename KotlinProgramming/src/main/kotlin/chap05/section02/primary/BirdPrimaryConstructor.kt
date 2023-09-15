package chap05.section02.primary

class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // 프로퍼티는 매개변수 안에 var를 사용해 프로퍼티로서 선언되어 본문에서는 생략됨

    //메서드
    fun fly() = println("fly wing : $wing")
    fun sing(vol : Int) = println("sing vol : $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color = ${coco.color}")
    coco.fly()
    coco.sing(3)
}