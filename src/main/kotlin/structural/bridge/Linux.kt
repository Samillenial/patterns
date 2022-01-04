package structural.bridge

open class Linux (override val arch : IArchitecture): OperSystem() {
    override fun checkHadware() {
        println("Linux: Verificando Hadware")
        arch.checkHardDisk()
        arch.checkMemory()
        arch.checkProcessor()
        arch.checkPorts()
    }

    override fun loadkernel() {
        println("Linux: Cargando Kernel")
        arch.checkRegEdit()
        arch.checkStartSector()
        arch.loadinitFile()
    }

    override fun startService() {
        println("Linux: Iniciando Servicios")
        arch.startComsServices()
        arch.startUpdateServices()
        arch.startGUImodel()
    }

    override fun login() {
        println("Linux: Login")
        arch.checkUser()
        arch.checkPassword()
        arch.checkPermissions()
    }
}