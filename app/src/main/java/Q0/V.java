package Q0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final V f5894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final V f5895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final V f5896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ V[] f5897r;

    static {
        V v3 = new V("IsPlacedInLookahead", 0);
        f5894o = v3;
        V v7 = new V("IsPlacedInApproach", 1);
        f5895p = v7;
        V v8 = new V("IsNotPlaced", 2);
        f5896q = v8;
        V[] vArr = {v3, v7, v8};
        f5897r = vArr;
        AbstractC1267a.u(vArr);
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f5897r.clone();
    }
}
