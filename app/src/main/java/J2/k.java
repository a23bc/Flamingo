package J2;

import E4.AbstractC0126y;
import E4.I;
import E4.Y;
import E4.Z;
import E4.b0;
import t2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f3688A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3690t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3691u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3695y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3696z;

    public k(int i7, i0 i0Var, int i8, i iVar, int i9, String str) {
        int iD;
        super(i7, i0Var, i8);
        int i10 = 0;
        this.f3690t = A0.e.y(i9, false);
        int i11 = this.f3700r.f16695e & (~iVar.f16603v);
        this.f3691u = (i11 & 1) != 0;
        this.f3692v = (i11 & 2) != 0;
        b0 b0Var = iVar.f16601t;
        b0 b0VarT = b0Var.isEmpty() ? I.t("") : b0Var;
        int i12 = 0;
        while (true) {
            if (i12 >= b0VarT.f1915r) {
                iD = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                iD = o.d(this.f3700r, (String) b0VarT.get(i12), iVar.f16604w);
                if (iD > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f3693w = i12;
        this.f3694x = iD;
        int i13 = this.f3700r.f16696f;
        Z z6 = o.f3716j;
        int i14 = iVar.f16602u;
        int iBitCount = (i13 == 0 || i13 != i14) ? Integer.bitCount(i13 & i14) : Integer.MAX_VALUE;
        this.f3695y = iBitCount;
        this.f3688A = (this.f3700r.f16696f & 1088) != 0;
        int iD2 = o.d(this.f3700r, str, o.g(str) == null);
        this.f3696z = iD2;
        boolean z7 = iD > 0 || (b0Var.isEmpty() && iBitCount > 0) || this.f3691u || (this.f3692v && iD2 > 0);
        if (A0.e.y(i9, iVar.f3683n0) && z7) {
            i10 = 1;
        }
        this.f3689s = i10;
    }

    @Override // J2.m
    public final int a() {
        return this.f3689s;
    }

    @Override // J2.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        AbstractC0126y abstractC0126yC = AbstractC0126y.f1997a.c(this.f3690t, kVar.f3690t);
        Integer numValueOf = Integer.valueOf(this.f3693w);
        Integer numValueOf2 = Integer.valueOf(kVar.f3693w);
        Y y6 = Y.f1899q;
        AbstractC0126y abstractC0126yB = abstractC0126yC.b(numValueOf, numValueOf2, y6);
        int i7 = this.f3694x;
        AbstractC0126y abstractC0126yA = abstractC0126yB.a(i7, kVar.f3694x);
        int i8 = this.f3695y;
        AbstractC0126y abstractC0126yC2 = abstractC0126yA.a(i8, kVar.f3695y).c(this.f3691u, kVar.f3691u);
        Boolean boolValueOf = Boolean.valueOf(this.f3692v);
        Boolean boolValueOf2 = Boolean.valueOf(kVar.f3692v);
        if (i7 == 0) {
            y6 = Y.f1898p;
        }
        AbstractC0126y abstractC0126yA2 = abstractC0126yC2.b(boolValueOf, boolValueOf2, y6).a(this.f3696z, kVar.f3696z);
        if (i8 == 0) {
            abstractC0126yA2 = abstractC0126yA2.d(this.f3688A, kVar.f3688A);
        }
        return abstractC0126yA2.e();
    }
}
