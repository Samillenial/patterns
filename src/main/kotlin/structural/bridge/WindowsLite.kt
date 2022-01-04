package structural.bridge

class WindowsLite( arch : IArchitecture): Windows(arch) {

    override fun loadkernel() {
        println("WindowsLite: Cargando Kernel")
        arch.checkStartSector()

    }

    override fun startService() {
        println("Windows: Iniciando Servicios")
        arch.startGUImodel()
    }
}