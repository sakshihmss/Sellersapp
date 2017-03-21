package com.innovativeincarnates.yash.loginsignup;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;



/**
 * Created by sakshi on 3/21/2017.
 */

public class Inventory extends Activity{

    Button btngrocery , btncosmetics , btnstationary ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory);

        btngrocery=(Button)findViewById(R.id.buttongrocery);
        btngrocery.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intent1=new Intent(getApplicationContext(),Grocery_Inventory.class);
                startActivity(intent1);
            }
        });

        btncosmetics=(Button)findViewById(R.id.buttoncosmetics);
        btncosmetics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intent2=new Intent(getApplicationContext(),Cosmetics_Inventory.class);
                startActivity(intent2);
            }
        });

        btnstationary=(Button)findViewById(R.id.buttonstationary);
        btnstationary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intent3=new Intent(getApplicationContext(),Stationary_Inventory.class);
                startActivity(intent3);
            }
        });

    }


}
