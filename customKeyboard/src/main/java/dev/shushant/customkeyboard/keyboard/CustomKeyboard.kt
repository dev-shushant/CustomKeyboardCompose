package dev.shushant.customkeyboard.keyboard

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.text.input.TextFieldValue
import dev.shushant.customkeyboard.model.Key

class CustomKeyboard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {
    @Composable
    override fun Content() {

        val textFieldState = remember {
            mutableStateOf(TextFieldValue(""))
        }
        val focusFirstKey by remember {
            mutableStateOf(false)
        }
        val enableEmailSuggestions by remember {
            mutableStateOf(true)
        }
        val onAction: ((Key) -> Unit)? = null
        val onKeyPress: ((Key) -> Unit) = { }

        CustomKeyboardView(
            textFieldState = textFieldState,
            focusFirstKey = focusFirstKey,
            enableEmailSuggestions = enableEmailSuggestions,
            onAction = onAction,
            onKeyPress = onKeyPress
        )
    }
}