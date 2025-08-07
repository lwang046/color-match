package com.example.colormatch;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ColorDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_detail);

        int color = getIntent().getIntExtra("color", Color.BLACK);
        
        View rootView = findViewById(R.id.rootView);
        rootView.setBackgroundColor(color);
        
        TextView colorInfoText = findViewById(R.id.colorInfoText);
        String colorHex = String.format("#%06X", (0xFFFFFF & color));
        String colorName = getColorName(color);
        colorInfoText.setText("Color: " + colorName + "\n" + colorHex);
        
        // Set text color to be visible on the background
        int textColor = isColorDark(color) ? Color.WHITE : Color.BLACK;
        colorInfoText.setTextColor(textColor);
        
        // Make the entire screen clickable to go back
        rootView.setOnClickListener(v -> finish());
    }
    
    private boolean isColorDark(int color) {
        // Calculate luminance to determine if color is dark
        double luminance = (0.299 * Color.red(color) + 0.587 * Color.green(color) + 0.114 * Color.blue(color)) / 255;
        return luminance < 0.5;
    }
    
    private String getColorName(int color) {
        // Standard Android colors
        if (color == Color.RED) return "Red";
        if (color == Color.GREEN) return "Green";
        if (color == Color.BLUE) return "Blue";
        if (color == Color.YELLOW) return "Yellow";
        if (color == Color.CYAN) return "Cyan";
        if (color == Color.MAGENTA) return "Magenta";
        if (color == Color.BLACK) return "Black";
        if (color == Color.WHITE) return "White";
        if (color == Color.GRAY) return "Gray";
        if (color == Color.DKGRAY) return "Dark Gray";
        if (color == Color.LTGRAY) return "Light Gray";
        
        // Custom colors from MainActivity
        if (color == Color.parseColor("#FF6B35")) return "Orange";
        if (color == Color.parseColor("#8A2BE2")) return "Blue Violet";
        if (color == Color.parseColor("#FF1493")) return "Deep Pink";
        if (color == Color.parseColor("#00CED1")) return "Dark Turquoise";
        if (color == Color.parseColor("#FFD700")) return "Gold";
        if (color == Color.parseColor("#32CD32")) return "Lime Green";
        if (color == Color.parseColor("#FF4500")) return "Orange Red";
        if (color == Color.parseColor("#9370DB")) return "Medium Purple";
        if (color == Color.parseColor("#20B2AA")) return "Light Sea Green";
        if (color == Color.parseColor("#FF69B4")) return "Hot Pink";
        if (color == Color.parseColor("#00FA9A")) return "Medium Spring Green";
        if (color == Color.parseColor("#FF6347")) return "Tomato";
        if (color == Color.parseColor("#40E0D0")) return "Turquoise";
        if (color == Color.parseColor("#EE82EE")) return "Violet";
        if (color == Color.parseColor("#90EE90")) return "Light Green";
        if (color == Color.parseColor("#F0E68C")) return "Khaki";
        if (color == Color.parseColor("#DDA0DD")) return "Plum";
        if (color == Color.parseColor("#98FB98")) return "Pale Green";
        if (color == Color.parseColor("#F5DEB3")) return "Wheat";
        if (color == Color.parseColor("#FFB6C1")) return "Light Pink";
        if (color == Color.parseColor("#87CEEB")) return "Sky Blue";
        if (color == Color.parseColor("#D8BFD8")) return "Thistle";
        if (color == Color.parseColor("#F0F8FF")) return "Alice Blue";
        if (color == Color.parseColor("#FAEBD7")) return "Antique White";
        if (color == Color.parseColor("#FFE4E1")) return "Misty Rose";
        if (color == Color.parseColor("#E6E6FA")) return "Lavender";
        if (color == Color.parseColor("#FFFACD")) return "Lemon Chiffon";
        if (color == Color.parseColor("#F0FFF0")) return "Honeydew";
        if (color == Color.parseColor("#FFF0F5")) return "Lavender Blush";
        if (color == Color.parseColor("#FDF5E6")) return "Old Lace";
        if (color == Color.parseColor("#F5F5DC")) return "Beige";
        if (color == Color.parseColor("#FFEFD5")) return "Peach Puff";
        if (color == Color.parseColor("#F5F5F5")) return "White Smoke";
        if (color == Color.parseColor("#FFF8DC")) return "Cornsilk";
        if (color == Color.parseColor("#FAF0E6")) return "Linen";
        if (color == Color.parseColor("#F8F8FF")) return "Ghost White";
        if (color == Color.parseColor("#F5FFFA")) return "Mint Cream";
        if (color == Color.parseColor("#FFFAFA")) return "Snow";
        if (color == Color.parseColor("#FFFFF0")) return "Ivory";
        if (color == Color.parseColor("#FAFAFA")) return "White";
        if (color == Color.parseColor("#F0F0F0")) return "Light Gray";
        if (color == Color.parseColor("#E0E0E0")) return "Silver";
        if (color == Color.parseColor("#D0D0D0")) return "Light Gray";
        if (color == Color.parseColor("#C0C0C0")) return "Silver";
        if (color == Color.parseColor("#B0B0B0")) return "Light Gray";
        if (color == Color.parseColor("#A0A0A0")) return "Dark Gray";
        if (color == Color.parseColor("#909090")) return "Gray";
        if (color == Color.parseColor("#808080")) return "Gray";
        if (color == Color.parseColor("#707070")) return "Dark Gray";
        if (color == Color.parseColor("#606060")) return "Dark Gray";
        if (color == Color.parseColor("#505050")) return "Dark Gray";
        if (color == Color.parseColor("#404040")) return "Dark Gray";
        if (color == Color.parseColor("#303030")) return "Dark Gray";
        if (color == Color.parseColor("#202020")) return "Dark Gray";
        if (color == Color.parseColor("#101010")) return "Dark Gray";
        
        // Additional vibrant colors
        if (color == Color.parseColor("#FF0000")) return "Pure Red";
        if (color == Color.parseColor("#00FF00")) return "Pure Green";
        if (color == Color.parseColor("#0000FF")) return "Pure Blue";
        if (color == Color.parseColor("#FFFF00")) return "Pure Yellow";
        if (color == Color.parseColor("#FF00FF")) return "Pure Magenta";
        if (color == Color.parseColor("#00FFFF")) return "Pure Cyan";
        
        // Modern color palette
        if (color == Color.parseColor("#E74C3C")) return "Red";
        if (color == Color.parseColor("#E67E22")) return "Orange";
        if (color == Color.parseColor("#F1C40F")) return "Yellow";
        if (color == Color.parseColor("#2ECC71")) return "Green";
        if (color == Color.parseColor("#3498DB")) return "Blue";
        if (color == Color.parseColor("#9B59B6")) return "Purple";
        if (color == Color.parseColor("#1ABC9C")) return "Teal";
        if (color == Color.parseColor("#34495E")) return "Dark Blue";
        if (color == Color.parseColor("#95A5A6")) return "Gray";
        if (color == Color.parseColor("#F39C12")) return "Orange";
        if (color == Color.parseColor("#D35400")) return "Dark Orange";
        if (color == Color.parseColor("#C0392B")) return "Dark Red";
        if (color == Color.parseColor("#8E44AD")) return "Dark Purple";
        if (color == Color.parseColor("#2980B9")) return "Dark Blue";
        if (color == Color.parseColor("#27AE60")) return "Dark Green";
        if (color == Color.parseColor("#16A085")) return "Dark Teal";
        
        // Popular web colors
        if (color == Color.parseColor("#FF6B6B")) return "Light Coral";
        if (color == Color.parseColor("#4ECDC4")) return "Turquoise";
        if (color == Color.parseColor("#45B7D1")) return "Sky Blue";
        if (color == Color.parseColor("#96CEB4")) return "Mint Green";
        if (color == Color.parseColor("#FFEAA7")) return "Light Yellow";
        if (color == Color.parseColor("#98D8C8")) return "Sea Green";
        if (color == Color.parseColor("#F7DC6F")) return "Golden Yellow";
        if (color == Color.parseColor("#BB8FCE")) return "Medium Purple";
        if (color == Color.parseColor("#85C1E9")) return "Light Blue";
        if (color == Color.parseColor("#F8C471")) return "Light Orange";
        if (color == Color.parseColor("#82E0AA")) return "Light Green";
        if (color == Color.parseColor("#F1948A")) return "Light Red";
        
        // Pastel colors
        if (color == Color.parseColor("#FFB3BA")) return "Light Pink";
        if (color == Color.parseColor("#BAFFC9")) return "Light Green";
        if (color == Color.parseColor("#BAE1FF")) return "Light Blue";
        if (color == Color.parseColor("#FFFFBA")) return "Light Yellow";
        if (color == Color.parseColor("#FFB3F7")) return "Light Purple";
        if (color == Color.parseColor("#B3FFE6")) return "Light Mint";
        if (color == Color.parseColor("#FFE6B3")) return "Light Orange";
        if (color == Color.parseColor("#E6B3FF")) return "Light Lavender";
        if (color == Color.parseColor("#B3F7FF")) return "Light Cyan";
        if (color == Color.parseColor("#F7FFB3")) return "Light Lime";
        if (color == Color.parseColor("#FFB3D9")) return "Light Rose";
        if (color == Color.parseColor("#D9B3FF")) return "Light Violet";
        
        // Neon colors
        if (color == Color.parseColor("#FF0080")) return "Neon Pink";
        if (color == Color.parseColor("#00FF80")) return "Neon Green";
        if (color == Color.parseColor("#0080FF")) return "Neon Blue";
        if (color == Color.parseColor("#FF8000")) return "Neon Orange";
        if (color == Color.parseColor("#8000FF")) return "Neon Purple";
        
        // Earth tones
        if (color == Color.parseColor("#8B4513")) return "Saddle Brown";
        if (color == Color.parseColor("#A0522D")) return "Sienna";
        if (color == Color.parseColor("#CD853F")) return "Peru";
        if (color == Color.parseColor("#DEB887")) return "Burlywood";
        if (color == Color.parseColor("#D2B48C")) return "Tan";
        if (color == Color.parseColor("#BC8F8F")) return "Rosy Brown";
        if (color == Color.parseColor("#F4A460")) return "Sandy Brown";
        if (color == Color.parseColor("#DAA520")) return "Goldenrod";
        if (color == Color.parseColor("#B8860B")) return "Dark Goldenrod";
        
        // Ocean colors
        if (color == Color.parseColor("#4682B4")) return "Steel Blue";
        if (color == Color.parseColor("#5F9EA0")) return "Cadet Blue";
        if (color == Color.parseColor("#B0C4DE")) return "Light Steel Blue";
        if (color == Color.parseColor("#ADD8E6")) return "Light Blue";
        if (color == Color.parseColor("#87CEFA")) return "Light Sky Blue";
        if (color == Color.parseColor("#1E90FF")) return "Dodger Blue";
        if (color == Color.parseColor("#4169E1")) return "Royal Blue";
        if (color == Color.parseColor("#0000CD")) return "Medium Blue";
        
        // Forest colors
        if (color == Color.parseColor("#228B22")) return "Forest Green";
        if (color == Color.parseColor("#8FBC8F")) return "Dark Sea Green";
        if (color == Color.parseColor("#3CB371")) return "Medium Sea Green";
        if (color == Color.parseColor("#2E8B57")) return "Sea Green";
        if (color == Color.parseColor("#48D1CC")) return "Medium Turquoise";
        
        // If no specific name found, return "Custom Color"
        return "Custom Color";
    }
} 