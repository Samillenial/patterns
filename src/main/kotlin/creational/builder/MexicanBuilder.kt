package creational.builder

class MexicanBuilder: PizzaBuilder {
    override fun setMass() {
        pizza.mass = "tortilla"
    }

    override fun setIngredient() {
        pizza.ingredients = "totopos + chile + queso"
    }

    override fun setSauces() {
        pizza.sauces = "guacamole"
    }

    override fun cook() {
        pizza.cook = "20 min a 180°"
    }

    override var pizza = Pizza("", "", "", "")
}