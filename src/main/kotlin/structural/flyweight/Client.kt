package structural.flyweight

private fun createStudents( person: Person){
    val student1 = Student( person )
    val student2 = Student( person )
    val student3 = Student( person )
    println("$student1 \n $student2 \n $student3")
}

private fun createPatients( person: Person){
    val patient1 = Patient( person )
    val patient2 = Patient( person )
    val patient3 = Patient( person )
    println("$patient1 \n $patient2 \n $patient3")
}

fun main(){
    val person = Person("SAMUEL", "ESTEPA", "132456798", 36)
    createStudents(person)
    person.age = 10
    createPatients(person)
}