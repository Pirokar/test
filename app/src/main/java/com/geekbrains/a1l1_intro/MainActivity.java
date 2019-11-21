package com.geekbrains.a1l1_intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button changeTextBtn, changePictureBtn;
    private TextView textView;
    private EditText editText;
    private RadioGroup radioGroup;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setOnChangeTextBtnClick();
        setOnRadioButtonsClick();
    }

    private void initViews() {
        changeTextBtn = findViewById(R.id.changeTextBtn);
        changePictureBtn = findViewById(R.id.changePictureBtn);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        radioGroup = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView);
    }

    private void setOnChangeTextBtnClick() {
        changeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextStr = editText.getText().toString();
                textView.setText(editTextStr);
            }
        });
        changePictureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String text = getString(R.string.hello_world);
                /*Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.nature);
                imageView.setImageDrawable(drawable);*/
                imageView.setImageResource(R.drawable.nature);
            }
        });
    }

    private void setOnRadioButtonsClick() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioBtnOption1) {
                    Toast.makeText(getApplicationContext(), "First option checked", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Toast.makeText(getApplicationContext(), "Second option checked", Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
    }
}
