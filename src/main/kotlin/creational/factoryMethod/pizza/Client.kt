package creational.factoryMethod.pizza

fun main(){
    val factory = PizzaFactory()
    println(factory.create(IPizzaCreator.EType.MEXICANA).getProduct())
    println(factory.create(IPizzaCreator.EType.MEXICANA).getProduct())
    println(factory.create(IPizzaCreator.EType.MEXICANA).getProduct())
    println(factory.create(IPizzaCreator.EType.MEXICANA).getProduct())

    println(factory.create(IPizzaCreator.EType.COLOMBIANA).getProduct())
    println(factory.create(IPizzaCreator.EType.COLOMBIANA).getProduct())
    println(factory.create(IPizzaCreator.EType.COLOMBIANA).getProduct())
    println(factory.create(IPizzaCreator.EType.COLOMBIANA).getProduct())

    println(factory.create(IPizzaCreator.EType.ITALIAN).getProduct())
    println(factory.create(IPizzaCreator.EType.ITALIAN).getProduct())
}