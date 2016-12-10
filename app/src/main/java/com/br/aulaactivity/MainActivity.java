package com.br.aulaactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.CallSuper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button proximaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "onCreate metodo chamado", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);

        this.proximaTela = (Button) findViewById(R.id.proxima_tela);

        proximaTela.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, SegundaTelaAvtivity.class));
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy metodo chamado", Toast.LENGTH_SHORT).show();
    }
}
