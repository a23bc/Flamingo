package u1;

import android.app.Notification;
import android.os.Parcel;
import b.C0602a;
import b.InterfaceC0604c;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f17178c;

    public n(String str, int i7, Notification notification) {
        this.f17176a = str;
        this.f17177b = i7;
        this.f17178c = notification;
    }

    public final void a(InterfaceC0604c interfaceC0604c) {
        String str = this.f17176a;
        int i7 = this.f17177b;
        C0602a c0602a = (C0602a) interfaceC0604c;
        c0602a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0604c.f9875a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i7);
            parcelObtain.writeString(null);
            Notification notification = this.f17178c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            c0602a.f9873c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f17176a + ", id:" + this.f17177b + ", tag:null]";
    }
}
