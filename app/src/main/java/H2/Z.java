package H2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import t2.C1468A;
import t2.C1469B;
import t2.C1470C;
import t2.C1473b;
import t2.C1492v;
import t2.C1494x;
import t2.C1495y;
import t2.C1496z;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends t2.h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f3116j = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3119g;
    public final t2.G h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1468A f3120i;

    static {
        C1492v c1492v = new C1492v();
        C2.I i7 = new C2.I(2);
        List list = Collections.EMPTY_LIST;
        E4.b0 b0Var = E4.b0.f1913s;
        C1496z c1496z = new C1496z();
        C1470C c1470c = C1470C.f16192d;
        Uri uri = Uri.EMPTY;
        AbstractC1697a.i(((Uri) i7.f985e) == null || ((UUID) i7.f984d) != null);
        if (uri != null) {
            new C1469B(uri, null, ((UUID) i7.f984d) != null ? new C1495y(i7) : null, null, list, null, b0Var, -9223372036854775807L);
        }
        new C1494x(c1492v);
        new C1468A(c1496z);
        t2.J j3 = t2.J.f16263J;
    }

    public Z(long j3, boolean z6, boolean z7, t2.G g6) {
        C1468A c1468a = z7 ? g6.f16225c : null;
        this.f3117e = j3;
        this.f3118f = j3;
        this.f3119g = z6;
        g6.getClass();
        this.h = g6;
        this.f3120i = c1468a;
    }

    @Override // t2.h0
    public final int b(Object obj) {
        return f3116j.equals(obj) ? 0 : -1;
    }

    @Override // t2.h0
    public final t2.e0 f(int i7, t2.e0 e0Var, boolean z6) {
        AbstractC1697a.f(i7, 1);
        Object obj = z6 ? f3116j : null;
        e0Var.getClass();
        e0Var.i(null, obj, 0, this.f3117e, 0L, C1473b.f16398f, false);
        return e0Var;
    }

    @Override // t2.h0
    public final int h() {
        return 1;
    }

    @Override // t2.h0
    public final Object l(int i7) {
        AbstractC1697a.f(i7, 1);
        return f3116j;
    }

    @Override // t2.h0
    public final t2.g0 m(int i7, t2.g0 g0Var, long j3) {
        AbstractC1697a.f(i7, 1);
        g0Var.b(t2.g0.f16443p, this.h, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f3119g, false, this.f3120i, 0L, this.f3118f, 0, 0, 0L);
        return g0Var;
    }

    @Override // t2.h0
    public final int o() {
        return 1;
    }
}
