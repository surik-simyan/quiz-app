
import org.company.quiz.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("Quiz App") {
            App()
        }
    }
}
