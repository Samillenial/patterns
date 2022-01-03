package creational.builder

class ItalianBuilder: PizzaBuilder {
    override fun setMass() {
        pizza.mass = "harina de maiz"
    }

    override fun setIngredient() {
        pizza.ingredients = "queso + albaca"
    }

    override fun setSauces() {
        pizza.sauces = "pomodoro"
    }

    override fun cook() {
        pizza.cook =  "15 min a 150°"
    }

    override var pizza = Pizza( "", "", "", "")

}