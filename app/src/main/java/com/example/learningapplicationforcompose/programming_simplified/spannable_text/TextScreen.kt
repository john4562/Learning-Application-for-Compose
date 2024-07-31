package com.example.learningapplicationforcompose.programming_simplified.spannable_text

import android.text.style.ClickableSpan
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
private fun SpannableTextPreview() {

    val text1 = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.Red,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        ) {
            append("H")
        }
        append("ello")
    }

    //way 1 to make spannable text
    val text2 = buildAnnotatedString {
        append("Please Accept the ")

        withStyle(
            style = SpanStyle(
                color = Color.Red,
                textDecoration = TextDecoration.Underline
            )
        ) {

            append("terms ")
        }

        append("and ")

        withStyle(
            style = SpanStyle(
                color = Color.Red,
                textDecoration = TextDecoration.Underline
            )
        ) {
            append("Privacy Policy")
        }

    }

    //way 2 to create a Spannable text with click action
    val text3 = buildAnnotatedString {
        append("Please Accept the ")
        pushStringAnnotation("terms", "terms")
        pushStyle( style = SpanStyle(
            color = Color.Red,
            textDecoration = TextDecoration.Underline
        ))
        append("terms ")
        pop()

        append("and ")
        pushStringAnnotation("privacy","privacy")
        pushStyle( style = SpanStyle(
            color = Color.Red,
            textDecoration = TextDecoration.Underline
        ))
        append("Privacy Policy")
        pop()




    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = text1)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = text2)

        Spacer(modifier = Modifier.height(20.dp))

        ClickableText(text = text3) {offset->
            text3.getStringAnnotations("terms",offset, offset).firstOrNull()?.let {
                it.item
            }

        }







    }

}