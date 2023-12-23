package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick00(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"00");

    }
    public void onClick0(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"0");
    }
    public void onClickComa(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+".");
    }
    public void onClickIg(View view){
        String res = null;
        String resAnt;
        Float resI;
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        String[] j =op.split(" ");
        resI=Float.parseFloat(j[0]);
        Log.i("ESO", "User:"+j[1]);
        for(int io = 1; io < j.length-1; io++){
            if(j[io].equals("*"))
            {
                resI= resI * Float.parseFloat(j[io+1]);
                res=resI.toString();
            }
            if(j[io].equals("/"))
            {
                resI= resI / Float.parseFloat(j[io+1]);
                res=resI.toString();
            }
            if(j[io].equals("+"))
            {
                resI= resI + Float.parseFloat(j[io+1]);
                Log.i("ESO", "User:"+resI);
                res=resI.toString();
            }
            if(j[io].equals("-"))
            {
                resI= resI - Float.parseFloat(j[io+1]);
                res=resI.toString();
            }
            if(j[io].equals("%"))
            {
                resI= resI/100;
                res=resI.toString();
            }
            io++;
        }
        TextView ress = findViewById(R.id.textView2);
        ress.setText("= "+res);

    }
    public void onClick1(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"1");
    }
    public void onClick2(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"2");
    }
    public void onClick3(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"3");
    }
    public void onClickSum(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+" + ");
    }
    public void onClick4(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"4");

    }
    public void onClick5(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"5");
    }
    public void onClick6(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"6");
    }
    public void onClickRest(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+" - ");
    }
    public void onClick7(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"7");

    }
    public void onClick8(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"8");
    }
    public void onClick9(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+"9");
    }
    public void onClickMult(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+" * ");
    }
    public void onClickC(View view){
        TextView opp = findViewById(R.id.textCalc);

        opp.setText("");
    }
    public void onClickPerc(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+" % ");
    }
    public void onClickDel(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();

        opp.setText(op.substring(0, op.length() - 1));
    }
    public void onClickDiv(View view){
        TextView opp = findViewById(R.id.textCalc);
        String op = opp.getText().toString();
        opp.setText(op+" / ");
    }
}