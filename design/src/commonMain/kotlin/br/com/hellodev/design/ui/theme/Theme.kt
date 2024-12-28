package br.com.hellodev.design.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import br.com.hellodev.design.presenter.theme.scheme.DividerColorScheme
import br.com.hellodev.design.ui.color.AlertColor
import br.com.hellodev.design.ui.color.AlphaDefaultColor
import br.com.hellodev.design.ui.color.AmbientColor
import br.com.hellodev.design.ui.color.BackgroundSocialButtonColorDark
import br.com.hellodev.design.ui.color.BackgroundSocialButtonColorLight
import br.com.hellodev.design.ui.color.BorderSocialButtonColorDark
import br.com.hellodev.design.ui.color.BorderSocialButtonColorLight
import br.com.hellodev.design.ui.color.CheckedColor
import br.com.hellodev.design.ui.color.DefaultColor
import br.com.hellodev.design.ui.color.DisabledColor
import br.com.hellodev.design.ui.color.DisabledDefaultColor
import br.com.hellodev.design.ui.color.DisabledTextColorDark
import br.com.hellodev.design.ui.color.DisabledTextColorLight
import br.com.hellodev.design.ui.color.DisabledTextFieldTextColorDark
import br.com.hellodev.design.ui.color.DisabledTextFieldTextColorLight
import br.com.hellodev.design.ui.color.DividerColorDark
import br.com.hellodev.design.ui.color.DividerColorLight
import br.com.hellodev.design.ui.color.Greyscale100Color
import br.com.hellodev.design.ui.color.Greyscale200Color
import br.com.hellodev.design.ui.color.Greyscale300Color
import br.com.hellodev.design.ui.color.Greyscale400Color
import br.com.hellodev.design.ui.color.Greyscale500Color
import br.com.hellodev.design.ui.color.Greyscale50Color
import br.com.hellodev.design.ui.color.Greyscale600Color
import br.com.hellodev.design.ui.color.Greyscale700Color
import br.com.hellodev.design.ui.color.Greyscale800Color
import br.com.hellodev.design.ui.color.Greyscale900Color
import br.com.hellodev.design.ui.color.IconColorDark
import br.com.hellodev.design.ui.color.IconColorLight
import br.com.hellodev.design.ui.color.IconDefaultColor
import br.com.hellodev.design.ui.color.InfoColor
import br.com.hellodev.design.ui.color.PrimaryBackgroundColorDark
import br.com.hellodev.design.ui.color.PrimaryBackgroundColorLight
import br.com.hellodev.design.ui.color.PrimaryButtonColor
import br.com.hellodev.design.ui.color.PrimaryButtonTextColorDark
import br.com.hellodev.design.ui.color.PrimaryButtonTextColorLight
import br.com.hellodev.design.ui.color.RadioSelectedColor
import br.com.hellodev.design.ui.color.RadioUnselectedColor
import br.com.hellodev.design.ui.color.SecondaryBackgroundColorDark
import br.com.hellodev.design.ui.color.SecondaryBackgroundColorLight
import br.com.hellodev.design.ui.color.SecondaryButtonColorDark
import br.com.hellodev.design.ui.color.SecondaryButtonColorLight
import br.com.hellodev.design.ui.color.SecondaryButtonTextColorDark
import br.com.hellodev.design.ui.color.SecondaryButtonTextColorLight
import br.com.hellodev.design.ui.color.SelectedBorderColor
import br.com.hellodev.design.ui.color.SpotColor
import br.com.hellodev.design.ui.color.SuccessColor
import br.com.hellodev.design.ui.color.SwitchSelectedBackgroundColor
import br.com.hellodev.design.ui.color.SwitchUnselectedBackgroundColor
import br.com.hellodev.design.ui.color.TagBackgroundColorDark
import br.com.hellodev.design.ui.color.TagBackgroundColorLight
import br.com.hellodev.design.ui.color.TagBorderColorDark
import br.com.hellodev.design.ui.color.TagBorderColorLight
import br.com.hellodev.design.ui.color.TagTextColorDark
import br.com.hellodev.design.ui.color.TagTextColorLight
import br.com.hellodev.design.ui.color.TextColorDark
import br.com.hellodev.design.ui.color.TextColorLight
import br.com.hellodev.design.ui.color.TextFieldBackgroundColorDark
import br.com.hellodev.design.ui.color.TextFieldBackgroundColorLight
import br.com.hellodev.design.ui.color.TextFieldBackgroundErrorColor
import br.com.hellodev.design.ui.color.TextFieldPlaceholderColor
import br.com.hellodev.design.ui.color.TextFieldTextColorDark
import br.com.hellodev.design.ui.color.TextFieldTextColorLight
import br.com.hellodev.design.ui.color.TextSocialButtonColorDark
import br.com.hellodev.design.ui.color.TextSocialButtonColorLight
import br.com.hellodev.design.ui.color.TopAppBarColorDark
import br.com.hellodev.design.ui.color.TopAppBarColorLight
import br.com.hellodev.design.ui.color.TopAppBarContentColorDark
import br.com.hellodev.design.ui.color.TopAppBarContentColorLight
import br.com.hellodev.design.ui.color.UncheckedColor
import br.com.hellodev.design.ui.color.UnselectedBorderColorDark
import br.com.hellodev.design.ui.color.UnselectedBorderColorLight
import br.com.hellodev.design.ui.color.WarningColor
import br.com.hellodev.design.ui.scheme.BorderColorScheme
import br.com.hellodev.design.ui.scheme.ButtonColorScheme
import br.com.hellodev.design.ui.scheme.CheckColorScheme
import br.com.hellodev.design.ui.scheme.IconColorScheme
import br.com.hellodev.design.ui.scheme.MyColorScheme
import br.com.hellodev.design.ui.scheme.RadioColorScheme
import br.com.hellodev.design.ui.scheme.ScreenColorScheme
import br.com.hellodev.design.ui.scheme.SocialButtonColorScheme
import br.com.hellodev.design.ui.scheme.SwitchColorScheme
import br.com.hellodev.design.ui.scheme.TagColorScheme
import br.com.hellodev.design.ui.scheme.TextColorScheme
import br.com.hellodev.design.ui.scheme.TextFieldColorScheme
import br.com.hellodev.design.ui.scheme.TopAppBarColorScheme

