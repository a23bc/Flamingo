package G1;

import o5.AbstractC1267a;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f2698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1993b[] f2699b;

    public d0() {
        this(new m0((m0) null));
    }

    public final void a() {
        C1993b[] c1993bArr = this.f2699b;
        if (c1993bArr != null) {
            C1993b c1993bG = c1993bArr[0];
            C1993b c1993bG2 = c1993bArr[1];
            m0 m0Var = this.f2698a;
            if (c1993bG2 == null) {
                c1993bG2 = m0Var.f2725a.g(2);
            }
            if (c1993bG == null) {
                c1993bG = m0Var.f2725a.g(1);
            }
            g(C1993b.a(c1993bG, c1993bG2));
            C1993b c1993b = this.f2699b[AbstractC1267a.y(16)];
            if (c1993b != null) {
                f(c1993b);
            }
            C1993b c1993b2 = this.f2699b[AbstractC1267a.y(32)];
            if (c1993b2 != null) {
                d(c1993b2);
            }
            C1993b c1993b3 = this.f2699b[AbstractC1267a.y(64)];
            if (c1993b3 != null) {
                h(c1993b3);
            }
        }
    }

    public abstract m0 b();

    public void c(int i7, C1993b c1993b) {
        if (this.f2699b == null) {
            this.f2699b = new C1993b[9];
        }
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                this.f2699b[AbstractC1267a.y(i8)] = c1993b;
            }
        }
    }

    public abstract void e(C1993b c1993b);

    public abstract void g(C1993b c1993b);

    public d0(m0 m0Var) {
        this.f2698a = m0Var;
    }

    public void d(C1993b c1993b) {
    }

    public void f(C1993b c1993b) {
    }

    public void h(C1993b c1993b) {
    }
}
