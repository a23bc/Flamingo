package g4;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f12520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ j[] f12521p;

    static {
        j jVar = new j("IGNORE", 0);
        j jVar2 = new j("RESPECT_PERFORMANCE", 1);
        f12520o = jVar2;
        j[] jVarArr = {jVar, jVar2, new j("RESPECT_ALL", 2)};
        f12521p = jVarArr;
        AbstractC1267a.u(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f12521p.clone();
    }
}
