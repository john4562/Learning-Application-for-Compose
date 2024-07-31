package com.example.learningapplicationforcompose.programming_simplified.flow_row

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowAndColumn() {

  /*  FlowRow(modifier = Modifier.fillMaxWidth(),
        maxItemsInEachRow = 3,
        horizontalArrangement = Arrangement.Center) {
        repeat(20) {
            Text(text = "Text $it", Modifier.padding(start = 10.dp))
        }

    }*/


    FlowColumn(Modifier.fillMaxSize(),
        maxItemsInEachColumn = 8) {
        repeat(50) {
            Text(text = "Text $it", Modifier.padding(vertical = 10.dp))
        }
    }


}