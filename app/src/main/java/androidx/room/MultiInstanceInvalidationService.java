package androidx.room;

import B3.g;
import B3.h;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9829o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f9830p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f9831q = new g(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f9832r = new h(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f9832r;
    }
}
