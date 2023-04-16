package com.example.myapplicationmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationmobileapp.ui.theme.MyApplicationMobileAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

private infix fun <R1> Function<R1>.Card(function: () -> R1): ((Boolean) -> R1)? {

}

class MainActivity : ComponentActivity() {
  /*  private fun Greeting(s: String) {
        TODO("Not yet implemented")
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationMobileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                            //Greeting("Android")

                    TopAppBar(
                        title = { Text("Mood Tracker") },
                        navigationIcon = {
                            IconButton(onClick = { /* doSomething() */ }) {
                                Icon(Icons.Filled.Menu, contentDescription = null)
                            }
                        },
                        actions = {})
                            // RowScope here, so these icons will be placed horizontally
                            IconButton(onClick = { /* doSomething() */ }) {
                                val checkedState = remember { mutableStateOf(true) }
                                Checkbox(
                                    checked = checkedState.value,
                                    onCheckedChange = {
                                        var it = false
                                        checkedState.value = it
                                    }
                                                Card {
                                            Text("Mood tracker: Choose your mood for the day")
                                    )
                                }
                            }
                        }
                }
            }
        }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationMobileAppTheme {
        Greeting("Android")
    }
}