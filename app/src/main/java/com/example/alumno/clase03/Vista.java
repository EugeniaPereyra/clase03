package com.example.alumno.clase03;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class Vista implements IMostrar {

    TextView tv;
    Button boton;

    public Vista(Activity a, Modelo m)
    {
        tv = (TextView) a.findViewById(R.id.tvSaludo); // super es que hereda del padre
        tv.setText("holaaaaaaaaaa");

        boton = (Button) a.findViewById(R.id.boton1);
        boton.setText("Cambiar texto");
       // boton.setOnClickListener();

    }


    @Override
    public void mostrarInfo(){
        tv.setText("ESTE ES LA INTERFAZ");
    }


}
