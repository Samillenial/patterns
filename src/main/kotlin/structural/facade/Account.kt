package structural.facade

class Account(  amount:Double, val password:String, val number: String ) {

    var balance = amount
        private set

    var locked = false
        set(value) {
            println("Account lock $value")
            field = value
        }

    init {
        println("ACCOUNT init balance $balance")
    }

    fun removeAmount(amount:Double):Boolean{
        println("Account remove Amount $amount")
        if(locked) {
            println("Account locked")
            return false
        }

          return  if(amount <= balance){
                balance-=amount
              println("Account remove new Balance $balance")
                true
            }
            else{
                println("Account amount > balance")
                 false
            }
    }

    fun depositAmount(amount:Double):Boolean{
        println("amount deposit $amount")
        if(locked) {
            println("Account locked")
            return false
        }
        balance += amount
        println("Account deposit new Balance $balance")
        return true
    }

    fun validPassword(password:String):Boolean{
        println("Account valid password $password ")
        return this.password == password
    }



}