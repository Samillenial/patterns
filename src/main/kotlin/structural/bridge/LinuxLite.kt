package structural.bridge

class LinuxLite( arch : IArchitecture): Linux(arch) {
    override fun loadkernel() {
        println("LinuxLite: Cargando Kernel")
        arch.loadinitFile()
    }

    override fun startService() {
        println("LinuxLite: Iniciando Servicios")
        arch.startComsServices()
    }
}