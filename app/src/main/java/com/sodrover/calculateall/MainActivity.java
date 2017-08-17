package com.sodrover.calculateall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inputButton(View view){
        TextView textView = (TextView) findViewById(R.id.tv_screen_bottom);
        Button button = (Button) view;
        String input = button.getText().toString();
        textView.setText(textView.getText().toString() + input);
    }

    public void addition(View view){
        TextView scrn_top = (TextView) findViewById(R.id.tv_screen_top);
        TextView scrn_bot = (TextView) findViewById(R.id.tv_screen_bottom);
        scrn_top.setText(scrn_bot.getText().toString());
        scrn_bot.setText("");
        operator = "+";
    }

    public void getResult(View view){
        TextView scrn_top = (TextView) findViewById(R.id.tv_screen_top);
        TextView scrn_bot = (TextView) findViewById(R.id.tv_screen_bottom);
        Double result = 0.00;
        result = Double.parseDouble(scrn_top.getText().toString()) + Double.parseDouble(scrn_bot.getText().toString());
        scrn_bot.setText("");
        scrn_bot.setText(result.toString());
}
}
