package com.example.imagecollage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imagecollage.ui.theme.ImageCollageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageCollageTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    Column {
                        Row { Img(R.drawable.s1)
                            Img(R.drawable.s2)
                             }
                        Row { Img(R.drawable.s3)
                            Img(R.drawable.s4) }

                        Row { Img(R.drawable.s5)
                            Img(R.drawable.s6) }
                        Row { Img(R.drawable.s7)
                            Img(R.drawable.s8) }


                        Img(R.drawable.s9)

                    }

                }
            }
        }
    }
}

@Composable
fun Img(url: Int) {
    Image(
        painter = painterResource(id = url),
        contentDescription = "Image",
        modifier = Modifier
            .padding(10.dp)
            .width(170.dp)
            .height(150.dp)


    )

}

@Preview(showBackground = true,
    widthDp = 390,
    heightDp = 800)
@Composable
fun DefaultPreview() {
    ImageCollageTheme {
        Img(R.drawable.s1)
        Img(R.drawable.s2)
        Img(R.drawable.s3)
        Img(R.drawable.s4)
        Img(R.drawable.s5)
        Img(R.drawable.s6)
        Img(R.drawable.s7)
        Img(R.drawable.s8)
        Img(R.drawable.s9)
    }
}