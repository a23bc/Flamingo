package b2;

import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10030p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l5.e f10031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f10032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H0 f10033s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(int i7, long j3, H0 h02, l5.e eVar) {
        super(2);
        this.f10033s = h02;
        this.f10032r = j3;
        this.f10031q = eVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10030p) {
            case 0:
                ((Number) obj2).intValue();
                l5.e eVar = this.f10031q;
                H0 h02 = this.f10033s;
                I0.c.c(1, this.f10032r, h02, (C0912t) obj, eVar);
                return Y4.o.f8736a;
            default:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    D0 d02 = D0.f10037w;
                    c0912t.Y(578571862);
                    c0912t.Y(-548224868);
                    if (!(c0912t.f11893a instanceof Z1.b)) {
                        C0879c.r();
                        throw null;
                    }
                    c0912t.V();
                    if (c0912t.f11890S) {
                        c0912t.k(d02);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, new n1.i(this.f10032r), o0.f10254I);
                    C0879c.y(c0912t, this.f10033s, o0.f10255J);
                    this.f10031q.invoke(c0912t, 0);
                    c0912t.p(true);
                    c0912t.p(false);
                    c0912t.p(false);
                }
                return Y4.o.f8736a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(l5.e eVar, long j3, H0 h02) {
        super(2);
        this.f10031q = eVar;
        this.f10032r = j3;
        this.f10033s = h02;
    }
}
