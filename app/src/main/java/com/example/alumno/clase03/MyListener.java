package com.example.alumno.clase03;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    private IMostrar a;

    public MyListener(IMostrar a)
    {
        this.a=a;
    }

    @Override
    public void onClick(View v){
        // Log.d("CLICK","se hizo click")
            a.mostrarInfo();

    }

}