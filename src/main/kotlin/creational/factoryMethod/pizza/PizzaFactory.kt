package creational.factoryMethod.pizza

class PizzaFactory: IPizzaCreator {

    override fun create( type: IPizzaCreator.EType): IPizza {
        return when( type ){
            IPizzaCreator.EType.MEXICANA -> MexicanPizza()
            IPizzaCreator.EType.COLOMBIANA -> ColombianPizza()
            IPizzaCreator.EType.ITALIAN -> ItalianPizza()
        }
    }
}