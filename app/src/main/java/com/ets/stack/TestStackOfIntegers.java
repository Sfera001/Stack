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

public class TestStackOfIntegers {



    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");

    }
}
