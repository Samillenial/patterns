package structural.bridge

interface IArchitecture {


    //Kernel
    fun checkStartSector()
    fun loadinitFile ()
    fun checkRegEdit ()

    //Hadware
    fun checkHardDisk ()
    fun checkMemory ()
    fun checkProcessor ()
    fun checkPorts ()

    //Services
    fun startComsServices ()
    fun startUpdateServices()
    fun startGUImodel ()

    //login
    fun checkUser ()
    fun checkPassword ()
    fun checkPermissions ()
}