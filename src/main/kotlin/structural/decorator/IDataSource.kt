package structural.decorator

interface IDataSource {
    fun read(): String
    fun write( data: String )
}