package com.example.radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogroup;
   Button btton;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup=findViewById(R.id.radi);
       btton=findViewById(R.id.button);
       textview=findViewById(R.id.txt);
       btton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });



    }
    public void CheckButton(View v)
    {
        int radioseselected=radiogroup.getCheckedRadioButtonId();
        RadioButton radiobttn=findViewById(radioseselected);

        Toast.makeText(this,"you selected:"+radiobttn.getText(),Toast.LENGTH_SHORT);

    }
}