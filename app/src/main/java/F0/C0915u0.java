package f0;

import m5.AbstractC1209k;
import t.C1443E;

/* JADX INFO: renamed from: f0.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0915u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0924z f11929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0877b f11931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l5.e f11932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1443E f11934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t.J f11935g;

    public C0915u0(C0924z c0924z) {
        this.f11929a = c0924z;
    }

    public static boolean a(G g6, t.J j3) {
        AbstractC1209k.d(g6, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        Q0 q02 = g6.f11662q;
        if (q02 == null) {
            q02 = W.f11767t;
        }
        return !q02.a(g6.j().f11655f, j3.g(g6));
    }

    public final boolean b() {
        if (this.f11929a != null) {
            C0877b c0877b = this.f11931c;
            if (c0877b != null ? c0877b.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final Q c(Object obj) {
        Q q7;
        C0924z c0924z = this.f11929a;
        return (c0924z == null || (q7 = c0924z.q(this, obj)) == null) ? Q.f11732o : q7;
    }

    public final void d() {
        C0924z c0924z = this.f11929a;
        if (c0924z != null) {
            c0924z.f11958C = true;
            c0924z.f11963H.h();
        }
        this.f11929a = null;
        this.f11934f = null;
        this.f11935g = null;
        this.f11932d = null;
    }

    public final void e(boolean z6) {
        int i7 = this.f11930b;
        this.f11930b = z6 ? i7 | 32 : i7 & (-33);
    }
}
