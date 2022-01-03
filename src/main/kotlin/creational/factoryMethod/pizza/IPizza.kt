package creational.factoryMethod.pizza

interface IPizza {
    var name: String
    var mass: String
    var sauces: String
    var ingredients: String
    var cook: String

    fun getProduct( ) = "Pizza: $name Masa: $mass Sauces: $sauces Ingredients: $ingredients Cook: $cook"
}