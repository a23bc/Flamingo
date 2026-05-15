package J5;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    public final long f3801a;

    /* JADX INFO: renamed from: b */
    public final I5.c f3802b;

    /* JADX INFO: renamed from: c */
    public final I5.b f3803c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue f3804d;

    public l(I5.d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC1209k.f(dVar, "taskRunner");
        AbstractC1209k.f(timeUnit, "timeUnit");
        this.f3801a = timeUnit.toNanos(5L);
        this.f3802b = dVar.e();
        this.f3803c = new I5.b(this, Z1.l.t(new StringBuilder(), G5.b.f2770f, " ConnectionPool"));
        this.f3804d = new ConcurrentLinkedQueue();
    }

    public final boolean a(F5.a aVar, h hVar, List list, boolean z6) {
        AbstractC1209k.f(hVar, "call");
        Iterator it = this.f3804d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k kVar = (k) it.next();
            AbstractC1209k.e(kVar, "connection");
            synchronized (kVar) {
                if (z6) {
                    if (!(kVar.f3792g != null)) {
                        continue;
                    }
                }
                if (kVar.i(aVar, list)) {
                    hVar.b(kVar);
                    return true;
                }
            }
        }
    }

    public final int b(k kVar, long j3) {
        byte[] bArr = G5.b.f2765a;
        ArrayList arrayList = kVar.f3799p;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                String str = "A connection to " + kVar.f3787b.f2473a.h + " was leaked. Did you forget to close a response body?";
                N5.n nVar = N5.n.f5271a;
                N5.n.f5271a.j(((f) reference).f3765a, str);
                arrayList.remove(i7);
                kVar.f3794j = true;
                if (arrayList.isEmpty()) {
                    kVar.f3800q = j3 - this.f3801a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
