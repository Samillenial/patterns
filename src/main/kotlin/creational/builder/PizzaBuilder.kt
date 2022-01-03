package creational.builder
interface PizzaBuilder {
    fun setMass()
    fun setIngredient()
    fun setSauces()
    fun cook()
    var pizza: Pizza
}
