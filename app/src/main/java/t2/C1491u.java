package t2;

import android.net.Uri;

/* JADX INFO: renamed from: t2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1491u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16737b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16738a;

    static {
        int i7 = w2.t.f18881a;
        f16737b = Integer.toString(0, 36);
    }

    public C1491u(S s7) {
        this.f16738a = (Uri) s7.f16352a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1491u) || !this.f16738a.equals(((C1491u) obj).f16738a)) {
            return false;
        }
        int i7 = w2.t.f18881a;
        return true;
    }

    public final int hashCode() {
        return this.f16738a.hashCode() * 31;
    }
}
