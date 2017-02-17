package com.example.admin.actividadprincipal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActDos extends AppCompatActivity {

    TextView nom,ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_dos);
        nom=(TextView)findViewById(R.id.textView2);
        ap=(TextView)findViewById(R.id.textView4);

        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String datoNommbre=(String)extras.get("nombre");
            String datoApellido=(String)extras.get("apellido");
            nom.setText(datoNommbre);
            ap.setText(datoApellido);
        }
        Button btnCall=(Button)findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9993329815"));
                startActivity(intent);
            }
        });
        Button btnSend=(Button)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT,"TE ENVITO A MI FIESTA");
                intent.setType("text/plain");
                startActivity(intent);
            }
        });

        Button btnDial=(Button)findViewById(R.id.btnDial);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9993329815"));
                startActivity(intent);
            }
        });

        Button btnView=(Button)findViewById(R.id.btnView);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.google.com.mx"));
                startActivity(intent);
            }
        });

    }
}
