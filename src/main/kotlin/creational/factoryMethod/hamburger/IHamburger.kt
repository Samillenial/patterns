package creational.factoryMethod.hamburger

interface IHamburger {
    var name: String
    var sauces: String
    var ingredients: String
    var cook: String

    fun getProduct( ) = "Hamburger: $name Ingredients: $ingredients Sauces: $sauces Cook: $cook"
}