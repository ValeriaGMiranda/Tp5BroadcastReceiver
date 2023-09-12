package com.valesoft.tp5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
public class CambioWIFI extends BroadcastReceiver {

    private Context context;

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getBooleanExtra("connected", false)){

            Intent intLlamar = new Intent(Intent.ACTION_CALL);
            intLlamar.setData(Uri.parse("tel:" + "2664553747"));
            intLlamar.addFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
            context.startActivity(intLlamar);
            Toast.makeText(context,"Llamando", Toast.LENGTH_LONG).show();
        }

    }


}
