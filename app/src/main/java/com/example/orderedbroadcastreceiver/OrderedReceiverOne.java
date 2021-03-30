package com.example.orderedbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class OrderedReceiverOne extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int resultCode = getResultCode();
        String resultData = getResultData();
        Bundle extras = getResultExtras(true);
        String stringExtra = extras.getString("stringExtra");
        resultCode++;
        stringExtra += "->OR1";
        String toastText = "StringExtra : " + stringExtra + "\n resultCode : " + resultCode;
        Toast.makeText(context, "Receiver : " + toastText, Toast.LENGTH_SHORT).show();

        resultData = "OR1";
        extras.putString("stringExtra",stringExtra);
        setResult(resultCode,resultData,extras);
    }
}
