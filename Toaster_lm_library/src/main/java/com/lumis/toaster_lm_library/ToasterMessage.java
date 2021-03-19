package com.lumis.toaster_lm_library;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context mContext, String msg){
        Toast.makeText(mContext , msg, Toast.LENGTH_LONG).show();
    }
}
