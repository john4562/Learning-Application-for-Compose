package com.example.learningapplicationforcompose.programming_simplified.intrinsic_measurment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.IntrinsicMeasureScope
import androidx.compose.ui.unit.dp

@Composable
fun IntrinsicMeasureExample() {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .height(IntrinsicSize.Min)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Text 1 \n jjgfg hhfd")
            Divider(
                modifier = Modifier
                    .width(1.dp)
                    .fillMaxHeight()
            )
            Text(text = "Text 2 \n hjg \n fjdjg \n fhfdh \n" +
                    " fhfdh\n" +
                    " fhfdh\n" +
                    " fhfdh")

        }
    }

}