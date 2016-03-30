package hr.zagreb.dinamo.testapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

import java.util.Calendar;

/**
 * Created by marko on 3/25/16.
 */
public class AlarmsBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = AlarmsBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), AlarmCreator.ACTION_ALARM)) {
            Log.i(TAG, "onReceive: intent received");

            Calendar intentCal = Calendar.getInstance();
            intentCal.setTimeInMillis(intent.getLongExtra(AlarmCreator.TIME_IN_MILLIS, 0));
            long intentTime = intentCal.getTimeInMillis();
            Log.i(TAG, "onReceive: time intent " + intentCal.getTime().getSeconds());

            Calendar nowCal = Calendar.getInstance();
            long now = nowCal.getTimeInMillis();
            Log.i(TAG, "onReceive: time now " + nowCal.getTime().getSeconds());
            if (intentCal.after(now)) {
                Log.i(TAG, "onReceive: triggering alarm");

                int id = intent.getIntExtra("id", 0);
                AlarmCreator.setAlarm(context, id);
            }
        }
    }
}
