package B2;

import H2.A;
import java.util.Arrays;
import t2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f734g;
    public final A h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f736j;

    public a(long j3, h0 h0Var, int i7, A a4, long j7, h0 h0Var2, int i8, A a7, long j8, long j9) {
        this.f728a = j3;
        this.f729b = h0Var;
        this.f730c = i7;
        this.f731d = a4;
        this.f732e = j7;
        this.f733f = h0Var2;
        this.f734g = i8;
        this.h = a7;
        this.f735i = j8;
        this.f736j = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f728a == aVar.f728a && this.f730c == aVar.f730c && this.f732e == aVar.f732e && this.f734g == aVar.f734g && this.f735i == aVar.f735i && this.f736j == aVar.f736j && M3.a.L(this.f729b, aVar.f729b) && M3.a.L(this.f731d, aVar.f731d) && M3.a.L(this.f733f, aVar.f733f) && M3.a.L(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f728a), this.f729b, Integer.valueOf(this.f730c), this.f731d, Long.valueOf(this.f732e), this.f733f, Integer.valueOf(this.f734g), this.h, Long.valueOf(this.f735i), Long.valueOf(this.f736j)});
    }
}
