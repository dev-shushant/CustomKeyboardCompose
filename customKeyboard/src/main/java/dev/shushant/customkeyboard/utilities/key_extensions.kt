package dev.shushant.customkeyboard.utilities

import dev.shushant.customkeyboard.data.KeysDataSource
import dev.shushant.customkeyboard.model.Key
import dev.shushant.customkeyboard.model.NumericUtilityKey
import dev.shushant.customkeyboard.model.TextUtilityKey
import dev.shushant.customkeyboard.model.UtilityKey

fun Key.isBackspace() = this is UtilityKey.Backspace || this is NumericUtilityKey.Backspace
fun Key.isUppercase() = this is UtilityKey.Uppercase
fun Key.isToggleKey() = KeysDataSource.toggleKeys.contains(this)
fun Key.isAction() = this is UtilityKey.ActionArrow
fun Key.isNumeric() = this is TextUtilityKey.Numeric
fun Key.isAbc() = this is TextUtilityKey.ABC
fun Key.isClear() = this is UtilityKey.Clear
fun Key.isSpecialCharacters() = this is TextUtilityKey.SpecialCharacters
fun Key.handleCaseMode(isUppercaseEnabled: Boolean) =
    if (isUppercaseEnabled)
        text.uppercase()
    else
        text.lowercase()