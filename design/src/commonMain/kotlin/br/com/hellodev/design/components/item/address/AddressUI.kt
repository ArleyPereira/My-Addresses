package br.com.hellodev.design.components.item.address

import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.hellodev.design.components.divider.HorizontalDividerUI
import br.com.hellodev.design.ui.functions.BorderStrokeNone
import br.com.hellodev.design.ui.functions.borderStrokeDefault
import br.com.hellodev.design.ui.theme.MyTheme
import br.com.hellodev.design.ui.typography.UrbanistFamily
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AddressUI(
    modifier: Modifier = Modifier
) {
    Card(
        onClick = {},
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(28.dp),
        colors = CardDefaults.cardColors(
            containerColor = MyTheme.colorScheme.screen.backgroundSecondary
        ),
        border = if (isSystemInDarkTheme()) {
            BorderStrokeNone
        } else {
            borderStrokeDefault()
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            end = 20.dp,
                            top = 20.dp
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .border(
                                    border = borderStrokeDefault(),
                                    shape = RoundedCornerShape(16.dp)
                                )
                                .size(64.dp),
                            contentAlignment = Alignment.Center
                        ) {
//                            ImageUI(
//                                modifier = Modifier
//                                    .size(32.dp),
//                                imageModel = R.drawable.ic_google,
//                                contentScale = ContentScale.Crop,
//                                previewPlaceholder = painterResource(R.drawable.ic_google),
//                                onClick = {}
//                            )
                        }

                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(horizontal = 16.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "UI/UX Designer",
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 24.sp,
                                    fontFamily = UrbanistFamily(),
                                    fontWeight = FontWeight(700),
                                    color = MyTheme.colorScheme.text.color
                                )
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Google LLC",
                                style = TextStyle(
                                    lineHeight = 22.4.sp,
                                    fontFamily = UrbanistFamily(),
                                    fontWeight = FontWeight(500),
                                    color = MyTheme.colorScheme.text.color,
                                    letterSpacing = 0.2.sp
                                )
                            )
                        }
                    }

//                    val checked = false
//                    Icon(
//                        painter = if (checked) {
//                            painterResource(Res.drawable.ic_mark_fill)
//                        } else painterResource(R.drawable.ic_mark_line),
//                        contentDescription = null,
//                        tint = if (isSystemInDarkTheme() || checked) {
//                            MyTheme.colorScheme.defaultColor
//                        } else MyTheme.colorScheme.icon.color
//                    )
                }

                HorizontalDividerUI(
                    modifier = Modifier
                        .padding(
                            vertical = 12.dp,
                            horizontal = 20.dp
                        )
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            bottom = 20.dp
                        )
                ) {
                    Spacer(modifier = Modifier.width(80.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Vitória, Espiríto Santo",
                            style = TextStyle(
                                lineHeight = 25.2.sp,
                                fontFamily = UrbanistFamily(),
                                fontWeight = FontWeight(500),
                                color = MyTheme.colorScheme.text.color,
                                letterSpacing = 0.2.sp
                            )
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "R$10,000 - R$25,000 / mês",
                            style = TextStyle(
                                lineHeight = 25.2.sp,
                                fontFamily = UrbanistFamily(),
                                fontWeight = FontWeight(600),
                                color = MyTheme.colorScheme.defaultColor,
                                letterSpacing = 0.2.sp
                            )
                        )

                        Spacer(modifier = Modifier.height(10.dp))

//                        LazyRow(
//                            modifier = Modifier
//                                .fillMaxWidth(),
//                            horizontalArrangement = Arrangement.spacedBy(8.dp),
//                            contentPadding = PaddingValues(
//                                end = 16.dp
//                            ),
//                        ) {
//                            items(2) { index ->
//                                AddressUI(text = "Tag: $index")
//                            }
//                        }
                    }
                }
            }
        }
    )
}

@Preview
@Composable
private fun JobItemUIPreview() {
    MyTheme {
        AddressUI()
    }
}