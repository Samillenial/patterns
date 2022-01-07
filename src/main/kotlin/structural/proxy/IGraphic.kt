package structural.proxy

interface IGraphic {

    fun draw()
    fun getExtents(): String
    fun load(): Boolean
    fun store(path:String): Boolean
    fun getImage() : String
}