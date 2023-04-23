package com.example.myapplicationmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationmobileapp.ui.theme.MyApplicationMobileAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private infix fun <R1> Function<R1>.Card(function: () -> R1) {

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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")

                    TopAppBar(
                        title = { Text("Mood Tracker") },
                        navigationIcon = {
                            IconButton(onClick = { /* doSomething() */ }) {
                                Icon(Icons.Filled.Menu, contentDescription = null)
                            }
                        },
                        actions = {}
                    )

                    var checkedState = remember { mutableStateOf(true) }
                    var checkedCapital = remember { mutableStateOf(true) }
                    var checkedCountry = remember { mutableStateOf(true) }
                    var checkedPoint = remember { mutableStateOf(true) }
                    var checkedPeriod = remember { mutableStateOf(true) }
                    Card {



                        Column {
                            Text(
                                "Mood tracker: Choose your mood for the day!",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(40.dp)
                            )
                            Text("Angry")
                                Checkbox(
                                    checked = checkedState.value,
                                    onCheckedChange = {
                                        checkedState.value = it
                                    })
                            Text("Happy")
                                Checkbox(
                                    checked = checkedCapital.value,
                                    onCheckedChange = {
                                        checkedCapital.value = it
                                    })
                            Text("Sad")
                                Checkbox(
                                    checked = checkedCountry.value,
                                    onCheckedChange = {
                                        checkedCountry.value = it
                                    })
                            Text("Disappointed")
                                Checkbox(
                                checked = checkedPoint.value,
                                onCheckedChange = {
                                    checkedPoint.value = it
                                })
                            Text("Excited")
                                 Checkbox(
                                checked = checkedPeriod.value,
                                onCheckedChange = {
                                    checkedPeriod.value = it
                                })
                        }
                    }
                }
            }
        }
    }

    private fun mutableStateof(b: Boolean) {
        TODO("Not yet implemented")
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