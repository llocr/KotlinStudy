package chap07.section02

interface Switcher {
    fun on(): String
}

class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalSorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" //바깥 클래스의 프로퍼티 접근
    }

    fun powerOn(): String {
        class Led(val color: String) { //지역 클래스선언
            fun blink(): String = "Blinking $color on $model" //외부의 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red") //여기에서 지역 클래스가 사용됨
        val powerSwitcher = object : Switcher { //익명 객체를 사용해 Switcher의 on() 메서드 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitcher.on()
    }
}

fun main() {
    val mySdCard = Smartphone("S7").ExternalSorage(32)
    println(mySdCard.getInfo())

    val myphone = Smartphone("Note9")
    myphone.ExternalSorage(128)
    println(myphone.powerOn())
}