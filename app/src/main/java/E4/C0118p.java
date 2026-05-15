package E4;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: E4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118p extends Z implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D4.e f1971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z f1972p;

    public C0118p(D4.e eVar, Z z6) {
        this.f1971o = eVar;
        this.f1972p = z6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        D4.e eVar = this.f1971o;
        return this.f1972p.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0118p) {
            C0118p c0118p = (C0118p) obj;
            if (this.f1971o.equals(c0118p.f1971o) && this.f1972p.equals(c0118p.f1972p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1971o, this.f1972p});
    }

    public final String toString() {
        return this.f1972p + ".onResultOf(" + this.f1971o + ")";
    }
}
