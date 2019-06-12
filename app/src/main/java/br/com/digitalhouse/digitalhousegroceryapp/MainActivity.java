package br.com.digitalhouse.digitalhousegroceryapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoCompras = findViewById(R.id.botao_compras_id);
        botaoCompras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exibirFragment1();

            }
        });

        Button botaoListas = findViewById(R.id.botao_lista_id);
        botaoListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exibirFragment2();

            }
        });

        Button botaoPromocoes = findViewById(R.id.botao_promocoes_id);
        botaoPromocoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exibirFragment3();

            }
        });
    }

    public void exibirFragment1(){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container_id, new Fragment1());
        transaction.commit();
    }
    public void exibirFragment2(){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container_id, new Fragment2());
        transaction.commit();
    }
    public void exibirFragment3(){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container_id, new Fragment3());
        transaction.commit();
    }


}
