/*
package chap07.section02

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunction
import kotlin.reflect.full.memberProperties

class User(val id: Int, val name: String, var grade: String = "Normal") {
    fun check() {
        if (grade == "Normal") println("You need to get the Silver Grade")
    }
}

fun main() {
    println(User::class)
    var classInfo = User::class
    classInfo.memberProperties.forEach {
        println("Property name = ${it.name}, type: ${it.returnType}")
    }
    classInfo.memberFunctions.forEach {
        println("Function name: ${it.name}, type: ${it.returnType}")
    }
    getKotlinType(User::class)
}

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}*/
