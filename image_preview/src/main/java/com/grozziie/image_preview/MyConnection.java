package com.grozziie.image_preview;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

public class MyConnection {

    public  static  void ConnectionBluetooth(Context context, String deviceMacAdress, String uuid) {
        BluetoothAdapter bluetoothAdapter;
        String deviceuuid=uuid;
        String devicemacad=deviceMacAdress;

       try {
           bluetoothAdapter= BluetoothAdapter.getDefaultAdapter();


       }catch (Exception e) {
       }

    }
}
