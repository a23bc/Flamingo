package S3;

import N3.p;
import T3.d;
import U3.f;
import U3.g;
import U3.h;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f6743d = 0;

    /* JADX INFO: renamed from: a */
    public final b f6744a;

    /* JADX INFO: renamed from: b */
    public final T3.b[] f6745b;

    /* JADX INFO: renamed from: c */
    public final Object f6746c;

    static {
        p.i("WorkConstraintsTracker");
    }

    public c(Context context, A0.b bVar, b bVar2) {
        Context applicationContext = context.getApplicationContext();
        this.f6744a = bVar2;
        this.f6745b = new T3.b[]{new T3.a((U3.a) h.V(applicationContext, bVar).f7042o, 0), new T3.a((U3.b) h.V(applicationContext, bVar).f7043p, 1), new T3.a((g) h.V(applicationContext, bVar).f7045r, 4), new T3.a((f) h.V(applicationContext, bVar).f7044q, 2), new T3.a((f) h.V(applicationContext, bVar).f7044q, 3), new d((f) h.V(applicationContext, bVar).f7044q), new T3.c((f) h.V(applicationContext, bVar).f7044q)};
        this.f6746c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f6746c) {
            try {
                for (T3.b bVar : this.f6745b) {
                    Object obj = bVar.f6939b;
                    if (obj != null && bVar.b(obj) && bVar.f6938a.contains(str)) {
                        p.d().b(new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.f6746c) {
            b bVar = this.f6744a;
            if (bVar != null) {
                bVar.c(arrayList);
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.f6746c) {
            try {
                for (T3.b bVar : this.f6745b) {
                    if (bVar.f6941d != null) {
                        bVar.f6941d = null;
                        bVar.d(null, bVar.f6939b);
                    }
                }
                for (T3.b bVar2 : this.f6745b) {
                    bVar2.c(collection);
                }
                for (T3.b bVar3 : this.f6745b) {
                    if (bVar3.f6941d != this) {
                        bVar3.f6941d = this;
                        bVar3.d(this, bVar3.f6939b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f6746c) {
            try {
                for (T3.b bVar : this.f6745b) {
                    ArrayList arrayList = bVar.f6938a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        bVar.f6940c.b(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
