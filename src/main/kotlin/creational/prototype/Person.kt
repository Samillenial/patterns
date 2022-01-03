package creational.prototype

class Prueba(var value: Int = 0, var name: String = ""):Cloneable{
    public override fun clone(): Any {
        return super.clone()
    }

    override fun toString(): String {
        return "Nombre: $name Valor: $value"
    }
}

data class Person( var name: String, var id: Int, var age: Int)

fun main(){
    val person1 = Person( "Samuel", 123456, 36)
    val person2 = person1.copy()
    person2.age = 16
    person2.id = 654321

    println("person1: $person1  person2: $person2")

    val prueba1 = Prueba(5, "caja")
    val prueba2 = prueba1.clone() as Prueba
    println("prueba1: $prueba1  prueba2: $prueba2")
}