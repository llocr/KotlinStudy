package chap04.section03

class InvalidNameException(message: String) : Exception(message)

fun main() {
    var name = "Kildong123"

    try {
        validateName(name)
    } catch (e : InvalidNameException) {
        println(e.message)
    } catch (e : Exception) {
        println(e.message)
    }
}

fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*"))) { //이름에 숫자가 포함되어 있으면 예외 발생
        throw InvalidNameException("Your name : $name : contains numerals.")
    }

}