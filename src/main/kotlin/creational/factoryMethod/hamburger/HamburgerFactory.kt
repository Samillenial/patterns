package creational.factoryMethod.hamburger

class HamburgerFactory:IHamburgerCreator {
    override fun create(type: IHamburgerCreator.EType): IHamburger {
        return when( type ){
            IHamburgerCreator.EType.COLOMBIANA -> ColombianHamburger()
            IHamburgerCreator.EType.MEXICANA -> MexicanHamburger()
        }
    }
}