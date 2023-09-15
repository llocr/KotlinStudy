package chap05.section02.secondary

//주 생성자가 없고 여러 개의 부 생성자를 가진 클래스
class Bird {
    var name : String
    var wing : Int
    var beak : String
    var color : String

    //첫번째 부 생성자
    constructor(name : String, wing : Int, beak : String, color : String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    //두번째 부 생성자
    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird("myBird", 2, "short", "blue")

    coco.color="yellow"
    println("coco.color = ${coco.color}")
    coco.fly()
    coco.sing(3)

    val toto = Bird("myBird2", "long")
}
