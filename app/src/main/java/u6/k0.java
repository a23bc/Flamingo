package u6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0058c;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import b1.C0615K;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1110d;
import java.util.List;
import java.util.Objects;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1388f;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.AbstractC1671d;
import w.AbstractC1674g;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ long f17712A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ b1.M f17713B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0615K f17714C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ long f17715D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ boolean f17716E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ long f17717F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ String f17718G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ List f17719H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ b1.M f17720I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f17721J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ int f17722K;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1388f f17723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f17724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f17725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f17728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d6.f f17729u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f17730v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17733y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17734z;

    public k0(C1388f c1388f, boolean z6, boolean z7, boolean z8, InterfaceC1180a interfaceC1180a, boolean z9, d6.f fVar, long j3, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, long j7, b1.M m7, C0615K c0615k, long j8, boolean z10, long j9, String str, List list, b1.M m8, String str2, int i7) {
        this.f17723o = c1388f;
        this.f17724p = z6;
        this.f17725q = z7;
        this.f17726r = z8;
        this.f17727s = interfaceC1180a;
        this.f17728t = z9;
        this.f17729u = fVar;
        this.f17730v = j3;
        this.f17731w = interfaceC1180a2;
        this.f17732x = interfaceC1180a3;
        this.f17733y = interfaceC1182c;
        this.f17734z = interfaceC1182c2;
        this.f17712A = j7;
        this.f17713B = m7;
        this.f17714C = c0615k;
        this.f17715D = j8;
        this.f17716E = z10;
        this.f17717F = j9;
        this.f17718G = str;
        this.f17719H = list;
        this.f17720I = m8;
        this.f17721J = str2;
        this.f17722K = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(c1395m, 9, 0.0f, 2);
            C0058c c0058c = AbstractC0068i.f1329c;
            C1388f c1388f = this.f17723o;
            C0084z c0084zA = AbstractC0082x.a(c0058c, c1388f, c0912t, 0);
            long j3 = c0912t.f11891T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pI);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t, c0084zA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                n1.c.w(i7, c0912t, i7, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t, interfaceC1398pC, c0351h4);
            boolean z6 = this.f17724p;
            if (z6) {
                AbstractC1959I.h(1.0f, 0.5f);
            } else {
                AbstractC1959I.h(0.0f, 0.5f);
            }
            long jH = z6 ? AbstractC1959I.h(1.0f, 0.5f) : AbstractC1959I.h(0.0f, 0.5f);
            boolean z7 = this.f17725q;
            Z0 z0B = AbstractC1674g.b(z7 ? 10.2f : 10.0f, z7 ? E0.f17387e : E0.f17388f, 0.0f, null, c0912t, 0, 28);
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, (this.f17726r || ((Boolean) this.f17727s.a()).booleanValue()) ? 0.95f : 0.82f);
            C0058c c0058c2 = z6 ? AbstractC0068i.f1328b : AbstractC0068i.f1327a;
            boolean z8 = this.f17728t;
            d6.f fVar = this.f17729u;
            if (z8) {
                c0912t.X(145872563);
                Objects.toString(fVar);
                System.out.getClass();
                InterfaceC1398p interfaceC1398pA = androidx.compose.animation.a.a(AbstractC1671d.k(0.86f, 350.0f, null, 4));
                C0084z c0084zA2 = AbstractC0082x.a(c0058c, C1385c.f15608A, c0912t, 0);
                long j7 = c0912t.f11891T;
                int i8 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pA);
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, c0084zA2, c0351h);
                C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                    n1.c.w(i8, c0912t, i8, c0351h3);
                }
                C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
                AbstractC1110d.n(n0.e.e(-499416007, new C1562e0(z7, z0B, interfaceC1398pB, jH, c1388f, c0058c2, fVar, this.f17730v), c0912t), c0912t, 6);
                c0912t.p(true);
                c0912t.p(false);
            } else {
                c0912t.X(149531369);
                AbstractC1110d.n(n0.e.e(1593756876, new j0(fVar, z0B, interfaceC1398pB, jH, c1388f, c0058c2, this.f17731w, this.f17732x, z6, z7, this.f17733y, this.f17734z, this.f17712A, this.f17713B, this.f17714C, this.f17715D, this.f17716E, this.f17717F, this.f17718G, this.f17719H, this.f17720I, this.f17721J, this.f17722K), c0912t), c0912t, 6);
                c0912t.p(false);
            }
            c0912t.p(true);
        }
        return Y4.o.f8736a;
    }
}
