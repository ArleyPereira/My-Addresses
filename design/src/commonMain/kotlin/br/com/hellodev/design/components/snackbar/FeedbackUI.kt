package br.com.hellodev.design.components.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.hellodev.core.enums.feedback.FeedbackType
import br.com.hellodev.core.enums.feedback.FeedbackType.ERROR
import br.com.hellodev.core.enums.feedback.FeedbackType.INFO
import br.com.hellodev.core.enums.feedback.FeedbackType.SUCCESS
import br.com.hellodev.core.enums.feedback.FeedbackType.WARNING
import br.com.hellodev.design.ui.theme.MyTheme
import br.com.hellodev.design.ui.typography.UrbanistFamily
import myaddresses.design.generated.resources.Res
import myaddresses.design.generated.resources.ic_info
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun FeedbackUI(
    modifier: Modifier = Modifier,
    message: String,
    type: FeedbackType
) {
    val containerColor = when (type) {
        SUCCESS -> MyTheme.colorScheme.successColor
        INFO -> MyTheme.colorScheme.infoColor
        WARNING -> MyTheme.colorScheme.warningColor
        ERROR -> MyTheme.colorScheme.alertColor
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = containerColor
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(Res.drawable.ic_info),
                contentDescription = message,
                tint = Color.White
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = message,
                style = TextStyle(
                    fontFamily = UrbanistFamily(),
                    color = Color.White,
                    letterSpacing = 0.2.sp
                )
            )
        }
    }
}

@Preview
@Composable
private fun FeedbackUIPreview() {
    MyTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MyTheme.colorScheme.screen.backgroundPrimary),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FeedbackUI(
                message = "Login efetuado com sucesso",
                type = SUCCESS
            )

            FeedbackUI(
                message = "Login efetuado com sucesso",
                type = INFO
            )

            FeedbackUI(
                message = "Login efetuado com sucesso",
                type = WARNING
            )

            FeedbackUI(
                message = "Login efetuado com sucesso",
                type = ERROR
            )
        }
    }
}