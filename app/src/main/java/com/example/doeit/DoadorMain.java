package com.example.doeit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class DoadorMain extends AppCompatActivity {
    private TextView nomeUsuario;

    private Button bt_menuAccount;

    String usuarioID;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doador_main2);
        IniciarComponentes();
        bt_menuAccount = (Button) findViewById(R.id.bottomNavigationView);
        bt_menuAccount.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {openProfile(); }
        });

    }

    public void openProfile(){
        Intent intent = new Intent(this, PerfilUsuarioDoador.class);
    }
    @Override
    protected void onStart() {
        super.onStart();

        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();

        DocumentReference documentReference = db.collection("Usuarios").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null){
                    nomeUsuario.setText(documentSnapshot.getString("nome"));
                }
            }
        });
    }
    private void IniciarComponentes(){
        nomeUsuario = findViewById(R.id.nomeUsuario);
    }
}