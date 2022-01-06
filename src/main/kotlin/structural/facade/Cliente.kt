package structural.facade
fun main(){

    val atm = TellerFacade()
    if(atm.removeMoney(3000.00))
        println("retiro existo")
    println("---------------------------------")
    if(atm.depositMoney(5000.00))
        println("deposito existo")
}