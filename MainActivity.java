package com.uca.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton respuesta, respuesta1;
    TextView Preguntas, Texto;
    Button Siguiente, Salir;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta = findViewById(R.id.respuesta);
        respuesta1 = findViewById(R.id.respuesta1);

        Preguntas = findViewById(R.id.Preguntas);
        Texto = findViewById(R.id.Texto);

        Siguiente = findViewById(R.id.Siguiente);
        Salir = findViewById(R.id.Salir);
    }
    public void Siguiente (View vista){
        if (respuesta.isChecked() == false && respuesta1.isChecked() == false){
            Toast.makeText(this, "Elija una opcion", Toast.LENGTH_SHORT).show();
        }else if(Npregunta ==1){
            if(respuesta.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            Preguntas.setText("Pregunta 2");
            Texto.setText("2-¿Tienes fiebre?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(false);
            respuesta1.setChecked(true);
        }else if (Npregunta == 2){
            if (respuesta.isChecked()) {
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            Preguntas.setText("Pregunta 3");
            Texto.setText("3-¿Tienes cansancio?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(true);
            respuesta1.setChecked(false);
        }else if (Npregunta == 3){
            if (respuesta.isChecked()) {
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            Preguntas.setText("Pregunta 4");
            Texto.setText("4-¿Tienes Perdida del gusto o olfato?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(false);
            respuesta1.setChecked(true);
        }else if (Npregunta == 4){
            if (respuesta.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            Preguntas.setText("Pregunta 5");
            Texto.setText("5-¿Tienes dolor de garganta?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(false);
            respuesta1.setChecked(true);
        }else if (Npregunta == 5){
            if (respuesta.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            Preguntas.setText("Pregunta 6");
            Texto.setText("6-¿Tienes dolor de cabeza?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(true);
            respuesta1.setChecked(false);
        }else if (Npregunta == 6){
            if (respuesta.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta +1;
            Preguntas.setText("Pregunta 7");
            Texto.setText("7-¿Tienes tos?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(true);
            respuesta1.setChecked(false);
        }else if (Npregunta == 7){
            if (respuesta.isChecked()){
                nota = nota +2;
            }
            Npregunta = Npregunta +1;
            Preguntas.setText("Pregunta 8");
            Texto.setText("8-¿Tienes dolor en el pecho?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(true);
            respuesta1.setChecked(false);
        }else if (Npregunta == 8){
            if (respuesta.isChecked()){
                nota = nota +2;
            }
            Npregunta = Npregunta +1;
            Preguntas.setText("Pregunta 9");
            Texto.setText("9-¿Tienes dificultad para respirar?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(true);
            respuesta1.setChecked(false);
        }else if (Npregunta == 9){
            if (respuesta.isChecked()){
                nota = nota +2;
            }
            Npregunta = Npregunta +1;
            Preguntas.setText("Pregunta 10");
            Texto.setText("10-¿Has tenido contacto con un contagiado de covid?");
            respuesta.setText("Si");
            respuesta1.setText("No");

            respuesta.setChecked(true);
            respuesta1.setChecked(false);
        }else if (Npregunta == 10){
            if (respuesta.isChecked()){
                nota = nota +2;
            }

            Preguntas.setText("Tu text: "+ nota);
            if (nota >= 16){
                Texto.setText("Tienes Covid");
            }else{
                Texto.setText("No tienes Covid");
            }
            respuesta.setVisibility(View.GONE);
            respuesta1.setVisibility(View.GONE);
            Siguiente.setVisibility(View.GONE);
        }
    }
    public void Salir (View vista){
        finish();
    }
}