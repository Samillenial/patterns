package structural.decorator

fun main(){

    val encryptDecorator = EncryptedDataSource( FileDataSource("prueba.txt") )
    println("Encrypt ${encryptDecorator.read()}")
    println("Decrypt ${encryptDecorator.write("esto es una prueba")}")

    val upperDecorator = UpperDataSource( encryptDecorator )
    println("Upper Read ${upperDecorator.read()}")
    println("Upper Write ${upperDecorator.write("esto es una prueba")}")
}