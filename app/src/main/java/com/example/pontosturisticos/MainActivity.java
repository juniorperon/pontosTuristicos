package com.example.pontosturisticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Campolim
    public void btnCampolimClick (View view) {
        Intent intent = new Intent(this,CampolimActivity.class);
        startActivity(intent);
    }

    //Zoologico
    public void btnZoologicoClick (View view) {
        Intent intent = new Intent(this,ZooActivivity.class);
        startActivity(intent);
    }

    //Parque das Aguas
    public void btnAguasClick (View view) {
        Intent intent = new Intent(this,AguasActivity.class);
        startActivity(intent);
    }
}
