package br.com.hellodev.design.components.bar.top

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.hellodev.design.ui.theme.MyTheme
import br.com.hellodev.design.ui.typography.UrbanistFamily
import myaddresses.design.generated.resources.Res
import myaddresses.design.generated.resources.ic_arrow_left
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarUI(
    modifier: Modifier = Modifier,
    title: String = "",
    onClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 28.8.sp,
                    fontFamily = UrbanistFamily(),
                    fontWeight = FontWeight.Bold
                )
            )
        },
        modifier = modifier,
        navigationIcon = {
            IconButton(
                modifier = Modifier
                    .padding(start = 8.dp),
                onClick = onClick,
                content = {
                    Icon(
                        painter = painterResource(Res.drawable.ic_arrow_left),
                        contentDescription = null
                    )
                }
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MyTheme.colorScheme.topAppBar.background,
            navigationIconContentColor = MyTheme.colorScheme.topAppBar.content,
            actionIconContentColor = MyTheme.colorScheme.topAppBar.content,
            titleContentColor = MyTheme.colorScheme.topAppBar.content
        )
    )
}

@Preview
@Composable
private fun TopAppBarUIPreview() {
    MyTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MyTheme.colorScheme.screen.backgroundPrimary),
        ) {
            TopAppBarUI(
                title = "Fill Your Profile",
                onClick = {}
            )
        }
    }
}