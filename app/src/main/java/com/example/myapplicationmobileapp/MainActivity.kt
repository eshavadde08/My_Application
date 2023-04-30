package com.example.myapplicationmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationmobileapp.ui.theme.MyApplicationMobileAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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

                    var checkedState = remember { mutableStateOf(false) }
                    var checkedCapital = remember { mutableStateOf(false) }
                    var checkedCountry = remember { mutableStateOf(false) }
                    var checkedPoint = remember { mutableStateOf(false) }
                    var checkedPeriod = remember { mutableStateOf(false) }
                    Card {



                        Column {
                            Text(
                                "Mood tracker: Choose your mood for the day!",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(40.dp)
                            )
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                                Text("Angry")
                                Checkbox(
                                    checked = checkedState.value,
                                    onCheckedChange = {
                                        checkedState.value = it
                                    })
                            }
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                                Text("Happy")
                                Checkbox(
                                    checked = checkedCapital.value,
                                    onCheckedChange = {
                                        checkedCapital.value = it
                                    })
                            }
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                                Text("Sad")
                                Checkbox(
                                    checked = checkedCountry.value,
                                    onCheckedChange = {
                                        checkedCountry.value = it
                                    })
                            }
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                                Text("Disappointed")
                                Checkbox(
                                    checked = checkedPoint.value,
                                    onCheckedChange = {
                                        checkedPoint.value = it
                                    })
                            }
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
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