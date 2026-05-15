package q0;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1352a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f15439a;

    public C1352a(i6.g gVar, Integer num) {
        this.f15439a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1352a)) {
            return false;
        }
        C1352a c1352a = (C1352a) obj;
        c1352a.getClass();
        return AbstractC1209k.a(null, null) && AbstractC1209k.a(this.f15439a, c1352a.f15439a);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f15439a + ')';
    }
}
