package x3;

import D2.HandlerC0087c;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import t.C1450e;

/* JADX INFO: renamed from: x3.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1940y extends Service {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f20123w = 0;

    /* JADX INFO: renamed from: o */
    public F5.t f20124o;

    /* JADX INFO: renamed from: p */
    public final k.I f20125p = new k.I(21, this);

    /* JADX INFO: renamed from: q */
    public final C1931p f20126q = new C1931p(this, "android.media.session.MediaController", -1, -1, null);

    /* JADX INFO: renamed from: r */
    public final ArrayList f20127r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final C1450e f20128s = new C1450e(0);

    /* JADX INFO: renamed from: t */
    public C1931p f20129t;

    /* JADX INFO: renamed from: u */
    public final HandlerC0087c f20130u;

    /* JADX INFO: renamed from: v */
    public Y f20131v;

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public AbstractServiceC1940y() {
        HandlerC0087c handlerC0087c = new HandlerC0087c(6);
        handlerC0087c.f1470b = this;
        this.f20130u = handlerC0087c;
    }

    public abstract C1930o a(Bundle bundle);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        F5.t tVar = this.f20124o;
        tVar.getClass();
        C1932q c1932q = (C1932q) tVar.f2442q;
        c1932q.getClass();
        return c1932q.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            this.f20124o = new C1935t(this);
        } else if (i7 >= 26) {
            this.f20124o = new C1934s(this);
        } else {
            this.f20124o = new F5.t(this);
        }
        this.f20124o.q();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f20130u.f1470b = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
