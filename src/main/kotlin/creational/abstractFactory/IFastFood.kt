package creational.abstractFactory


import creational.factoryMethod.hamburger.IHamburger
import creational.factoryMethod.pizza.IPizza

interface IFastFood {
    enum class EType{
        COLOMBIANA,
        MEXICANA,
        ITALIANA
    }

    fun createPizza(): IPizza
    fun createHamburger(): IHamburger
}