package com.example.douglas.ejemplo2cap6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText fno;
    private EditText sno;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fno = findViewById(R.id.firstno);
        sno = findViewById(R.id.secondno);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        fno.setText("");
        sno.setText("");
    }

    @Override
    public void onClick(View v) {

        boolean a = TextUtils.isEmpty(fno.getText());
        boolean b = TextUtils.isEmpty(sno.getText());

        if(!a & !b){

            int firstNumber = Integer.parseInt(fno.getText().toString());
            int secondNumber = Integer.parseInt(sno.getText().toString());

            Intent intent = new Intent(this,Calculate.class);
            Bundle bundle = new Bundle();
            bundle.putInt("fno",firstNumber);
            bundle.putInt("sno",secondNumber);
            intent.putExtra("gcfdata", bundle);
            startActivity(intent);
        }
    }
}
