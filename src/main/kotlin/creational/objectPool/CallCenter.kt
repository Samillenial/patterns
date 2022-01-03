package creational.objectPool

data class Operator( val name: String, var id: Int ){
    fun setPQR() {
            println("$name esta procesando PQR")
    }
}

object CallCenter {

    init {
        println("TR se esta instanciando")
    }

    fun acquireOperator(): Operator{

        return if (_available.isNotEmpty()) {
            val operator = _available[0]
            println("devolviendo un operador previo ${operator.name}")
            _inUse.add(operator)
            _available.removeAt(0)
            operator
        } else {
            if( operatorAvailable ) {
                val newOperador = Operator("Operator$count", count++)
                ++operatorCount
                println("creando un nuevo operador ${newOperador.name}")
                _inUse.add(newOperador)
                newOperador
            }
            else
                throw Exception( "no hay mas operadores disponibles")
        }
    }

    fun releaseOperator( operator: Operator ){
        println("liberando al operador ${operator.name}")
        _available.add(operator)
        _inUse.remove(operator)
    }

    val operatorAvailable: Boolean
        get() = operatorCount < MAX_OPERATORS

        private var count = 0
        private const val MAX_OPERATORS = 3

        var operatorCount = 0

            set(value) {
                field = if( value > MAX_OPERATORS)
                     MAX_OPERATORS
                else
                    value
            }

        private val _available: MutableList<Operator> = mutableListOf()
        private val _inUse: MutableList<Operator> = mutableListOf()
}

fun main(){

    val operatorToYoshio = CallCenter.acquireOperator()
    operatorToYoshio.setPQR()

    val operatorToSam = CallCenter.acquireOperator()
    operatorToSam.setPQR()

    val operatorToEdwin = CallCenter.acquireOperator()
    operatorToEdwin.setPQR()

    if( CallCenter.operatorAvailable){
        val operatorToMike = CallCenter.acquireOperator()
        operatorToMike.setPQR()
        CallCenter.releaseOperator(operatorToMike)
    }

    CallCenter.releaseOperator(operatorToEdwin)
    CallCenter.releaseOperator(operatorToSam)
    CallCenter.releaseOperator(operatorToYoshio)
}