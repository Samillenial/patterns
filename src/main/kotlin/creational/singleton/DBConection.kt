package creational.singleton

object DBConection {

    init {
        println("se esta instanciando")
    }

    fun loggin(){
        println("se esta logeando")
    }

    fun connect(){
        println("se esta conectando")
    }
     fun disconnect(){
         println("se esta desconectando")
     }
}

class TraditionalDBConection{

    private constructor(){
        println("TR se esta instanciando")
    }

    fun loggin(){
        println("TR se esta logeando")
    }

    fun connect(){
        println("TR se esta conectando")
    }

    fun disconnect(){
        println("TR se esta desconectando")
    }

    companion object{

        private var _instance: TraditionalDBConection? = null

        val instance: TraditionalDBConection
            get() {
                if (_instance == null) _instance = TraditionalDBConection()
                return _instance!!
            }
    }
}

fun main(){
    DBConection.loggin()
    DBConection.connect()
    DBConection.disconnect()

    TraditionalDBConection.instance.loggin()
    TraditionalDBConection.instance.connect()
    TraditionalDBConection.instance.disconnect()
}