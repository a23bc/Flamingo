package l2;

import Z1.l;

/* JADX INFO: renamed from: l2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1168h {

    /* JADX INFO: renamed from: a */
    public final int f14167a;

    public C1168h(int i7) {
        this.f14167a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1168h) && this.f14167a == ((C1168h) obj).f14167a;
    }

    public final int hashCode() {
        return this.f14167a;
    }

    public final String toString() {
        return l.r(new StringBuilder("ResourceColorProvider(resId="), this.f14167a, ')');
    }
}
