package com.example.android.cattlecall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rounds extends Activity {
    /** Called when the activity is first created. */
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round);
        Button r=(Button)findViewById(R.id.r7);

        r.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent myintent8=new Intent();
        				myintent8.setClass(getApplicationContext(),cattle1.class);
        				startActivity(myintent8);
        			}
               
        });
        
        Button r1=(Button)findViewById(R.id.r1);

        r1.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent myintent8=new Intent();
        				myintent8.setClass(getApplicationContext(),apti.class);
        				startActivity(myintent8);
        			}
               
        });
        
        Button r2=(Button)findViewById(R.id.r2);

        r2.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent myintent8=new Intent();
        				myintent8.setClass(getApplicationContext(),gd.class);
        				startActivity(myintent8);
        			}
               
        });
        
        Button r3=(Button)findViewById(R.id.r3);

        r3.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent myintent8=new Intent();
        				myintent8.setClass(getApplicationContext(),ti.class);
        				startActivity(myintent8);
        			}
               
        });
        
        Button r4=(Button)findViewById(R.id.r4);

        r4.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent myintent8=new Intent();
        				myintent8.setClass(getApplicationContext(),ti2.class);
        				startActivity(myintent8);
        			}
               
        });
        
        Button r5=(Button)findViewById(R.id.r5);

        r5.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent myintent8=new Intent();
        				myintent8.setClass(getApplicationContext(),mr.class);
        				startActivity(myintent8);
        			}
               
        });
        
        Button r6=(Button)findViewById(R.id.r6);

        r6.setOnClickListener(new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View v)
        			{
        				Intent myintent8=new Intent();
        				myintent8.setClass(getApplicationContext(),hr.class);
        				startActivity(myintent8);
        			}
               
        });
        
    }
}