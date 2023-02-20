package com.example.vasialo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view){
        Kotnik k = new Kotnik();
        TextView text_view = (TextView) findViewById(R.id.textView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        text_view.setText(k.GetWork((String)spinner.getSelectedItem()));

        /*String str = new String(((String) spinner.getSelectedItem()));

        text_view.setText(k.GetWork((String) spinner.getSelectedItem()));

        if (String.valueOf(spinner.getSelectedItem()).equals("Вася")){
            text_view.setText("Страдает Хуйней");
        }

        if (String.valueOf(spinner.getSelectedItem()).equals("Коть")){
            text_view.setText("Лапку Лижет");
        }

        if (String.valueOf(spinner.getSelectedItem()).equals("Собака")){
            text_view.setText("Делает Кусь");
        }
*/
    }
}





