package O0;

import f0.C0879c;
import f0.C0912t;
import k.AbstractC1113a;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f5448p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1398p f5449q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ l5.e f5450r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f5451s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(InterfaceC1398p interfaceC1398p, l5.e eVar, int i7, int i8) {
        super(2);
        this.f5448p = i8;
        this.f5449q = interfaceC1398p;
        this.f5450r = eVar;
        this.f5451s = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f5448p;
        C0912t c0912t = (C0912t) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                w0.c(this.f5449q, this.f5450r, c0912t, C0879c.B(this.f5451s | 1));
                break;
            default:
                AbstractC1113a.q(this.f5449q, this.f5450r, c0912t, C0879c.B(this.f5451s | 1));
                break;
        }
        return Y4.o.f8736a;
    }
}
