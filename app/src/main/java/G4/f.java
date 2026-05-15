package g4;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f12508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f12509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f12510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f12511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f[] f12512s;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        f12508o = fVar;
        f fVar2 = new f("MEMORY", 1);
        f12509p = fVar2;
        f fVar3 = new f("DISK", 2);
        f12510q = fVar3;
        f fVar4 = new f("NETWORK", 3);
        f12511r = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f12512s = fVarArr;
        AbstractC1267a.u(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f12512s.clone();
    }
}
