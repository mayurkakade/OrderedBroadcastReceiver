package com.example.orderedbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class OrderedReceiverTwo extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int resultCode = getResultCode();
        String resultData = getResultData();
        Bundle extras = getResultExtras(true);
        String stringExtra = extras.getString("stringExtra");
        resultCode++;
        stringExtra += "->OR2";
        String toastText = "StringExtra : " + stringExtra + "\n resultCode : " + resultCode;
        Toast.makeText(context, "Receiver : " + toastText, Toast.LENGTH_SHORT).show();

        resultData = "OR2";
        extras.putString("stringExtra",stringExtra);
        setResult(resultCode,resultData,extras);
    }
}
