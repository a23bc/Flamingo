package r1;

import K0.C0236d;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import w.C1657F;
import w.C1658G;
import w.C1661J;
import w.a0;
import w.p0;

/* JADX INFO: renamed from: r1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1410d extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15672t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1410d(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(0);
        this.f15668p = i7;
        this.f15669q = obj;
        this.f15670r = obj2;
        this.f15671s = obj3;
        this.f15672t = obj4;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f15668p) {
            case 0:
                ((w) this.f15669q).f((C0236d) this.f15670r, (u) this.f15671s, (n1.n) this.f15672t);
                break;
            default:
                C1658G c1658g = (C1658G) this.f15670r;
                Float f7 = c1658g.f18516o;
                Float f8 = (Float) this.f15669q;
                boolean zEquals = f8.equals(f7);
                Float f9 = (Float) this.f15671s;
                if (!zEquals || !f9.equals(c1658g.f18517p)) {
                    c1658g.f18516o = f8;
                    c1658g.f18517p = f9;
                    c1658g.f18519r = new a0((C1657F) this.f15672t, p0.f18727a, f8, f9, null);
                    C1661J c1661j = c1658g.f18523v;
                    c1661j.f18531b.setValue(Boolean.TRUE);
                    c1658g.f18520s = false;
                    c1658g.f18521t = true;
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
