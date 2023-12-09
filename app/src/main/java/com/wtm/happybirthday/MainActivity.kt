package com.wtm.happybirthday

import android.media.Image
import android.os.Bundle
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wtm.happybirthday.ui.theme.HappyBirthdayTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                GreetingText(message = "Happy Birthday Manny!", from = "From Dorcas")
                }
            }
        }
    }

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
       Box{
            Image(
                painter = painterResource(id = R.drawable.manny_u),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F
            )
        }
    }


    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(60.dp)

    ) {

        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(24.dp)

        )

            }
     }

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText( stringResource(R.string.happy_birthday_text),
            stringResource(R.string.signature_text))
    }
}