package br.com.hellodev.design.ui.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import myaddresses.design.generated.resources.Res
import myaddresses.design.generated.resources.urbanist_400
import myaddresses.design.generated.resources.urbanist_500
import myaddresses.design.generated.resources.urbanist_600
import myaddresses.design.generated.resources.urbanist_700
import org.jetbrains.compose.resources.Font

@Composable
fun UrbanistFamily(): FontFamily {
    return FontFamily(
        Font(Res.font.urbanist_400, FontWeight.Normal),
        Font(Res.font.urbanist_500, FontWeight.Medium),
        Font(Res.font.urbanist_600, FontWeight.SemiBold),
        Font(Res.font.urbanist_700, FontWeight.Bold)
    )
}