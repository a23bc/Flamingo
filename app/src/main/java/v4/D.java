package V4;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final D f7454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final D f7455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ D[] f7456q;

    static {
        D d4 = new D("THUMB", 0);
        f7454o = d4;
        D d7 = new D("TRACK", 1);
        f7455p = d7;
        D[] dArr = {d4, d7};
        f7456q = dArr;
        AbstractC1267a.u(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f7456q.clone();
    }
}
