package structural.composite

fun main() {
    val hammerBox = Box()
    hammerBox.add( Hammer() )

    val kitPhoneBox = Box()
    kitPhoneBox.add( Phone() )
    kitPhoneBox.add( HeadPhone() )

    val chargerBox = Box()
    chargerBox.add( Charger() )

    val kitCompletePhone = Box()
    kitCompletePhone.add( kitPhoneBox )
    kitCompletePhone.add( chargerBox )

    val amazon = Box()
    amazon.add( hammerBox )
    amazon.add( kitCompletePhone )
    amazon.add( Facture() )

    println( "Total: ${amazon.getAmount()}")
}
