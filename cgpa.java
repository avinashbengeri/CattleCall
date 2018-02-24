package com.example.android.cattlecall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cgpa extends Activity {
    /** Called when the activity is first created. */
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa);
        
        Button cb2=(Button)findViewById(R.id.cb2);
        cb2.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent m1=new Intent();
        				m1.setClass(getApplicationContext(),CattleCall.class);
        				startActivity(m1);
        			}
               
        }); 
        
        
        
        
        Button cb1=(Button)findViewById(R.id.cb1);
        cb1.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent m8=new Intent();
        				m8.setClass(getApplicationContext(),CattleCall.class);
        				startActivity(m8);
        			}
               
        });
    }
}