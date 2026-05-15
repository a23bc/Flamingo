package q4;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f15585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f15586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f15587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d[] f15588r;

    static {
        d dVar = new d("EXACT", 0);
        f15585o = dVar;
        d dVar2 = new d("INEXACT", 1);
        f15586p = dVar2;
        d dVar3 = new d("AUTOMATIC", 2);
        f15587q = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        f15588r = dVarArr;
        AbstractC1267a.u(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15588r.clone();
    }
}
