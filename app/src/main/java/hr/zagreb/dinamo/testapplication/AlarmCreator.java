package hr.zagreb.dinamo.testapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

/**
 * Created by marko on 3/25/16.
 */
public class AlarmCreator {

    public static final String ACTION_ALARM = "ion.licat.app.BROADCAST";
    public static final String TIME_IN_MILLIS = "getTimeInMillis";

    public static void initAlarms(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Calendar cal = Calendar.getInstance();

        long timeMillisNow = cal.getTimeInMillis();
        long timeBefore = timeMillisNow - 5000;
        long timeAfter = timeMillisNow + 5000;

        Intent intent = new Intent(ACTION_ALARM);

        int id = 0;
        for (int i = 0; i < 5; i++) {
            intent.putExtra(TIME_IN_MILLIS, timeBefore);
            id = 13000 + i;
            PendingIntent pendingIntent = PendingIntent.getBroadcast(context, id, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, timeBefore, pendingIntent);
        }

        for (int i = 0; i < 5; i++) {
            intent.putExtra(TIME_IN_MILLIS, timeAfter);
            id = 14000 + i;
            PendingIntent pendingIntent = PendingIntent.getBroadcast(context, id, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, timeAfter, pendingIntent);
        }
    }

    public static void setAlarm(Context context, int id) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(ACTION_ALARM);
        long time = Calendar.getInstance().getTimeInMillis() + 2;
        intent.putExtra(TIME_IN_MILLIS, time);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, id, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.set(AlarmManager.RTC_WAKEUP, time, pendingIntent);
    }
}
