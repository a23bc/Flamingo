package t3;

import A2.S;
import N2.H;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements f {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1497A f16897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.m f16898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f16899c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f16900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f16901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f16902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16903g;
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public H f16904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16906k;

    public k(C1497A c1497a) {
        this.f16897a = c1497a;
        i iVar = new i();
        iVar.f16889e = new byte[128];
        this.f16900d = iVar;
        this.f16906k = -9223372036854775807L;
        this.f16901e = new S(178);
        this.f16898b = new w2.m();
    }

    @Override // t3.f
    public final void a() {
        x2.g.a(this.f16899c);
        i iVar = this.f16900d;
        iVar.f16885a = false;
        iVar.f16887c = 0;
        iVar.f16886b = 0;
        j jVar = this.f16902f;
        if (jVar != null) {
            jVar.f16891b = false;
            jVar.f16892c = false;
            jVar.f16893d = false;
            jVar.f16894e = -1;
        }
        S s7 = this.f16901e;
        if (s7 != null) {
            s7.d();
        }
        this.f16903g = 0L;
        this.f16906k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023d  */
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w2.m r22) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.b(w2.m):void");
    }

    @Override // t3.f
    public final void c(boolean z6) {
        AbstractC1697a.j(this.f16902f);
        if (z6) {
            this.f16902f.b(0, this.f16903g, this.f16905j);
            j jVar = this.f16902f;
            jVar.f16891b = false;
            jVar.f16892c = false;
            jVar.f16893d = false;
            jVar.f16894e = -1;
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.f16906k = j3;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.h = c1500d.f16801e;
        c1500d.b();
        H hE = oVar.E(c1500d.f16800d, 2);
        this.f16904i = hE;
        this.f16902f = new j(hE);
        this.f16897a.b(oVar, c1500d);
    }
}
