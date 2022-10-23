package com.example.composecamp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by Dede Dari Rahmadi on 19/10/22
 */
class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        Surface(modifier = Modifier.fillMaxSize(), color = Color.DarkGray) {
            Column(modifier = Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                SectionOne(modifier = Modifier.weight(1f))
                SectionTwo(Modifier.weight(1f))
            }
        }
    }

    @Composable
    fun SectionOne(modifier: Modifier) {
            Box(modifier = modifier, contentAlignment = Alignment.BottomCenter) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_logo),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 70.dp, height = 70.dp)
                    )
                    Text(text = "Dede Dari Rahmadi", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                    Text(text = "Android Developer", fontWeight = FontWeight.Bold)
                }
            }

    }


    @Composable
    fun SectionTwo(modifier: Modifier) {
        Column(modifier.wrapContentHeight(), verticalArrangement = Arrangement.spacedBy(10.dp), ) {
            PhoneNumber(phoneNumber = "089606185656")
            SocialMedia(socialMedia = "@D.BESAR")
            Email(email = "dededarirahmadi@gmail.com")
        }

    }

    @Composable
    fun PhoneNumber(phoneNumber: String) {
        Row() {
            Icon(Icons.Default.Phone, contentDescription = null)
            Text(text = phoneNumber, Modifier.padding(start = 16.dp))
        }
    }

    @Composable
    fun SocialMedia(socialMedia: String) {
        Row() {
            Icon(Icons.Default.Share, contentDescription = null)
            Text(text = socialMedia, Modifier.padding(start = 16.dp))
        }
    }

    @Composable
    fun Email(email: String) {
        Row() {
            Icon(Icons.Default.Email, contentDescription = null)
            Text(text = email, Modifier.padding(start = 16.dp))
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MainScreen()
    }
}