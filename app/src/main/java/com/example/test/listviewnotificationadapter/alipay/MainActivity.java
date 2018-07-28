package com.example.test.listviewnotificationadapter.alipay;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.test.listviewnotificationadapter.R;

/**
 * Created by Administrator on 2018/7/27.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = (Button) findViewById(R.id.btn);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                startActivity(new Intent(this,DialogActivity.class));
                break;
            default:
                break;
        }
    }
}
