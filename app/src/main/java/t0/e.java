package t0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f16160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f16161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ e[] f16162q;

    static {
        e eVar = new e("VIEW_APPEAR", 0);
        f16160o = eVar;
        e eVar2 = new e("VIEW_DISAPPEAR", 1);
        f16161p = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f16162q = eVarArr;
        AbstractC1267a.u(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f16162q.clone();
    }
}
