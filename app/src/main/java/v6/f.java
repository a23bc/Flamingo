package v6;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f18362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f18363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f[] f18364q;

    static {
        f fVar = new f("Main", 0);
        f18362o = fVar;
        f fVar2 = new f("Secondary", 1);
        f18363p = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f18364q = fVarArr;
        AbstractC1267a.u(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f18364q.clone();
    }
}
