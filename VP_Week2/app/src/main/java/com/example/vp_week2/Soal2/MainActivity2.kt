package com.example.vp_week2.Soal2

import androidx.compose.foundation.Image

import androidx.compose.material3.TextField
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.text.TextStyle
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.window.Popup
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import com.example.vp_week2.R


val Poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_regular, FontWeight.Bold)
)


@Composable
fun screen(){

    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }
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
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            val starColor = Color(0xFFFFB800)

            Text(
                text = "My Travel",
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize =  24.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Full Moon",
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Fairytale",
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.White.copy(alpha = 0.8f)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(5) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = null,
                        tint = starColor,
                        modifier = Modifier.size(18.dp)
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "5.0",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            TravelTextField(
                value = text1,
                onValueChange = {text1 = it},
                placeholder = "What did you enjoy most about your trip?"
            )

            Spacer(modifier = Modifier.height(12.dp))

            TravelTextField(
                value = text2,
                onValueChange = { text2 = it },
                placeholder = "What was your favorite spot?"
            )

            Spacer(modifier = Modifier.height(12.dp))

            TravelTextField(
                value = text3,
                onValueChange = { text3 = it },
                placeholder = "Anything else you'd like to add?"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.BottomEnd
            ) {
                FloatingActionButton(
                    onClick = { },
                    containerColor = Color(0xFFD6E3F3),
                    contentColor = Color.Black,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add"
                    )
                }
            }
        }
    }
}

@Composable
fun TravelTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String
){
    val bg = Color(0xFFD6E3F3)

    TextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                fontFamily = Poppins,
                fontSize = 12.sp,
                color = Color(0xFF6E788B)
            )
        },
        textStyle = TextStyle(
            fontFamily = Poppins,
            fontSize = 12.sp,
            color = Color.Black
        ),
        singleLine = true,
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = bg,
            unfocusedContainerColor = bg,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun screenPreview() {
    screen()
}