package f0;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends Enum {

    /* JADX INFO: renamed from: o */
    public static final Q f11732o;

    /* JADX INFO: renamed from: p */
    public static final Q f11733p;

    /* JADX INFO: renamed from: q */
    public static final Q f11734q;

    /* JADX INFO: renamed from: r */
    public static final Q f11735r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ Q[] f11736s;

    static {
        Q q7 = new Q("IGNORED", 0);
        f11732o = q7;
        Q q8 = new Q("SCHEDULED", 1);
        f11733p = q8;
        Q q9 = new Q("DEFERRED", 2);
        f11734q = q9;
        Q q10 = new Q("IMMINENT", 3);
        f11735r = q10;
        Q[] qArr = {q7, q8, q9, q10};
        f11736s = qArr;
        AbstractC1267a.u(qArr);
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) f11736s.clone();
    }
}
