package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String firstNumber;
    String symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycalculator);

        TextView count = findViewById(R.id.textViewCount);
        Button buttonDelete = findViewById(R.id.buttonDelete);
        Button buttonMemory = findViewById(R.id.buttonMemory);
        Button buttonRecuperate = findViewById(R.id.buttonRecuperate);
        Button buttonDivider = findViewById(R.id.buttonDivider);
        Button buttonOne = findViewById(R.id.buttonOne);
        Button buttonTwo = findViewById(R.id.buttonTwo);
        Button buttonThree = findViewById(R.id.buttonThree);
        Button buttonFour = findViewById(R.id.ButtonFour);
        Button buttonFive = findViewById(R.id.ButtonFive);
        Button buttonSix = findViewById(R.id.ButtonSix);
        Button buttonSeven = findViewById(R.id.buttonSeven);
        Button buttonEight = findViewById(R.id.buttonEight);
        Button buttonNine = findViewById(R.id.buttonNine);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        Button buttonMultiplier = findViewById(R.id.buttonMultiplier);
        Button buttonZero = findViewById(R.id.buttonZero);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonPoint = findViewById(R.id.buttonPoint);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = count.getText().toString();
                symbol = "+";
                count.setText("");
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = count.getText().toString();
                symbol = "-";
                count.setText("");
            }
        });

        buttonMultiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = count.getText().toString();
                symbol = "*";
                count.setText("");
            }
        });

        buttonDivider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = count.getText().toString();
                symbol = "/";
                count.setText("");
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult = myResult + 0;
                count.setText(myResult);
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "1";
                count.setText(myResult);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "2";
                count.setText(myResult);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "3";
                count.setText(myResult);
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "4";
                count.setText(myResult);
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "5";
                count.setText(myResult);
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "6";
                count.setText(myResult);
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "7";
                count.setText(myResult);
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "8";
                count.setText(myResult);
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult += "9";
                count.setText(myResult);
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.setText("");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myResult = count.getText().toString();
                myResult = myResult + ".";
                count.setText(myResult);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String secondNumber = count.getText().toString();

                switch (symbol) {
                    case "+": {
                        double parseFirstNumber = Double.parseDouble(firstNumber);
                        double parseSecondNumber = Double.parseDouble(secondNumber);

                        double result = parseFirstNumber + parseSecondNumber;

                        count.setText(String.valueOf(result));
                    }
                    break;
                    case "-": {
                        double parseFirstNumber = Double.parseDouble(firstNumber);
                        double parseSecondNumber = Double.parseDouble(secondNumber);

                        double result = parseFirstNumber - parseSecondNumber;

                        count.setText(String.valueOf(result));
                    }
                    break;
                    case "*": {
                        double parseFirstNumber = Double.parseDouble(firstNumber);
                        double parseSecondNumber = Double.parseDouble(secondNumber);

                        double result = parseFirstNumber * parseSecondNumber;

                        count.setText(String.valueOf(result));
                    }
                    break;
                    case "/": {
                        double parseFirstNumber = Double.parseDouble(firstNumber);
                        double parseSecondNumber = Double.parseDouble(secondNumber);

                        double result = parseFirstNumber / parseSecondNumber;

                        count.setText(String.valueOf(result));
                    }
                }
            }
        });

        buttonMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = count.getText().toString();

                Toast toast = Toast.makeText(MainActivity.this, "Se ha guardado el número", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonRecuperate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = "";
                count.setText("");


                Toast toast = Toast.makeText(MainActivity.this, "Se ha borrado el número", Toast.LENGTH_SHORT);
                toast.show();

            }
        });













    }
}