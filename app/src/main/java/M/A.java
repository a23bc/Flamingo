package M;

import X.AbstractC0498r0;
import X.K0;
import f0.C0903o;
import f0.C0912t;
import g1.C0957C;
import g1.C0980v;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import r0.AbstractC1383a;
import r0.C1395m;
import r0.InterfaceC1398p;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class A implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ K0 f4326A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f4327B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f4328C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ B2.m f4329D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ n1.d f4330E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f4331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b1.M f4332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B0 f4335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0980v f4336t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B2.g f4337u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f4338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f4339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f4340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f4341y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ J.b f4342z;

    public A(Z z6, b1.M m7, int i7, int i8, B0 b0, C0980v c0980v, B2.g gVar, InterfaceC1398p interfaceC1398p, InterfaceC1398p interfaceC1398p2, InterfaceC1398p interfaceC1398p3, InterfaceC1398p interfaceC1398p4, J.b bVar, K0 k02, boolean z7, InterfaceC1182c interfaceC1182c, B2.m mVar, n1.d dVar) {
        this.f4331o = z6;
        this.f4332p = m7;
        this.f4333q = i7;
        this.f4334r = i8;
        this.f4335s = b0;
        this.f4336t = c0980v;
        this.f4337u = gVar;
        this.f4338v = interfaceC1398p;
        this.f4339w = interfaceC1398p2;
        this.f4340x = interfaceC1398p3;
        this.f4341y = interfaceC1398p4;
        this.f4342z = bVar;
        this.f4326A = k02;
        this.f4327B = z7;
        this.f4328C = interfaceC1182c;
        this.f4329D = mVar;
        this.f4330E = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1398p h02;
        C0912t c0912t = (C0912t) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            C1395m c1395m = C1395m.f15634a;
            Z z6 = this.f4331o;
            InterfaceC1398p interfaceC1398pD = androidx.compose.foundation.layout.c.d(c1395m, ((n1.g) z6.f4503g.getValue()).f14511o, Float.NaN);
            int i7 = this.f4333q;
            int i8 = this.f4334r;
            b1.M m7 = this.f4332p;
            InterfaceC1398p interfaceC1398pA = AbstractC1383a.a(interfaceC1398pD, new O(i7, i8, m7));
            boolean zH = c0912t.h(z6);
            Object objK = c0912t.K();
            if (zH || objK == C0903o.f11850a) {
                objK = new E3.e(6, z6);
                c0912t.i0(objK);
            }
            InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK;
            B0 b0 = this.f4335s;
            EnumC2048l0 enumC2048l0 = (EnumC2048l0) b0.f4370f.getValue();
            C0980v c0980v = this.f4336t;
            int i9 = b1.L.f9944c;
            long j3 = c0980v.f12385b;
            int iF = (int) (j3 >> 32);
            long j7 = b0.f4369e;
            if (iF == ((int) (j7 >> 32)) && (iF = (int) (j3 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                iF = b1.L.f(j3);
            }
            b0.f4369e = j3;
            C0957C c0957cN = V.n(this.f4337u, c0980v.f12384a);
            int iOrdinal = enumC2048l0.ordinal();
            if (iOrdinal == 0) {
                h02 = new H0(b0, iF, c0957cN, interfaceC1180a);
            } else {
                if (iOrdinal != 1) {
                    throw new A2.W();
                }
                h02 = new P(b0, iF, c0957cN, interfaceC1180a);
            }
            AbstractC0498r0.f(androidx.compose.foundation.relocation.a.a(AbstractC1383a.a(j0.k.r(interfaceC1398pA).f(h02).f(this.f4338v).f(this.f4339w), new D.B0(2, m7)).f(this.f4340x).f(this.f4341y), this.f4342z), n0.e.e(1412697320, new C0280z(this.f4326A, z6, this.f4327B, this.f4328C, c0980v, this.f4329D, this.f4330E, this.f4334r), c0912t), c0912t, 48);
        } else {
            c0912t.Q();
        }
        return Y4.o.f8736a;
    }
}