private val LightColorScheme = MyColorScheme(
    text = TextColorScheme(
        color = TextColorLight,
        disabled = DisabledTextColorLight
    ),
    screen = ScreenColorScheme(
        backgroundPrimary = PrimaryBackgroundColorLight,
        backgroundSecondary = SecondaryBackgroundColorLight
    ),
    icon = IconColorScheme(
        color = IconColorLight,
        default = IconDefaultColor
    ),
    button = ButtonColorScheme(
        primaryBackground = PrimaryButtonColor,
        secondaryBackground = SecondaryButtonColorLight,
        primaryText = PrimaryButtonTextColorLight,
        secondaryText = SecondaryButtonTextColorLight
    ),
    border = BorderColorScheme(
        selected = SelectedBorderColor,
        unselected = UnselectedBorderColorLight
    ),
    divider = DividerColorScheme(
        color = DividerColorLight
    ),
    socialButton = br.com.hellodev.design.ui.scheme.SocialButtonColorScheme(
        background = BackgroundSocialButtonColorLight,
        border = BorderSocialButtonColorLight,
        text = TextSocialButtonColorLight
    ),
    textField = TextFieldColorScheme(
        background = TextFieldBackgroundColorLight,
        errorBackground = TextFieldBackgroundErrorColor,
        text = TextFieldTextColorLight,
        placeholder = TextFieldPlaceholderColor,
        disabledText = DisabledTextFieldTextColorLight
    ),
    switch = SwitchColorScheme(
        selectedBackground = SwitchSelectedBackgroundColor,
        unselectedBackground = SwitchUnselectedBackgroundColor
    ),
    topAppBar = br.com.hellodev.design.ui.scheme.TopAppBarColorScheme(
        background = TopAppBarColorLight,
        content = TopAppBarContentColorLight
    ),
    radio = RadioColorScheme(
        selectedColor = RadioSelectedColor,
        unselectedColor = RadioUnselectedColor
    ),
    check = CheckColorScheme(
        checked = CheckedColor,
        unchecked = UncheckedColor,
    ),
    tag = TagColorScheme(
        background = TagBackgroundColorLight,
        text = TagTextColorLight,
        border = TagBorderColorLight
    ),
    defaultColor = DefaultColor,
    disabledDefaultColor = DisabledDefaultColor,
    alphaDefaultColor = AlphaDefaultColor,
    successColor = SuccessColor,
    alertColor = AlertColor,
    warningColor = WarningColor,
    infoColor = InfoColor,
    disabledColor = DisabledColor,
    greyscale900Color = Greyscale900Color,
    greyscale800Color = Greyscale800Color,
    greyscale700Color = Greyscale700Color,
    greyscale600Color = Greyscale600Color,
    greyscale500Color = Greyscale500Color,
    greyscale400Color = Greyscale400Color,
    greyscale300Color = Greyscale300Color,
    greyscale200Color = Greyscale200Color,
    greyscale100Color = Greyscale100Color,
    greyscale50Color = Greyscale50Color,
    spotColor = SpotColor,
    ambientColor = AmbientColor
)

