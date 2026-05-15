package D;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final N f1254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ N[] f1255p;

    static {
        N n7 = new N("Visible", 0);
        N n8 = new N("Clip", 1);
        f1254o = n8;
        N[] nArr = {n7, n8, new N("ExpandIndicator", 2), new N("ExpandOrCollapseIndicator", 3)};
        f1255p = nArr;
        AbstractC1267a.u(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f1255p.clone();
    }
}
