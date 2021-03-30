package com.example.orderedbroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    OrderedReceiverOne orderedReceiverOne = new OrderedReceiverOne();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("com.example.orderedbroadcastreceiver.EXAMPLE_ACTION");
        filter.setPriority(1);
        registerReceiver(orderedReceiverOne,filter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(orderedReceiverOne);
    }
}