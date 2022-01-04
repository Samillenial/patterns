package structural.bridge

class X86 : IArchitecture {
    override fun checkStartSector() {
        println ("x86: checkStartSector")
    }

    override fun loadinitFile() {
        println ("x86: loadinitFile")
    }

    override fun checkRegEdit() {
        println ("x86: checkRegEdit")
    }

    override fun checkHardDisk() {
        println ("x86: checkHardDisk")
    }

    override fun checkMemory() {
        println ("x86: checkMemory")
    }

    override fun checkProcessor() {
        println ("x86: checkProcessor")
    }

    override fun checkPorts() {
        println ("x86: checkPorts")
    }

    override fun startComsServices() {
        println ("x86: startComsServices")
    }

    override fun startUpdateServices() {
        println ("x86: startUpdateServices")
    }

    override fun startGUImodel() {
        println ("x86: startGUImodel")
    }

    override fun checkUser() {
        println ("x86: checkUser")
    }

    override fun checkPassword() {
        println ("x86: checkPassword")
    }

    override fun checkPermissions() {
        println ("x86: checkPermissions")
    }
}