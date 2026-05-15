package M;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final N f4425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final N f4426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final N f4427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ N[] f4428r;

    static {
        N n7 = new N("None", 0);
        f4425o = n7;
        N n8 = new N("Selection", 1);
        f4426p = n8;
        N n9 = new N("Cursor", 2);
        f4427q = n9;
        N[] nArr = {n7, n8, n9};
        f4428r = nArr;
        AbstractC1267a.u(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f4428r.clone();
    }
}
