package de.timstebner.jobfinder.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// ── Stitch-Palette (identisch in beiden HTML-Dateien, tailwind.config) ────────
val Primary            = Color(0xFF818CF8)
val PrimaryDim         = Color(0xFFB3B6E0)
val PrimaryFixed       = Color(0xFFCFD1FD)
val PrimaryFixedDim    = Color(0xFFC1C3EE)
val OnPrimary          = Color(0xFF3A3D61)
val PrimaryContainer   = Color(0xFF4C5074)
val OnPrimaryContainer = Color(0xFFE0E1FF)
val OnPrimaryFixed     = Color(0xFF303356)
val OnPrimaryFixedVariant = Color(0xFF4C5074)
val InversePrimary     = Color(0xFF595C82)

val Secondary             = Color(0xFFC4C4DD)
val SecondaryDim          = Color(0xFFB7B7CF)
val SecondaryFixed        = Color(0xFFE1E0F9)
val SecondaryFixedDim     = Color(0xFFD2D2EB)
val OnSecondary           = Color(0xFF3D3F52)
val SecondaryContainer    = Color(0xFF383A4D)
val OnSecondaryContainer  = Color(0xFFBDBDD5)
val OnSecondaryFixed      = Color(0xFF3C3E51)
val OnSecondaryFixedVariant = Color(0xFF595A6F)

val Tertiary            = Color(0xFFFCE3FF)
val TertiaryDim         = Color(0xFFE7C3EF)
val TertiaryFixed       = Color(0xFFF6D0FE)
val TertiaryFixedDim    = Color(0xFFE7C3EF)
val OnTertiary          = Color(0xFF694C72)
val TertiaryContainer   = Color(0xFFF6D0FE)
val OnTertiaryContainer = Color(0xFF604469)
val OnTertiaryFixed     = Color(0xFF4D3255)
val OnTertiaryFixedVariant = Color(0xFF6B4D73)

val Error            = Color(0xFFF97386)
val ErrorDim         = Color(0xFFC44B5F)
val OnError          = Color(0xFF490013)
val ErrorContainer   = Color(0xFF871C34)
val OnErrorContainer = Color(0xFFFF97A3)

val Background              = Color(0xFF060E20)
val OnBackground            = Color(0xFFDEE5FF)
val Surface                 = Color(0xFF060E20)
val SurfaceDim              = Color(0xFF060E20)
val SurfaceBright           = Color(0xFF182B52)
val SurfaceTint             = Color(0xFFC1C3EE)
val OnSurface               = Color(0xFFDEE5FF)
val SurfaceVariant          = Color(0xFF11244C)
val OnSurfaceVariant        = Color(0xFF99AAD9)
val SurfaceContainerLowest  = Color(0xFF000000)
val SurfaceContainerLow     = Color(0xFF06122C)
val SurfaceContainer        = Color(0xFF0A1836)
val SurfaceContainerHigh    = Color(0xFF0F1E3F)
val SurfaceContainerHighest = Color(0xFF11244C)
val InverseSurface          = Color(0xFFFAF8FF)
val InverseOnSurface        = Color(0xFF4D556B)

val Outline        = Color(0xFF6475A1)
val OutlineVariant = Color(0xFF364770)

// ── Light-Mode-Oberflächen (aus html:not(.dark) CSS: background #f1f3f7, text #1e293b) ──
val BackgroundLight              = Color(0xFFF1F3F7)
val OnBackgroundLight            = Color(0xFF1E293B)
val SurfaceLight                 = Color(0xFFF1F3F7)
val SurfaceBrightLight           = Color(0xFFFFFFFF)
val OnSurfaceLight               = Color(0xFF1E293B)
val SurfaceVariantLight          = Color(0xFFDDE4F0)
val OnSurfaceVariantLight        = Color(0xFF475569)
val SurfaceContainerLowestLight  = Color(0xFFFFFFFF)
val SurfaceContainerLowLight     = Color(0xFFE8ECF5)
val SurfaceContainerLight        = Color(0xFFDDE4F0)
val SurfaceContainerHighLight    = Color(0xFFD0D9EC)
val SurfaceContainerHighestLight = Color(0xFFC3CFE8)
val OutlineVariantLight          = Color(0xFFC6C5D0)
val InverseSurfaceLight          = Color(0xFF1E293B)
val InverseOnSurfaceLight        = Color(0xFFF1F3F7)

