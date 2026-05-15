package C2;

/* JADX INFO: renamed from: C2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0043o f1141d = new C0042n().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1144c;

    public C0043o(C0042n c0042n) {
        this.f1142a = c0042n.f1138a;
        this.f1143b = c0042n.f1139b;
        this.f1144c = c0042n.f1140c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0043o.class != obj.getClass()) {
            return false;
        }
        C0043o c0043o = (C0043o) obj;
        return this.f1142a == c0043o.f1142a && this.f1143b == c0043o.f1143b && this.f1144c == c0043o.f1144c;
    }

    public final int hashCode() {
        return ((this.f1142a ? 1 : 0) << 2) + ((this.f1143b ? 1 : 0) << 1) + (this.f1144c ? 1 : 0);
    }
}
