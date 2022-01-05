package structural.decorator

class EncryptedDataSource(dataSource: IDataSource): DecoratorDataSource(dataSource) {
    override fun read(): String {
        return  decrypt( super.read() )
    }

    override fun write(data: String) {
        super.write(encrypt(data))
    }

    private fun encrypt( data: String) = data.reversed()
    private fun decrypt( data: String) = encrypt( data )
}