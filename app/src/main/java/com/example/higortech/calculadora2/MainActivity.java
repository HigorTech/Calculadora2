package com.example.higortech.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView valor1;
    private TextView valor2;
    private Button soma;
    private Button subtracao;
    private Button multiplicacao;
    private Button divisao;
    private TextView resultado;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT).show();
        Log.v("Verbose","Sou um log de Verbose e estou no onStart");
        Log.d("Debug","Sou um log de Debug e estou no onStart");
        Log.i("Informação","Sou um log de Informação e estou no onStart");
        Log.w("Alerta","Sou um log de Perigo e estou no onStart");
        Log.e("Erro","Sou um log de Erro e estou no onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT).show();
        Log.v("Verbose","Sou um log de Verbose e estou no onStop");
        Log.d("Debug","Sou um log de Debug e estou no onStop");
        Log.i("Informação","Sou um log de Informação e estou no onStop");
        Log.w("Alerta","Sou um log de Perigo e estou no onStop");
        Log.e("Erro","Sou um log de Erro e estou no onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();
        Log.v("Verbose","Sou um log de Verbose e estou no onDestroy");
        Log.d("Debug","Sou um log de Debug e estou no onCreate");
        Log.i("Informação","Sou um log de Informação e estou no onDestroy");
        Log.w("Alerta","Sou um log de Perigo e estou no onDestroy");
        Log.e("Erro","Sou um log de Erro e estou no onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPaused",Toast.LENGTH_SHORT).show();
        Log.v("Verbose","Sou um log de Verbose e estou no onPaused");
        Log.d("Debug","Sou um log de Debug e estou no onPaused");
        Log.i("Informação","Sou um log de Informação e estou no onPaused");
        Log.w("Alerta","Sou um log de Perigo e estou no onPaused");
        Log.e("Erro","Sou um log de Erro e estou no onPaused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT).show();
        Log.v("Verbose","Sou um log de Verbose e estou no onResume");
        Log.d("Debug","Sou um log de Debug e estou no onResume");
        Log.i("Informação","Sou um log de Informação e estou no onResume");
        Log.w("Alerta","Sou um log de Perigo e estou no onResume");
        Log.e("Erro","Sou um log de Erro e estou no onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_SHORT).show();
        Log.v("Verbose","Sou um log de Verbose e estou no onRestart");
        Log.d("Debug","Sou um log de Debug e estou no onRestart");
        Log.i("Informação","Sou um log de Informação e estou no onRestart");
        Log.w("Alerta","Sou um log de Perigo e estou no onRestart");
        Log.e("Erro","Sou um log de Erro e estou no onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT).show();
        Log.v("Verbose","Sou um log de Verbose e estou no onCreate");
        Log.d("Debug","Sou um log de Debug e estou no onCreate");
        Log.i("Informação","Sou um log de Informação e estou no onCreate");
        Log.w("Alerta","Sou um log de Perigo e estou no onCreate");
        Log.e("Erro","Sou um log de Erro e estou no onCreate");


        valor1 = findViewById(R.id.nr1Id);
        valor2 = findViewById(R.id.nr2Id);
        soma = findViewById(R.id.btnSoma);
        subtracao = findViewById(R.id.btnSub);
        multiplicacao = findViewById(R.id.btnMult);
        divisao = findViewById(R.id.btnDiv);
        resultado = findViewById(R.id.resultadoId);


        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String v1 = valor1.getText().toString();
               String v2 = valor2.getText().toString();

//
               if (v1.isEmpty()||v2.isEmpty()){
                   resultado.setText("Digite os Numeros nos campos Indicados.");
               } else {

                   double x = Double.parseDouble(v1);
                   double y = Double.parseDouble(v2);
                   double xy = x + y;
                   resultado.setText("A Soma é: "+xy);
               }





            }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v1 = valor1.getText().toString();
                String v2 = valor2.getText().toString();
                if (v1.isEmpty()||v2.isEmpty()){
                    resultado.setText("Digite os Numeros nos campos Indicados.");
                } else {

                    double x = Double.parseDouble(v1);
                    double y = Double.parseDouble(v2);
                    double xy = x - y;
                    resultado.setText("A Subtração é: "+xy);
                }


//


            }
        });
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v1 = valor1.getText().toString();
                String v2 = valor2.getText().toString();

//
                if (v1.isEmpty()||v2.isEmpty()){
                    resultado.setText("Digite os Numeros nos campos Indicados.");
                } else {

                    double x = Double.parseDouble(v1);
                    double y = Double.parseDouble(v2);
                    double xy = x / y;
                    resultado.setText("A Divisão é: "+xy);
                }


            }
        });

        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v1 = valor1.getText().toString();
                String v2 = valor2.getText().toString();

                if (v1.isEmpty()||v2.isEmpty()){
                    resultado.setText("Digite os Numeros nos campos Indicados.");
                } else {

                    double x = Double.parseDouble(v1);
                    double y = Double.parseDouble(v2);
                    double xy = x * y;
                    resultado.setText("A Multiplicação é: "+xy);
                }

//


            }
        });













    }


}
