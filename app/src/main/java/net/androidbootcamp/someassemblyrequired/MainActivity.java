package net.androidbootcamp.someassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // BUTTON SECTION (DEFINE)
        Button btnBicycle = (Button) findViewById(R.id.btnBike);
        Button btnPatio = (Button) findViewById(R.id.btnPatio);
        Button btnDresser = (Button) findViewById(R.id.btnDresser);

        // SET ON CLICK LISTENERS

            btnBicycle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, bicycle.class ));
                }
            });


            btnPatio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, patio.class));
                }
            });

            btnDresser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, Dresser1.class));
                }
            });
    }
}
