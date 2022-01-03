package creational.abstractFactory

import creational.factoryMethod.hamburger.HamburgerFactory
import creational.factoryMethod.hamburger.IHamburgerCreator
import creational.factoryMethod.pizza.IPizzaCreator
import creational.factoryMethod.pizza.PizzaFactory

class MexicanFastFood: IFastFood {
    override fun createPizza() = PizzaFactory().create(IPizzaCreator.EType.MEXICANA)
    override fun createHamburger() = HamburgerFactory().create(IHamburgerCreator.EType.MEXICANA)
}