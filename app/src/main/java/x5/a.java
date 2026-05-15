package X5;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f8337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f8338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f8339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f8340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a[] f8341s;

    static {
        a aVar = new a("NORMAL", 0);
        f8337o = aVar;
        a aVar2 = new a("SONG_LIST", 1);
        f8338p = aVar2;
        a aVar3 = new a("SETTINGS", 2);
        f8339q = aVar3;
        a aVar4 = new a("PLAY_LIST", 3);
        f8340r = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f8341s = aVarArr;
        AbstractC1267a.u(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8341s.clone();
    }
}
