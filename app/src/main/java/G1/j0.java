package G1;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: b */
    public static final m0 f2722b;

    /* JADX INFO: renamed from: a */
    public final m0 f2723a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f2722b = (i7 >= 30 ? new c0() : i7 >= 29 ? new b0() : new a0()).b().f2725a.a().f2725a.b().f2725a.c();
    }

    public j0(m0 m0Var) {
        this.f2723a = m0Var;
    }

    public m0 a() {
        return this.f2723a;
    }

    public m0 b() {
        return this.f2723a;
    }

    public m0 c() {
        return this.f2723a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p() == j0Var.p() && o() == j0Var.o() && Objects.equals(l(), j0Var.l()) && Objects.equals(j(), j0Var.j()) && Objects.equals(f(), j0Var.f());
    }

    public C0141h f() {
        return null;
    }

    public C1993b g(int i7) {
        return C1993b.f20270e;
    }

    public C1993b h(int i7) {
        if ((i7 & 8) == 0) {
            return C1993b.f20270e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public C1993b i() {
        return l();
    }

    public C1993b j() {
        return C1993b.f20270e;
    }

    public C1993b k() {
        return l();
    }

    public C1993b l() {
        return C1993b.f20270e;
    }

    public C1993b m() {
        return l();
    }

    public m0 n(int i7, int i8, int i9, int i10) {
        return f2722b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i7) {
        return true;
    }

    public void d(View view) {
    }

    public void e(m0 m0Var) {
    }

    public void r(C1993b[] c1993bArr) {
    }

    public void s(C1993b c1993b) {
    }

    public void t(m0 m0Var) {
    }

    public void u(C1993b c1993b) {
    }
}
