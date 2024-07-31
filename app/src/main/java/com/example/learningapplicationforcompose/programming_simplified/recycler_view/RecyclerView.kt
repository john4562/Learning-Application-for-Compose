package com.example.learningapplicationforcompose.programming_simplified.recycler_view

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun RecyclerView(modifier: Modifier = Modifier) {

    VerticalRecyclerView()
}


data class Students(val id:Int, val name:String )




@Composable
fun VerticalRecyclerView(modifier: Modifier = Modifier) {

    val list = listOf("gff","djdg","fsjf","dshcjf","chd","fshj","hfjd","fdjd","fjg","fhh")

    val studentsList = listOf(
        Students(1, "King"),
        Students(2, "Kging"),
        Students(3, "Kingz"),
        Students(4, "Kinghj"),
        Students(5, "Kingjg"),
        Students(6, "Kijgng"),
        Students(7, "Kinfhdg"),
        Students(8, "Kidgsng"),
        Students(9, "Kiafang"),
        Students(10, "Kisdgsng"),
        Students(11, "Kigshng"),
        Students(12, "Kisfhdfng"),
        Students(13, "Kigjjfgng")
    )


    LazyColumn(modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(20.dp)
    ) {

       /* item{
            repeat(100) {
                Text(text = "Hello ${it+1}", modifier = Modifier.padding(15.dp))
                HorizontalDivider()
            }
        }*/

     /*   items(list) {
            Text(text = it, modifier = Modifier.padding(20.dp))
        }*/

        items(studentsList, key = {
            it.id
        }) {
            Text(text = it.name, Modifier.padding(10.dp))
        }


    }

}


@Composable
fun HorizontalRecyclerView(modifier: Modifier = Modifier) {
    val list = listOf("gff","djdg","fsjf","dshcjf","chd","fshj","hfjd","fdjd","fjg","fhh")

    LazyRow(modifier = Modifier.fillMaxWidth(),
        state = rememberLazyListState(
            4
        )) {
       /* items(list) {
            Text(text = it, Modifier.padding(  20.dp ))
        }*/

        itemsIndexed(list) {size,item->
            Text(text = "$item $size", Modifier.padding(  20.dp ))
        }
    }

}


@Composable
fun VerticalGridView(modifier: Modifier = Modifier) {
    val list = listOf("gff","djdg","fsjf","dshcjf","chd","fshj","hfjd","fdjd","fjg","fhh")

    LazyVerticalGrid(columns = GridCells.Adaptive(70.dp)) {
        itemsIndexed(list) {position,item->
            Text(text = "$item $position", Modifier.padding(  20.dp ))
        }

    }

}

@Composable
fun HorizontalGridView(modifier: Modifier = Modifier) {
    val list = listOf("gff","djdg","fsjf","dshcjf","chd","fshj","hfjd","fdjd","fjg","fhh")

    LazyHorizontalGrid(rows = GridCells.Fixed(4)) {
        itemsIndexed(list) {position,item->
            Text(text = "$item $position", Modifier.padding(  20.dp ))
        }
    }


}


@Preview(showBackground = true)
@Composable
private fun ShowRecyclerViewPreview() {
    HorizontalGridView()
}
