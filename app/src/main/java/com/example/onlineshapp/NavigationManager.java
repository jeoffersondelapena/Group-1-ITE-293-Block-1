package com.example.onlineshapp;

import android.content.Context;
import android.content.Intent;

public class NavigationManager {

    public static void goToActivity(Context context, Class _class, boolean isClearTask) {
        Intent intent = new Intent(context, _class);

        if (isClearTask) {
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        }

        context.startActivity(intent);
    }

//    public static void goToFragment(Context context, String fragmentStackName, Fragment fragment) {
//        ((FragmentActivity) context).getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fragmentContainer, fragment)
//                .hide(SuperGlobals.currentFragment)
//                .show(fragment)
//                .commit();
//
//        SuperGlobals.currentFragment = fragment;
//        SuperGlobals.currentFragmentStackName = fragmentStackName;
//
//        BottomNavigationViewFragmentStacksManager.createFragment(fragmentStackName, fragment);
//    }

}
