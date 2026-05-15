package B2;

import H2.A;
import t2.g0;
import t2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f770g;

    public j(k kVar, String str, int i7, A a4) {
        this.f770g = kVar;
        this.f764a = str;
        this.f765b = i7;
        this.f766c = a4 == null ? -1L : a4.f2976d;
        if (a4 == null || !a4.b()) {
            return;
        }
        this.f767d = a4;
    }

    public final boolean a(a aVar) {
        A a4 = aVar.f731d;
        if (a4 == null) {
            return this.f765b != aVar.f730c;
        }
        long j3 = this.f766c;
        if (j3 == -1) {
            return false;
        }
        if (a4.f2976d > j3) {
            return true;
        }
        A a7 = this.f767d;
        if (a7 == null) {
            return false;
        }
        h0 h0Var = aVar.f729b;
        int iB = h0Var.b(a4.f2973a);
        int iB2 = h0Var.b(a7.f2973a);
        if (a4.f2976d < a7.f2976d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zB = a4.b();
        int i7 = a7.f2974b;
        if (!zB) {
            int i8 = a4.f2977e;
            return i8 == -1 || i8 > i7;
        }
        int i9 = a4.f2974b;
        if (i9 > i7) {
            return true;
        }
        if (i9 == i7) {
            return a4.f2975c > a7.f2975c;
        }
        return false;
    }

    public final boolean b(h0 h0Var, h0 h0Var2) {
        A a4;
        int i7 = this.f765b;
        if (i7 < h0Var.o()) {
            k kVar = this.f770g;
            h0Var.n(i7, kVar.f772a);
            g0 g0Var = kVar.f772a;
            for (int i8 = g0Var.f16464m; i8 <= g0Var.f16465n; i8++) {
                int iB = h0Var2.b(h0Var.l(i8));
                if (iB != -1) {
                    i7 = h0Var2.f(iB, kVar.f773b, false).f16428c;
                    break;
                }
            }
            i7 = -1;
        } else if (i7 >= h0Var2.o()) {
            i7 = -1;
        }
        this.f765b = i7;
        return i7 != -1 && ((a4 = this.f767d) == null || h0Var2.b(a4.f2973a) != -1);
    }
}
