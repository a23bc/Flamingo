package Q0;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class I extends Enum {

    /* JADX INFO: renamed from: o */
    public static final I f5794o;

    /* JADX INFO: renamed from: p */
    public static final I f5795p;

    /* JADX INFO: renamed from: q */
    public static final I f5796q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ I[] f5797r;

    static {
        I i7 = new I("InMeasureBlock", 0);
        f5794o = i7;
        I i8 = new I("InLayoutBlock", 1);
        f5795p = i8;
        I i9 = new I("NotUsed", 2);
        f5796q = i9;
        I[] iArr = {i7, i8, i9};
        f5797r = iArr;
        AbstractC1267a.u(iArr);
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f5797r.clone();
    }
}
