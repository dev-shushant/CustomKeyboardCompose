package dev.shushant.customkeyboard.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.shushant.customkeyboard.data.KeysDataSource
import dev.shushant.customkeyboard.model.Key
import dev.shushant.customkeyboard.theme.colorScheme
import dev.shushant.customkeyboard.utilities.append
import dev.shushant.customkeyboard.utilities.clear
import dev.shushant.customkeyboard.utilities.handleCaseMode
import dev.shushant.customkeyboard.utilities.isAbc
import dev.shushant.customkeyboard.utilities.isAction
import dev.shushant.customkeyboard.utilities.isBackspace
import dev.shushant.customkeyboard.utilities.isClear
import dev.shushant.customkeyboard.utilities.isNumeric
import dev.shushant.customkeyboard.utilities.isSpecialCharacters
import dev.shushant.customkeyboard.utilities.isToggleKey
import dev.shushant.customkeyboard.utilities.isUppercase
import dev.shushant.customkeyboard.utilities.toggle
import dev.shushant.customkeyboard.utilities.updateAndRemoveLastChar

@Composable
fun CustomKeyboardView(
    modifier: Modifier = Modifier,
    darkTheme: Boolean = isSystemInDarkTheme(),
    textFieldState: MutableState<TextFieldValue>?,
    focusFirstKey: Boolean = false,
    enableEmailSuggestions: Boolean = true,
    onAction: ((key: Key) -> Unit)? = null,
    onKeyPress: (key: Key) -> Unit
) {
    val focusKey = remember { mutableStateOf(focusFirstKey) }
    val isUppercase = remember { mutableStateOf(false) }
    val isNumeric = remember { mutableStateOf(false) }
    val isSpecialCharacters = remember { mutableStateOf(false) }
    val alphabets = remember { mutableStateOf(KeysDataSource.normalKeys) }
    val numericKeys = remember { mutableStateOf(KeysDataSource.numericKeys) }
    val specialCharactersKeys = remember { mutableStateOf(KeysDataSource.specialCharactersKeys) }
    val colorScheme = darkTheme.colorScheme
    val keys by rememberUpdatedState(
        if (isNumeric.value) {
            numericKeys.value
        } else if (isSpecialCharacters.value) {
            specialCharactersKeys.value
        } else {
            alphabets.value
        }
    )
    Column(
        modifier = modifier
            .background(
                colorScheme.background,
                MaterialTheme.shapes.medium.copy(
                    topStart = CornerSize(12.dp),
                    topEnd = CornerSize(12.dp),
                    bottomEnd = CornerSize(0.dp),
                    bottomStart = CornerSize(0.dp)
                )
            )
            .padding(8.dp)
    ) {
        if (enableEmailSuggestions)
            EmailSuggestionsRow(textFieldState) {}

        LazyVerticalGrid(
            columns = GridCells.Fixed(10),
            horizontalArrangement = Arrangement.Center,
        ) {
            items(keys.size,
                key = { index ->
                    keys[index].text.plus(index)
                },
                span = { index ->
                    GridItemSpan(keys[index].span)
                }) { index ->
                CustomKeyboardButton(
                    key = keys[index],
                    requestFocus = focusKey.value && index == 0,
                    isUppercaseEnable = isUppercase.value,
                    isToggle = keys[index].isToggleKey(),
                ) {
                    if (it.isUppercase()) {
                        isUppercase.toggle()
                    } else if (it.isAction()) {
                        onAction?.invoke(it)
                    } else if (it.isSpecialCharacters()) {
                        isSpecialCharacters.toggle()
                        isNumeric.value = false
                    } else if (it.isNumeric() || it.isAbc()) {
                        isNumeric.toggle()
                        isSpecialCharacters.value = false
                    } else {
                        onKeyPress(it)
                        processKeys(it, textFieldState, isUppercase.value)
                    }
                }
            }
        }
    }
}

fun processKeys(it: Key, state: MutableState<TextFieldValue>?, isUppercase: Boolean) {
    if (it.isBackspace()) {
        state?.updateAndRemoveLastChar()
    } else if (it.isClear()) {
        state?.clear()
    } else {
        state?.append(it.handleCaseMode(isUppercase))
    }
}

@Preview
@Composable
fun KeyboardViewPreview() {
    CustomKeyboardView(textFieldState = null) {}
}