package com.test.myapplication;

import androidx.fragment.app.FragmentManager;

class NavigationController {

    private volatile static NavigationController controller;

    static NavigationController getInstance(BaseActivity baseActivity) {
        if (null == controller) {
            controller = new NavigationController(baseActivity);
        }
        return controller;
    }

    private BaseActivity baseActivity;

    private NavigationController(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;
    }

    void replaceFragment() {
        FragmentManager fragmentManager = baseActivity.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.holder, new SecondFragment()).commit();
    }
}
