package br.com.exerciciolayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt01 = (Button)findViewById(R.id.button);
        Button bt02 = (Button)findViewById(R.id.button2);
        Button bt03 = (Button)findViewById(R.id.button3);
        Button bt04 = (Button)findViewById(R.id.button4);
        Button bt05 = (Button)findViewById(R.id.button5);
        Button bt06 = (Button)findViewById(R.id.button6);
        Button bt07 = (Button)findViewById(R.id.button7);

        bt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout01 = new Intent(MainActivity.this, Exercicio01LinearActivity.class);
                startActivity(intentLayout01);
            }
        });

        bt02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout02 = new Intent(MainActivity.this, Exercicio01GridActivity.class);
                startActivity(intentLayout02);
            }
        });

        bt03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout03 = new Intent(MainActivity.this, Exercicio01TableActivity.class);
                startActivity(intentLayout03);
            }
        });

        bt04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout04 = new Intent(MainActivity.this, Exercicio02RelativeActivity.class);
                startActivity(intentLayout04);
            }
        });

        bt05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout05 = new Intent(MainActivity.this, Exercicio03CardViewActivity.class);
                startActivity(intentLayout05);
            }
        });

        bt06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout06 = new Intent(MainActivity.this, Exercicio04ScrollViewActivity.class);
                startActivity(intentLayout06);
            }
        });

        bt07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout07 = new Intent(MainActivity.this, Exercicio05ConstraintActivity.class);
                startActivity(intentLayout07);
            }
        });

    }
}
