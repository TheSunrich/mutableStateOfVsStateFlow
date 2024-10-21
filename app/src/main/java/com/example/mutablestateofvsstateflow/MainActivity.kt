package com.example.mutablestateofvsstateflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mutablestateofvsstateflow.ui.theme.MutableStateOfVsStateFlowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MutableStateOfVsStateFlowTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterComparisonScreen()
                }
            }
        }
    }
}

@Composable
fun CounterComparisonScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //Text(text = "Counter with mutableStateOf", style = MaterialTheme.typography.headlineMedium)
        //CounterWithMutableStateOf()
        //Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Counter with StateFlow", style = MaterialTheme.typography.headlineMedium)
        CounterWithStateFlow()
    }
}

@Preview(showBackground = true)
@Composable
fun CounterComparisonScreenPreview() {
    CounterComparisonScreen()
}