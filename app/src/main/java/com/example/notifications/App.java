package com.example.notifications;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        String notificationId = getString(R.string.NOTIFICATION_CHANNEL_ID);
        String notificationName = getString(R.string.NOTIFICATION_CHANNEL_NAME);
        String notificationDescription = getString(R.string.NOTIFICATION_CHANNEL_DESCRIPTION);

        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        NotificationChannel channel = new NotificationChannel(notificationId, notificationName, importance);
        channel.setDescription(notificationDescription);
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        notificationManager.createNotificationChannel(channel);
    }
}
