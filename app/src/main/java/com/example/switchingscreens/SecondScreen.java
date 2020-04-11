package com.example.switchingscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SecondScreen extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callinActivity");
        TextView t1 = (TextView) findViewById(R.id.calling_activity_text_view);
        t1.append(" " + previousActivity);
    }

    public void sendUsersName(View view) {
        EditText userName = (EditText) findViewById(R.id.editText);
        String user = String.valueOf(userName.getText());
        Intent returnIntent = new Intent();
        returnIntent.putExtra("username", user);
        setResult(RESULT_OK, returnIntent);
        finish();
    }
}
