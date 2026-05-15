package W3;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public final String f7791a;

    /* JADX INFO: renamed from: b */
    public final int f7792b;

    public d(String str, int i7) {
        this.f7791a = str;
        this.f7792b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7792b != dVar.f7792b) {
            return false;
        }
        return this.f7791a.equals(dVar.f7791a);
    }

    public final int hashCode() {
        return (this.f7791a.hashCode() * 31) + this.f7792b;
    }
}
