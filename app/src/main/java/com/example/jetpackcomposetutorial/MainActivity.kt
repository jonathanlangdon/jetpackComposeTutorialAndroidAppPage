package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetpackComposeTutorialPage(
                        title = stringResource(R.string.jetpack_compose_tutorial_title),
                        paragraph1 = stringResource(R.string.compose_tutorial_paragraph_1),
                        paragraph2 = stringResource(R.string.compose_tutorial_paragraph_2)
                    )
                }
            }
        }
    }
}


@Composable
fun TutorialText(
    title: String,
    paragraph1: String,
    paragraph2: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = paragraph1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun JetpackComposeTutorialPage(
    title: String,
    paragraph1: String,
    paragraph2: String,
    modifier: Modifier = Modifier
) {
    val jetpackComposeTopImage = painterResource(R.drawable.bg_compose_background)
    Box(modifier) {
        Image(
            painter = jetpackComposeTopImage,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        TutorialText(
            title = title,
            paragraph1 = paragraph1,
            paragraph2 = paragraph2,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun JetPackComposeTutorialPreview() {
    JetpackComposeTutorialTheme {
        JetpackComposeTutorialPage(
            title = stringResource(R.string.jetpack_compose_tutorial_title),
            paragraph1 = stringResource(R.string.compose_tutorial_paragraph_1),
            paragraph2 = stringResource(R.string.compose_tutorial_paragraph_2)
        )
    }
}