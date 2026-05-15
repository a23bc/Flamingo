package S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f6747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f6748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f6749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f6750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f6751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f6752t;

    static {
        a aVar = new a("LevelDebug", 0);
        f6747o = aVar;
        a aVar2 = new a("LevelInfo", 1);
        f6748p = aVar2;
        a aVar3 = new a("LevelWarning", 2);
        f6749q = aVar3;
        a aVar4 = new a("LevelError", 3);
        f6750r = aVar4;
        a aVar5 = new a("LevelNone", 4);
        f6751s = aVar5;
        f6752t = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6752t.clone();
    }
}
