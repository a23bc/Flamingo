package b1;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z f10020o = new z();

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        if (AbstractC1209k.a(obj, Boolean.FALSE)) {
            return new C1987t(C1987t.f20262j);
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return new C1987t(AbstractC1959I.c(((Integer) obj).intValue()));
    }
}
