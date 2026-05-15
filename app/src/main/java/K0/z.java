package K0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z f3936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z f3937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z f3938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ z[] f3939r;

    static {
        z zVar = new z("Unknown", 0);
        f3936o = zVar;
        z zVar2 = new z("Dispatching", 1);
        f3937p = zVar2;
        z zVar3 = new z("NotDispatching", 2);
        f3938q = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        f3939r = zVarArr;
        AbstractC1267a.u(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f3939r.clone();
    }
}
