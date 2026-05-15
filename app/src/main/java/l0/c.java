package L0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f4092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f4093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ c[] f4094q;

    static {
        c cVar = new c("Lsq2", 0);
        f4092o = cVar;
        c cVar2 = new c("Impulse", 1);
        f4093p = cVar2;
        c[] cVarArr = {cVar, cVar2};
        f4094q = cVarArr;
        AbstractC1267a.u(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f4094q.clone();
    }
}
