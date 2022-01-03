package creational.factoryMethod.pizza

class MexicanPizza: IPizza {
    override var name = "MEXICAN"
    override var mass = "tortilla"
    override var sauces = "guacamole"
    override var ingredients = "totopos + chile + queso"
    override var cook = "20 min a 180°"
}