package com.example.learningapplicationforcompose.test

import android.os.Bundle
import android.util.Log
import android.view.ViewTreeObserver
import android.view.WindowInsets
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learningapplicationforcompose.test.ui.theme.LearningApplicationForComposeTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContent {
            LearningApplicationForComposeTheme {
               //Counter()
                Derived()
            }
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier) {
    KeyBoard()
    TextField(value = "", onValueChange = {}, label = {"games"})

}

@Composable
fun Counter(modifier: Modifier = Modifier) {
    val count = remember {
        mutableStateOf(0)
    }
    val mk = count.value % 3 ==0
    LaunchedEffect(key1 = mk) {
        Log.d("MyTag35", "Current Count is ${count.value} Thread Name is ${Thread.currentThread().name}")

    }
    val scope = rememberCoroutineScope()
    Button(onClick = { count.value++

    }) {
        Text(text = "Increment count")
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearningApplicationForComposeTheme {
        Greeting("Android")
    }
}

//Disposable Effect
@Composable
fun KeyBoard(modifier: Modifier = Modifier) {
    Log.d("MyTag2", "KeyBoard: Composable called")
    val view = LocalView.current
    DisposableEffect(key1 = Unit) {
        Log.d("MyTag2", "KeyBoard: DisposableEffect: called")
        val listener = ViewTreeObserver.OnGlobalLayoutListener {
            val insets = ViewCompat.getRootWindowInsets(view)
            val isKeyboardVisible = insets?.isVisible(WindowInsetsCompat.Type.ime())
            Log.d("MyTag2", "KeyBoard: $isKeyboardVisible")
        }
        view.viewTreeObserver.addOnGlobalLayoutListener(listener)
        onDispose {
            Log.d("MyTag2", "KeyBoard: removing listener ")
            view.viewTreeObserver.removeOnGlobalLayoutListener(listener)
        }
    }
}

//produce State
@Composable
fun Derived(modifier: Modifier = Modifier) {
    val tableOf = remember {
        mutableStateOf(5)
    }
    val index = produceState(initialValue = 1) {
        repeat(9){
            delay(1000)
            value+=1
        }
    }

    val message = derivedStateOf { "${tableOf.value} * ${index.value} = ${tableOf.value * index.value}" }
    Box (contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f)){
        Text(text = message.value, style = MaterialTheme.typography.headlineMedium)
    }


}