package structural.flyweight

class Patient( value: Person) {
    val person = PersonFactory.getPerson(value)
    var doctor = ""
    var disease = ""

    override fun toString(): String {
        return "PATIENT: $person.toString()"
    }
}