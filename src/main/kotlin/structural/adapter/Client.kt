package structural.adapter

fun main(){
    val type = "Netflix"
   val player = when(type){
        "VHS"->VHSAdapter()
        "Netflix"->NetflixAdapter()
        "Amazon"->AmazonAdapter()
       else-> throw Exception("dispositivo invalido $type")

    }
    val homeCinema = HomeCinema(player)
    homeCinema.play("mision Imposible")
    homeCinema.rewind()
    homeCinema.stop()

}
