package f4;

import O0.InterfaceC0319p;
import O0.w0;
import Q0.N;
import android.os.SystemClock;
import f0.C0879c;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0894j0;
import x0.C1895e;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class v extends D0.b {

    /* JADX INFO: renamed from: s */
    public D0.b f12230s;

    /* JADX INFO: renamed from: t */
    public final D0.b f12231t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC0319p f12232u;

    /* JADX INFO: renamed from: v */
    public final int f12233v;

    /* JADX INFO: renamed from: w */
    public final boolean f12234w;

    /* JADX INFO: renamed from: z */
    public boolean f12237z;

    /* JADX INFO: renamed from: x */
    public final C0888g0 f12235x = new C0888g0(0);

    /* JADX INFO: renamed from: y */
    public long f12236y = -1;

    /* JADX INFO: renamed from: A */
    public final C0886f0 f12228A = new C0886f0(1.0f);

    /* JADX INFO: renamed from: B */
    public final C0894j0 f12229B = C0879c.t(null);

    public v(D0.b bVar, D0.b bVar2, InterfaceC0319p interfaceC0319p, int i7, boolean z6) {
        this.f12230s = bVar;
        this.f12231t = bVar2;
        this.f12232u = interfaceC0319p;
        this.f12233v = i7;
        this.f12234w = z6;
    }

    @Override // D0.b
    public final void b(float f7) {
        this.f12228A.j(f7);
    }

    @Override // D0.b
    public final void c(C1980m c1980m) {
        this.f12229B.setValue(c1980m);
    }

    @Override // D0.b
    public final long h() {
        D0.b bVar = this.f12230s;
        long jH = bVar != null ? bVar.h() : 0L;
        D0.b bVar2 = this.f12231t;
        long jH2 = bVar2 != null ? bVar2.h() : 0L;
        boolean z6 = jH != 9205357640488583168L;
        boolean z7 = jH2 != 9205357640488583168L;
        if (z6 && z7) {
            return i6.h.i(Math.max(C1895e.d(jH), C1895e.d(jH2)), Math.max(C1895e.b(jH), C1895e.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override // D0.b
    public final void i(N n7) {
        boolean z6 = this.f12237z;
        C0886f0 c0886f0 = this.f12228A;
        D0.b bVar = this.f12231t;
        if (z6) {
            j(n7, bVar, c0886f0.h());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f12236y == -1) {
            this.f12236y = jUptimeMillis;
        }
        float f7 = (jUptimeMillis - this.f12236y) / this.f12233v;
        float fH = c0886f0.h() * i6.h.p(f7, 0.0f, 1.0f);
        float fH2 = this.f12234w ? c0886f0.h() - fH : c0886f0.h();
        this.f12237z = f7 >= 1.0f;
        j(n7, this.f12230s, fH2);
        j(n7, bVar, fH);
        if (this.f12237z) {
            this.f12230s = null;
        } else {
            C0888g0 c0888g0 = this.f12235x;
            c0888g0.j(c0888g0.h() + 1);
        }
    }

    public final void j(N n7, D0.b bVar, float f7) {
        if (bVar == null || f7 <= 0.0f) {
            return;
        }
        long jF = n7.f();
        long jH = bVar.h();
        long jL = (jH == 9205357640488583168L || C1895e.e(jH) || jF == 9205357640488583168L || C1895e.e(jF)) ? jF : w0.l(jH, this.f12232u.a(jH, jF));
        C0894j0 c0894j0 = this.f12229B;
        if (jF == 9205357640488583168L || C1895e.e(jF)) {
            bVar.g(n7, jL, f7, (C1980m) c0894j0.getValue());
            return;
        }
        float f8 = 2;
        float fD = (C1895e.d(jF) - C1895e.d(jL)) / f8;
        float fB = (C1895e.b(jF) - C1895e.b(jL)) / f8;
        A0.c cVar = n7.f5853o;
        ((A.b) cVar.f54p.f50p).t(fD, fB, fD, fB);
        bVar.g(n7, jL, f7, (C1980m) c0894j0.getValue());
        float f9 = -fD;
        float f10 = -fB;
        ((A.b) cVar.f54p.f50p).t(f9, f10, f9, f10);
    }
}
