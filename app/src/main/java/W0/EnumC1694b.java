package w0;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: w0.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1694b extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC1694b f18770o;

    /* JADX INFO: renamed from: p */
    public static final EnumC1694b f18771p;

    /* JADX INFO: renamed from: q */
    public static final EnumC1694b f18772q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ EnumC1694b[] f18773r;

    static {
        EnumC1694b enumC1694b = new EnumC1694b("None", 0);
        f18770o = enumC1694b;
        EnumC1694b enumC1694b2 = new EnumC1694b("Cancelled", 1);
        f18771p = enumC1694b2;
        EnumC1694b enumC1694b3 = new EnumC1694b("Redirected", 2);
        f18772q = enumC1694b3;
        EnumC1694b[] enumC1694bArr = {enumC1694b, enumC1694b2, enumC1694b3, new EnumC1694b("RedirectCancelled", 3)};
        f18773r = enumC1694bArr;
        AbstractC1267a.u(enumC1694bArr);
    }

    public static EnumC1694b valueOf(String str) {
        return (EnumC1694b) Enum.valueOf(EnumC1694b.class, str);
    }

    public static EnumC1694b[] values() {
        return (EnumC1694b[]) f18773r.clone();
    }
}
