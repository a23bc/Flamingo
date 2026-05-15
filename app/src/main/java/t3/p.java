package t3;

import A2.S;
import N2.H;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class p implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1497A f16962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f16964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f16965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16966e;
    public long l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f16967f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f16968g = new S(32);
    public final S h = new S(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S f16969i = new S(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final S f16970j = new S(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S f16971k = new S(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16972m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w2.m f16973n = new w2.m();

    public p(C1497A c1497a) {
        this.f16962a = c1497a;
    }

    @Override // t3.f
    public final void a() {
        this.l = 0L;
        this.f16972m = -9223372036854775807L;
        x2.g.a(this.f16967f);
        this.f16968g.d();
        this.h.d();
        this.f16969i.d();
        this.f16970j.d();
        this.f16971k.d();
        o oVar = this.f16965d;
        if (oVar != null) {
            oVar.f16956f = false;
            oVar.f16957g = false;
            oVar.h = false;
            oVar.f16958i = false;
            oVar.f16959j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e A[SYNTHETIC] */
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w2.m r35) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.p.b(w2.m):void");
    }

    @Override // t3.f
    public final void c(boolean z6) {
        AbstractC1697a.j(this.f16964c);
        int i7 = w2.t.f18881a;
        if (z6) {
            o oVar = this.f16965d;
            long j3 = this.l;
            oVar.f16961m = oVar.f16953c;
            oVar.a((int) (j3 - oVar.f16952b));
            oVar.f16960k = oVar.f16952b;
            oVar.f16952b = j3;
            oVar.a(0);
            oVar.f16958i = false;
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.f16972m = j3;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f16963b = c1500d.f16801e;
        c1500d.b();
        H hE = oVar.E(c1500d.f16800d, 2);
        this.f16964c = hE;
        this.f16965d = new o(hE);
        this.f16962a.b(oVar, c1500d);
    }

    public final void f(byte[] bArr, int i7, int i8) {
        o oVar = this.f16965d;
        if (oVar.f16956f) {
            int i9 = oVar.f16954d;
            int i10 = (i7 + 2) - i9;
            if (i10 < i8) {
                oVar.f16957g = (bArr[i10] & 128) != 0;
                oVar.f16956f = false;
            } else {
                oVar.f16954d = (i8 - i7) + i9;
            }
        }
        if (!this.f16966e) {
            this.f16968g.a(bArr, i7, i8);
            this.h.a(bArr, i7, i8);
            this.f16969i.a(bArr, i7, i8);
        }
        this.f16970j.a(bArr, i7, i8);
        this.f16971k.a(bArr, i7, i8);
    }
}
