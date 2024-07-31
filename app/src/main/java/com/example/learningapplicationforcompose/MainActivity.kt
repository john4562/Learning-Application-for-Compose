package com.example.learningapplicationforcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningapplicationforcompose.navigation.bottom_bar.MainEntryPoint
import com.example.learningapplicationforcompose.programming_simplified.flow_row.FlowRowAndColumn
import com.example.learningapplicationforcompose.programming_simplified.intrinsic_measurment.IntrinsicMeasureExample
import com.example.learningapplicationforcompose.programming_simplified.multi_header.MultiHeaderWithLazyColumn
import com.example.learningapplicationforcompose.ui.theme.LearningApplicationForComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  enableEdgeToEdge()
        setContent {
            LearningApplicationForComposeTheme {
             //   MainEntryPoint()
               // HorizontalPagerScreen()
                MultiHeaderWithLazyColumn()
            }


        }
    }
}

@Preview
@Composable
private fun ShowPreview() {
    MainEntryPoint()
}

/*
@Preview
@Composable
private fun SpeechBubblePreview() {
    LearningApplicationForComposeTheme {
        val tipSize = with(LocalDensity.current) {15.dp.toPx()}
        val cornerRadius = with(LocalDensity.current) {15.dp.toPx()}


        Box(modifier = Modifier
            .size(200.dp)
            .drawBehind {
                val path = Path().apply {
                    addRoundRect(
                        RoundRect(
                            left = tipSize,
                            top = 0f,
                            right = size.width,
                            bottom = size.height - tipSize,
                            radiusX = cornerRadius,
                            radiusY = cornerRadius

                        )
                    )

                    moveTo(
                        x = tipSize,
                        y = size.height - tipSize - cornerRadius
                    )

                    lineTo(
                        x = 0f,
                        y = size.height
                    )

                    lineTo(
                        x = tipSize + cornerRadius,
                        y = size.height - tipSize
                    )

                    close()

                }

                drawPath(
                    path = path,
                    color = Color.Red
                )

            }
        ) {
            Text(text = "Hello World!", modifier = Modifier.offset(x = 18.dp, y = 2.dp))
        }
    }

}
*/

/*
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowDetails() {
    val state = rememberSaveable {
        mutableStateOf(1)
    }
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .padding(10.dp)
        .fillMaxSize()){
        Text(text = "Notification count is ${state.value}")
        Button(onClick = { state.value++ }) {
            Text(text = "Send Notification")
        }
    }
}

@Composable
fun ShowName() {
    Text(text = "my is Khan",
        fontSize = 32.sp,
        color = Color.Red,
        fontStyle = FontStyle.Normal,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,

    )
}

@Preview(showBackground = true, widthDp = 300, heightDp = 600)
@Composable
fun ShowNamePreview() {
    val TAG = "MyTags"

*/
/*    Text(text = "Hello", color = Color.White, modifier = Modifier.background(Color.Blue).size(200.dp).border(4.dp,Color.Red).clip(
        CircleShape).background(Color.Yellow))*//*


    Image(painter = painterResource(id = R.drawable.scenery), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier
        .size(80.dp)
        .clip(
            CircleShape
        ))


  */
/*  Row(modifier = Modifier.padding(5.dp)) {
        Image(painter = painterResource(id = R.drawable.avtar), contentDescription = "Profile Image", contentScale = ContentScale.Crop,)
        Column  {
            Text(text = "King Khan", fontSize = 22.sp)
            Text(text = "software engineer", fontSize = 15.sp)
        }
    }*//*


   // ShowName()
  */
/*  Button(onClick = {  }, colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color.Blue)) {
        Text(text = "Games")

    }*//*


}*/
