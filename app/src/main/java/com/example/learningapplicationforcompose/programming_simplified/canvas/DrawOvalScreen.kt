package com.example.learningapplicationforcompose.programming_simplified.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawOvalScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawOval(
            color = Color.Red,
            size = Size(200.dp.toPx(), 300.dp.toPx()),
            topLeft = Offset(x = canvasWidth/2, y= canvasHeight/2),
            style = Stroke(width = 10f),
        )



    }

}

@Preview(showBackground = true)
@Composable
private fun ShowDrawOvalScreen() {
    DrawOvalScreen()
    Text(text = "Games")
    Spacer(modifier = Modifier.fillMaxSize())
    Divider(Modifier.height(19.dp))
}

private fun mk() {
    println("Show Youtube Branch")
    println("This is 2nd commit")
    println("This is Games Branch")
    println("This is My Github Test")
}