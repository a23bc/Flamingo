package Q0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final G f5787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final G f5788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final G f5789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G f5790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final G f5791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ G[] f5792t;

    static {
        G g6 = new G("Measuring", 0);
        f5787o = g6;
        G g7 = new G("LookaheadMeasuring", 1);
        f5788p = g7;
        G g8 = new G("LayingOut", 2);
        f5789q = g8;
        G g9 = new G("LookaheadLayingOut", 3);
        f5790r = g9;
        G g10 = new G("Idle", 4);
        f5791s = g10;
        G[] gArr = {g6, g7, g8, g9, g10};
        f5792t = gArr;
        AbstractC1267a.u(gArr);
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f5792t.clone();
    }
}
