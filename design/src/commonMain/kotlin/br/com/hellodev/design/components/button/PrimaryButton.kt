package br.com.hellodev.design.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.hellodev.design.ui.theme.MyTheme
import br.com.hellodev.design.ui.typography.UrbanistFamily
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(58.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MyTheme.colorScheme.button.primaryBackground,
            disabledContainerColor = MyTheme.colorScheme.disabledDefaultColor
        ),
        content = {
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 22.4.sp,
                    fontFamily = UrbanistFamily(),
                    fontWeight = FontWeight.Bold,
                    color = MyTheme.colorScheme.button.primaryText,
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.2.sp
                )
            )
        }
    )
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    MyTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MyTheme.colorScheme.screen.backgroundPrimary)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            PrimaryButton(
                text = "Continuar",
                onClick = {}
            )
        }
    }
}