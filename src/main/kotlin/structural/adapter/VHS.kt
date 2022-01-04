package structural.adapter

class VHS {
    var casetteName=""
    fun insertCasette(name:String){
        casetteName=name
        println("VHS ingesando cinta $casetteName")
    }
    fun play( ){
        println("VHS play $casetteName")
    }
    fun stop(){
        println("VHS stop $casetteName")
    }
    fun rewind(){
        println("VHS rewind cinta $casetteName")
    }
    fun forward(){
        println("VHS forward cinta $casetteName")
    }
    fun eject(){
        println("VHS eject cinta $casetteName")
        casetteName= ""
    }
}