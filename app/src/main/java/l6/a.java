package l6;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f14252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f14253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a[] f14254q;

    static {
        a aVar = new a("Add", 0);
        f14252o = aVar;
        a aVar2 = new a("Favorite", 1);
        f14253p = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f14254q = aVarArr;
        AbstractC1267a.u(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14254q.clone();
    }
}
