package structural.proxy

class RemoteImage ( var urlImage: String): IGraphic {

    var imageImp: String = ""
    var extent: String = ".jpeg"

    override fun draw() {
        println("RemoteImage: draw")
    }

    override fun getExtents(): String {
        println("RemoteImage: getExtent")
        return extent
    }

    override fun load(): Boolean {
        println("RemoteImage: load from OneDrive")
        imageImp = "Esta es una imagen de prueba"
        return true
    }

    override fun getImage(): String {
        println("RemoteImage: getImage")
        return imageImp

    }

    override fun store(path: String): Boolean {
        println("RemoteImage: store in google")
        return true
    }
}