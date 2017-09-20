     package com.itrainasia.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

     public class MainActivity extends AppCompatActivity {
         Button plusButton;
         EditText editText1;
         EditText editText2;
         TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        plusButton = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText1.getText() +" + "+editText2.getText()+" =" );
            }
        });


    }
}
