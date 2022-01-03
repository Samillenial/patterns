package creational.factoryMethod.hamburger

fun main(){
    val hamburgerFactory = HamburgerFactory()
    println(hamburgerFactory.create(IHamburgerCreator.EType.MEXICANA).getProduct())
    println(hamburgerFactory.create(IHamburgerCreator.EType.COLOMBIANA).getProduct())
}