package M;

import X.K0;
import X.P0;
import f0.C0903o;
import f0.C0912t;
import g1.C0980v;
import l5.InterfaceC1182c;
import m5.AbstractC1207i;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f4674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f4675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0980v f4676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f4677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f4678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B2.m f4679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ F0 f4680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0276v f4681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4682w;

    public s0(Z z6, K0 k02, C0980v c0980v, boolean z7, boolean z8, B2.m mVar, F0 f02, C0276v c0276v, int i7) {
        this.f4674o = z6;
        this.f4675p = k02;
        this.f4676q = c0980v;
        this.f4677r = z7;
        this.f4678s = z8;
        this.f4679t = mVar;
        this.f4680u = f02;
        this.f4681v = c0276v;
        this.f4682w = i7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        c0912t.X(851809892);
        Object objK = c0912t.K();
        f0.W w7 = C0903o.f11850a;
        if (objK == w7) {
            objK = new P0();
            c0912t.i0(objK);
        }
        P0 p02 = (P0) objK;
        Object objK2 = c0912t.K();
        if (objK2 == w7) {
            objK2 = new K();
            c0912t.i0(objK2);
        }
        Z z6 = this.f4674o;
        K0 k02 = this.f4675p;
        C0980v c0980v = this.f4676q;
        F0 f02 = this.f4680u;
        q0 q0Var = new q0(z6, k02, c0980v, this.f4677r, this.f4678s, p02, this.f4679t, f02, (K) objK2, this.f4681v, this.f4682w);
        C1395m c1395m = C1395m.f15634a;
        boolean zH = c0912t.h(q0Var);
        Object objK3 = c0912t.K();
        if (zH || objK3 == w7) {
            r0 r0Var = new r0(1, q0Var, q0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0);
            c0912t.i0(r0Var);
            objK3 = r0Var;
        }
        InterfaceC1398p interfaceC1398pA = androidx.compose.ui.input.key.a.a(c1395m, (InterfaceC1182c) ((AbstractC1207i) objK3));
        c0912t.p(false);
        return interfaceC1398pA;
    }
}
