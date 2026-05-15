package Y4;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Enum {

    /* JADX INFO: renamed from: o */
    public static final f f8723o;

    /* JADX INFO: renamed from: p */
    public static final f f8724p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ f[] f8725q;

    static {
        f fVar = new f("SYNCHRONIZED", 0);
        f fVar2 = new f("PUBLICATION", 1);
        f8723o = fVar2;
        f fVar3 = new f("NONE", 2);
        f8724p = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f8725q = fVarArr;
        AbstractC1267a.u(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f8725q.clone();
    }
}
