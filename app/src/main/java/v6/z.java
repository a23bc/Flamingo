package v6;

import D.AbstractC0060d;
import F.C0130c;
import f0.C0912t;
import m5.AbstractC1209k;
import r0.C1395m;

/* JADX INFO: loaded from: classes.dex */
public final class z implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f18504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f18505p;

    public z(float f7, boolean z6) {
        this.f18504o = z6;
        this.f18505p = f7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC1209k.f((C0130c) obj, "$this$item");
        if ((iIntValue & 17) == 16 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            if (this.f18504o) {
                c0912t.X(1822960520);
                AbstractC0060d.d(c0912t, i6.h.E(c1395m, 15));
                c0912t.p(false);
            } else {
                c0912t.X(1822852640);
                AbstractC0060d.d(c0912t, i6.h.E(c1395m, this.f18505p));
                c0912t.p(false);
            }
        }
        return Y4.o.f8736a;
    }
}
