package com.ronitoonza.kids;

import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.rgb(255, 248, 255));

        TextView title = new TextView(this);
        title.setText("🎨 RoniToonZa Kids");
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);

        TextView welcome = new TextView(this);
        welcome.setText("Welcome! Let's have fun! 🌈");
        welcome.setTextSize(20);
        welcome.setGravity(Gravity.CENTER);
        welcome.setPadding(0, 20, 0, 30);

        Button cartoons = new Button(this);
        cartoons.setText("🎬 Cartoons");

        Button stories = new Button(this);
        stories.setText("📖 Stories");

        Button poems = new Button(this);
        poems.setText("🎵 Poems");

        layout.addView(title);
        layout.addView(welcome);
        layout.addView(cartoons);
        layout.addView(stories);
        layout.addView(poems);

        cartoons.setOnClickListener(v ->
                Toast.makeText(this, "Cartoons coming soon! 🎬", Toast.LENGTH_SHORT).show()
        );

        stories.setOnClickListener(v ->
                Toast.makeText(this, "Stories coming soon! 📖", Toast.LENGTH_SHORT).show()
        );

        poems.setOnClickListener(v ->
                Toast.makeText(this, "Poems coming soon! 🎵", Toast.LENGTH_SHORT).show()
        );

        setContentView(layout);
    }
}