private val DarkColorScheme = MyColorScheme(
    text = TextColorScheme(
        color = TextColorDark,
        disabled = DisabledTextColorDark
    ),
    screen = ScreenColorScheme(
        backgroundPrimary = PrimaryBackgroundColorDark,
        backgroundSecondary = SecondaryBackgroundColorDark
    ),
    icon = IconColorScheme(
        color = IconColorDark,
        default = IconDefaultColor
    ),
    button = ButtonColorScheme(
        primaryBackground = PrimaryButtonColor,
        secondaryBackground = SecondaryButtonColorDark,
        primaryText = PrimaryButtonTextColorDark,
        secondaryText = SecondaryButtonTextColorDark
    ),
    border = BorderColorScheme(
        selected = SelectedBorderColor,
        unselected = UnselectedBorderColorDark
    ),
    divider = DividerColorScheme(
        color = DividerColorDark
    ),
    socialButton = br.com.hellodev.design.ui.scheme.SocialButtonColorScheme(
        background = BackgroundSocialButtonColorDark,
        border = BorderSocialButtonColorDark,
        text = TextSocialButtonColorDark
    ),
    textField = TextFieldColorScheme(
        background = TextFieldBackgroundColorDark,
        errorBackground = TextFieldBackgroundErrorColor,
        text = TextFieldTextColorDark,
        placeholder = TextFieldPlaceholderColor,
        disabledText = DisabledTextFieldTextColorDark
    ),
    switch = SwitchColorScheme(
        selectedBackground = SwitchSelectedBackgroundColor,
        unselectedBackground = SwitchUnselectedBackgroundColor
    ),
    topAppBar = br.com.hellodev.design.ui.scheme.TopAppBarColorScheme(
        background = TopAppBarColorDark,
        content = TopAppBarContentColorDark
    ),
    radio = RadioColorScheme(
        selectedColor = RadioSelectedColor,
        unselectedColor = RadioUnselectedColor
    ),
    check = CheckColorScheme(
        checked = CheckedColor,
        unchecked = UncheckedColor,
    ),
    tag = TagColorScheme(
        background = TagBackgroundColorDark,
        text = TagTextColorDark,
        border = TagBorderColorDark
    ),
    defaultColor = DefaultColor,
    disabledDefaultColor = DisabledDefaultColor,
    alphaDefaultColor = AlphaDefaultColor,
    successColor = SuccessColor,
    alertColor = AlertColor,
    warningColor = WarningColor,
    infoColor = InfoColor,
    disabledColor = DisabledColor,
    greyscale900Color = Greyscale900Color,
    greyscale800Color = Greyscale800Color,
    greyscale700Color = Greyscale700Color,
    greyscale600Color = Greyscale600Color,
    greyscale500Color = Greyscale500Color,
    greyscale400Color = Greyscale400Color,
    greyscale300Color = Greyscale300Color,
    greyscale200Color = Greyscale200Color,
    greyscale100Color = Greyscale100Color,
    greyscale50Color = Greyscale50Color,
    spotColor = SpotColor,
    ambientColor = AmbientColor
)

private val LocalColorScheme = compositionLocalOf { LightColorScheme }

object MyTheme {
    val colorScheme: MyColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current
}

@Composable
fun MyTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme by remember(isDarkTheme) {
        mutableStateOf(if (isDarkTheme) DarkColorScheme else LightColorScheme)
    }

    CompositionLocalProvider(LocalColorScheme provides colorScheme) {
        MaterialTheme(content = content)
    }
}