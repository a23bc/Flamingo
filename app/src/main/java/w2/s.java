package w2;

import android.app.Notification;
import android.app.Service;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static void a(Service service, int i7, Notification notification, int i8, String str) {
        try {
            service.startForeground(i7, notification, i8);
        } catch (RuntimeException e7) {
            AbstractC1697a.m("The service must be declared with a foregroundServiceType that includes " + str);
            throw e7;
        }
    }
}
