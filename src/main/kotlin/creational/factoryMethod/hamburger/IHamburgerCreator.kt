package creational.factoryMethod.hamburger

interface IHamburgerCreator {

    enum class EType{
        COLOMBIANA,
        MEXICANA
    }

    fun create( type: EType ): IHamburger
}