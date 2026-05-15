package u6;

import d0.H0;
import f0.C0903o;
import f0.C0912t;
import f0.Z0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.InterfaceC1626w;
import w.AbstractC1674g;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f17800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f17801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f17802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f17803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b1.M f17805t;

    public p0(String str, boolean z6, InterfaceC1398p interfaceC1398p, float f7, int i7, b1.M m7) {
        this.f17800o = str;
        this.f17801p = z6;
        this.f17802q = interfaceC1398p;
        this.f17803r = f7;
        this.f17804s = i7;
        this.f17805t = m7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
        String str = this.f17800o;
        if (str != null) {
            boolean z6 = this.f17801p;
            Z0 z0B = AbstractC1674g.b(z6 ? 0.65f : 0.29f, z6 ? E0.f17385c : E0.f17386d, 0.0f, "translation_alpha_animation", c0912t, 3072, 20);
            C1395m c1395m = C1395m.f15634a;
            c0912t.X(131737998);
            boolean zF = c0912t.f(z0B);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new h6.K(z0B, 7);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            H0.b(str, androidx.compose.foundation.layout.a.j(androidx.compose.ui.graphics.a.a(c1395m, (InterfaceC1182c) objK).f(this.f17802q), 0.0f, this.f17803r, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, new m1.k(this.f17804s), 0L, 0, false, 0, 0, this.f17805t, c0912t, 0, 0, 65020);
        }
        return Y4.o.f8736a;
    }
}
