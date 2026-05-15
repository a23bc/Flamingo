package Y4;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f8721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b[] f8722p;

    static {
        b bVar = new b("WARNING", 0);
        f8721o = bVar;
        b[] bVarArr = {bVar, new b("ERROR", 1), new b("HIDDEN", 2)};
        f8722p = bVarArr;
        AbstractC1267a.u(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8722p.clone();
    }
}
