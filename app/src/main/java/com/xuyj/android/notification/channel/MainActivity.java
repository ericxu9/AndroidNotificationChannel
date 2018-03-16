package com.xuyj.android.notification.channel;

import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    private NotificationHelper mNotificationHelper;

    private static final String TITLE      = "我是标题";
    private static final String CONTENT    = "我是内容";
    private static final int    DEFAULT_ID = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNotificationHelper = new NotificationHelper(this);
    }

    public void showNotification(View view)
    {
        NotificationCompat.Builder builder = mNotificationHelper.getNotification(TITLE, CONTENT);
        mNotificationHelper.notify(DEFAULT_ID, builder);
    }

    /**
     * 打开Chanel设置界面，提供Channel ID
     *
     * @param view
     */
    public void openChannelSetting(View view)
    {
        mNotificationHelper.openChannelSetting(NotificationHelper.CHANNEL_ID);
    }

    public void openNotificationSetting(View view)
    {
        mNotificationHelper.openNotificationSetting();
    }
}
