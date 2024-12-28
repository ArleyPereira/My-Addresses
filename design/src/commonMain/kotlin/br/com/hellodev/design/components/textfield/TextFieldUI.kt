package br.com.hellodev.design.components.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.hellodev.core.mask.MaskVisualTransformation
import br.com.hellodev.design.ui.theme.MyTheme
import br.com.hellodev.design.ui.typography.UrbanistFamily
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TextFieldUI(
    modifier: Modifier = Modifier,
    value: String = "",
    placeholder: String = "",
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onValueChange: (String) -> Unit
) {
    val focusRequester = remember { FocusRequester() }
    val customTextSelectionColors = TextSelectionColors(
        handleColor = MyTheme.colorScheme.defaultColor,
        backgroundColor = MyTheme.colorScheme.alphaDefaultColor
    )

    CompositionLocalProvider(LocalTextSelectionColors provides customTextSelectionColors) {
        TextField(
            value = value,
            onValueChange = { value ->
                val filteredValue = when (visualTransformation) {
                    is MaskVisualTransformation -> value.filter { it.isDigit() }

                    else -> value
                }

                if (filteredValue.length <= maxLength) {
                    onValueChange(filteredValue)
                }
            },
            modifier = modifier
                .fillMaxWidth()
                .focusRequester(focusRequester),
            enabled = true,
            placeholder = {
                Text(
                    text = placeholder,
                    style = TextStyle(
                        lineHeight = 19.6.sp,
                        fontFamily = UrbanistFamily(),
                        color = MyTheme.colorScheme.textField.placeholder,
                        letterSpacing = 0.2.sp
                    )
                )
            },
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = MyTheme.colorScheme.textField.background,
                focusedContainerColor = MyTheme.colorScheme.textField.background,
                disabledContainerColor = MyTheme.colorScheme.textField.background,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                errorContainerColor = MyTheme.colorScheme.textField.errorBackground,
                errorIndicatorColor = Color.Transparent,
                unfocusedTextColor = MyTheme.colorScheme.textField.text,
                focusedTextColor = MyTheme.colorScheme.textField.text,
                errorTextColor = MyTheme.colorScheme.textField.text,
                disabledTextColor = MyTheme.colorScheme.textField.disabledText,
                cursorColor = MyTheme.colorScheme.defaultColor
            )
        )
    }
}

@Preview
@Composable
private fun TextFieldUIPreview() {
    var textValue by remember {
        mutableStateOf("testando")
    }

    MyTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MyTheme.colorScheme.screen.backgroundPrimary),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextFieldUI(
                modifier = Modifier
                    .padding(32.dp),
                value = textValue,
                placeholder = "Ex: Arley Santana",
                onValueChange = {
                    textValue = it
                }
            )
        }
    }
}