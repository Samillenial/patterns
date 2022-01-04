package structural.adapter

class AmazonAdapter:IPlayer {
    private val player=Amazon()

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