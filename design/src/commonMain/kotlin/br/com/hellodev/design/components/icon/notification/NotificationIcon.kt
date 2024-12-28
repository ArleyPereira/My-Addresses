package br.com.hellodev.design.components.icon.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.hellodev.design.ui.functions.borderDefault
import br.com.hellodev.design.ui.theme.MyTheme
import myaddresses.design.generated.resources.Res
import myaddresses.design.generated.resources.ic_notification
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun NotificationIcon(
    modifier: Modifier = Modifier,
    viewed: Boolean = false,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .borderDefault()
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() },
                onClick = onClick
            )
            .padding(12.dp)
    ) {
        Icon(
            painter = painterResource(Res.drawable.ic_notification),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp),
            tint = MyTheme.colorScheme.icon.color
        )

        if (!viewed) {
            Box(
                modifier = Modifier
                    .size(6.dp)
                    .background(
                        color = MyTheme.colorScheme.alertColor,
                        shape = CircleShape
                    )
                    .align(Alignment.TopEnd)
            )
        }
    }
}

@Preview
@Composable
private fun NotificationIconPreview() {
    MyTheme {
        Column(
            modifier = Modifier
                .background(MyTheme.colorScheme.screen.backgroundPrimary)
                .padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NotificationIcon(
                viewed = false,
                onClick = {}
            )
        }
    }
}