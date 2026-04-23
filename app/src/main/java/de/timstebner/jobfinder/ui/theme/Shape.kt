package de.timstebner.jobfinder.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// Exakte Border-Radii aus Stitch tailwind.config borderRadius:
//   DEFAULT = 1rem  → 16dp  (Inputs, kleine Cards)
//   lg      = 2rem  → 32dp  (Job-Cards, Portal-Buttons: rounded-3xl)
//   xl      = 3rem  → 48dp  (Primäre CTAs)
//   full    = 9999px        (Suchleiste, Navigation-Pill) → CircleShape in Compose
val Shapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),   // Stitch "sm" = 0.5rem (Chips, Badges)
    small      = RoundedCornerShape(16.dp),  // Stitch DEFAULT = 1rem
    medium     = RoundedCornerShape(16.dp),  // Stitch DEFAULT = 1rem
    large      = RoundedCornerShape(32.dp),  // Stitch "lg" = 2rem
    extraLarge = RoundedCornerShape(48.dp),  // Stitch "xl" = 3rem
)
