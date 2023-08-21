package id.lunaratechno.moviedb.features.home.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeFragment(){
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Text(text = "Home")
    }
}