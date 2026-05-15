package J2;

import E4.AbstractC0126y;
import E4.Y;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f3701A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f3702B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f3703C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f3704D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f3705E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f3706F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f3707G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f3709t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3711v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3714y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3715z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(int r9, t2.i0 r10, int r11, J2.i r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.n.<init>(int, t2.i0, int, J2.i, int, int, boolean):void");
    }

    public static int c(n nVar, n nVar2) {
        AbstractC0126y abstractC0126yB = AbstractC0126y.f1997a.c(nVar.f3711v, nVar2.f3711v).a(nVar.f3701A, nVar2.f3701A).c(nVar.f3702B, nVar2.f3702B).c(nVar.f3712w, nVar2.f3712w).c(nVar.f3708s, nVar2.f3708s).c(nVar.f3710u, nVar2.f3710u).b(Integer.valueOf(nVar.f3715z), Integer.valueOf(nVar2.f3715z), Y.f1899q);
        boolean z6 = nVar2.f3705E;
        boolean z7 = nVar.f3705E;
        AbstractC0126y abstractC0126yC = abstractC0126yB.c(z7, z6);
        boolean z8 = nVar2.f3706F;
        boolean z9 = nVar.f3706F;
        AbstractC0126y abstractC0126yC2 = abstractC0126yC.c(z9, z8);
        if (z7 && z9) {
            abstractC0126yC2 = abstractC0126yC2.a(nVar.f3707G, nVar2.f3707G);
        }
        return abstractC0126yC2.e();
    }

    @Override // J2.m
    public final int a() {
        return this.f3704D;
    }

    @Override // J2.m
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (!this.f3703C && !w2.t.a(this.f3700r.f16701m, nVar.f3700r.f16701m)) {
            return false;
        }
        this.f3709t.getClass();
        return this.f3705E == nVar.f3705E && this.f3706F == nVar.f3706F;
    }
}
