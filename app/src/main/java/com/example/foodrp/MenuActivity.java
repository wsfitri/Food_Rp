package com.example.foodrp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button rs = (Button)findViewById(R.id.rs);
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RaActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });
        Button rd = (Button)findViewById(R.id.rd);
        rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RdActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });

        Button rc = (Button)findViewById(R.id.rc);
        rc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RcActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });

        Button pojok = (Button)findViewById(R.id.pojok);
        pojok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PojokActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });
    }
}
