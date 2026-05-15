package u6;

/* JADX INFO: renamed from: u6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1569l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17735a;

    public C1569l(boolean z6) {
        this.f17735a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1569l) && this.f17735a == ((C1569l) obj).f17735a;
    }

    public final int hashCode() {
        return this.f17735a ? 1231 : 1237;
    }

    public final String toString() {
        return "SpaceMarker(isSpace=" + this.f17735a + ')';
    }
}
