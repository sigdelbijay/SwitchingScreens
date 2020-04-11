package com.example.switchingscreens;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getName(View view) {
        Intent getNameScreenIntent = new Intent(this, SecondScreen.class);
        getNameScreenIntent.putExtra("callinActivity", "MainActivity");

        final int result = 1;
        startActivityForResult(getNameScreenIntent, result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView nameTextView = (TextView) findViewById(R.id.users_name_message);
        String returnedName = data.getStringExtra("username");
        nameTextView.append(" " + returnedName);
    }


}
