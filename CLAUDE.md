# JobFinder - Projektkontext

## Überblick
Native Android App (Kotlin, Jetpack Compose) für Job-Suche mit Web-Scraping.

## Design-Referenz
Im Ordner /design-reference/ liegen die originalen Stitch-Design-Dateien:
- home-screen.html → Startseite mit Suchleiste und 4 Portal-Buttons
- favorites-screen.html → Favoriten-Seite mit gespeicherten Jobs
- DESIGN.md → Komplettes Design-System (Farben, Typo, Glassmorphism-Regeln)
- Screenshots der einzelnen Screens als PNG-Dateien

WICHTIG: Bei allen UI-Entscheidungen IMMER zuerst die HTML-Dateien und DESIGN.md konsultieren. Die Compose-Implementierung muss pixelgenau dem Stitch-Design entsprechen: gleiche Farben, Abstände, Border-Radii, Opacities, Blur-Werte, Schatten und Animationen.

## Technologie
- Sprache: Kotlin
- UI: Jetpack Compose mit Material 3
- Package: de.timstebner.jobfinder
- Min SDK: API 26
- Web-Scraping: JSoup
- Lokale Datenbank: Room (für Favoriten)
- Navigation: Jetpack Navigation Compose
- Architecture: MVVM (ViewModel + Repository Pattern)

## Animations-Referenz (aus Stitch HTML)
- Cards: hover scale(1.02), press scale(0.98), transition 500ms cubic-bezier(0.16, 1, 0.3, 1)
- Buttons: active scale(0.97), transition all 0.3s ease
- Heart-Button: active scale(0.90), shadow-lg shadow-primary/10
- Suchleiste: Glow-Gradient beim Fokus (primary/20 zu tertiary/20), Blur, Opacity 0.30→1.0
- Theme-Toggle: scale 0.95 default, 0.90 active
- Hintergrund: 3 Blur-Kreise (400px, 500px, 300px) mit blur(120-150px)
- Screen-Eintritt: fade-in + slide-in-from-bottom-4, duration 700ms

## Glassmorphism-Werte (aus Stitch CSS)
- Glass Panel: background rgba(255,255,255,0.05), backdrop-filter blur(32px), border 1px solid rgba(255,255,255,0.1)
- Glass Button: background rgba(255,255,255,0.03), backdrop-filter blur(24px), border 1px solid rgba(255,255,255,0.08)
- Light Mode Glass Panel: background rgba(255,255,255,0.6), border-color rgba(0,0,0,0.08)
- Light Mode Glass Button: background rgba(255,255,255,0.4), border-color rgba(0,0,0,0.1)
- Floating Shadow Dark: 0 15px 35px -5px rgba(0,0,0,0.5)
- Floating Shadow Light: 0 10px 30px -10px rgba(0,0,0,0.15)

## Screens
1. HomeScreen - Hero-Titel mit Gradient-Text, Suchleiste mit Glass-Effekt, 2x2 Portal-Grid (Kleinanzeigen, Stepstone, Indeed, Arbeitsamt)
2. SearchResultsScreen - Gescrapte Job-Ergebnisse mit Filter/Sortierung, "Mehr laden" Button
3. FavoritesScreen - Lokal gespeicherte Favoriten mit gleichen JobCards

## Bottom Navigation
- Floating Pill: 200px breit, 56px hoch, rounded-full
- Glassmorphism mit blur(32px)
- 2 Items: Home (home icon), Favorites (favorite icon)
- Active: primary Farbe + bg-white/10, Inactive: on-surface-variant

## Konventionen
- Code auf Englisch, Kommentare auf Deutsch
- Erkläre was du tust bevor du Dateien änderst
- Frage um Erlaubnis bevor du Dateien löschst
