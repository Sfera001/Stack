package com.ets.stack;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addButton,deleteLast,deleteFirst,deleteAll;
    Button[] buttons = new Button[20];
    Button button;
    private TableLayout queryTableLayout;
    private int i = 0;
    private int j = 0;
    private int size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queryTableLayout =  findViewById(R.id.queryTableLayout);
        addButton = findViewById(R.id.addButton);
        deleteLast = findViewById(R.id.deleteLast);
        deleteFirst = findViewById(R.id.deleteFirst);
        deleteAll = findViewById(R.id.deleteAll);

        addButton.setOnClickListener(this);
        deleteLast.setOnClickListener(this);
        deleteFirst.setOnClickListener(this);
        deleteAll.setOnClickListener(this);

    }

    public void onClick(View v){
        AddButtons addButtons = new AddButtons();
        button = new Button(this);
        if (size >= buttons.length) {
            Button[] temp = new Button[buttons.length * 2];
            System.arraycopy(buttons, 0, temp, 0, buttons.length);
            buttons = temp;
        }
        button.setId(size);
        button.setText("Button " + size);
        switch (v.getId()){
            case R.id.addButton:
                queryTableLayout.addView(buttons[size++] = button);
                break;
            case R.id.deleteFirst:
                queryTableLayout.removeView(addButtons.deleteFirst(buttons,i));
                i++;
                break;

            case R.id.deleteLast:
                queryTableLayout.removeView(addButtons.deleteLast(buttons,size));
                --size;
                break;
            case R.id.deleteAll:
                queryTableLayout.removeAllViews();
                size = 0;
                i = 0;
                break;
        }
    }


}
