package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    String oldNumber = "";
    String op = "+";
    boolean isNewOp = true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);






    }

    public void NumberEvent(View view) {

        if (isNewOp)
            ed1.setText("");
        isNewOp = false;

        String numero = ed1.getText().toString();
        String buttonNumber = view.getTag().toString();

        switch (buttonNumber) {
            case "1":
                numero += "1";
                break;
            case "2":
                numero += "2";
                break;
            case "3":
                numero += "3";
                break;
            case "4":
                numero += "4";
                break;
            case "5":
                numero += "5";
                break;
            case "6":
                numero += "6";
                break;
            case "7":
                numero += "7";
                break;
            case "8":
                numero += "8";
                break;
            case "9":
                numero += "9";
                break;
            case "0":
                numero += "0";
                break;

            case ".":
                numero += ".";
                break;

            case "+/-":
                numero = "-"+numero;
                break;
        }

        ed1.setText(numero);
    }

    public void OperatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        String operator = view.getTag().toString();

        switch (operator) {
            case "/":
                op = "/";
                break;

            case "x":
                op = "*";
                break;

            case "+":
                op = "+";
                break;


            case "-":
                op = "-";
                break;




        }
    }

    public void equalEvent(View view) {

        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op){

            case "+":
                result = Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;

            case "-":
                result = Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;

            case "*":
                result = Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;

            case "/":
                result = Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result+"");
    }

    public void AcEvent(View view) {

        ed1.setText("0");
        isNewOp = true;

    }

    public void PorcentajeEvent(View view) {

        Double no = Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(no+"");
        isNewOp = true;
    }
}