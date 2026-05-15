package n0;

import Y4.o;
import f0.C0912t;
import m5.C1199a;
import n1.r;
import w5.AbstractC1767D;
import z.E0;
import z.H0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c extends C1199a implements l5.e {

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f14477v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i7, i8, cls, obj, str, str2);
        this.f14477v = i9;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14477v) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((d) this.f14411o).e(iIntValue, (C0912t) obj);
                break;
            default:
                long j3 = ((r) obj).f14529a;
                H0 h02 = (H0) this.f14411o;
                AbstractC1767D.t(h02.f20644P.e(), null, new E0(h02, j3, null), 3);
                break;
        }
        return o.f8736a;
    }
}
