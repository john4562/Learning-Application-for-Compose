package com.example.learningapplicationforcompose.viewpager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerScreen(modifier: Modifier = Modifier) {

    val pagestate = rememberPagerState(pageCount = {10})
    val scope = rememberCoroutineScope()


    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(state = pagestate, modifier = Modifier.align(Alignment.Center))
        {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Text(text = "Page $it", fontSize = 30.sp)
            }
            
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
            .align(Alignment.BottomCenter), horizontalAlignment = Alignment.CenterHorizontally) {

            Button(onClick = {
                scope.launch {
                    pagestate.animateScrollToPage(pagestate.currentPage+1)
                }}) {
                Text(text = "Next")
            }


            Row {
                repeat(10) {
                    CustomIndicator(selected = pagestate.currentPage == it)
                }
            }

        }

    }

    



}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CustomIndicator(selected:Boolean) {
        Box(modifier = Modifier
            .padding(2.dp)
            .background(
                color = if (selected) Color.Red else Color.Gray, shape = CircleShape
            )
            .size(10.dp)) {

        }

}



@Preview
@Composable
private fun ShowData() {
    HorizontalPagerScreen()
}