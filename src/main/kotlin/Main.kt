import javax.swing.*

class AsteroidsGame {  //Converted boilerplate
    companion object {
        fun initWindow() {
            println("initWindow")
            val window = JFrame("Asteroids")
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
            val playSpace = PlaySpace()
            //window.add(playSpace)
            window.contentPane.add(playSpace)
            window.addKeyListener(playSpace.inputState)
            window.addMouseListener(playSpace.inputState)
            window.setResizable(false)

            //val button = JButton("Button")
            //window.contentPane.add(button)
            window.pack()
            window.setLocationRelativeTo(null)
            window.isVisible = true //Kotlin doesn't like getter setter methods?
        }
    }
}

fun main(args: Array<String>) {
    println("START")

    class RunThis: Runnable {
        override fun run() {
            AsteroidsGame.initWindow()
        }
    }
    SwingUtilities.invokeLater(RunThis())  //Couldn't figure out how to do this in one line
}
