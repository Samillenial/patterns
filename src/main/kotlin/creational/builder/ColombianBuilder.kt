package creational.builder

class ColombianBuilder: PizzaBuilder {
    override fun setMass() {
        pizza.mass = "harina de trigo"
    }

    override fun setIngredient() {
        pizza.ingredients = "maiz + jamon + queso + champiñon"
    }

    override fun setSauces() {
        pizza.sauces = "tartara"
    }

    override fun cook() {
        pizza.cook =  "25 min a 120°"
    }

    override var pizza = Pizza( "", "", "", "")

}