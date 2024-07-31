package com.example.learningapplicationforcompose.quotes.design.utils

import android.content.Context
import android.graphics.pdf.PdfDocument.Page
import androidx.compose.runtime.mutableStateOf
import com.example.learningapplicationforcompose.quotes.design.Pages
import com.example.learningapplicationforcompose.quotes.design.models.Quote
import com.google.gson.Gson

object  DataManager {

    var data = emptyArray<Quote>()
    var currentQuote:Quote? = null

    var isDateLoaded = mutableStateOf(false)
    var currentPage = mutableStateOf(Pages.LISTING)

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDateLoaded.value = true
    }

    fun switchPages(quote: Quote?) {
        if (currentPage.value  == Pages.LISTING) {
            currentQuote = quote
            currentPage.value == Pages.DETAIL
        }else{
            currentPage.value == Pages.LISTING
        }
    }

}