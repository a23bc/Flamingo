package j6;

import D.AbstractC0060d;
import F.C0130c;
import f0.C0912t;
import m5.AbstractC1209k;
import r0.C1395m;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f13756p = new j(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f13757q = new j(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f13758r = new j(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13759o;

    public /* synthetic */ j(int i7) {
        this.f13759o = i7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f13759o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    i.a(null, c0912t, 0);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    i.a(null, c0912t2, 0);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue3 & 17) == 16 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    AbstractC0060d.d(c0912t3, i6.h.E(C1395m.f15634a, 134));
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
