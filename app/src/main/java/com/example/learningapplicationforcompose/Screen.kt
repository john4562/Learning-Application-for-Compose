package com.example.learningapplicationforcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(heightDp = 500)
@Composable
fun PreviewItem() {
    LazyColumn(content = {
        items(getCategoryList()) {item->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    })


 /*   Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map { item->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    }*/
}


@Composable
fun BlogCategory(img:Int, title:String, subtitle:String) {

    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .clip(CircleShape)
                    .weight(0.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(0.8f))
        }

    }


}

@Composable
public fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = title, style = MaterialTheme.typography.bodyLarge)
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            style = MaterialTheme.typography.labelMedium
        )
    }
}


data class Category(val img:Int, val title:String, val subtitle:String)


fun getCategoryList():MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.avtar,"Programming", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Technology", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Full Stack Developers", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"DevOps", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"AI & ML", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Programming", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Technology", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Full Stack Developers", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"DevOps", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"AI & ML", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Programming", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Technology", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Full Stack Developers", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"DevOps", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"AI & ML", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Programming", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Technology", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"Full Stack Developers", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"DevOps", "Learn Different Language"))
    list.add(Category(R.drawable.avtar,"AI & ML", "Learn Different Language"))
        return list
}

