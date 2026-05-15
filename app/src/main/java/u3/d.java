package U3;

import C1.o;
import I4.t;
import N3.p;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7030f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.b f7031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7033c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f7034d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7035e;

    static {
        p.i("ConstraintTracker");
    }

    public d(Context context, A0.b bVar) {
        this.f7032b = context.getApplicationContext();
        this.f7031a = bVar;
    }

    public abstract Object a();

    public final void b(T3.b bVar) {
        synchronized (this.f7033c) {
            try {
                if (this.f7034d.remove(bVar) && this.f7034d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f7033c) {
            try {
                Object obj2 = this.f7035e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f7035e = obj;
                    ((o) this.f7031a.f52r).execute(new t(6, this, new ArrayList(this.f7034d), false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
