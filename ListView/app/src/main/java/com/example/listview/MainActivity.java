package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ///////////////Array para mostrar los articulos al dar click sobre uno de ellos///////////////////
    private String Electrodomesticos [] = {"Ventiladores", "Neveras", "Licuadoras", "Estufas", "Televisores",
            "Lavadoras", "Equipos de sonido"};

    /////////////Array para mostrar los elementos almacenados de los articulos////////////////
    private String Precio [] = {"$140.000", "$170.000", "$65.000", "$100.000", "$300.000", "$140.000", "$55.000"};
    private String Total [] = {"40", "17", "65", "10", "30", "14", "55"};

    ////////////Variables que vamos asignar a los arrays declarados arriba///////////
    private TextView electrodomestico;
    private ListView precio;
    private ListView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /////////////Asignamos las variables a los id que declaramos en las vistas del layout////////////
        electrodomestico = (TextView)findViewById(R.id.mensaje);
        precio =(ListView)findViewById(R.id.lista);
        total =(ListView)findViewById(R.id.lista);

        /////////////////Funcion arrayadapter para mostrar el array de los electrodomesticos en el listview////////////
        ArrayAdapter<String> mostrar = new ArrayAdapter<String> (this, android.R.layout
                .simple_list_item_1, Electrodomesticos);
        precio.setAdapter(mostrar);
        ///////////////////////Funcion setOnItemClickListener para dar click en el listview de los electrodomesticos///////
        total.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        ////////////////Funcion onItemClick para mostrar los elementos almacenados en los arrays del listview y asi mostrarlos en el textview////////
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                electrodomestico.setText (" Precio: " + Precio[position] + "\n" + " Disponibles: "  + Total[position]);
            }
        });
    }
}
