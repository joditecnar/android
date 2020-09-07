package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String Electrodomesticos [] = {"Ventiladores", "Neveras", "Licuadoras", "Estufas", "Televisores",
            "Lavadoras", "Equipos de sonido"};
    private String Precio [] = {"$140.000", "$170.000", "$65.000", "$100.000", "$300.000", "$140.000", "$55.000"};
    private String Total [] = {"40", "17", "65", "10", "30", "14", "55"};

    private TextView electrodomestico;
    private ListView precio;
    private ListView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        electrodomestico = (TextView)findViewById(R.id.mensaje);
        precio =(ListView)findViewById(R.id.lista);
        total =(ListView)findViewById(R.id.lista);

        ArrayAdapter<String> mostrar = new ArrayAdapter<String> (this, android.R.layout
                .simple_list_item_1, Electrodomesticos);
        total.setAdapter(mostrar);
        total.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView parent, View view, int position, long id) {
                electrodomestico.setText (" Precio: " + Precio[position] + "\n" + " Disponibles: "  + Total[position]);
            }
        });
    }
}
