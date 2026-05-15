package w6;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Enum {

    /* JADX INFO: renamed from: q */
    public static final c f19591q;

    /* JADX INFO: renamed from: r */
    public static final c f19592r;

    /* JADX INFO: renamed from: s */
    public static final c f19593s;

    /* JADX INFO: renamed from: t */
    public static final c f19594t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ c[] f19595u;

    /* JADX INFO: renamed from: o */
    public final float f19596o;

    /* JADX INFO: renamed from: p */
    public final float f19597p;

    static {
        c cVar = new c("Large", 0, 30, 0.08f);
        f19591q = cVar;
        float f7 = 28;
        c cVar2 = new c("Medium", 1, f7, 0.08f);
        f19592r = cVar2;
        c cVar3 = new c("Small", 2, f7, 0.1f);
        f19593s = cVar3;
        c cVar4 = new c("Custom1", 3, 22, 0.05f);
        f19594t = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f19595u = cVarArr;
        AbstractC1267a.u(cVarArr);
    }

    public c(String str, int i7, float f7, float f8) {
        super(str, i7);
        this.f19596o = f7;
        this.f19597p = f8;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f19595u.clone();
    }
}
