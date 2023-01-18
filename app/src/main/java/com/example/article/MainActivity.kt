package com.example.article

import android.media.Image
import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    text(text1 = getString(R.string.title), text2 = getString(R.string.short_description), text3 =getString(
                                            R.string.long_description) )
                }
            }
        }
    }
}


@Composable
fun text(text1:String,text2:String,text3:String){
    Column{
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()

        )
        Text(text=text1,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start=16.dp, end=16.dp, bottom=16.dp,  top=16.dp),

        )
        Text(text= text2,
            modifier = Modifier
                .padding(start=16.dp, end=16.dp),
            textAlign = Justify
        )
        Text(text=text3,
            modifier = Modifier
                .padding(start=16.dp, end=15.dp, bottom=15.dp,  top=15.dp),
            textAlign = Justify
        )


        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArticleTheme {
        text(text1 = "yoyoyo", text2 = "yoyoyoyoyoy", text3 ="yoyoyoyoyoyoy" )
    }
}



