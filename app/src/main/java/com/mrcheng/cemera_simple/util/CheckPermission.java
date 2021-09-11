package com.mrcheng.cemera_simple.util;

import android.Manifest;
import android.content.Context;

import androidx.core.content.ContextCompat;


public class CheckPermission {
    private void getPermissionManager(Context context){
        int i = ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA);

    }
}
