package com.example.learningapplicationforcompose.programming_simplified.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawArcScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawArc(
            color = Color.Red,
            startAngle = 0f,
            sweepAngle = 90f,
            useCenter = false,
            topLeft = Offset(x = canvasWidth/4, y= canvasHeight/4),
            size = Size(200.dp.toPx(), 200.dp.toPx()),
            style = Stroke(10f)
        )

        
    }

}

@Preview(showBackground = true)
@Composable
private fun ShowDrawArcScreenPreview() {
    DrawArcScreen()
}