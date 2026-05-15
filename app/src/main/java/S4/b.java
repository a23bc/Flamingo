package S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f6753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f6754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ b[] f6755q;

    static {
        b bVar = new b("OnErrorDiscard", 0);
        f6753o = bVar;
        b bVar2 = new b("OnErrorRecover", 1);
        f6754p = bVar2;
        f6755q = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6755q.clone();
    }
}
