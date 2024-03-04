package com.sabithpkcmnr.edgetoedge;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import com.google.android.material.appbar.MaterialToolbar;

public class ActivityFixed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        //EdgeToEdge.enable(this); //We don't need this since we want
        //to keep the status bar untouched and only navigation bar needed to be modified
        setContentView(R.layout.activity_fixed);






        TextView itemTextLastBye = findViewById(R.id.itemTextLastBye);
        ViewCompat.setOnApplyWindowInsetsListener(itemTextLastBye, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(0, 0, 0, systemBars.bottom);
            return insets;
        });


    }
}