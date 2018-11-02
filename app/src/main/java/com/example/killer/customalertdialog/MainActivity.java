package com.example.killer.customalertdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogButton = findViewById(R.id.showDialogButton);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();        
            }
        });
    }
    
    void showDialog() {

        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alert_dialog, null);

        Button acceptButton = view.findViewById(R.id.acceptButton);
        Button cancelButton = view.findViewById(R.id.cancelButton);

        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "onClick: accept button");
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "onClick: cancel button" );
            }
        });

        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();

        alertDialog.show();



    }
}
