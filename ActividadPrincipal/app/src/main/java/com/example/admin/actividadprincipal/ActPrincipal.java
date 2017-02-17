package com.example.admin.actividadprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActPrincipal extends AppCompatActivity {
private EditText txtNombre,txtApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_principal);
        Button btnEnviar=(Button)findViewById(R.id.btnEnvio);
        txtApellido=(EditText)findViewById(R.id.EditNombre);
        txtNombre=(EditText)findViewById(R.id.EditaApellido);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviar_Datos();
            }
        });
    }
    public void enviar_Datos(){
        Intent intent=new Intent(ActPrincipal.this,ActDos.class);
        String auxNombre=txtNombre.getText().toString();
        String auxApellido=txtApellido.getText().toString();
        intent.putExtra("nombre",auxNombre);
        intent.putExtra("apellido",auxApellido);
        startActivity(intent);
    }
}
