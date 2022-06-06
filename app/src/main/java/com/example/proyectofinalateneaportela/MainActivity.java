package com.example.proyectofinalateneaportela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular;
    private Button btnSelectCity;
    private LinearLayout LlBottom;
    private LinearLayout LLPortada;
    private ListView lvCities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar_datos();
        //Evento que gestiona el click largo sobre el Texto Bienvenido/ Welcome
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LlBottom.setVisibility(View.VISIBLE);
                LLPortada.setVisibility(View.GONE);
            }
        });
        lvCities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String city = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this, "Ciudad Elegida: "+city, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onClickbtn(View view) {
        Toast.makeText(this, "bonton son funcionalidad", Toast.LENGTH_SHORT).show();


    }
    private void inicializar_datos() {

        btnCalcular = findViewById(R.id.btnStartTravel);
        btnSelectCity = findViewById(R.id.btnSelectCity);
        LlBottom = findViewById(R.id.LlListCities);
        LLPortada = findViewById(R.id.LLPortada);
        lvCities = findViewById(R.id.lvCities);

    }

}