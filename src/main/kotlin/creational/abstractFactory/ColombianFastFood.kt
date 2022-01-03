package creational.abstractFactory

import creational.factoryMethod.hamburger.HamburgerFactory
import creational.factoryMethod.hamburger.IHamburger
import creational.factoryMethod.hamburger.IHamburgerCreator
import creational.factoryMethod.pizza.IPizzaCreator
import creational.factoryMethod.pizza.PizzaFactory

class ColombianFastFood: IFastFood {
    override fun createPizza() = PizzaFactory().create(IPizzaCreator.EType.COLOMBIANA)
    override fun createHamburger() = HamburgerFactory().create(IHamburgerCreator.EType.COLOMBIANA)
    override fun createHotDog(): IHamburger {
        TODO("Not yet implemented")
    }

    override fun createChickenFry(): IHamburger {
        TODO("Not yet implemented")
    }

    override fun createFrechFry(): IHamburger {
        TODO("Not yet implemented")
    }
}