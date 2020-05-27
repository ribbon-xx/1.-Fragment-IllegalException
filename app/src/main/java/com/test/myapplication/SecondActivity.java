package com.test.myapplication;

import android.os.Bundle;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        NavigationController.getInstance(this).replaceFragment();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
