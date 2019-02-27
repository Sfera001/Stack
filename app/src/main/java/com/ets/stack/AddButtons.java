package com.ets.stack;

import android.widget.Button;

public class AddButtons {




    public Button deleteFirst(Button[] button,int i){
        return button[i];
    }

    public Button deleteLast(Button[] button,int size){
        return button[--size];
    }



}
