package V4;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r5.C1420a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1420a f7553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f7554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f7555r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1420a c1420a, float f7, InterfaceC1182c interfaceC1182c) {
        super(1);
        this.f7553p = c1420a;
        this.f7554q = f7;
        this.f7555r = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean z6;
        float fFloatValue = ((Number) obj).floatValue();
        C1420a c1420a = this.f7553p;
        float fP = i6.h.p(fFloatValue, c1420a.f15779a, c1420a.f15780b);
        if (fP == this.f7554q) {
            z6 = false;
        } else {
            this.f7555r.b(Float.valueOf(fP));
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
