package dev.shushant.customkeyboard.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector
import dev.shushant.customkeyboard.data.KeysConstants

sealed class UtilityKey(
    open val icon: ImageVector,
    override val text: String,
    override val span: Int = 1
) : Key {
    data object Uppercase : UtilityKey(
        Icons.Outlined.KeyboardCapslock,
        KeysConstants.UPPER_CASE_KEY
    )

    data object Backspace : UtilityKey(
        Icons.Outlined.KeyboardBackspace,
        KeysConstants.BACK_SPACE_KEY
    )

    data object Clear : UtilityKey(
        Icons.Outlined.Delete,
        KeysConstants.CLEAR_KEY,
        2
    )

    data object Space : UtilityKey(
        Icons.Outlined.SpaceBar,
        KeysConstants.SPACE_KEY,
        3
    )

    data object ActionArrow : UtilityKey(
        Icons.Outlined.Search,
        KeysConstants.SEARCH_KEY,
        2
    )
}