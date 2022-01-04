package structural.adapter

class Netflix {
    var movieName=""

    fun play( ){
        println("Netflix play $movieName")
    }
    fun stop(){
        println("Netflix stop $movieName")
    }
    fun rewind(){
        println("Netflix rewind cinta $movieName")
    }
    fun forward(){
        println("Netflix forward cinta $movieName")
    }

    fun search(name:String){
        movieName = name
        println("Netflix search cinta $movieName")
    }

}