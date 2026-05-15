package V4;

import K0.C0245m;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1210l implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f7582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G f7583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B.k f7584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f7586t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y4.e f7587u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7588v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z6, G g6, B.k kVar, int i7, boolean z7, Y4.e eVar, InterfaceC0878b0 interfaceC0878b0) {
        super(3);
        this.f7582p = z6;
        this.f7583q = g6;
        this.f7584r = kVar;
        this.f7585s = i7;
        this.f7586t = z7;
        this.f7587u = eVar;
        this.f7588v = interfaceC0878b0;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1398p interfaceC1398pF = (InterfaceC1398p) obj;
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f(interfaceC1398pF, "$this$composed");
        c0912t.Y(984032592);
        if (this.f7582p) {
            c0912t.Y(773894976);
            c0912t.Y(-492369756);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                f0.C c7 = new f0.C(C0879c.l(c0912t));
                c0912t.i0(c7);
                objK = c7;
            }
            c0912t.p(false);
            InterfaceC1765B interfaceC1765B = ((f0.C) objK).f11644o;
            c0912t.p(false);
            Integer numValueOf = Integer.valueOf(this.f7585s);
            Boolean boolValueOf = Boolean.valueOf(this.f7586t);
            G g6 = this.f7583q;
            Object[] objArr = {g6, this.f7584r, numValueOf, boolValueOf};
            v vVar = new v(this.f7586t, this.f7585s, interfaceC1765B, g6, this.f7587u, this.f7588v, null);
            C0245m c0245m = K0.H.f3830a;
            interfaceC1398pF = interfaceC1398pF.f(new SuspendPointerInputElement(null, null, objArr, new K0.G(vVar), 3));
        }
        c0912t.p(false);
        return interfaceC1398pF;
    }
}
