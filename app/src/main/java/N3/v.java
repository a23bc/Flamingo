package N3;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Enum {

    /* JADX INFO: renamed from: o */
    public static final v f5150o;

    /* JADX INFO: renamed from: p */
    public static final v f5151p;

    /* JADX INFO: renamed from: q */
    public static final v f5152q;

    /* JADX INFO: renamed from: r */
    public static final v f5153r;

    /* JADX INFO: renamed from: s */
    public static final v f5154s;

    /* JADX INFO: renamed from: t */
    public static final v f5155t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ v[] f5156u;

    static {
        v vVar = new v("ENQUEUED", 0);
        f5150o = vVar;
        v vVar2 = new v("RUNNING", 1);
        f5151p = vVar2;
        v vVar3 = new v("SUCCEEDED", 2);
        f5152q = vVar3;
        v vVar4 = new v("FAILED", 3);
        f5153r = vVar4;
        v vVar5 = new v("BLOCKED", 4);
        f5154s = vVar5;
        v vVar6 = new v("CANCELLED", 5);
        f5155t = vVar6;
        f5156u = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f5156u.clone();
    }

    public final boolean a() {
        return this == f5152q || this == f5153r || this == f5155t;
    }
}
