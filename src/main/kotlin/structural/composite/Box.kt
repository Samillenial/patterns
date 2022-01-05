package structural.composite

class Box : IProduct {
    private val productsList = mutableListOf<IProduct>()

    override val name = "Box"
    override fun getAmount(): Double {
        var amount = 0.0
        productsList.forEach{
            amount += it.getAmount()
            println( "Product Name: ${it.name} -> Amount $${it.getAmount()}" )
        }
        return amount
    }

    fun add( product: IProduct ) = productsList.add( product )
    fun remove( product: IProduct ) = productsList.remove( product )

    fun getProducts(): List<IProduct> = productsList
    fun getProduct( index: Int ) = productsList[index]

}