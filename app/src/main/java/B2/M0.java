package b2;

import d2.EnumC0814b;
import l2.AbstractC1166f;
import l2.C1163c;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M0 f10098a = new M0();

    public final EnumC0814b a(AbstractC1166f abstractC1166f) {
        return abstractC1166f instanceof C1163c ? EnumC0814b.EXPAND : EnumC0814b.WRAP;
    }
}
