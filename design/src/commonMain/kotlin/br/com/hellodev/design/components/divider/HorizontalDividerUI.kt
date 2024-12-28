package br.com.hellodev.design.components.divider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.hellodev.design.ui.theme.MyTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HorizontalDividerUI(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalDivider(
            modifier = Modifier,
            color = MyTheme.colorScheme.divider.color
        )
    }
}

@Preview
@Composable
private fun HorizontalDividerUIPreview() {
    MyTheme {
        Column(
            modifier = Modifier
                .background(MyTheme.colorScheme.screen.backgroundPrimary)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalDividerUI()
        }
    }
}