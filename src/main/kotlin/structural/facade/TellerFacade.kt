package structural.facade

class TellerFacade {

    private var atm = ATM()
    private val bank =
        mutableListOf<Account>(Account(5000.00, "1234", "1234567890123456"), Account(3000.00, "7777", "123456789987654"))

    fun removeMoney(amount: Double): Boolean {
        if (!atm.readCard()) {
            println("TellerFacade: NO SE PUDO LEER TARJETA")
            return false
        }

        val account = bank.find { account ->
            account.number == atm.accountNumber
        }

        if (account == null) {
            println("TellerFacade: NO SE ENCONTRO CUENTA ${atm.accountNumber}")
            return false
        }

        if (account.locked) {
            println("TellerFacade: LA CUENTA ESTA BLOQUEADA")
            return false
        }

        if (!account.validPassword(atm.inputPassword())) {
            println("TellerFacade: EL PASSWORD NO ES CORRECTO")
            return false
        }

        if (!account.removeAmount(amount)) {
            println("TellerFacade: NO SE PUDO RETIRAR DINERO DE LA CUENTA")
            return false
        }

        if (!atm.removeMoney(amount)) {
            println("TellerFacade: NO SE PUDO RETIRAR DINERO DEL ATM")
            return false
        }

        atm.printTicket()
        return true
    }

    fun depositMoney(amount:Double): Boolean {
        if (!atm.readCard()) {
            println("TellerFacade: NO SE PUDO LEER TARJETA")
            return false
        }

        val account = bank.find { account ->
            account.number == atm.accountNumber
        }

        if (account == null) {
            println("TellerFacade: NO SE ENCONTRO CUENTA ${atm.accountNumber}")
            return false
        }

        if (account.locked) {
            println("TellerFacade: LA CUENTA ESTA BLOQUEADA")
            return false
        }

        if (!account.depositAmount(amount)) {
            println("TellerFacade: NO SE PUDO RETIRAR DINERO DE LA CUENTA")
            return false
        }

        if (!atm.depositMoney(amount)) {
            println("TellerFacade: NO SE PUDO RETIRAR DINERO DEL ATM")
            return false
        }

        atm.printTicket()
        return true
    }

}