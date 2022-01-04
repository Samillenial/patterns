package structural.bridge

class X64 : IArchitecture {
    override fun checkStartSector() {
        println ("x64: checkStartSector")
    }

    override fun loadinitFile() {
        println ("x64: loadinitFile")
    }

    override fun checkRegEdit() {
        println ("x64: checkRegEdit")
    }

    override fun checkHardDisk() {
        println ("x64: checkHardDisk")
    }

    override fun checkMemory() {
        println ("x64: checkMemory")
    }

    override fun checkProcessor() {
        println ("x64: checkProcessor")
    }

    override fun checkPorts() {
        println ("x64: checkPorts")
    }

    override fun startComsServices() {
        println ("x64: startComsServices")
    }

    override fun startUpdateServices() {
        println ("x64: startUpdateServices")
    }

    override fun startGUImodel() {
        println ("x64: startGUImodel")
    }

    override fun checkUser() {
        println ("x64: checkUser")
    }

    override fun checkPassword() {
        println ("x64: checkPassword")
    }

    override fun checkPermissions() {
        println ("x64: checkPermissions")
    }
}