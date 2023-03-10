import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import app.softwork.bootstrapcompose.DropDown
import app.softwork.bootstrapcompose.DropDownBuilder
import app.softwork.bootstrapcompose.require
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    require("./custom.scss")
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("-")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }
            DropDown("Dropup", direction = DropDown.Direction.Up) {
                items()
            }
        }
    }
}

@Composable
private fun DropDownBuilder.items() {
    Button("Menu Item") {}
    Button("Menu Item") {}
    Button("Menu Item") {}
}

