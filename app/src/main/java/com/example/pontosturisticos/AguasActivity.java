package com.example.pontosturisticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AguasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aguas);
    }

    public void btnMapaAguasClick(View view) {
        //Parque das aguas
        Uri uri = Uri.parse("geo:0,0?q=Rua+Antônio+Joaquim+Santana+714");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void btnVoltarClick(View view) {
        //Parque das aguas
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}