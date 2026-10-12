package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public float liczba=0;
    public String CurrentDisplay="";
    public int dzialanie=0;

    public void dodaj1(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"1";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj2(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"2";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj3(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"3";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj4(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"4";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj5(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"5";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj6(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"6";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj7(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"7";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj8(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"8";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj9(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"9";
        resultat.setText(CurrentDisplay);
    }
    public void dodaj0(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay=CurrentDisplay+"0";
        resultat.setText(CurrentDisplay);
    }
    public void clear(View view){
        TextView resultat = findViewById(R.id.textView);
        CurrentDisplay="";
        resultat.setText(CurrentDisplay);
        liczba=0;
    }
    public void dodawanie(View view){

        TextView resultat = findViewById(R.id.textView);
        liczba=liczba+Float.parseFloat(CurrentDisplay);
        resultat.setText(Float.toString(liczba));
        dzialanie=1;
        CurrentDisplay="";
        resultat.setText(CurrentDisplay);
    }
    public void ruwnanie(View view){
        TextView resultat = findViewById(R.id.textView);
        if(dzialanie==1) {
//            resultat.setText(Float.toString(liczba));
            liczba = liczba + Float.parseFloat(CurrentDisplay);
            resultat.setText(Float.toString(liczba));
        }else{
            resultat.setText(Float.toString(liczba));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}