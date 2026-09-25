package com.example.vp_week2.Soal2

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vp_week2.R

@Composable
fun screen(){
    val card = Color(0xFF333852)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Image(
            painter = painterResource(id = R.drawable.wallpaper),
            contentDescription = "Background Aurora",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .align(Alignment.TopCenter)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.65f)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .background(card)
                .padding(24.dp)
        ) {

            val starColor = Color(0xFFFFB800)

            Text(
                text = "My"
            )
        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun screenPreview() {
    screen()
}