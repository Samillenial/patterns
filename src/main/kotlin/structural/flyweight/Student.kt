package structural.flyweight

class Student( value: Person ) {
    private val person = PersonFactory.getPerson(value)
    var carrier = ""
    var semester = 0

    override fun toString(): String {
        return "STUDENT: $person.toString()"
    }
}