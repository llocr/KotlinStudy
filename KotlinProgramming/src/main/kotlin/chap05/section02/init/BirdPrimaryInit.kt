package chap05.section02.init

//프로퍼티의 기본값 지정
class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {

    //초기화 블록
    init {
        println("------------- 초기화 블록 시작 -------------")
        println("내 이름은 $name, 부리는 $beak")
        this.sing(3)
        println("------------- 초기화 블록 종료 -------------")
    }

     //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "red")

    coco.color = "yelllow"
    println("coco.color = ${coco.color}")
    coco.fly()

    val toto = Bird(beak = "long", color = "blue") //기본값이 있는 것은 생략하고 없는 것만 전달 가능
    println("toto.name = ${toto.name}")
    println("toto.wing = ${toto.wing}")
    println("toto.color = ${toto.color}")
    println("toto.beak = ${toto.beak}")
}