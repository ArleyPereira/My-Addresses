package br.com.hellodev.design.ui.scheme

import androidx.compose.ui.graphics.Color
import br.com.hellodev.design.presenter.theme.scheme.DividerColorScheme

data class MyColorScheme(
    val text: TextColorScheme,
    val screen: ScreenColorScheme,
    val icon: IconColorScheme,
    val button: ButtonColorScheme,
    val border: BorderColorScheme,
    val divider: DividerColorScheme,
    val socialButton: br.com.hellodev.design.ui.scheme.SocialButtonColorScheme,
    val textField: TextFieldColorScheme,
    val switch: SwitchColorScheme,
    val topAppBar: br.com.hellodev.design.ui.scheme.TopAppBarColorScheme,
    val radio: RadioColorScheme,
    val check: CheckColorScheme,
    val tag: TagColorScheme,
    val defaultColor: Color,
    val alphaDefaultColor: Color,
    val disabledDefaultColor: Color,
    val successColor: Color,
    val disabledColor: Color,
    val infoColor: Color,
    val warningColor: Color,
    val alertColor: Color,
    val greyscale900Color: Color,
    val greyscale800Color: Color,
    val greyscale700Color: Color,
    val greyscale600Color: Color,
    val greyscale500Color: Color,
    val greyscale400Color: Color,
    val greyscale300Color: Color,
    val greyscale200Color: Color,
    val greyscale100Color: Color,
    val greyscale50Color: Color,
    val spotColor: Color,
    val ambientColor: Color,
)