// ── Dark Color Scheme (Standard) ──────────────────────────────────────────────
val DarkColorScheme = darkColorScheme(
    primary                = Primary,
    onPrimary              = OnPrimary,
    primaryContainer       = PrimaryContainer,
    onPrimaryContainer     = OnPrimaryContainer,
    inversePrimary         = InversePrimary,
    secondary              = Secondary,
    onSecondary            = OnSecondary,
    secondaryContainer     = SecondaryContainer,
    onSecondaryContainer   = OnSecondaryContainer,
    tertiary               = Tertiary,
    onTertiary             = OnTertiary,
    tertiaryContainer      = TertiaryContainer,
    onTertiaryContainer    = OnTertiaryContainer,
    error                  = Error,
    onError                = OnError,
    errorContainer         = ErrorContainer,
    onErrorContainer       = OnErrorContainer,
    background             = Background,
    onBackground           = OnBackground,
    surface                = Surface,
    onSurface              = OnSurface,
    surfaceVariant         = SurfaceVariant,
    onSurfaceVariant       = OnSurfaceVariant,
    surfaceTint            = SurfaceTint,
    inverseSurface         = InverseSurface,
    inverseOnSurface       = InverseOnSurface,
    outline                = Outline,
    outlineVariant         = OutlineVariant,
    surfaceBright          = SurfaceBright,
    surfaceContainerLowest  = SurfaceContainerLowest,
    surfaceContainerLow     = SurfaceContainerLow,
    surfaceContainer        = SurfaceContainer,
    surfaceContainerHigh    = SurfaceContainerHigh,
    surfaceContainerHighest = SurfaceContainerHighest,
)

// ── Light Color Scheme ─────────────────────────────────────────────────────────
val LightColorScheme = lightColorScheme(
    primary                = Primary,
    onPrimary              = Color.White,
    primaryContainer       = PrimaryFixed,
    onPrimaryContainer     = OnPrimaryFixed,
    inversePrimary         = Primary,
    secondary              = Color(0xFF5A5C70),
    onSecondary            = Color.White,
    secondaryContainer     = SecondaryFixed,
    onSecondaryContainer   = OnSecondaryFixed,
    tertiary               = Color(0xFF9C4DAA),
    onTertiary             = Color.White,
    tertiaryContainer      = TertiaryFixed,
    onTertiaryContainer    = OnTertiaryFixed,
    error                  = Color(0xFFBA1A1A),
    onError                = Color.White,
    errorContainer         = Color(0xFFFFDAD6),
    onErrorContainer       = Color(0xFF410002),
    background             = BackgroundLight,
    onBackground           = OnBackgroundLight,
    surface                = SurfaceLight,
    onSurface              = OnSurfaceLight,
    surfaceVariant         = SurfaceVariantLight,
    onSurfaceVariant       = OnSurfaceVariantLight,
    surfaceTint            = Primary,
    inverseSurface         = InverseSurfaceLight,
    inverseOnSurface       = InverseOnSurfaceLight,
    outline                = Outline,
    outlineVariant         = OutlineVariantLight,
    surfaceBright          = SurfaceBrightLight,
    surfaceContainerLowest  = SurfaceContainerLowestLight,
    surfaceContainerLow     = SurfaceContainerLowLight,
    surfaceContainer        = SurfaceContainerLight,
    surfaceContainerHigh    = SurfaceContainerHighLight,
    surfaceContainerHighest = SurfaceContainerHighestLight,
)
