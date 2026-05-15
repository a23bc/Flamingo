package O0;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import o0.C1247d;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f5454p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1398p f5455q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f5456r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f5457s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Y4.c f5458t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj, InterfaceC1398p interfaceC1398p, Y4.c cVar, int i7, int i8) {
        super(2);
        this.f5454p = i8;
        this.f5457s = obj;
        this.f5455q = interfaceC1398p;
        this.f5458t = cVar;
        this.f5456r = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f5454p;
        C0912t c0912t = (C0912t) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                int iB = C0879c.B(this.f5456r | 1);
                w0.b((A0) this.f5457s, this.f5455q, (l5.e) this.f5458t, c0912t, iB);
                break;
            default:
                androidx.compose.ui.viewinterop.a.b((C1247d) this.f5457s, this.f5455q, (InterfaceC1182c) this.f5458t, c0912t, C0879c.B(this.f5456r | 1));
                break;
        }
        return Y4.o.f8736a;
    }
}
