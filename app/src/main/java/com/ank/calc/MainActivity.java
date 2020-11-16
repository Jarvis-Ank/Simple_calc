package com.ank.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero,one,two,three,four,five,six,seven,eight,nine,dubzero,add,sub,div,dot,per,mul,clear,equals;
    ImageButton back;
    double v1=0;
    double v2=0;
    TextView inf,res;
    boolean a,m,d,su;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero= findViewById(R.id.btn_zero);
        one= findViewById(R.id.btn_one);
        two= findViewById(R.id.btn_two);
        three= findViewById(R.id.btn_three);
        four= findViewById(R.id.btn_four);
        five= findViewById(R.id.btn_five);
        six= findViewById(R.id.btn_six);
        seven= findViewById(R.id.btn_seven);
        eight= findViewById(R.id.btn_egt);
        nine= findViewById(R.id.btn_nine);
        dubzero= findViewById(R.id.btn_dub_zero);
        dot= findViewById(R.id.btn_point);
        mul= findViewById(R.id.btn_mul);
        sub= findViewById(R.id.btn_minus);
        add= findViewById(R.id.btn_add);
        div= findViewById(R.id.btn_div);
        clear= findViewById(R.id.btn_clear);
        per= findViewById(R.id.btn_perc);
        equals= findViewById(R.id.btn_equals);
        inf=findViewById(R.id.info);
        res=findViewById(R.id.txt_result);
        back=findViewById(R.id.btn_back);


      zero.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              inf.setText(inf.getText().toString()+"0");
          }
      });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"9");
            }
        });

        dubzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText().toString()+"00");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(inf.getText()+".");
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inf.getText().length()!=0)
                {
                    v1=Double.parseDouble(inf.getText().toString());
                    res.setText(v1/100+"");
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = inf.getText().toString();
                if(!"".equals(str)){
                    str=str.substring(0,str.length()-1);
                    inf.setText(str);

                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText(null);
                res.setText(null);
            }
        });

      add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inf.getText().length()!=0)
                {  if(res.getText().length()==0){
                    v1=Double.parseDouble(inf.getText().toString());
                    a=true;
                    inf.setText(null);}
                else {
                    v1=Double.parseDouble(res.getText().toString());
                    a=true;
                    inf.setText(null);
                }
                }
                else {
                    inf.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inf.getText().length()!=0)
                {  if(res.getText().length()==0){
                    v1=Double.parseDouble(inf.getText().toString());
                    su=true;
                    inf.setText(null);}
                else {
                    v1=Double.parseDouble(res.getText().toString());
                    su=true;
                    inf.setText(null);
                }
                }
                else {
                    inf.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inf.getText().length()!=0)
                {  if(res.getText().length()==0){
                    v1=Double.parseDouble(inf.getText().toString());
                    m=true;
                    inf.setText(null);}
                else {
                    v1=Double.parseDouble(res.getText().toString());
                    m=true;
                    inf.setText(null);
                }
                }
                else {
                    inf.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inf.getText().length()!=0)
                {  if(res.getText().length()==0){
                    v1=Double.parseDouble(inf.getText().toString());
                    d=true;
                    inf.setText(null);}
                else {
                    v1=Double.parseDouble(res.getText().toString());
                    d=true;
                    inf.setText(null);
                }
                }
                else {
                    inf.setText(null);
                }
            }
        });



        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2=Double.parseDouble(inf.getText().toString());
                if(a==true)
                {

                    res.setText(v1+v2+"");
                    a=false;
                }


                 if(m==true)
                {
                    res.setText(v1*v2+"");
                    m=false;
                }

                 if(su==true)
                {
                    v2=Double.parseDouble(inf.getText().toString());
                    su=false;
                    res.setText(v1-v2+"");
                }

                 if(d==true)
                {
                    v2=Double.parseDouble(inf.getText().toString());
                    d=false;
                    res.setText(v1/v2+"");
                }

            }
        });
    }


    }

