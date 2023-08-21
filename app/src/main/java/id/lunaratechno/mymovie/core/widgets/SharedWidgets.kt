package id.lunaratechno.moviedb.core.widgets

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun AppBarDefault(name : String? = "", actions: @Composable() (RowScope.() -> Unit)? ) {
    if (actions != null) {
        TopAppBar(title = {
            Text("$name")
        }, actions = actions)
    } else {
        TopAppBar(title = {
            Text("$name")
        })
    }
}

@Composable
fun Fab() {
    FloatingActionButton(onClick = {
        // To Do buat function on click
    }) {
        // Content didalam fab
        Text(text = "Add")
    }
}