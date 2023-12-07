package com.example.doeit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeDonatario extends AppCompatActivity {
    private ImageView bt_logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_donatario);
        IniciarComponentes();

        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeDonatario.this, Perfil_Donatario.class);
            }
        });
    }

    private void IniciarComponentes(){
        bt_logout = findViewById(R.id.imageMenuDona);
    }
}