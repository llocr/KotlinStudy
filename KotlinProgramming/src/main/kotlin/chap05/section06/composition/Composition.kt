package chap05.section06.composition

//필기. 구성관계 - 집합 관계와 거의 동일하지만 특정 클래스가 어느 한 클래스의 부분이 되는 것

class Car(val name: String, val power: String) {
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    val car = Car("Tico", "100hp")
    car.startEngine()
    car.stopEngine()
}