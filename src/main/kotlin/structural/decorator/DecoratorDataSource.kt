package structural.decorator

open class DecoratorDataSource(private val dataSource: IDataSource): IDataSource by dataSource {
}