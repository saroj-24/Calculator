package com.example.my_first_application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;
import java.math.*;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private Button buttom1,buttom2,buttom3,buttom4,buttom5,buttom6,buttom7,buttom8,buttom9,buttom0,buttompoint,buttomequal,buttomclear,buttombackspace,buttomdivide,buttomadd,buttommultiy,buttomSubtract;
    private TextView textview1,textview2;
    private Button buttomleftbracket,buttomrightbracket,buttompower,buttomlog,buttomsin,buttomcos,buttomtan,buttomx,buttomroot,buttompie;
    private double first;
    private double second;
    private  double result;
    private String operation;
    private  String answer;
    String pie= "3.14159";
    boolean Addition, Subtract, Multiplication, Division, Reminder, NoPower,
            istpower, Sin, Arithmetic, Cos, Tan,root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();
        textview1 = findViewById(R.id.textview1);
        textview2 = findViewById(R.id.textview2);
        buttom0 = findViewById(R.id.buttom0);
        buttom1 = findViewById(R.id.buttom1);
        buttom2 = findViewById(R.id.buttom2);
        buttom3 = findViewById(R.id.buttom3);
        buttom4 = findViewById(R.id.buttom4);
        buttom5= findViewById(R.id.buttom5);
        buttom6 = findViewById(R.id.buttom6);
        buttom7 = findViewById(R.id.buttom7);
        buttom8 = findViewById(R.id.buttom8);
        buttom9 = findViewById(R.id.buttom9);
        buttomadd = findViewById(R.id.buttomadd);
        buttomleftbracket = findViewById(R.id.buttomleftbracket);
        buttomrightbracket = findViewById(R.id.buttomrightbracket);
        buttompower=findViewById(R.id.buttompower);
        buttomlog = findViewById(R.id.buttomlog);
        buttomsin = findViewById(R.id.buttomsin);
        buttomcos = findViewById(R.id.buttomcos);
        buttomtan = findViewById(R.id.buttomtan);
        buttomx = findViewById(R.id.buttomx);
        buttomroot = findViewById(R.id.buttomroot);
        buttompie = findViewById(R.id.buttompie);
        buttombackspace = findViewById(R.id.buttombackspace);
        buttomclear = findViewById(R.id.buttomclear);
        buttomdivide = findViewById(R.id.buttomdivide);
        buttommultiy = findViewById(R.id.buttommultiy);
        buttomequal = findViewById(R.id.buttomequal);
        buttompoint = findViewById(R.id.buttompoint);
        buttomSubtract = findViewById(R.id.buttomSubtract);

        ///code for button
        buttomclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try{
                   textview1.setText(null);
                   textview2.setText(null);
               }catch(Exception e)
               {
                   Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                   t.setGravity(Gravity.CENTER, 0, 0);
                   t.show();
               }
            }
        });
        buttom0.setOnClickListener(new View.OnClickListener() {
            //function of etOnClicklistener -helps us to link a listener with certain attributes
            //setOnClickListener is a method in Android basically used with buttons, image buttons etc.
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom0.getText().toString();
                textview2.setText(text);
            }
        });
        buttomleftbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttomleftbracket.getText().toString();
                textview2.setText(text);
            }
        });
        buttomrightbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttomrightbracket.getText().toString();
                textview2.setText(text);
            }
        });
        buttompower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttompower.getText().toString();
                textview2.setText(text);
            }
        });
        buttomlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttomlog.getText().toString();
                textview2.setText(text);
            }
        });
        buttomsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString() + buttomsin.getText().toString();
                textview2.setText(text);
            }
        });
        buttomcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttomcos.getText().toString();
                textview2.setText(text);
            }
        });
        buttomtan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                    double text;
                     text = Double.parseDouble(String.valueOf(textview2.getText()));
                    text = Math.tan(text);
                    textview2.setText(String.valueOf(text));
            }
        });
        buttomx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int value = Integer.parseInt(textview2.getText().toString());
                    double fact = factorialUsingForLoop(value);
                    textview2.setText(String.valueOf(fact));
                    textview1.setText(value + "!");
                }catch(Exception e)
                {
                    Toast t = Toast.makeText(MainActivity.this,"Syntax error",Toast.LENGTH_LONG);
                    t.setGravity(Gravity.TOP,0,0);
                    t.show();
                }
            }
        });
        buttomroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /*String  val = textview2.getText().toString();
               double r = Math.sqrt(Double.parseDouble(val));
               textview2.setText(String.valueOf(r));*/
              try {
                  //double value;
                ///  value = Double.parseDouble(textview2.getText()+" ");
                  String  val = textview2.getText().toString();
                  double r = Math.sqrt(Double.parseDouble(val));
                  textview2.setText(String.valueOf(r));
                   root = true;
                  // textview2.setText(null);
              }catch(Exception e)
              {
                  Toast t = Toast.makeText(MainActivity.this, "SYNTAX ERROR", Toast.LENGTH_LONG);
                  t.setGravity(Gravity.TOP, 0, 0);
                  t.show();
              }
            }
        });
        buttompie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               textview1.setText(buttompie.getText());
               textview2.setText(textview2.getText()+pie);
            }
        });
        buttom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom1.getText().toString();
                textview2.setText(text);
            }
        });
        buttom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom2.getText().toString();
                textview2.setText(text);
            }
        });
        buttom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom3.getText().toString();
                textview2.setText(text);
            }
        });
        buttom4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom4.getText().toString();
                textview2.setText(text);
            }
        });
        buttom5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom5.getText().toString();
                textview2.setText(text);
            }
        });
        buttom6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom6.getText().toString();
                textview2.setText(text);
            }
        });
        buttom7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom7.getText().toString();
                textview2.setText(text);
            }
        });
        buttom8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom8.getText().toString();
                textview2.setText(text);
            }
        });
        buttom9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+buttom9.getText().toString();
                textview2.setText(text);
            }
        });
        buttompoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview2.setText(textview2.getText() + ".");
            }
        });

        buttombackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String backspace = null;
                if(textview2.getText().length()>0)
                {
                    StringBuilder stringbuilder = new StringBuilder(textview2.getText());
                    stringbuilder.deleteCharAt(textview2.getText().length()-1);
                    backspace = stringbuilder.toString();
                    textview2.setText(backspace);


                }
            }
        });

        // code for operation

        buttomSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(" ");
                operation = "-";*/
                textview2.setText(textview2.getText() + "-");

            }
        });

        buttomadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /* String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                 textview1.setText(primary);
                textview2.setText(" ");
              operation = "+";*/
                textview2.setText(textview2.getText() + "+");

            }
        });

        buttomdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(" ");
                operation = "/";*/
                textview2.setText(textview2.getText() + "/");

            }
        });
        buttommultiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(" ");
                operation = "*";*/
                textview2.setText(textview2.getText() + "*");

            }
        });
        buttompower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(textview2.getText().toString());
                double square = d*d;
                textview2.setText(String.valueOf(square));
                textview1.setText(d+" ^2");

            }
        });
        //equal button function
        buttomequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String val= textview2.getText().toString();
                if(val.isEmpty())
                {
                    Toast t = Toast.makeText(MainActivity.this, "INVALID ENTER", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.TOP, 0, 0);
                    t.show();
                }
                else{
                    String replacedstr = val.replace('÷','/').replace('×','*');
                    double result = answer(replacedstr);
                    textview2.setText(String.valueOf(result));
                    textview1.setText(val);
                }
               // String val= textview2.getText().toString();



            }
        });
    }

    double  factorialUsingForLoop(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //key--function
    public  static double answer(final String str)
    {
           return  new Object()
           {
                   int pos = -1;
                   int ch=0;
                   void nextChar()
                   {
                       ch = (++pos<str.length())?str.charAt(pos):-1;
                   }
                   boolean eat(int charToEat)
                   {
                       while(ch==' ')nextChar();
                       if(ch==charToEat)
                       {
                           nextChar();
                           return true;
                       }
                       return false;
                   }
                   double parse()
                   {
                       nextChar();
                       double x = parseExpression();
                       if(pos<str.length())throw new RuntimeException("unexpection :"+(char)ch);
                       return x;
                   }
                   double parseExpression()
                   {
                       double x = parseTerm();
                       for(;;)
                       {
                           if(eat('+'))x+=parseTerm();
                           else if(eat('-'))x-=parseTerm();
                           else
                               return x;
                       }
                   }
                   double parseTerm()
                   {
                       double x = parseFactor();
                       for(;;)
                       {
                           if(eat('*'))x*=parseTerm();
                           else if(eat('/'))x/=parseTerm();
                           else
                               return x;
                       }
                   }
                   double parseFactor()
                   {
                       if(eat('+')) return parseFactor();
                       if(eat('-'))return parseFactor();

                       double x;
                       int startPos = this.pos;
                       if(eat('(')) //parantheses
                       {
                           x=parseExpression();
                           eat(')');
                       }
                       else if((ch >= '0' && ch<= '9')|| ch=='.')
                       {
                           while((ch >= '0' && ch<= '9')|| ch=='.')
                               nextChar();
                           x = Double.parseDouble(str.substring(startPos,this.pos));
                       }
                       else  if(ch >= 'a' && ch<= 'z')
                       {
                           while(ch >= 'a' && ch<= 'z')
                               nextChar();
                           String func = str.substring(startPos,this.pos);
                           x = parseFactor();
                           if(func.equals("sqrt")) x = Math.sqrt(x);
                          else if(func.equals("sin")) x = Math.sin(Math.toRadians(x));
                          else if(func.equals("cos")) x = Math.sin(Math.toRadians(x));
                          else if(func.equals("tan")) x = Math.sin(Math.toRadians(x));
                          else  if(func.equals("log")) x = Math.log10(x);
                          else throw  new RuntimeException("Unknown Function "+func);

                       }else
                       {
                           throw new RuntimeException("Unexpected :"+(char)ch);
                       }
                       if(eat('^'))x =Math.pow(x,parseFactor());
                       return x;
                   }
           }.parse();
    }
}
