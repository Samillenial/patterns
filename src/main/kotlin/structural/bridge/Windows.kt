package structural.bridge

open class Windows (override val arch : IArchitecture) : OperSystem() {
    override fun checkHadware() {
        println("Windows: Verificando Hadware")
        arch.checkProcessor()
        arch.checkMemory()
        arch.checkPorts()
        arch.checkHardDisk()
    }

    override fun loadkernel() {
        println("Windows: Cargando Kernel")
        arch.loadinitFile()
        arch.checkStartSector()
        arch.checkRegEdit()
    }

    override fun startService() {
        println("Windows: Iniciando Servicios")
        arch.startUpdateServices()
        arch.startComsServices()
        arch.startGUImodel()
    }

    override fun login() {
        println("Windows: Login")
        arch.checkUser()
        arch.checkPassword()
        arch.checkPermissions()
    }

}