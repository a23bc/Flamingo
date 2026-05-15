package G;

import H.C0183z;
import O0.InterfaceC0296a0;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC0296a0 {

    /* JADX INFO: renamed from: a */
    public final p f2541a;

    /* JADX INFO: renamed from: b */
    public final int f2542b;

    /* JADX INFO: renamed from: c */
    public final boolean f2543c;

    /* JADX INFO: renamed from: d */
    public final float f2544d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0296a0 f2545e;

    /* JADX INFO: renamed from: f */
    public final float f2546f;

    /* JADX INFO: renamed from: g */
    public final boolean f2547g;
    public final InterfaceC1765B h;

    /* JADX INFO: renamed from: i */
    public final n1.d f2548i;

    /* JADX INFO: renamed from: j */
    public final int f2549j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1182c f2550k;
    public final Object l;

    /* JADX INFO: renamed from: m */
    public final int f2551m;

    /* JADX INFO: renamed from: n */
    public final int f2552n;

    /* JADX INFO: renamed from: o */
    public final int f2553o;

    /* JADX INFO: renamed from: p */
    public final EnumC2048l0 f2554p;

    /* JADX INFO: renamed from: q */
    public final int f2555q;

    /* JADX INFO: renamed from: r */
    public final int f2556r;

    public n(p pVar, int i7, boolean z6, float f7, InterfaceC0296a0 interfaceC0296a0, float f8, boolean z7, InterfaceC1765B interfaceC1765B, n1.d dVar, int i8, InterfaceC1182c interfaceC1182c, List list, int i9, int i10, int i11, EnumC2048l0 enumC2048l0, int i12, int i13) {
        this.f2541a = pVar;
        this.f2542b = i7;
        this.f2543c = z6;
        this.f2544d = f7;
        this.f2545e = interfaceC0296a0;
        this.f2546f = f8;
        this.f2547g = z7;
        this.h = interfaceC1765B;
        this.f2548i = dVar;
        this.f2549j = i8;
        this.f2550k = interfaceC1182c;
        this.l = list;
        this.f2551m = i9;
        this.f2552n = i10;
        this.f2553o = i11;
        this.f2554p = enumC2048l0;
        this.f2555q = i12;
        this.f2556r = i13;
    }

    @Override // O0.InterfaceC0296a0
    public final Map a() {
        return this.f2545e.a();
    }

    @Override // O0.InterfaceC0296a0
    public final void b() {
        this.f2545e.b();
    }

    @Override // O0.InterfaceC0296a0
    public final int c() {
        return this.f2545e.c();
    }

    @Override // O0.InterfaceC0296a0
    public final InterfaceC1182c d() {
        return this.f2545e.d();
    }

    @Override // O0.InterfaceC0296a0
    public final int e() {
        return this.f2545e.e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final n f(int i7, boolean z6) {
        p pVar;
        int i8;
        EnumC2048l0 enumC2048l0;
        long j3;
        if (this.f2547g) {
            return null;
        }
        ?? r15 = this.l;
        if (r15.isEmpty() || (pVar = this.f2541a) == null || (i8 = this.f2542b - i7) < 0 || i8 >= pVar.f2584g) {
            return null;
        }
        o oVar = (o) Z4.n.q0(r15);
        o oVar2 = (o) Z4.n.x0(r15);
        if (oVar.f2577w || oVar2.f2577w) {
            return null;
        }
        EnumC2048l0 enumC2048l02 = this.f2554p;
        int i9 = this.f2552n;
        int i10 = this.f2551m;
        if (i7 < 0) {
            if (Math.min((I0.c.I(oVar, enumC2048l02) + oVar.f2569o) - i10, (I0.c.I(oVar2, enumC2048l02) + oVar2.f2569o) - i9) <= (-i7)) {
                return null;
            }
        } else if (Math.min(i10 - I0.c.I(oVar, enumC2048l02), i9 - I0.c.I(oVar2, enumC2048l02)) <= i7) {
            return null;
        }
        int size = r15.size();
        int i11 = 0;
        while (i11 < size) {
            o oVar3 = (o) r15.get(i11);
            if (oVar3.f2577w) {
                enumC2048l0 = enumC2048l02;
            } else {
                long j7 = oVar3.f2574t;
                long j8 = 4294967295L;
                enumC2048l0 = enumC2048l02;
                char c7 = ' ';
                oVar3.f2574t = (((long) ((int) (j7 >> 32))) << 32) | (((long) (((int) (j7 & 4294967295L)) + i7)) & 4294967295L);
                if (z6) {
                    int size2 = oVar3.f2563g.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        C0183z c0183zA = oVar3.f2565j.a(i12, oVar3.f2558b);
                        if (c0183zA != null) {
                            long j9 = c0183zA.f2948j;
                            j3 = j8;
                            char c8 = c7;
                            c0183zA.f2948j = (((long) ((int) (j9 >> c8))) << c8) | (((long) (((int) (j9 & j3)) + i7)) & j3);
                        } else {
                            j3 = j8;
                        }
                        i12++;
                        j8 = j3;
                        c7 = ' ';
                    }
                }
            }
            i11++;
            enumC2048l02 = enumC2048l0;
        }
        return new n(this.f2541a, i8, this.f2543c || i7 > 0, i7, this.f2545e, this.f2546f, this.f2547g, this.h, this.f2548i, this.f2549j, this.f2550k, r15, this.f2551m, this.f2552n, this.f2553o, enumC2048l02, this.f2555q, this.f2556r);
    }

    public final long g() {
        InterfaceC0296a0 interfaceC0296a0 = this.f2545e;
        return (((long) interfaceC0296a0.e()) << 32) | (((long) interfaceC0296a0.c()) & 4294967295L);
    }
}
