package dev.shushant.customkeyboardsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.shushant.customkeyboard.custom.CustomTextField
import dev.shushant.customkeyboard.keyboard.CustomKeyboardView
import dev.shushant.customkeyboardsample.ui.theme.CustomKeyboardSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomKeyboardSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CustomKeyboardSample()
                }
            }
        }
    }
}

@Composable
fun CustomKeyboardSample() {
    val textState = remember { mutableStateOf(TextFieldValue(text = "")) }

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .fillMaxSize()
    ) {
        CustomTextField(
            textState = textState,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .padding(10.dp)
        )
        Column {
            CustomKeyboardView(textFieldState = textState,
                focusFirstKey = false,
                enableEmailSuggestions = false,
                modifier = Modifier.shadow(8.dp),
                onAction = {

                }) {}
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CustomKeyboardSampleTheme {
        CustomKeyboardSample()
    }
}