package com.example.mymessenger2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onClickButtonSendMessage(View view){
        //Intent intent = new Intent(this, ReceiveMessageActivity.class);


        EditText editText = (EditText)findViewById(R.id.editTextTextMultiLine);
        String message = editText.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        String chosenHeader = getString(R.string.chosenHeader);
        Intent chosenIntent = Intent.createChooser(intent, chosenHeader);
        startActivity(chosenIntent);
    }
}