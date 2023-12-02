package com.onesignal;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

/**
 * This abstract base class is required to generate binding library in Xamarin (dotnet)
 * and have the remoteNotificationReceived work on that platform
 *
 *  You do not require to use this class if you are using the native Android sdk
 *  directly in Java or kotlin.
 */
public abstract class NotificationExtenderBase implements NotificationCompat.Extender {
    @NonNull
    @Override
    public abstract NotificationCompat.Builder extend(@NonNull NotificationCompat.Builder builder);
}
