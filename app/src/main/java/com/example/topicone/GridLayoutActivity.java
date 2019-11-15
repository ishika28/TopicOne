package com.example.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridLayoutActivity extends AppCompatActivity {
    Button btnOne, btnTwo, btnThree, btnFour, btnFive,
            btnSix, btnSeven, btnEight, btnNine, btnZero,
            btnAdd, btnSub, btnMul, btnDiv, btnClear, btnEqual;
    EditText etNum;
    int number1, number2, result;
    char temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
      
        btnOne= findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnNine);
        btnClear=findViewById(R.id.btnClear);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnEqual=findViewById(R.id.btnEqual);
        etNum=findViewById(R.id.etNum);


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"1");

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(etNum.getText()+"9");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum.setText(null);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Integer.parseInt(etNum.getText()+"");
                temp='+';
                etNum.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Integer.parseInt(etNum.getText()+"");

                temp='-';
                etNum.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Integer.parseInt(etNum.getText()+"");
                temp='*';
                etNum.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Integer.parseInt(etNum.getText()+"");
                temp='/';
                etNum.setText(null);
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Integer.parseInt(etNum.getText() + "");
                switch (temp) {
                    case '+':
                        Operationclass calculate = new Operationclass(number1, number2);
                        result=calculate.add();
                        etNum.setText(result+"");
                        break;

                    case '-':
                        Operationclass cal = new Operationclass(number1, number2);
                        result=cal.sub();
                        etNum.setText(result+"");
                        break;
                    case '*':
                        Operationclass c = new Operationclass(number1, number2);
                        result=c.mul();
                        etNum.setText(result+"");
                        break;
                    case '/':
                        Operationclass ca = new Operationclass(number1, number2);
                        result=ca.div();
                        etNum.setText(result+"");
                        break;

                }


            }


        });
    }

}
