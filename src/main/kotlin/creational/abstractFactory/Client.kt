package creational.abstractFactory

fun main( ){
    val colombianFastFoodFactory = FastFoodFactory( IFastFood.EType.COLOMBIANA).factory
    println(colombianFastFoodFactory.createHamburger().getProduct())
    println(colombianFastFoodFactory.createPizza().getProduct())

    val mexicanFastFoodFactory = FastFoodFactory( IFastFood.EType.MEXICANA).factory
    println(mexicanFastFoodFactory.createHamburger().getProduct())
    println(mexicanFastFoodFactory.createPizza().getProduct())

    val italianFastFoodFactory = FastFoodFactory( IFastFood.EType.ITALIANA).factory
    println(italianFastFoodFactory.createHamburger().getProduct())
    println(italianFastFoodFactory.createPizza().getProduct())
}