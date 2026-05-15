package u6;

import b1.C0615K;
import d0.H0;
import f0.C0903o;
import f0.C0912t;
import f0.Z0;
import java.util.List;
import l5.InterfaceC1182c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.AbstractC1671d;
import w.AbstractC1674g;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f17774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f17775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f17776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f17777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f17779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1.M f17780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17781v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d6.f f17782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f17783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0615K f17784y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f17785z;

    public o0(boolean z6, boolean z7, InterfaceC1398p interfaceC1398p, String str, long j3, int i7, b1.M m7, boolean z8, d6.f fVar, List list, C0615K c0615k, long j7) {
        this.f17774o = z6;
        this.f17775p = z7;
        this.f17776q = interfaceC1398p;
        this.f17777r = str;
        this.f17778s = j3;
        this.f17779t = i7;
        this.f17780u = m7;
        this.f17781v = z8;
        this.f17782w = fVar;
        this.f17783x = list;
        this.f17784y = c0615k;
        this.f17785z = j7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            f0.W w7 = C0903o.f11850a;
            boolean z6 = this.f17774o;
            InterfaceC1398p interfaceC1398p = this.f17776q;
            boolean z7 = this.f17775p;
            if (z6) {
                c0912t.X(-281017568);
                Z0 z0B = AbstractC1674g.b(z7 ? 1.0f : 0.19f, AbstractC1671d.k(0.86f, 350.0f, null, 4), 0.0f, "line_alpha_animation", c0912t, 3120, 20);
                InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.layout.c.b(c1395m, 1.0f).f(interfaceC1398p);
                c0912t.X(960781474);
                boolean zF = c0912t.f(z0B);
                Object objK = c0912t.K();
                if (zF || objK == w7) {
                    objK = new h6.K(z0B, 4);
                    c0912t.i0(objK);
                }
                c0912t.p(false);
                InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pF, (InterfaceC1182c) objK);
                String str = this.f17777r;
                if (str == null) {
                    str = "";
                }
                H0.b(str, interfaceC1398pA, this.f17778s, 0L, null, null, 0L, new m1.k(this.f17779t), 0L, 0, false, 0, 0, this.f17780u, c0912t, 0, 0, 65016);
                c0912t.p(false);
            } else {
                c0912t.X(-280077152);
                Z0 z0B2 = AbstractC1674g.b(z7 ? 1.0f : 0.7f, AbstractC1671d.k(0.86f, 350.0f, null, 4), 0.0f, "word_alpha_animation", c0912t, 3120, 20);
                InterfaceC1398p interfaceC1398pF2 = androidx.compose.foundation.layout.c.b(c1395m, 1.0f).f(interfaceC1398p);
                c0912t.X(960804194);
                boolean zF2 = c0912t.f(z0B2);
                Object objK2 = c0912t.K();
                if (zF2 || objK2 == w7) {
                    objK2 = new h6.K(z0B2, 5);
                    c0912t.i0(objK2);
                }
                c0912t.p(false);
                InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.graphics.a.a(interfaceC1398pF2, (InterfaceC1182c) objK2);
                c0912t.X(960807627);
                boolean z8 = this.f17781v;
                boolean zG = c0912t.g(z8);
                Object objK3 = c0912t.K();
                if (zG || objK3 == w7) {
                    objK3 = z8 ? EnumC1561e.f17587p : EnumC1561e.f17586o;
                    c0912t.i0(objK3);
                }
                c0912t.p(false);
                L.a(interfaceC1398pA2, new C1563f((EnumC1561e) objK3, 3), n0.e.e(1966605928, new n0(this.f17782w, this.f17780u, this.f17775p, this.f17783x, this.f17784y, this.f17778s, this.f17785z, 1), c0912t), c0912t, 384);
                c0912t.p(false);
            }
        }
        return Y4.o.f8736a;
    }
}
