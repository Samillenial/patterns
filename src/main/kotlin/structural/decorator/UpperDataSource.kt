package structural.decorator

class UpperDataSource(dataSource: IDataSource): DecoratorDataSource(dataSource) {
    override fun read(): String {
        return  super.read().uppercase()
    }

    override fun write(data: String) {
        super.write(data.uppercase())
    }
}