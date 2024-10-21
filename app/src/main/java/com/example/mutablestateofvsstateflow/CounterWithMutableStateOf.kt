package com.example.mutablestateofvsstateflow
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CounterWithMutableStateOf() {
    var counter by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Counter: $counter", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { counter++ }) {
            Text(text = "Increase")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { counter-- }) {
            Text(text = "Decrease")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterWithMutableStateOfPreview() {
    CounterWithMutableStateOf()
}
