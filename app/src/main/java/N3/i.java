package N3;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f5138c;

    public i(int i7, Notification notification, int i8) {
        this.f5136a = i7;
        this.f5138c = notification;
        this.f5137b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f5136a == iVar.f5136a && this.f5137b == iVar.f5137b) {
            return this.f5138c.equals(iVar.f5138c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5138c.hashCode() + (((this.f5136a * 31) + this.f5137b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f5136a + ", mForegroundServiceType=" + this.f5137b + ", mNotification=" + this.f5138c + '}';
    }
}
