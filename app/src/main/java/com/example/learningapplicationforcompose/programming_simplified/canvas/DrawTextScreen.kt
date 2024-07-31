package com.example.learningapplicationforcompose.programming_simplified.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawTextScreen(modifier: Modifier = Modifier) {
    val textMeasure = rememberTextMeasurer()
    val text = "Hello World!"
    val textLayoutMeasure = remember(text) {
        textMeasure.measure(text)
    }

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawCircle(
            color = Color.Red
        )

        drawText(
            text = "Hello World!",
            textMeasurer = textMeasure,
            topLeft = Offset(x = canvasWidth/2 - textLayoutMeasure.size.width/2, y= canvasHeight/2 - textLayoutMeasure.size.height/2)
        )


    }
}

@Preview(showBackground = true)
@Composable
private fun ShowDrawTextScreenPreview() {
    DrawTextScreen()
}


