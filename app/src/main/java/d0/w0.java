package d0;

import f0.C0886f0;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r5.C1420a;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D0 f11163q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(D0 d02, int i7) {
        super(1);
        this.f11162p = i7;
        this.f11163q = d02;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) throws Exception {
        boolean z6;
        switch (this.f11162p) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                D0 d02 = this.f11163q;
                C1420a c1420a = d02.f10834b;
                float fP = i6.h.p(fFloatValue, c1420a.f15779a, c1420a.f15780b);
                C0886f0 c0886f0 = d02.f10835c;
                if (fP == c0886f0.h()) {
                    z6 = false;
                } else {
                    if (fP != c0886f0.h()) {
                        InterfaceC1182c interfaceC1182c = d02.f10836d;
                        if (interfaceC1182c != null) {
                            interfaceC1182c.b(Float.valueOf(fP));
                        } else {
                            d02.c(fP);
                        }
                    }
                    d02.f10833a.a();
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            default:
                long j3 = ((C1892b) obj).f19867a;
                D0 d03 = this.f11163q;
                d03.b(0.0f);
                d03.f10841j.a();
                return Y4.o.f8736a;
        }
    }
}
