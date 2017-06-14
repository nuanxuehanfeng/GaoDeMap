package com.bawei.wangxueshi.gaodemap.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.bawei.wangxueshi.gaodemap.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BufferKnifeActivity extends Activity {

    @BindView(R.id.bt1)
    Button bt1;
    @BindView(R.id.bt2)
    Button bt2;
    @BindView(R.id.bt3)
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffer_knife);
        ButterKnife.bind(this);
    }
}
