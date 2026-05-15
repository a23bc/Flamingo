package Q0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l0 f6049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l0 f6050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ l0[] f6051q;

    static {
        l0 l0Var = new l0("Min", 0);
        f6049o = l0Var;
        l0 l0Var2 = new l0("Max", 1);
        f6050p = l0Var2;
        l0[] l0VarArr = {l0Var, l0Var2};
        f6051q = l0VarArr;
        AbstractC1267a.u(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f6051q.clone();
    }
}
