package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
//        Intent intent = new Intent(this);
        EditText editText = (EditText)findViewById(R.id.editText6);
        String message = editText.getText().toString();
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
//        intent.putExtra(EXTRA_MESSAGE,message);
//        startActivity(intent);
    }


}
