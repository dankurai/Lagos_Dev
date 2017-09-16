package com.hubuktechnology.mylagosdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by hubuk on 14/09/2017 AD.
 */

public class DeveloperDetail extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.develper_detail_activity);
        Intent intent = getIntent();
        String devName = intent.getStringExtra("dev");
        TextView texttView = (TextView)findViewById(R.id.devName);
        texttView.setText(devName);
    }

}
