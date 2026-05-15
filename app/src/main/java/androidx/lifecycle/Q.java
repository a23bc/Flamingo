package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a */
    public final r2.d f9719a = new r2.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        r2.d dVar = this.f9719a;
        if (dVar != null) {
            if (dVar.f15764d) {
                r2.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f15761a) {
                autoCloseable2 = (AutoCloseable) dVar.f15762b.put(str, autoCloseable);
            }
            r2.d.a(autoCloseable2);
        }
    }

    public final void b() {
        r2.d dVar = this.f9719a;
        if (dVar != null && !dVar.f15764d) {
            dVar.f15764d = true;
            synchronized (dVar.f15761a) {
                try {
                    Iterator it = dVar.f15762b.values().iterator();
                    while (it.hasNext()) {
                        r2.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f15763c.iterator();
                    while (it2.hasNext()) {
                        r2.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f15763c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        r2.d dVar = this.f9719a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f15761a) {
            autoCloseable = (AutoCloseable) dVar.f15762b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
