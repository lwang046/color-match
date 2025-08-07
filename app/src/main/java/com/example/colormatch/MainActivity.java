package com.example.colormatch;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ColorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 6)); // 6 columns

        List<Integer> colors = generateColors();
        adapter = new ColorAdapter(colors, new ColorAdapter.OnColorClickListener() {
            @Override
            public void onColorClick(int color) {
                Intent intent = new Intent(MainActivity.this, ColorDetailActivity.class);
                intent.putExtra("color", color);
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(adapter);
    }

    private List<Integer> generateColors() {
        List<Integer> colors = new ArrayList<>();
        
        // Add a variety of colors
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(Color.YELLOW);
        colors.add(Color.CYAN);
        colors.add(Color.MAGENTA);
        colors.add(Color.BLACK);
        colors.add(Color.WHITE);
        colors.add(Color.GRAY);
        colors.add(Color.DKGRAY);
        colors.add(Color.LTGRAY);
        colors.add(Color.parseColor("#FF6B35")); // Orange
        colors.add(Color.parseColor("#8A2BE2")); // Blue Violet
        colors.add(Color.parseColor("#FF1493")); // Deep Pink
        colors.add(Color.parseColor("#00CED1")); // Dark Turquoise
        colors.add(Color.parseColor("#FFD700")); // Gold
        colors.add(Color.parseColor("#32CD32")); // Lime Green
        colors.add(Color.parseColor("#FF4500")); // Orange Red
        colors.add(Color.parseColor("#9370DB")); // Medium Purple
        colors.add(Color.parseColor("#20B2AA")); // Light Sea Green
        colors.add(Color.parseColor("#FF69B4")); // Hot Pink
        colors.add(Color.parseColor("#00FA9A")); // Medium Spring Green
        colors.add(Color.parseColor("#FF6347")); // Tomato
        colors.add(Color.parseColor("#40E0D0")); // Turquoise
        colors.add(Color.parseColor("#EE82EE")); // Violet
        colors.add(Color.parseColor("#90EE90")); // Light Green
        colors.add(Color.parseColor("#F0E68C")); // Khaki
        colors.add(Color.parseColor("#DDA0DD")); // Plum
        colors.add(Color.parseColor("#98FB98")); // Pale Green
        colors.add(Color.parseColor("#F5DEB3")); // Wheat
        colors.add(Color.parseColor("#FFB6C1")); // Light Pink
        colors.add(Color.parseColor("#87CEEB")); // Sky Blue
        colors.add(Color.parseColor("#D8BFD8")); // Thistle
        colors.add(Color.parseColor("#F0F8FF")); // Alice Blue
        colors.add(Color.parseColor("#FAEBD7")); // Antique White
        colors.add(Color.parseColor("#FFE4E1")); // Misty Rose
        colors.add(Color.parseColor("#E6E6FA")); // Lavender
        colors.add(Color.parseColor("#FFFACD")); // Lemon Chiffon
        colors.add(Color.parseColor("#F0FFF0")); // Honeydew
        colors.add(Color.parseColor("#FFF0F5")); // Lavender Blush
        colors.add(Color.parseColor("#FDF5E6")); // Old Lace
        colors.add(Color.parseColor("#F5F5DC")); // Beige
        colors.add(Color.parseColor("#FFEFD5")); // Peach Puff
        colors.add(Color.parseColor("#F5F5F5")); // White Smoke
        colors.add(Color.parseColor("#FFF8DC")); // Cornsilk
        colors.add(Color.parseColor("#FAF0E6")); // Linen
        colors.add(Color.parseColor("#F0F8FF")); // Alice Blue
        colors.add(Color.parseColor("#F8F8FF")); // Ghost White
        colors.add(Color.parseColor("#F5FFFA")); // Mint Cream
        colors.add(Color.parseColor("#FFFAFA")); // Snow
        colors.add(Color.parseColor("#FFFFF0")); // Ivory
        colors.add(Color.parseColor("#FAFAFA")); // White
        colors.add(Color.parseColor("#F0F0F0")); // Light Gray
        colors.add(Color.parseColor("#E0E0E0")); // Silver
        colors.add(Color.parseColor("#D0D0D0")); // Light Gray
        colors.add(Color.parseColor("#C0C0C0")); // Silver
        colors.add(Color.parseColor("#B0B0B0")); // Light Gray
        colors.add(Color.parseColor("#A0A0A0")); // Dark Gray
        colors.add(Color.parseColor("#909090")); // Gray
        colors.add(Color.parseColor("#808080")); // Gray
        colors.add(Color.parseColor("#707070")); // Dark Gray
        colors.add(Color.parseColor("#606060")); // Dark Gray
        colors.add(Color.parseColor("#505050")); // Dark Gray
        colors.add(Color.parseColor("#404040")); // Dark Gray
        colors.add(Color.parseColor("#303030")); // Dark Gray
        colors.add(Color.parseColor("#202020")); // Dark Gray
        colors.add(Color.parseColor("#101010")); // Dark Gray
        colors.add(Color.parseColor("#000000")); // Black
        
        // Additional vibrant colors
        colors.add(Color.parseColor("#FF0000")); // Pure Red
        colors.add(Color.parseColor("#00FF00")); // Pure Green
        colors.add(Color.parseColor("#0000FF")); // Pure Blue
        colors.add(Color.parseColor("#FFFF00")); // Pure Yellow
        colors.add(Color.parseColor("#FF00FF")); // Pure Magenta
        colors.add(Color.parseColor("#00FFFF")); // Pure Cyan
        
        // More beautiful colors
        colors.add(Color.parseColor("#FF1493")); // Deep Pink
        colors.add(Color.parseColor("#00BFFF")); // Deep Sky Blue
        colors.add(Color.parseColor("#FF8C00")); // Dark Orange
        colors.add(Color.parseColor("#32CD32")); // Lime Green
        colors.add(Color.parseColor("#FF69B4")); // Hot Pink
        colors.add(Color.parseColor("#00CED1")); // Dark Turquoise
        colors.add(Color.parseColor("#FFD700")); // Gold
        colors.add(Color.parseColor("#9370DB")); // Medium Purple
        colors.add(Color.parseColor("#20B2AA")); // Light Sea Green
        colors.add(Color.parseColor("#FF4500")); // Orange Red
        colors.add(Color.parseColor("#8A2BE2")); // Blue Violet
        colors.add(Color.parseColor("#00FA9A")); // Medium Spring Green
        colors.add(Color.parseColor("#FF6347")); // Tomato
        colors.add(Color.parseColor("#40E0D0")); // Turquoise
        colors.add(Color.parseColor("#EE82EE")); // Violet
        colors.add(Color.parseColor("#90EE90")); // Light Green
        colors.add(Color.parseColor("#F0E68C")); // Khaki
        colors.add(Color.parseColor("#DDA0DD")); // Plum
        colors.add(Color.parseColor("#98FB98")); // Pale Green
        colors.add(Color.parseColor("#F5DEB3")); // Wheat
        colors.add(Color.parseColor("#FFB6C1")); // Light Pink
        colors.add(Color.parseColor("#87CEEB")); // Sky Blue
        colors.add(Color.parseColor("#D8BFD8")); // Thistle
        colors.add(Color.parseColor("#F0F8FF")); // Alice Blue
        colors.add(Color.parseColor("#FAEBD7")); // Antique White
        colors.add(Color.parseColor("#FFE4E1")); // Misty Rose
        colors.add(Color.parseColor("#E6E6FA")); // Lavender
        colors.add(Color.parseColor("#FFFACD")); // Lemon Chiffon
        colors.add(Color.parseColor("#F0FFF0")); // Honeydew
        colors.add(Color.parseColor("#FFF0F5")); // Lavender Blush
        colors.add(Color.parseColor("#FDF5E6")); // Old Lace
        colors.add(Color.parseColor("#F5F5DC")); // Beige
        colors.add(Color.parseColor("#FFEFD5")); // Peach Puff
        colors.add(Color.parseColor("#F5F5F5")); // White Smoke
        colors.add(Color.parseColor("#FFF8DC")); // Cornsilk
        colors.add(Color.parseColor("#FAF0E6")); // Linen
        colors.add(Color.parseColor("#F8F8FF")); // Ghost White
        colors.add(Color.parseColor("#F5FFFA")); // Mint Cream
        colors.add(Color.parseColor("#FFFAFA")); // Snow
        colors.add(Color.parseColor("#FFFFF0")); // Ivory
        
        // Popular web colors
        colors.add(Color.parseColor("#FF6B6B")); // Light Coral
        colors.add(Color.parseColor("#4ECDC4")); // Turquoise
        colors.add(Color.parseColor("#45B7D1")); // Sky Blue
        colors.add(Color.parseColor("#96CEB4")); // Mint Green
        colors.add(Color.parseColor("#FFEAA7")); // Light Yellow
        colors.add(Color.parseColor("#DDA0DD")); // Plum
        colors.add(Color.parseColor("#98D8C8")); // Sea Green
        colors.add(Color.parseColor("#F7DC6F")); // Golden Yellow
        colors.add(Color.parseColor("#BB8FCE")); // Medium Purple
        colors.add(Color.parseColor("#85C1E9")); // Light Blue
        colors.add(Color.parseColor("#F8C471")); // Light Orange
        colors.add(Color.parseColor("#82E0AA")); // Light Green
        colors.add(Color.parseColor("#F1948A")); // Light Red
        colors.add(Color.parseColor("#85C1E9")); // Light Blue
        colors.add(Color.parseColor("#F8C471")); // Light Orange
        colors.add(Color.parseColor("#82E0AA")); // Light Green
        colors.add(Color.parseColor("#F1948A")); // Light Red
        
        // Modern color palette
        colors.add(Color.parseColor("#E74C3C")); // Red
        colors.add(Color.parseColor("#E67E22")); // Orange
        colors.add(Color.parseColor("#F1C40F")); // Yellow
        colors.add(Color.parseColor("#2ECC71")); // Green
        colors.add(Color.parseColor("#3498DB")); // Blue
        colors.add(Color.parseColor("#9B59B6")); // Purple
        colors.add(Color.parseColor("#1ABC9C")); // Teal
        colors.add(Color.parseColor("#34495E")); // Dark Blue
        colors.add(Color.parseColor("#95A5A6")); // Gray
        colors.add(Color.parseColor("#F39C12")); // Orange
        colors.add(Color.parseColor("#D35400")); // Dark Orange
        colors.add(Color.parseColor("#C0392B")); // Dark Red
        colors.add(Color.parseColor("#8E44AD")); // Dark Purple
        colors.add(Color.parseColor("#2980B9")); // Dark Blue
        colors.add(Color.parseColor("#27AE60")); // Dark Green
        colors.add(Color.parseColor("#16A085")); // Dark Teal
        
        // Pastel colors
        colors.add(Color.parseColor("#FFB3BA")); // Light Pink
        colors.add(Color.parseColor("#BAFFC9")); // Light Green
        colors.add(Color.parseColor("#BAE1FF")); // Light Blue
        colors.add(Color.parseColor("#FFFFBA")); // Light Yellow
        colors.add(Color.parseColor("#FFB3F7")); // Light Purple
        colors.add(Color.parseColor("#B3FFE6")); // Light Mint
        colors.add(Color.parseColor("#FFE6B3")); // Light Orange
        colors.add(Color.parseColor("#E6B3FF")); // Light Lavender
        colors.add(Color.parseColor("#B3F7FF")); // Light Cyan
        colors.add(Color.parseColor("#F7FFB3")); // Light Lime
        colors.add(Color.parseColor("#FFB3D9")); // Light Rose
        colors.add(Color.parseColor("#D9B3FF")); // Light Violet
        
        // Neon colors
        colors.add(Color.parseColor("#FF0080")); // Neon Pink
        colors.add(Color.parseColor("#00FF80")); // Neon Green
        colors.add(Color.parseColor("#0080FF")); // Neon Blue
        colors.add(Color.parseColor("#FF8000")); // Neon Orange
        colors.add(Color.parseColor("#8000FF")); // Neon Purple
        colors.add(Color.parseColor("#00FFFF")); // Neon Cyan
        colors.add(Color.parseColor("#FFFF00")); // Neon Yellow
        colors.add(Color.parseColor("#FF0080")); // Neon Magenta
        
        // Earth tones
        colors.add(Color.parseColor("#8B4513")); // Saddle Brown
        colors.add(Color.parseColor("#A0522D")); // Sienna
        colors.add(Color.parseColor("#CD853F")); // Peru
        colors.add(Color.parseColor("#DEB887")); // Burlywood
        colors.add(Color.parseColor("#F5DEB3")); // Wheat
        colors.add(Color.parseColor("#D2B48C")); // Tan
        colors.add(Color.parseColor("#BC8F8F")); // Rosy Brown
        colors.add(Color.parseColor("#F4A460")); // Sandy Brown
        colors.add(Color.parseColor("#DAA520")); // Goldenrod
        colors.add(Color.parseColor("#B8860B")); // Dark Goldenrod
        
        // Ocean colors
        colors.add(Color.parseColor("#4682B4")); // Steel Blue
        colors.add(Color.parseColor("#5F9EA0")); // Cadet Blue
        colors.add(Color.parseColor("#B0C4DE")); // Light Steel Blue
        colors.add(Color.parseColor("#ADD8E6")); // Light Blue
        colors.add(Color.parseColor("#87CEEB")); // Sky Blue
        colors.add(Color.parseColor("#87CEFA")); // Light Sky Blue
        colors.add(Color.parseColor("#00BFFF")); // Deep Sky Blue
        colors.add(Color.parseColor("#1E90FF")); // Dodger Blue
        colors.add(Color.parseColor("#4169E1")); // Royal Blue
        colors.add(Color.parseColor("#0000CD")); // Medium Blue
        
        // Forest colors
        colors.add(Color.parseColor("#228B22")); // Forest Green
        colors.add(Color.parseColor("#32CD32")); // Lime Green
        colors.add(Color.parseColor("#90EE90")); // Light Green
        colors.add(Color.parseColor("#98FB98")); // Pale Green
        colors.add(Color.parseColor("#8FBC8F")); // Dark Sea Green
        colors.add(Color.parseColor("#3CB371")); // Medium Sea Green
        colors.add(Color.parseColor("#2E8B57")); // Sea Green
        colors.add(Color.parseColor("#20B2AA")); // Light Sea Green
        colors.add(Color.parseColor("#48D1CC")); // Medium Turquoise
        colors.add(Color.parseColor("#40E0D0")); // Turquoise

        return colors;
    }

    public static class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {
        private List<Integer> colors;
        private OnColorClickListener listener;

        public interface OnColorClickListener {
            void onColorClick(int color);
        }

        public ColorAdapter(List<Integer> colors, OnColorClickListener listener) {
            this.colors = colors;
            this.listener = listener;
        }

        @Override
        public ColorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.color_item, parent, false);
            return new ColorViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ColorViewHolder holder, int position) {
            int color = colors.get(position);
            holder.colorView.setBackgroundColor(color);
            holder.itemView.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onColorClick(color);
                }
            });
        }

        @Override
        public int getItemCount() {
            return colors.size();
        }

        static class ColorViewHolder extends RecyclerView.ViewHolder {
            View colorView;

            ColorViewHolder(View itemView) {
                super(itemView);
                colorView = itemView.findViewById(R.id.colorView);
            }
        }
    }
} 