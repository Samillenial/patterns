package creational.factoryMethod.pizza


interface IPizzaCreator {

    enum class EType{
        MEXICANA,
        COLOMBIANA,
        ITALIAN
    }

    fun create( type: EType): IPizza
}