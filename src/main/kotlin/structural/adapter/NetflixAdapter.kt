package structural.adapter

class NetflixAdapter:IPlayer {
    private val player=Netflix()

    override fun play(name: String) {
        player.search(name)
        player.play()
    }

    override fun stop() {
        player.stop()
    }

    override fun rewind() {
        player.rewind()
    }

    override fun forward() {
        player.forward()
    }
}