package structural.facade

class ATM {

    private var balance:Double = 10000.00


    var accountNumber = ""
        private set

    init {
        println("ATM init balance $balance")
    }

    fun removeMoney( amount: Double): Boolean{
        println("ATM remove $amount")
        return if( amount <= balance ) {
              balance -= amount
            println("ATM removeMoney new balance $balance")
            true
        } else {
            println("ATM amount $amount > balance $balance")
            false
        }
    }

    fun depositMoney( amount: Double ): Boolean{
        println("ATM depositMoney: $amount")
        balance += amount
        return true
    }

    fun printTicket(){
        println("ATM print ticket")
    }

    fun readCard():Boolean{

        accountNumber = "1234567890123456"
        println("ATM read Card $accountNumber")
        return true
    }

    fun inputPassword():String{
        val clave= "1234"
        println("ATM introducir Clave $clave")
        return clave
    }
}