package creational.builder


fun main() {

    val colombianKitchen = Kitchen(ColombianBuilder())
    println(colombianKitchen.cookPizza())
    println(colombianKitchen.cookPizza())
    println(colombianKitchen.cookPizza())
    println(colombianKitchen.cookPizza())

    val mexicanKitchen = Kitchen(MexicanBuilder())
    println(mexicanKitchen.cookPizza())
    println(mexicanKitchen.cookPizza())
    println(mexicanKitchen.cookPizza())
    println(mexicanKitchen.cookPizza())

    val italianKitchen = Kitchen(ItalianBuilder())
    println(italianKitchen.cookPizza())
    println(italianKitchen.cookPizza())
}
