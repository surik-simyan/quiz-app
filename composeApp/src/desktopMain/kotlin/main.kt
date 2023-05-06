import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.company.quiz.App
import java.awt.Dimension

fun main() = application {
    Window(
        title = "Quiz App",
        state = rememberWindowState(width = 1000.dp, height = 800.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(1000, 800)
        window.maximumSize = Dimension(1000, 800)
        App()
    }
}
