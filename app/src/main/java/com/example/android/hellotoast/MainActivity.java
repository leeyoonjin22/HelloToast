package com.example.android.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hellotoast.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = TextView.findViewById(R.id.show_count);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
           // mShowCount.setText(Integer.toString(mCount));

            changeText();
    }
    private void changeText(){
        changeText2();
    }
    private void changeText2(){
        mShowCount.setText(Integer.toString(mCount));
    }
}