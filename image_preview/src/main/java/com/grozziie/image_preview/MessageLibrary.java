package com.grozziie.image_preview;

import android.content.Context;
import android.widget.Toast;

public class MessageLibrary {
    public MessageLibrary() {
    }

    public static  void  mymessage(Context context, String message) {
        Toast.makeText(context, ""+message, Toast.LENGTH_SHORT).show();
    }
}
