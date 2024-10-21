package com.example.mutablestateofvsstateflow

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CounterViewModel : ViewModel() {
    private val _counter = MutableStateFlow(0)
    val counter: StateFlow<Int> = _counter

    fun increase() {
        _counter.update { it + 1 }
    }

    fun decrease() {
        _counter.update { it - 1 }
    }
}

@Composable
fun CounterWithStateFlow(viewModel: CounterViewModel = viewModel()) {
    val counter by viewModel.counter.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Counter: $counter", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.increase() }) {
            Text(text = "Increase")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.decrease() }) {
            Text(text = "Decrease")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterWithStateFlowPreview() {
    CounterWithStateFlow()
}


