package chap05.section06.association

//필기. 연관관계 - 두 개의 서로 분리된 클래스가 연결을 가지는 것

class Patient(val name: String) {
    fun doctorList(d: Doctor) {
        println("Patient name = ${name}")
        println("Doctor name = ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor name = ${name}")
        println("Patient name = ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("kimsabu")
    val patient1 = Patient("kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}