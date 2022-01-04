package structural.adapter

class VHSAdapter:IPlayer {

    private val player=VHS()

    override fun play(name: String) {
       player.insertCasette(name)
        player.play()
    }

    override fun stop() {
        player.stop()
        player.eject()
    }

    override fun rewind() {
        player.rewind()
    }

    override fun forward() {
        player.forward()
    }
}