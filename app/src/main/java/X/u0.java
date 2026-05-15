package X;

import D.C0056b;
import f0.C0879c;
import f0.C0894j0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import m5.AbstractC1209k;
import t.AbstractC1462q;
import t.C1441C;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static final V1.a l = new V1.a(new C0056b(8, 0), new C0469c0(2));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8174b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1441C f8175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f8176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public J f8177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0483j0 f8178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0485k0 f8179g;
    public M h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public J f8180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public J f8181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0894j0 f8182k;

    public u0(long j3) {
        C1441C c1441c = AbstractC1462q.f16101a;
        this.f8175c = new C1441C();
        this.f8176d = new AtomicLong(j3);
        C1441C c1441c2 = AbstractC1462q.f16101a;
        AbstractC1209k.d(c1441c2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f8182k = C0879c.t(c1441c2);
    }

    public final C1441C a() {
        return (C1441C) this.f8182k.getValue();
    }

    public final boolean b(O0.C c7, long j3, long j7, F f7, boolean z6) {
        C0485k0 c0485k0 = this.f8179g;
        if (c0485k0 == null) {
            return true;
        }
        C0495p0 c0495p0 = c0485k0.f8096o;
        long jB = c0495p0.b(c7, j3);
        long jB2 = c0495p0.b(c7, j7);
        c0495p0.l(z6);
        return c0495p0.o(jB, jB2, false, f7);
    }

    public final ArrayList c(O0.C c7) {
        boolean z6 = this.f8173a;
        ArrayList arrayList = this.f8174b;
        if (!z6) {
            Z4.s.k0(arrayList, new F2.v(1, new D.D0(7, c7)));
            this.f8173a = true;
        }
        return arrayList;
    }

    public final void d(C0492o c0492o) {
        long j3 = c0492o.f8115a;
        C1441C c1441c = this.f8175c;
        if (c1441c.b(j3)) {
            this.f8174b.remove(c0492o);
            long j7 = c0492o.f8115a;
            c1441c.g(j7);
            J j8 = this.f8181j;
            if (j8 != null) {
                j8.b(Long.valueOf(j7));
            }
        }
    }
}
