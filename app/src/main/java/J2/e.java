package J2;

import E4.AbstractC0126y;
import E4.Y;
import E4.Z;
import E4.b0;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import t2.C1487p;
import t2.i0;
import t2.l0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f3627A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f3628B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f3629C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f3630D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f3631E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f3632F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f3633G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f3634H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f3635I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f3636J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f3637K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f3640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f3641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3644y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3645z;

    public e(int i7, i0 i0Var, int i8, i iVar, int i9, boolean z6, d dVar, int i10) {
        int i11;
        int iD;
        String[] strArrSplit;
        int iD2;
        boolean z7;
        super(i7, i0Var, i8);
        this.f3641v = iVar;
        int i12 = iVar.f3681l0 ? 24 : 16;
        int i13 = 0;
        this.f3627A = false;
        this.f3640u = o.g(this.f3700r.f16694d);
        this.f3642w = A0.e.y(i9, false);
        int i14 = 0;
        while (true) {
            b0 b0Var = iVar.f16595n;
            i11 = Integer.MAX_VALUE;
            if (i14 >= b0Var.f1915r) {
                iD = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iD = o.d(this.f3700r, (String) b0Var.get(i14), false);
                if (iD > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f3644y = i14;
        this.f3643x = iD;
        int i15 = this.f3700r.f16696f;
        int i16 = iVar.f16596o;
        this.f3645z = (i15 == 0 || i15 != i16) ? Integer.bitCount(i15 & i16) : Integer.MAX_VALUE;
        C1487p c1487p = this.f3700r;
        int i17 = c1487p.f16696f;
        this.f3628B = i17 == 0 || (i17 & 1) != 0;
        this.f3631E = (c1487p.f16695e & 1) != 0;
        int i18 = c1487p.f16680A;
        this.f3632F = i18;
        this.f3633G = c1487p.f16681B;
        int i19 = c1487p.f16698i;
        this.f3634H = i19;
        this.f3639t = (i19 == -1 || i19 <= iVar.f16598q) && (i18 == -1 || i18 <= iVar.f16597p) && dVar.apply(c1487p);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i20 = w2.t.f18881a;
        if (i20 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i20 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = w2.t.E(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iD2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iD2 = o.d(this.f3700r, strArrSplit[i22], false);
                if (iD2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f3629C = i22;
        this.f3630D = iD2;
        int i23 = 0;
        while (true) {
            b0 b0Var2 = iVar.f16599r;
            if (i23 >= b0Var2.f1915r) {
                break;
            }
            String str = this.f3700r.f16701m;
            if (str != null && str.equals(b0Var2.get(i23))) {
                i11 = i23;
                break;
            }
            i23++;
        }
        this.f3635I = i11;
        this.f3636J = (i9 & 384) == 128;
        this.f3637K = (i9 & 64) == 64;
        i iVar2 = this.f3641v;
        if (A0.e.y(i9, iVar2.f3683n0) && ((z7 = this.f3639t) || iVar2.f3680k0)) {
            l0 l0Var = iVar2.f16600s;
            int i24 = l0Var.f16519a;
            C1487p c1487p2 = this.f3700r;
            if (i24 != 2 || o.i(iVar2, i9, c1487p2)) {
                i13 = (!A0.e.y(i9, false) || !z7 || c1487p2.f16698i == -1 || iVar2.f16607z || iVar2.f16606y || (!iVar2.f3684o0 && z6) || l0Var.f16519a == 2 || (i12 & i9) == 0) ? 1 : 2;
            }
        }
        this.f3638s = i13;
    }

    @Override // J2.m
    public final int a() {
        return this.f3638s;
    }

    @Override // J2.m
    public final boolean b(m mVar) {
        int i7;
        String str;
        e eVar = (e) mVar;
        this.f3641v.getClass();
        C1487p c1487p = this.f3700r;
        int i8 = c1487p.f16680A;
        if (i8 == -1) {
            return false;
        }
        C1487p c1487p2 = eVar.f3700r;
        if (i8 != c1487p2.f16680A) {
            return false;
        }
        if ((this.f3627A || ((str = c1487p.f16701m) != null && TextUtils.equals(str, c1487p2.f16701m))) && (i7 = c1487p.f16681B) != -1 && i7 == c1487p2.f16681B) {
            return this.f3636J == eVar.f3636J && this.f3637K == eVar.f3637K;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        boolean z6 = this.f3642w;
        boolean z7 = this.f3639t;
        Z zA = (z7 && z6) ? o.f3716j : o.f3716j.a();
        AbstractC0126y abstractC0126yC = AbstractC0126y.f1997a.c(z6, eVar.f3642w);
        Integer numValueOf = Integer.valueOf(this.f3644y);
        Integer numValueOf2 = Integer.valueOf(eVar.f3644y);
        Y y6 = Y.f1899q;
        AbstractC0126y abstractC0126yB = abstractC0126yC.b(numValueOf, numValueOf2, y6).a(this.f3643x, eVar.f3643x).a(this.f3645z, eVar.f3645z).c(this.f3631E, eVar.f3631E).c(this.f3628B, eVar.f3628B).b(Integer.valueOf(this.f3629C), Integer.valueOf(eVar.f3629C), y6).a(this.f3630D, eVar.f3630D).c(z7, eVar.f3639t).b(Integer.valueOf(this.f3635I), Integer.valueOf(eVar.f3635I), y6);
        boolean z8 = this.f3641v.f16606y;
        int i7 = this.f3634H;
        int i8 = eVar.f3634H;
        if (z8) {
            abstractC0126yB = abstractC0126yB.b(Integer.valueOf(i7), Integer.valueOf(i8), o.f3716j.a());
        }
        AbstractC0126y abstractC0126yB2 = abstractC0126yB.c(this.f3636J, eVar.f3636J).c(this.f3637K, eVar.f3637K).b(Integer.valueOf(this.f3632F), Integer.valueOf(eVar.f3632F), zA).b(Integer.valueOf(this.f3633G), Integer.valueOf(eVar.f3633G), zA);
        if (w2.t.a(this.f3640u, eVar.f3640u)) {
            abstractC0126yB2 = abstractC0126yB2.b(Integer.valueOf(i7), Integer.valueOf(i8), zA);
        }
        return abstractC0126yB2.e();
    }
}
