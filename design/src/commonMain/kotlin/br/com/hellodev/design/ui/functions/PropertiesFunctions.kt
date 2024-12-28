package br.com.hellodev.design.ui.functions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.com.hellodev.design.ui.theme.MyTheme

// Border Stroke None
val BorderStrokeNone = BorderStroke(
    width = 0.dp,
    color = Color.Transparent
)

@Composable
fun Modifier.borderDefault(
    width: Dp = 1.dp,
    color: Color = MyTheme.colorScheme.border.unselected,
    shape: Shape = CircleShape
): Modifier {
    return this
        .clip(shape)
        .drawBehind {
            drawOutline(
                outline = shape.createOutline(size, layoutDirection, this),
                color = color,
                style = androidx.compose.ui.graphics.drawscope.Stroke(width.toPx())
            )
        }
}

@Composable
fun borderStrokeDefault(isSelect: Boolean = false): BorderStroke {
    return if (isSelect) {
        BorderStroke(
            width = 1.dp,
            color = MyTheme.colorScheme.border.selected
        )
    } else {
        BorderStroke(
            width = 1.dp,
            color = MyTheme.colorScheme.border.unselected
        )
    }
}

@Composable
fun iconTintColor(filled: Boolean, isError: Boolean = false): Color {
    return if (isError) {
        MyTheme.colorScheme.alertColor
    } else {
        if (filled) {
            MyTheme.colorScheme.icon.color
        } else MyTheme.colorScheme.icon.default
    }
}
