package u6;

import D.AbstractC0060d;
import f0.C0912t;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f17917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f17918q;

    public /* synthetic */ w0(float f7, int i7, boolean z6) {
        this.f17916o = i7;
        this.f17917p = z6;
        this.f17918q = f7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1398p interfaceC1398pC;
        InterfaceC1398p interfaceC1398pC2;
        switch (this.f17916o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    boolean z6 = this.f17917p;
                    float f7 = this.f17918q;
                    if (z6) {
                        c0912t.X(2082280644);
                        interfaceC1398pC = androidx.compose.foundation.layout.c.c(c1395m, f7 / 2);
                    } else {
                        c0912t.X(2082282730);
                        interfaceC1398pC = androidx.compose.foundation.layout.c.c(c1395m, f7 / 4);
                    }
                    AbstractC0060d.d(c0912t, interfaceC1398pC);
                    c0912t.p(false);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C1395m c1395m2 = C1395m.f15634a;
                    boolean z7 = this.f17917p;
                    float f8 = this.f17918q;
                    if (z7) {
                        c0912t2.X(2082433732);
                        interfaceC1398pC2 = androidx.compose.foundation.layout.c.c(c1395m2, f8 / 2);
                    } else {
                        c0912t2.X(2082435812);
                        interfaceC1398pC2 = androidx.compose.foundation.layout.c.c(c1395m2, f8);
                    }
                    AbstractC0060d.d(c0912t2, interfaceC1398pC2);
                    c0912t2.p(false);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
