package com.example.learningapplicationforcompose.programming_simplified.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawPointScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawPoints(
            points = listOf(
                Offset(canvasWidth/2, 30.dp.toPx()),
                Offset(canvasWidth/4, canvasHeight/4),
                Offset(canvasWidth/2, canvasHeight/2)
            ),
            pointMode = PointMode.Points,
            color = Color.Red,
            strokeWidth = 50f,
            cap = StrokeCap.Round
        )

        
    }

}

@Preview(showBackground = true)
@Composable
private fun ShowDrawPointScreenPreview() {
    DrawPointScreen()
}