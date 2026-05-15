package N2;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f4963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f4964b;

    public A(C c7, C c8) {
        this.f4963a = c7;
        this.f4964b = c8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A.class == obj.getClass()) {
            A a4 = (A) obj;
            if (this.f4963a.equals(a4.f4963a) && this.f4964b.equals(a4.f4964b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4964b.hashCode() + (this.f4963a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C c7 = this.f4963a;
        sb.append(c7);
        C c8 = this.f4964b;
        if (c7.equals(c8)) {
            str = "";
        } else {
            str = ", " + c8;
        }
        return Z1.l.t(sb, str, "]");
    }
}
