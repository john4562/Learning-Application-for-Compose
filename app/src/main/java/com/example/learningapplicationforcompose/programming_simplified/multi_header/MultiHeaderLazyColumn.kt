package com.example.learningapplicationforcompose.programming_simplified.multi_header

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun MultiHeaderWithLazyColumn() {

    var isShow = remember {
        mutableStateMapOf<String, Boolean>()
    }

    LazyColumn(modifier = Modifier.padding(20.dp)) {
        val groupItem = itemList.groupBy { it.type }
        groupItem.forEach{(type, items) ->
            item{
                Row {
                    Text(text = type, style = MaterialTheme.typography.displayLarge.copy(
                        fontWeight = FontWeight.W700,
                        color = Color.Black
                    ))

                    Text(text = "(${items.size})", style = MaterialTheme.typography.displayLarge.copy(
                        color = Color.Black
                    ))
                    IconButton(onClick = { /*TODO*/ }) {
                      //  Icon(imageVector = if(isShow(type) == true) Icons.Default.KeyboardArrowDown else Icons.Default.KeyboardArrowUp, contentDescription = )
                    }

                }
            }

            items(items, key = {
                it.id
            }) {
                Text(text = it.name, modifier = Modifier.padding(vertical = 10.dp))
            }

        }
    }

}



data class Item(val id:Int,
    val name:String,
    val type:String)

val itemList = listOf(Item(11, "Lion", "Animal"),
    Item(1, "Tiger", "Animal"),
    Item(2, "Lion", "Animal"),
    Item(3, "Beer", "Animal"),
    Item(4, "Lotus", "Flower"),
    Item(5, "Sunflower", "Flower"),
    Item(7, "Rose", "Flower"),
    Item(8, "Table", "Furniture"),
    Item(9, "Chair", "Furniture"),
    Item(10, "Bed", "Furniture"),)