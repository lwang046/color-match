# Color Match Android App

A simple Android application that displays a grid of different colors. When you tap on a specific color, it shows the color in full screen.

## Features

- **Color Grid**: Displays a 3-column grid of various colors
- **Full Screen View**: Tap any color to see it in full screen
- **Color Information**: Shows the hex color code in the full screen view
- **Smart Text Color**: Automatically adjusts text color for visibility based on background color
- **Minimal Dependencies**: Uses only essential Android libraries

## Project Structure

```
ColorMatch/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/colormatch/
│   │   │   ├── MainActivity.java          # Main activity with color grid
│   │   │   └── ColorDetailActivity.java  # Full screen color view
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_main.xml     # Main activity layout
│   │   │   │   ├── activity_color_detail.xml # Full screen layout
│   │   │   │   └── color_item.xml        # Individual color item layout
│   │   │   ├── values/
│   │   │   │   ├── colors.xml            # Color resources
│   │   │   │   ├── strings.xml           # String resources
│   │   │   │   └── themes.xml            # App themes
│   │   │   └── xml/
│   │   │       ├── backup_rules.xml      # Backup configuration
│   │   │       └── data_extraction_rules.xml # Data extraction rules
│   │   └── AndroidManifest.xml           # App manifest
│   ├── build.gradle                      # App module build config
│   └── proguard-rules.pro               # ProGuard rules
├── build.gradle                         # Root build config
├── settings.gradle                      # Project settings
├── gradle.properties                    # Gradle properties
├── gradlew                             # Gradle wrapper (Unix)
├── gradlew.bat                         # Gradle wrapper (Windows)
└── gradle/wrapper/
    ├── gradle-wrapper.jar              # Gradle wrapper JAR
    └── gradle-wrapper.properties       # Gradle wrapper properties
```

## Dependencies

The app uses minimal dependencies:
- `androidx.appcompat:appcompat:1.6.1` - AppCompat support
- `com.google.android.material:material:1.10.0` - Material Design components
- `androidx.constraintlayout:constraintlayout:2.1.4` - ConstraintLayout

## How to Build

1. **Prerequisites**: 
   - Android Studio or JDK 8+
   - Android SDK

2. **Build the project**:
   ```bash
   ./gradlew build
   ```

3. **Install on device**:
   ```bash
   ./gradlew installDebug
   ```

## How it Works

1. **MainActivity**: 
   - Creates a RecyclerView with a 3-column GridLayoutManager
   - Generates a list of 60+ different colors
   - Uses a custom ColorAdapter to display colors in a grid
   - Handles color item clicks to launch ColorDetailActivity

2. **ColorDetailActivity**:
   - Receives the selected color via Intent
   - Displays the color in full screen
   - Shows the hex color code
   - Automatically adjusts text color for visibility
   - Allows tapping anywhere to return to the grid

3. **ColorAdapter**:
   - Custom RecyclerView adapter for displaying color items
   - Uses CardView for each color item with rounded corners and elevation
   - Implements click listener interface for color selection

## Color Generation

The app includes a variety of colors:
- Standard Android colors (RED, GREEN, BLUE, etc.)
- Custom hex colors for more variety
- Grayscale variations
- Pastel and vibrant colors

## UI/UX Features

- **Responsive Grid**: Adapts to different screen sizes
- **Material Design**: Uses Material Design components and theming
- **Smooth Transitions**: Clean navigation between activities
- **Accessibility**: Proper contrast ratios and touch targets
- **Full Screen Mode**: Immersive color viewing experience

## Requirements

- **Minimum SDK**: 21 (Android 5.0 Lollipop)
- **Target SDK**: 34 (Android 14)
- **Compile SDK**: 34

## License

This project is open source and available under the Apache License 2.0. 