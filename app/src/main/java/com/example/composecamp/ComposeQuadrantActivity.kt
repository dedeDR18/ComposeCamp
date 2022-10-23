package com.example.composecamp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Dede Dari Rahmadi on 19/10/22
 */

class ComposeQuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        Surface(modifier = Modifier.fillMaxWidth(), color = Color.DarkGray) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier.weight(1f)) {
                    Quadrant1(Modifier.weight(1f))
                    Quadrant2(Modifier.weight(1f))
                }
                Row(modifier = Modifier.weight(1f)) {
                    Quadrant3(Modifier.weight(1f))
                    Quadrant4(Modifier.weight(1f))
                }

            }

        }
    }

    @Composable
    fun Quadrant1(modifier: Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Green)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Title(stringResource(R.string.title_1))
            Paragraf(text = stringResource(R.string.description_1))
        }
    }

    @Composable
    fun Quadrant2(modifier: Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Yellow)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Title(stringResource(R.string.title_2))
            Paragraf(text = stringResource(R.string.description_2))
        }
    }

    @Composable
    fun Quadrant3(modifier: Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Cyan)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Title(stringResource(R.string.title_3))
            Paragraf(text = stringResource(R.string.description_3))
        }
    }

    @Composable
    fun Quadrant4(modifier: Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Title(stringResource(R.string.title_4))
            Paragraf(text = stringResource(R.string.description_4))
        }
    }


    @Composable
    fun Title(title: String) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }

    @Composable
    fun Paragraf(text: String) {
        Text(text = text, textAlign = TextAlign.Justify)
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MainScreen()
    }
}