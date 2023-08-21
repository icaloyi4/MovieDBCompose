package id.lunaratechno.moviedb.core.routes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Favorite
import androidx.compose.material.icons.sharp.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(var title:String, var icon:ImageVector, var screen_route:String){

    object Home : BottomNavItem("Home", Icons.Sharp.Home,RoutesModel.home)
    object Favourite: BottomNavItem("Favourite",  Icons.Sharp.Favorite,RoutesModel.favourite)
}