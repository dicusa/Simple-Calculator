package com.example.assignment_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv0,tvDEL,tvADD,tvSUB,tvEQU,tvDIV,tvCAL,tvMUL,tvDOT;
int len1;
double n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewById();
        onClickListners();

    }

    private void onClickListners() {
        tv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"0"+"");
            }
        });
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"1"+"");
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"2"+"");
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"3"+"");
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"4"+"");
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"5"+"");
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"6"+"");
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"7"+"");
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"8"+"");
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCAL.setText((tvCAL.getText().toString())+"9"+"");
            }
        });
        tvDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= tvCAL.getText().toString().length();

                if (a!=0)
                    tvCAL.setText((tvCAL.getText().toString().substring(0,a-1))+"");

                else
                    tvCAL.setText("");

            }
        });

        tvDEL.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tvCAL.setText("");
                return false;
            }
        });

        tvDOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= tvCAL.getText().toString().length();
                if(a!=0)
                    tvCAL.setText((tvCAL.getText().toString())+"."+"");
                else
                    tvCAL.setText(0+"."+"");
            }
        });

        tvADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCAL.getText().toString().isEmpty()) return;
                len1=tvCAL.getText().toString().length();
                n1=Double.parseDouble(tvCAL.getText().toString());
                tvCAL.setText((tvCAL.getText())+"+"+"");
            }
        });

        tvSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCAL.getText().toString().isEmpty()) return;
                len1=tvCAL.getText().toString().length();
                n1=Double.parseDouble(tvCAL.getText().toString());
                tvCAL.setText((tvCAL.getText())+"-"+"");
            }
        });

        tvMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCAL.getText().toString().isEmpty()) return;
                len1=tvCAL.getText().toString().length();
                n1=Double.parseDouble(tvCAL.getText().toString());
                tvCAL.setText((tvCAL.getText())+"*"+"");
            }
        });



        tvDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCAL.getText().toString().isEmpty()) return;
                len1=tvCAL.getText().toString().length();
                n1=Double.parseDouble(tvCAL.getText().toString());
                tvCAL.setText((tvCAL.getText())+"/"+"");
            }
        });
        tvEQU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tvCAL.getText().toString().equals(""))
                {}
                else {
                    double b = 0;
                    n2 = Double.parseDouble(tvCAL.getText().toString().substring(len1 + 1));

                    String op = (tvCAL.getText().toString().substring(len1, len1 + 1));
                    if (op.equals("+")) {
                        if(!tvCAL.getText().toString().isEmpty())
                        b = n1 + n2;
                    }

                    if (op.equals("-")) {
                        b = n1 - n2;
                    }

                    if (op.equals("*")) {
                        b = n1 * n2;
                    }

                    if (op.equals("/")) {
                        b = n1 / n2;
                    }
                    tvCAL.setText(b + "");
                }

            }
        });

    }

    private void ViewById() {
        tv0 = findViewById(R.id.tv_0);
        tv1 = findViewById(R.id.tv_1);
        tv2 = findViewById(R.id.tv_2);
        tv3 = findViewById(R.id.tv_3);
        tv4 = findViewById(R.id.tv_4);
        tv5 = findViewById(R.id.tv_5);
        tv6 = findViewById(R.id.tv_6);
        tv7 = findViewById(R.id.tv_7);
        tv8 = findViewById(R.id.tv_8);
        tv9 = findViewById(R.id.tv_9);
        tvDEL = findViewById(R.id.tv_DEL);
        tvADD = findViewById(R.id.tv_ADD);
        tvSUB = findViewById(R.id.tv_SUB);
        tvEQU = findViewById(R.id.tv_EQU);
        tvDIV = findViewById(R.id.tv_DIV);
        tvCAL = findViewById(R.id.tv_CAL);
        tvMUL = findViewById(R.id.tv_MUL);
        tvDOT = findViewById(R.id.tv_DOT);


    }
}
