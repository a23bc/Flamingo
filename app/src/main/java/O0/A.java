package O0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final A f5275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final A f5276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ A[] f5277q;

    static {
        A a4 = new A("Width", 0);
        f5275o = a4;
        A a7 = new A("Height", 1);
        f5276p = a7;
        A[] aArr = {a4, a7};
        f5277q = aArr;
        AbstractC1267a.u(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f5277q.clone();
    }
}
