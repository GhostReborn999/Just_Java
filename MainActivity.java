package com.ghostreborn.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
  
  public void submitOrder(View view){
    display(0);
  }
  
  public void display(int num){
    TextView textView = findViewById(R.id.user_quantity_textView);
    textView.setText( "" + num );
  }
  
}
