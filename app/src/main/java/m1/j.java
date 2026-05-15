package m1;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f14341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f14342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ j[] f14343q;

    static {
        j jVar = new j("Ltr", 0);
        f14341o = jVar;
        j jVar2 = new j("Rtl", 1);
        f14342p = jVar2;
        j[] jVarArr = {jVar, jVar2};
        f14343q = jVarArr;
        AbstractC1267a.u(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f14343q.clone();
    }
}
