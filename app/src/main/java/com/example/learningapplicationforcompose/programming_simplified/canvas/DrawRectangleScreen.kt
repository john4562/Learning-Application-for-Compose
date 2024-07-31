package com.example.learningapplicationforcompose.programming_simplified.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawRectangleScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth =size.width
        val canvasHeight =size.height

        drawRect(
            color = Color.Red,
            size = Size(canvasWidth, canvasHeight/4),
            topLeft = Offset(x=0f,y=canvasHeight/3),
            style = Stroke(
                width = 10f,
                pathEffect = PathEffect.dashPathEffect(
                    floatArrayOf(10f,10f), 10f
                )
            )
        )


    }

}

@Composable
fun DrawRoundedRectangleScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.padding(horizontal = 20.dp).fillMaxSize()) {
        val canvasWidth =size.width
        val canvasHeight =size.height

        drawRoundRect(
            color = Color.Red,
            size = Size(canvasWidth, canvasHeight/4),
            topLeft = Offset(x=0f,y=canvasHeight/3),
            cornerRadius = CornerRadius(16.dp.toPx())

        )


    }

}




@Preview(showBackground = true)
@Composable
private fun ShowDrawRectangleScreenPreview() {
    DrawRoundedRectangleScreen()
}