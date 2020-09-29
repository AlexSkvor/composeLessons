package com.alexskvor.composetutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.alexskvor.composetutorial.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    val image = imageResource(id = R.drawable.header)
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        MaterialTheme {

            val imageModifier = Modifier
                .preferredHeight(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(8.dp))

            Image(
                asset = image,
                modifier = imageModifier,
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text(
                text = "A very long title for article" +
                        " that describes the full content" +
                        " of article itself and more then that " +
                        "this title is so long that we need " +
                        "to crop it with two lines or even less",
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "Text 22222222222",
                style = typography.body2
            )
            Text(
                text = "Text 33333333333",
                style = typography.body2
            )
        }
    }
}

@Preview
@Composable
fun PreviewGreeting() {
    NewsStory()
}