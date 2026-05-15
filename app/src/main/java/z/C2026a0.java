package z;

import x0.C1892b;

/* JADX INFO: renamed from: z.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2026a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20775c;

    public C2026a0(long j3, long j7, boolean z6) {
        this.f20773a = j3;
        this.f20774b = j7;
        this.f20775c = z6;
    }

    public final C2026a0 a(C2026a0 c2026a0) {
        return new C2026a0(C1892b.h(this.f20773a, c2026a0.f20773a), Math.max(this.f20774b, c2026a0.f20774b), this.f20775c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2026a0)) {
            return false;
        }
        C2026a0 c2026a0 = (C2026a0) obj;
        return C1892b.b(this.f20773a, c2026a0.f20773a) && this.f20774b == c2026a0.f20774b && this.f20775c == c2026a0.f20775c;
    }

    public final int hashCode() {
        int iF = C1892b.f(this.f20773a) * 31;
        long j3 = this.f20774b;
        return ((iF + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f20775c ? 1231 : 1237);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) C1892b.j(this.f20773a)) + ", timeMillis=" + this.f20774b + ", shouldApplyImmediately=" + this.f20775c + ')';
    }
}
