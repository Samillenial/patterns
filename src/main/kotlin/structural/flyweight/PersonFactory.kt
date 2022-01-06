package structural.flyweight

object PersonFactory {
    private val persons = mutableListOf<Person>()

    fun getPerson( value: Person ): Person{

        persons.forEach { person ->
            if( value == person ) {
                println("SE HA ENCONTRADO PERSONA $value")
                return person
            }
        }

        persons.add(value.copy())
        println("SE HA AGREGADO PERSONA $value")
        return persons.last()
    }
}