package v6;

import D.AbstractC0060d;
import f0.C0912t;
import m5.AbstractC1209k;
import r0.C1395m;
import v.InterfaceC1626w;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: renamed from: v6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1647a implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1647a f18343p = new C1647a(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1647a f18344q = new C1647a(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18345o;

    public /* synthetic */ C1647a(int i7) {
        this.f18345o = i7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f18345o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((G.j) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    AbstractC0060d.d(c0912t, i6.h.E(C1395m.f15634a, 134));
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj2;
                ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
                AbstractC0060d.d(c0912t2, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 0.12f), 1), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t2), AbstractC1959I.f20180a));
                break;
        }
        return Y4.o.f8736a;
    }
}
