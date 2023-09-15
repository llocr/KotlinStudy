package chap05.section06.dependency

//필기. 의존관계 - 한 클래스가 다른 클래스에 의존되어 있어 영향을 주는 경우 의존(Dependency) 관계라고 합니다.

class Patient(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient : $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {
    val customerId: Int = p.id

    fun patientList() {
        println("Doctor : $name, Patient: ${p.name}")
        println("customerId = ${customerId}")
    }
}

fun main() {
    val patient = Patient("kildong", 1234)
    val doctor = Doctor("kimsabu", patient)
    doctor.patientList()
}
