package com.muneiah.example.workmanagerwithnotification;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager nm;
    NotificationCompat.Builder nc;
    public static final int NOTIFICATION_ID=3323;
    public static final String CHANNEL_ID="welcome";
    PendingIntent pi;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=new Intent(this,MainActivity.class);
        pi=PendingIntent.getActivity(this,NOTIFICATION_ID,i,PendingIntent.FLAG_UPDATE_CURRENT);
        nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        createChannel();
    }

    private void createChannel() {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel= new NotificationChannel(CHANNEL_ID,"anusha",NotificationManager.IMPORTANCE_HIGH);
            channel.setLightColor(Color.BLUE);
            channel.enableVibration(true);
            nm.createNotificationChannel(channel);
        }
    }

    public void show_notification(View view) {
        nc=new NotificationCompat.Builder(this,CHANNEL_ID);
        nc.setContentTitle("welcome to all");
        nc.setContentText("Notification");
        nc.addAction(R.drawable.ic_launcher_background,"reply",pi);
        nc.setSmallIcon(R.drawable.ic_launcher_background);
        nc.setDefaults(Notification.DEFAULT_ALL);
        nc.setContentIntent(pi);
        nc.setPriority(Notification.PRIORITY_HIGH);
        //nc.setSound(R.raw.one);
        nm.notify(NOTIFICATION_ID,nc.build());
    }

}