package com.innovativeincarnates.yash.loginsignup;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.TextView;


/**
 * Created by sakshi on 3/21/2017.
 */

public class Grocery_Inventory extends Activity{

    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    CheckBox ch4;
    CheckBox ch5;
    CheckBox ch6;
    CheckBox ch7;
    CheckBox ch8;
    CheckBox ch9;
    CheckBox ch10;
    OnClickListener checkBoxListener;                               
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grocery_inventory);
        ch1=(CheckBox)findViewById(R.id.grocery1);
        ch2=(CheckBox)findViewById(R.id.grocery2);
        ch3=(CheckBox)findViewById(R.id.grocery3);
        ch4=(CheckBox)findViewById(R.id.grocery4);
        ch5=(CheckBox)findViewById(R.id.grocery5);
        ch6=(CheckBox)findViewById(R.id.grocery6);
        ch7=(CheckBox)findViewById(R.id.grocery7);
        ch8=(CheckBox)findViewById(R.id.grocery8);
        ch9=(CheckBox)findViewById(R.id.grocery9);
        ch10=(CheckBox)findViewById(R.id.grocery10);


        checkBoxListener =new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ch1.isChecked()) {
                    t1.setText(ch1.getText().toString());
                }
                else{
                    t1.setText("");
                }

                if(ch2.isChecked()) {
                    t2.setText(ch2.getText().toString());
                }
                else{
                    t2.setText("");
                }
                if(ch3.isChecked()) {
                    t3.setText(ch3.getText().toString());
                }
                else{
                    t3.setText("");
                }

                if(ch4.isChecked()) {
                    t4.setText(ch4.getText().toString());
                }
                else{
                    t4.setText("");
                }
                if(ch5.isChecked()) {
                    t5.setText(ch5.getText().toString());
                }
                else{
                    t5.setText("");
                }

                if(ch6.isChecked()) {
                    t6.setText(ch6.getText().toString());
                }
                else{
                    t6.setText("");
                }
                if(ch7.isChecked()) {
                    t7.setText(ch7.getText().toString());
                }
                else{
                    t7.setText("");
                }

                if(ch8.isChecked()) {
                    t8.setText(ch8.getText().toString());
                }
                else{
                    t8.setText("");
                }
                if(ch9.isChecked()) {
                    t9.setText(ch9.getText().toString());
                }
                else{
                    t9.setText("");
                }

                if(ch10.isChecked()) {
                    t10.setText(ch10.getText().toString());
                }
                else{
                    t1.setText("");
                }


            }
        };

        ch1.setOnClickListener(checkBoxListener);
        ch2.setOnClickListener(checkBoxListener);
        ch3.setOnClickListener(checkBoxListener);
        ch4.setOnClickListener(checkBoxListener);
        ch5.setOnClickListener(checkBoxListener);
        ch6.setOnClickListener(checkBoxListener);
        ch7.setOnClickListener(checkBoxListener);
        ch8.setOnClickListener(checkBoxListener);
        ch9.setOnClickListener(checkBoxListener);
        ch10.setOnClickListener(checkBoxListener);
    }

}
