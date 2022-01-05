package structural.decorator

class FileDataSource(private val fileName: String ): IDataSource {
    init {
        println("abriendo archivo: $fileName")
    }

    override fun read(): String {
        println("leyendo archivo: $fileName")
        return "hola mundo"
    }

    override fun write(data: String) {
        println("escribiendo archivo: $fileName data: $data")
    }
}