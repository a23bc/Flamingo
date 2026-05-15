package F;

import H.C0183z;
import O0.InterfaceC0296a0;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0296a0 {

    /* JADX INFO: renamed from: a */
    public final s f2115a;

    /* JADX INFO: renamed from: b */
    public final int f2116b;

    /* JADX INFO: renamed from: c */
    public final boolean f2117c;

    /* JADX INFO: renamed from: d */
    public final float f2118d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0296a0 f2119e;

    /* JADX INFO: renamed from: f */
    public final float f2120f;

    /* JADX INFO: renamed from: g */
    public final boolean f2121g;
    public final InterfaceC1765B h;

    /* JADX INFO: renamed from: i */
    public final n1.d f2122i;

    /* JADX INFO: renamed from: j */
    public final long f2123j;

    /* JADX INFO: renamed from: k */
    public final Object f2124k;
    public final int l;

    /* JADX INFO: renamed from: m */
    public final int f2125m;

    /* JADX INFO: renamed from: n */
    public final int f2126n;

    /* JADX INFO: renamed from: o */
    public final EnumC2048l0 f2127o;

    /* JADX INFO: renamed from: p */
    public final int f2128p;

    /* JADX INFO: renamed from: q */
    public final int f2129q;

    public r(s sVar, int i7, boolean z6, float f7, InterfaceC0296a0 interfaceC0296a0, float f8, boolean z7, InterfaceC1765B interfaceC1765B, n1.d dVar, long j3, List list, int i8, int i9, int i10, EnumC2048l0 enumC2048l0, int i11, int i12) {
        this.f2115a = sVar;
        this.f2116b = i7;
        this.f2117c = z6;
        this.f2118d = f7;
        this.f2119e = interfaceC0296a0;
        this.f2120f = f8;
        this.f2121g = z7;
        this.h = interfaceC1765B;
        this.f2122i = dVar;
        this.f2123j = j3;
        this.f2124k = list;
        this.l = i8;
        this.f2125m = i9;
        this.f2126n = i10;
        this.f2127o = enumC2048l0;
        this.f2128p = i11;
        this.f2129q = i12;
    }

    @Override // O0.InterfaceC0296a0
    public final Map a() {
        return this.f2119e.a();
    }

    @Override // O0.InterfaceC0296a0
    public final void b() {
        this.f2119e.b();
    }

    @Override // O0.InterfaceC0296a0
    public final int c() {
        return this.f2119e.c();
    }

    @Override // O0.InterfaceC0296a0
    public final InterfaceC1182c d() {
        return this.f2119e.d();
    }

    @Override // O0.InterfaceC0296a0
    public final int e() {
        return this.f2119e.e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final r f(int i7, boolean z6) {
        s sVar;
        int i8;
        if (this.f2121g) {
            return null;
        }
        ?? r15 = this.f2124k;
        if (r15.isEmpty() || (sVar = this.f2115a) == null || (i8 = this.f2116b - i7) < 0 || i8 >= sVar.f2142o) {
            return null;
        }
        s sVar2 = (s) Z4.n.q0(r15);
        s sVar3 = (s) Z4.n.x0(r15);
        if (sVar2.f2144q || sVar3.f2144q) {
            return null;
        }
        int i9 = this.f2125m;
        int i10 = this.l;
        if (i7 < 0) {
            if (Math.min((sVar2.f2140m + sVar2.f2142o) - i10, (sVar3.f2140m + sVar3.f2142o) - i9) <= (-i7)) {
                return null;
            }
        } else if (Math.min(i10 - sVar2.f2140m, i9 - sVar3.f2140m) <= i7) {
            return null;
        }
        int size = r15.size();
        for (int i11 = 0; i11 < size; i11++) {
            s sVar4 = (s) r15.get(i11);
            if (!sVar4.f2144q) {
                sVar4.f2140m += i7;
                int[] iArr = sVar4.f2148u;
                int length = iArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    if ((i12 & 1) != 0) {
                        iArr[i12] = iArr[i12] + i7;
                    }
                }
                if (z6) {
                    int size2 = sVar4.f2131b.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        C0183z c0183zA = sVar4.f2139k.a(i13, sVar4.f2137i);
                        if (c0183zA != null) {
                            long j3 = c0183zA.f2948j;
                            c0183zA.f2948j = (((long) ((int) (j3 >> 32))) << 32) | (((long) (((int) (j3 & 4294967295L)) + i7)) & 4294967295L);
                        }
                    }
                }
            }
        }
        return new r(this.f2115a, i8, this.f2117c || i7 > 0, i7, this.f2119e, this.f2120f, this.f2121g, this.h, this.f2122i, this.f2123j, r15, this.l, this.f2125m, this.f2126n, this.f2127o, this.f2128p, this.f2129q);
    }

    public final long g() {
        InterfaceC0296a0 interfaceC0296a0 = this.f2119e;
        return (((long) interfaceC0296a0.e()) << 32) | (((long) interfaceC0296a0.c()) & 4294967295L);
    }
}
