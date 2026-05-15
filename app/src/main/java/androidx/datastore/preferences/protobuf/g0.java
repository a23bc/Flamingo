package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static boolean a(Object obj, C0535h c0535h) throws C0550x {
        int iG = c0535h.g();
        int i7 = iG >>> 3;
        int i8 = iG & 7;
        if (i8 == 0) {
            ((f0) obj).c(i7 << 3, Long.valueOf(c0535h.L()));
            return true;
        }
        if (i8 == 1) {
            ((f0) obj).c((i7 << 3) | 1, Long.valueOf(c0535h.A()));
            return true;
        }
        if (i8 == 2) {
            ((f0) obj).c((i7 << 3) | 2, c0535h.m());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw C0550x.b();
            }
            ((f0) obj).c((i7 << 3) | 5, Integer.valueOf(c0535h.x()));
            return true;
        }
        f0 f0VarB = f0.b();
        int i9 = i7 << 3;
        int i10 = i9 | 4;
        while (c0535h.d() != Integer.MAX_VALUE && a(f0VarB, c0535h)) {
        }
        if (i10 != c0535h.g()) {
            throw new C0550x("Protocol message end-group tag did not match expected tag.");
        }
        f0VarB.f9468e = false;
        ((f0) obj).c(i9 | 3, f0VarB);
        return true;
    }

    public static f0 b() {
        return f0.b();
    }
}
