package structural.decorator

class TCPDataSource(private val ip: String, private val port: String ): IDataSource {
    init {
        println("abriendo socket: $ip:$port")
    }

    override fun read(): String {
        println("leyendo socket: $ip:$port")
        return "hello world"
    }

    override fun write(data: String) {
        println("escribiendo socket: $ip:$port data: $data")
    }
}