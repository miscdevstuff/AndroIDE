package io.sohil876.androide.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.sohil876.androide.screens.TerminalScreen

enum class AppRoute(val route: String, val label: String) {
    Editor("editor", "Editor"),
    Terminal("terminal", "Terminal"),
    Tools("tools", "Tools")
}

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = AppRoute.Editor.route,
        modifier = modifier
    ) {
        composable(AppRoute.Editor.route) {
            RoutePlaceholder(label = AppRoute.Editor.label)
        }
        composable(AppRoute.Terminal.route) {
            TerminalScreen()
        }
        composable(AppRoute.Tools.route) {
            RoutePlaceholder(label = AppRoute.Tools.label)
        }
    }
}

@Composable
private fun RoutePlaceholder(label: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = label)
    }
}
