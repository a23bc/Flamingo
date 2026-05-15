package x3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: x3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1939x implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k.I f20118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f20119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f20120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k.I f20122s;

    public RunnableC1939x(int i7, int i8, Bundle bundle, String str, k.I i9, k.I i10) {
        this.f20122s = i9;
        this.f20118o = i10;
        this.f20119p = i7;
        this.f20120q = str;
        this.f20121r = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1931p c1931p;
        k.I i7 = this.f20118o;
        IBinder binder = ((Messenger) i7.f13847p).getBinder();
        k.I i8 = this.f20122s;
        ((AbstractServiceC1940y) i8.f13847p).f20128s.remove(binder);
        AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) i8.f13847p;
        Iterator it = abstractServiceC1940y.f20127r.iterator();
        while (true) {
            c1931p = null;
            if (!it.hasNext()) {
                break;
            }
            C1931p c1931p2 = (C1931p) it.next();
            if (c1931p2.f20094c == this.f20119p) {
                if (TextUtils.isEmpty(this.f20120q) || this.f20121r <= 0) {
                    c1931p = new C1931p((AbstractServiceC1940y) i8.f13847p, c1931p2.f20092a, c1931p2.f20093b, c1931p2.f20094c, i7);
                }
                it.remove();
            }
        }
        if (c1931p == null) {
            c1931p = new C1931p((AbstractServiceC1940y) i8.f13847p, this.f20120q, this.f20121r, this.f20119p, i7);
        }
        abstractServiceC1940y.f20128s.put(binder, c1931p);
        try {
            binder.linkToDeath(c1931p, 0);
        } catch (RemoteException unused) {
        }
    }
}
