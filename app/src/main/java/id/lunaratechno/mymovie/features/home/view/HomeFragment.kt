package id.lunaratechno.moviedb.features.home.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.lunaratechno.mymovie.core.widgets.AppBarDefault

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeFragment(){
    Scaffold(topBar = {
        AppBarDefault(name = "My Movies", actions = null)
    },modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(15.dp)) {
            Text(text = "Top Rated")
            Text(text = "Now Playing")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeReview() {
    HomeFragment()
}