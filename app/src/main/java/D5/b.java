package D5;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Enum {

    /* JADX INFO: renamed from: o */
    public static final b f1600o;

    /* JADX INFO: renamed from: p */
    public static final b f1601p;

    /* JADX INFO: renamed from: q */
    public static final b f1602q;

    /* JADX INFO: renamed from: r */
    public static final b f1603r;

    /* JADX INFO: renamed from: s */
    public static final b f1604s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ b[] f1605t;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f1600o = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f1601p = bVar2;
        b bVar3 = new b("PARKING", 2);
        f1602q = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f1603r = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f1604s = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f1605t = bVarArr;
        AbstractC1267a.u(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1605t.clone();
    }
}
