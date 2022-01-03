import creational.builder.ColombianBuilder
import creational.builder.Kitchen
import creational.builder.MexicanBuilder

fun main(args: Array<String>) {

    val colombianBuilder = ColombianBuilder()
    val mexicanPizza = MexicanBuilder()

    val kitchen = Kitchen(colombianBuilder)

    println(kitchen.cookPizza())
}