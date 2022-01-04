package structural.bridge

abstract class OperSystem: IPlatform {
    protected abstract val arch : IArchitecture
}