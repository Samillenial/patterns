package structural.adapter

class Amazon {
    var movieName=""

    fun play( ){
        println("Amazon play $movieName")
    }
    fun stop(){
        println("Amazon stop $movieName")
    }
    fun rewind(){
        println("Amazon rewind cinta $movieName")
    }
    fun forward(){
        println("Amazon forward cinta $movieName")
    }

    fun search(name:String){
        movieName = name
        println("Amazon search cinta $movieName")
    }

}