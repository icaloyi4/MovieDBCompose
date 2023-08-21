package id.lunaratechno.moviedb.features.favourite.view

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FavouriteFragment(){
    Scaffold() {
        Text(text = "Favourite")
    }
}

@Preview(showBackground = true)
@Composable
fun FavouriteReview() {
    FavouriteFragment()
}