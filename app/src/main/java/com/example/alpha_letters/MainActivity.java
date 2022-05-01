package com.example.alpha_letters;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    TextView txtview;
    Button btn1, btn2, btn3,ans;
    boolean flagr=false,flagg=false,flags=false;


    String[] root ={"g","j","p","q","y"};
    String[] grass ={"a","c","e","i","o","m","n","r","s","u","v","w","x","z"};
    String[] sky ={"b","d","f","h","k","l","t"};
    Random rnd;
    int r;
    String letter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        ans = findViewById(R.id.ans);
        txtview=findViewById(R.id.txtbox);
        rnd = new Random();
        r=rnd.nextInt((122-97)+1)+97;
        letter= String.valueOf((char) r);
        txtview.setText(letter);

    }


    @SuppressLint("SetTextI18n")
    public void sky(View view) {


        for (String s : sky) {
            if (letter.equals(s)) {

                ans.setText("Correct");
                flags=false;
                break;
            }
            else
            {
                flags=true;
            }

        }
        if(flags==true)
        {
            ans.setText("Incorrect");
        }
    }

    @SuppressLint("SetTextI18n")
    public void grass(View view) {

        for (String s : grass) {
            if (letter.equals(s)) {
                ans.setText("Correct");
                flagg=false;
                break;
            }
            else
            {
                flagg=true;
            }

        }
        if(flagg==true)
        {
            ans.setText("Incorrect");
        }
    }

    @SuppressLint("SetTextI18n")
    public void root(View view) {

        for (String s : root) {
            if (letter.equals(s)) {
                ans.setText("Correct");
                flagr=false;
                break;
            }
            else
            {
                flagr=true;
            }

        }
        if(flagr==true)
        {
            ans.setText("Incorrect");
        }

    }
}