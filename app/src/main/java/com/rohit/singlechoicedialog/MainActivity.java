package com.rohit.singlechoicedialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItems = getResources().getStringArray(R.array.shopping_item);

        Button mButton = (Button) findViewById(R.id.button);
        final TextView mResult = (TextView) findViewById(R.id.tvResult);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                mBuilder.setTitle("Choose an item");
                mBuilder.setItems(listItems, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                                Toast.makeText(getApplicationContext()," Position 0 is selected", Toast.LENGTH_LONG).show();
                                break;
                            case 1:
                                Toast.makeText(getApplicationContext(),"position 1 is selected", Toast.LENGTH_LONG).show();
                                break;
                            case 3:
                                Toast.makeText(getApplicationContext(),"Position 0 is selected", Toast.LENGTH_LONG).show();
                                break;
                        }
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }
}
