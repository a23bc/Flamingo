package w;

import f0.C0879c;
import f0.C0912t;
import j5.AbstractC1107a;
import m5.AbstractC1210l;
import o0.C1249f;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f18682p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f18683q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f18684r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f18685s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, int i7, int i8) {
        super(2);
        this.f18682p = i8;
        this.f18684r = obj;
        this.f18685s = obj2;
        this.f18683q = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f18682p;
        C0912t c0912t = (C0912t) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                ((j0) this.f18684r).a(this.f18685s, c0912t, C0879c.B(this.f18683q | 1));
                break;
            default:
                int iB = C0879c.B(this.f18683q | 1);
                AbstractC1107a.h((C1249f) this.f18684r, (n0.d) this.f18685s, c0912t, iB);
                break;
        }
        return Y4.o.f8736a;
    }
}
