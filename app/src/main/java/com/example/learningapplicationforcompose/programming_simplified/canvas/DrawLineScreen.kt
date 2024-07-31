package com.example.learningapplicationforcompose.programming_simplified.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DrawLineScreen() {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(
            color = Color.Red,
            start = Offset(x = 0f, y = canvasHeight/2) ,
            end = Offset(x = canvasWidth, y = canvasHeight/2),
            strokeWidth = 10f,
            cap = StrokeCap.Round,
//            pathEffect = PathEffect.dashPathEffect(
//                intervals = floatArrayOf(10f,20f),
//                phase = 0f
//            )
            pathEffect = PathEffect.chainPathEffect(
                inner = PathEffect.dashPathEffect(
                intervals = floatArrayOf(100f,20f),
                phase = 10f
            ),
                outer = PathEffect.cornerPathEffect(10f)
            )
        )


    }


}

@Composable
fun DiagonalLine(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(color = Color.Red,
            start = Offset.Zero,
            end = Offset(x = canvasWidth, y = canvasHeight),
            strokeWidth = 10f)

    }
}


@Composable
fun VerticalCentreLine(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(color = Color.Red,
            start = Offset(x=canvasWidth/2, y=0f),
            end = Offset(x = canvasWidth/2, y = canvasHeight),
            strokeWidth = 10f)

    }
}

@Composable
fun CenterScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(color = Color.Red,
            start = Offset(x=canvasWidth/2, y=0f),
            end = Offset(x = canvasWidth/2, y = canvasHeight),
            strokeWidth = 10f)

        drawLine(color = Color.Red,
            start = Offset(x=0f, y=canvasHeight/2),
            end = Offset(x = canvasWidth, y = canvasHeight/2),
            strokeWidth = 10f)

    }
}




@Preview(showBackground = true)
@Composable
private fun ShowDrawLinePreview() {
    CenterScreen()
}