package com.example.alumno.clase03;

/**
 * Created by alumno on 30/03/2017.
 */

public class Controlador {

    private MyListener listener;
    private Vista vista;

    public Controlador(MyListener listener, Vista vista)
    {
        this.listener=listener;
        this.vista=vista;
    }

    public MyListener getListener(){
        return this.listener;
    }

    public void mostrar()
    {
        this.vista.mostrarInfo();
    }

}
