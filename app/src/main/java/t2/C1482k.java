package t2;

import androidx.datastore.preferences.protobuf.C0535h;

/* JADX INFO: renamed from: t2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1482k {

    /* JADX INFO: renamed from: e */
    public static final C1482k f16499e = new C0535h(0).b();

    /* JADX INFO: renamed from: f */
    public static final String f16500f;

    /* JADX INFO: renamed from: g */
    public static final String f16501g;
    public static final String h;

    /* JADX INFO: renamed from: i */
    public static final String f16502i;

    /* JADX INFO: renamed from: a */
    public final int f16503a;

    /* JADX INFO: renamed from: b */
    public final int f16504b;

    /* JADX INFO: renamed from: c */
    public final int f16505c;

    /* JADX INFO: renamed from: d */
    public final String f16506d;

    static {
        int i7 = w2.t.f18881a;
        f16500f = Integer.toString(0, 36);
        f16501g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16502i = Integer.toString(3, 36);
    }

    public C1482k(C0535h c0535h) {
        this.f16503a = c0535h.f9479b;
        this.f16504b = c0535h.f9480c;
        this.f16505c = c0535h.f9481d;
        this.f16506d = (String) c0535h.f9482e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1482k)) {
            return false;
        }
        C1482k c1482k = (C1482k) obj;
        return this.f16503a == c1482k.f16503a && this.f16504b == c1482k.f16504b && this.f16505c == c1482k.f16505c && w2.t.a(this.f16506d, c1482k.f16506d);
    }

    public final int hashCode() {
        int i7 = (((((527 + this.f16503a) * 31) + this.f16504b) * 31) + this.f16505c) * 31;
        String str = this.f16506d;
        return i7 + (str == null ? 0 : str.hashCode());
    }
}
