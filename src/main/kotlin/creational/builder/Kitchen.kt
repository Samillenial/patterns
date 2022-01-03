package creational.builder

class Kitchen (private val pb: PizzaBuilder) { //director

    fun cookPizza(): Pizza { //build
        pb.setMass()
        pb.setIngredient()
        pb.setSauces()
        pb.cook()
        return pb.pizza
    }

    fun getPizza(): Pizza = pb.pizza //product
}
