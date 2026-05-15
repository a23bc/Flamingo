package D;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final D f1213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final D f1214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final D f1215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ D[] f1216r;

    static {
        D d4 = new D("Vertical", 0);
        f1213o = d4;
        D d7 = new D("Horizontal", 1);
        f1214p = d7;
        D d8 = new D("Both", 2);
        f1215q = d8;
        D[] dArr = {d4, d7, d8};
        f1216r = dArr;
        AbstractC1267a.u(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f1216r.clone();
    }
}
