package com.example.learningapplicationforcompose.quotes.design

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningapplicationforcompose.quotes.design.screens.QuoteDetails
import com.example.learningapplicationforcompose.quotes.design.screens.QuoteListItem
import com.example.learningapplicationforcompose.quotes.design.screens.QuoteListScreen
import com.example.learningapplicationforcompose.quotes.design.ui.theme.LearningApplicationForComposeTheme
import com.example.learningapplicationforcompose.quotes.design.utils.DataManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class QuotesAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            DataManager.loadAssetsFromFile(applicationContext)
        }
        setContent {
            App()
        }
    }

}


@Composable
fun App() {
    if (DataManager.isDateLoaded.value) {
        if (DataManager.currentPage.value == Pages.LISTING) {
            QuoteListScreen(data = DataManager.data) {
                Log.d(TAG, "App: item clicked called")
                DataManager.switchPages(it)
            }
        }else{
            Log.d(TAG, "App: else condition called")
            DataManager.currentQuote?.let { QuoteDetails(quote = it) }
        }
    }else{
        Box(contentAlignment = Alignment.Center,modifier = Modifier.fillMaxSize(1f)) {
            Text(text = "Loading....", style = MaterialTheme.typography.bodyMedium)
        }
    }
}


enum class Pages{
    LISTING,
    DETAIL
}

const val TAG = "MyTagjg"

