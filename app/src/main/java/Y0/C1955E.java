package y0;

import m5.AbstractC1209k;
import x0.C1893c;

/* JADX INFO: renamed from: y0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1955E extends AbstractC1959I {

    /* JADX INFO: renamed from: e */
    public final C1893c f20176e;

    public C1955E(C1893c c1893c) {
        this.f20176e = c1893c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1955E) {
            return AbstractC1209k.a(this.f20176e, ((C1955E) obj).f20176e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20176e.hashCode();
    }

    @Override // y0.AbstractC1959I
    public final C1893c m() {
        return this.f20176e;
    }
}
