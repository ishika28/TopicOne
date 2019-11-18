package com.example.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton rdoa1, rdoa2, rdoa3;
    ImageView imgVlook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        rdoa1= findViewById(R.id.rdoa1);
        rdoa2=findViewById(R.id.rdoa2);
        rdoa3=findViewById(R.id.rdoa3);

        imgVlook=findViewById(R.id.imgVlook);

        rdoa1.setOnClickListener(this);
        rdoa2.setOnClickListener(this);
        rdoa3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rdoa1:
                imgVlook.setImageResource(R.drawable.a1);
                break;

            case R.id.rdoa2:
                imgVlook.setImageResource(R.drawable.a2);
                break;

            case R.id.rdoa3:
                imgVlook.setImageResource(R.drawable.a3);
                break;
        }
    }
}
