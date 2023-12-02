package com.onesignal;

import android.content.Context;


/**
 * This abstract base class is required to generate binding library in Xamarin (dotnet)
 * and have the remoteNotificationReceived work on that platform.
 *
 * You do not require to use this class if you are using the native Android sdk
 * directly in Java or kotlin.
 */
public abstract class OSRemoteNotificationReceivedBase implements OneSignal.OSRemoteNotificationReceivedHandler {

    @Override
    public abstract void remoteNotificationReceived(Context context, OSNotificationReceivedEvent notificationReceivedEvent) ;
}


