package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import r.C1380a;
import s.C1427d;
import s.C1429f;

/* JADX INFO: loaded from: classes.dex */
public class A {
    public static final Object h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9677a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1429f f9678b = new C1429f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f9679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f9680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f9683g;

    public A() {
        Object obj = h;
        this.f9680d = obj;
        this.f9683g = new z(this);
        this.f9679c = obj;
    }

    public final void a(Object obj) {
        C1380a.L().f15600a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke setValue on a background thread");
        }
        this.f9679c = obj;
        if (this.f9681e) {
            this.f9682f = true;
            return;
        }
        this.f9681e = true;
        do {
            this.f9682f = false;
            C1429f c1429f = this.f9678b;
            c1429f.getClass();
            C1427d c1427d = new C1427d(c1429f);
            c1429f.f15818q.put(c1427d, Boolean.FALSE);
            if (c1427d.hasNext()) {
                ((Map.Entry) c1427d.next()).getValue().getClass();
                throw new ClassCastException();
            }
        } while (this.f9682f);
        this.f9681e = false;
    }
}
