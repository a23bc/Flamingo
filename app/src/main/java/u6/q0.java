package u6;

import f0.C0903o;
import f0.C0912t;
import k.AbstractC1113a;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f17820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f17821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f17822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f17823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f17824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f17825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1.M f17826u;

    public q0(boolean z6, String str, boolean z7, InterfaceC1398p interfaceC1398p, float f7, int i7, b1.M m7) {
        this.f17820o = z6;
        this.f17821p = str;
        this.f17822q = z7;
        this.f17823r = interfaceC1398p;
        this.f17824s = f7;
        this.f17825t = i7;
        this.f17826u = m7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.X(961066714);
            boolean z6 = this.f17820o;
            boolean zG = c0912t.g(z6);
            String str = this.f17821p;
            boolean zF = zG | c0912t.f(str);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = Boolean.valueOf((!z6 || str == null || str.length() == 0) ? false : true);
                c0912t.i0(objK);
            }
            boolean zBooleanValue = ((Boolean) objK).booleanValue();
            c0912t.p(false);
            AbstractC1113a.d(zBooleanValue, null, null, null, null, n0.e.e(205263177, new p0(this.f17821p, this.f17822q, this.f17823r, this.f17824s, this.f17825t, this.f17826u), c0912t), c0912t, 1572864, 30);
        }
        return Y4.o.f8736a;
    }
}
