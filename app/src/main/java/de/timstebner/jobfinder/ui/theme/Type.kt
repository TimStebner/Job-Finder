package de.timstebner.jobfinder.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import de.timstebner.jobfinder.R

// Google Fonts Provider (GMS) – Zertifikate in res/values/font_certs.xml
private val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage   = "com.google.android.gms",
    certificates      = R.array.com_google_android_gms_fonts_certs,
)

private val manrope = GoogleFont("Manrope")

val ManropeFontFamily: FontFamily = FontFamily(
    Font(googleFont = manrope, fontProvider = provider, weight = FontWeight.Normal),
    Font(googleFont = manrope, fontProvider = provider, weight = FontWeight.Medium),
    Font(googleFont = manrope, fontProvider = provider, weight = FontWeight.SemiBold),
    Font(googleFont = manrope, fontProvider = provider, weight = FontWeight.Bold),
    Font(googleFont = manrope, fontProvider = provider, weight = FontWeight.ExtraBold),
)

val Typography = Typography(
    // Display: 3.5rem = 56sp, extrabold, leading-[1.1], tracking-tight (aus Stitch Hero-Titel)
    displayLarge = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.ExtraBold,
        fontSize     = 56.sp,
        lineHeight   = 61.6.sp,
        letterSpacing = (-0.5).sp,
    ),
    displayMedium = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.ExtraBold,
        fontSize     = 45.sp,
        lineHeight   = 50.sp,
        letterSpacing = (-0.3).sp,
    ),
    displaySmall = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 36.sp,
        lineHeight   = 44.sp,
        letterSpacing = (-0.2).sp,
    ),
    // Headline
    headlineLarge = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 32.sp,
        lineHeight   = 40.sp,
        letterSpacing = 0.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 28.sp,
        lineHeight   = 36.sp,
        letterSpacing = 0.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 24.sp,
        lineHeight   = 32.sp,
        letterSpacing = 0.sp,
    ),
    // Title: 1.375rem = 22sp, bold (aus Stitch Job-Titel in Cards)
    titleLarge = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 22.sp,
        lineHeight   = 28.sp,
        letterSpacing = 0.sp,
    ),
    titleMedium = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.SemiBold,
        fontSize     = 16.sp,
        lineHeight   = 24.sp,
        letterSpacing = 0.15.sp,
    ),
    titleSmall = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.SemiBold,
        fontSize     = 14.sp,
        lineHeight   = 20.sp,
        letterSpacing = 0.1.sp,
    ),
    // Body: 1rem = 16sp, regular (aus Stitch body-lg)
    bodyLarge = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Normal,
        fontSize     = 16.sp,
        lineHeight   = 24.sp,
        letterSpacing = 0.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Normal,
        fontSize     = 14.sp,
        lineHeight   = 20.sp,
        letterSpacing = 0.sp,
    ),
    bodySmall = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Normal,
        fontSize     = 12.sp,
        lineHeight   = 16.sp,
        letterSpacing = 0.sp,
    ),
    // Label: 0.75rem = 12sp, bold, uppercase, tracking-wider = 0.2em ≈ 2.4sp (aus Stitch Portal-Buttons)
    labelLarge = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 14.sp,
        lineHeight   = 20.sp,
        letterSpacing = 0.sp,
    ),
    labelMedium = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 12.sp,
        lineHeight   = 16.sp,
        letterSpacing = 0.5.sp,
    ),
    // labelSmall = Label-Stil für Chips/Badges (tracking-widest = 0.2em)
    labelSmall = TextStyle(
        fontFamily   = ManropeFontFamily,
        fontWeight   = FontWeight.Bold,
        fontSize     = 10.sp,
        lineHeight   = 16.sp,
        letterSpacing = 2.0.sp,
    ),
)
