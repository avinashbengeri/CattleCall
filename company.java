package com.example.android.cattlecall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class company extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company);
        
        Button b1=(Button)findViewById(R.id.c1);
       
b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent1=new Intent();
				myintent1.setClass(getApplicationContext(),tcs.class);
				startActivity(myintent1);
			}
       
});


Button b2=(Button)findViewById(R.id.c2);

b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent2=new Intent();
				myintent2.setClass(getApplicationContext(),infosys.class);
				startActivity(myintent2);
			}
       
});
Button b3=(Button)findViewById(R.id.c3);

b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent3=new Intent();
				myintent3.setClass(getApplicationContext(),mindtree.class);
				startActivity(myintent3);
			}
       
});
Button b4=(Button)findViewById(R.id.c4);

b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent4=new Intent();
				myintent4.setClass(getApplicationContext(),pathpartner.class);
				startActivity(myintent4);
			}
       
});
Button b5=(Button)findViewById(R.id.c5);

b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent5=new Intent();
				myintent5.setClass(getApplicationContext(),wifro.class);
				startActivity(myintent5);
			}
       
});
Button b6=(Button)findViewById(R.id.c6);

b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent6=new Intent();
				myintent6.setClass(getApplicationContext(),accenture.class);
				startActivity(myintent6);
			}
       
});
Button b7=(Button)findViewById(R.id.c7);

b7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent7=new Intent();
				myintent7.setClass(getApplicationContext(),ibm.class);
				startActivity(myintent7);
			}
       
});

Button exitc=(Button)findViewById(R.id.exitc);

exitc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent myintent8=new Intent();
				myintent8.setClass(getApplicationContext(),cattle1.class);
				startActivity(myintent8);
			}
       
});
}}