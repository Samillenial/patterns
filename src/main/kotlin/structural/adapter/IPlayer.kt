package structural.adapter

interface IPlayer {
    fun play( name:String)
    fun stop()
    fun rewind()
    fun forward()
}