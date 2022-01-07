package structural.proxy

fun main () {

    val image = ImageProxy("1234", "4321")
    image.load()
    image.getImage()
    image.draw()
    image.store("c: documents")


}