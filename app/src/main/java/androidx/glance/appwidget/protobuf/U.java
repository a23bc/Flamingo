package androidx.glance.appwidget.protobuf;

import androidx.datastore.preferences.protobuf.C0535h;

/* JADX INFO: loaded from: classes.dex */
public final class U {
    public static T a(Object obj) {
        r rVar = (r) obj;
        T t7 = rVar.unknownFields;
        if (t7 != T.f9594f) {
            return t7;
        }
        T t8 = new T(0, new int[8], new Object[8], true);
        rVar.unknownFields = t8;
        return t8;
    }

    public static boolean b(int i7, C0535h c0535h, Object obj) throws C0574w {
        int i8 = c0535h.f9479b;
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        G1.P p7 = (G1.P) c0535h.f9482e;
        if (i10 == 0) {
            c0535h.p0(0);
            ((T) obj).c(i9 << 3, Long.valueOf(p7.s()));
            return true;
        }
        if (i10 == 1) {
            c0535h.p0(1);
            ((T) obj).c((i9 << 3) | 1, Long.valueOf(p7.p()));
            return true;
        }
        if (i10 == 2) {
            ((T) obj).c((i9 << 3) | 2, c0535h.n());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw C0574w.b();
            }
            c0535h.p0(5);
            ((T) obj).c(5 | (i9 << 3), Integer.valueOf(p7.o()));
            return true;
        }
        T t7 = new T(0, new int[8], new Object[8], true);
        int i11 = i9 << 3;
        int i12 = i11 | 4;
        int i13 = i7 + 1;
        if (i13 >= 100) {
            throw new C0574w("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0535h.d() != Integer.MAX_VALUE && b(i13, c0535h, t7)) {
        }
        if (i12 != c0535h.f9479b) {
            throw new C0574w("Protocol message end-group tag did not match expected tag.");
        }
        if (t7.f9599e) {
            t7.f9599e = false;
        }
        ((T) obj).c(i11 | 3, t7);
        return true;
    }
}
