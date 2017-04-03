package com.example.alumno.clase03;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class Vista implements IMostrar {

    private TextView tv;
    private Button boton;

    public Vista(Activity a, Modelo m)
    {
        this.tv = (TextView) a.findViewById(R.id.tvSaludo); // super es que hereda del padre
        this.tv.setText("holaaaaaaaaaa");

        this.boton = (Button) a.findViewById(R.id.boton1);
        this.boton.setText("Cambiar texto");
       // boton.setOnClickListener();

    }


    @Override
    public void mostrarInfo(){
        tv.setText("ESTE ES LA INTERFAZ");
    }


}
