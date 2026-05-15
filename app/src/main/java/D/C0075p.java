package D;

import O0.InterfaceC0298b0;
import f0.C0886f0;
import f0.C0894j0;
import l5.InterfaceC1182c;
import w.C1670c;

/* JADX INFO: renamed from: D.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0075p implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1363o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1369u;

    public /* synthetic */ C0075p(O0.m0 m0Var, O0.Y y6, InterfaceC0298b0 interfaceC0298b0, int i7, int i8, r rVar) {
        this.f1366r = m0Var;
        this.f1367s = y6;
        this.f1368t = interfaceC0298b0;
        this.f1364p = i7;
        this.f1365q = i8;
        this.f1369u = rVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        float fFloatValue;
        switch (this.f1363o) {
            case 0:
                AbstractC0074o.b((O0.l0) obj, (O0.m0) this.f1366r, (O0.Y) this.f1367s, ((InterfaceC0298b0) this.f1368t).getLayoutDirection(), this.f1364p, this.f1365q, ((r) this.f1369u).f1384a);
                break;
            default:
                C1670c c1670c = (C1670c) obj;
                if (((Boolean) ((C0894j0) this.f1366r).getValue()).booleanValue()) {
                    int i7 = this.f1365q;
                    int i8 = this.f1364p;
                    if (i8 == i7) {
                        float fFloatValue2 = ((Number) c1670c.e()).floatValue();
                        Float f7 = (Float) ((p0.s) this.f1368t).get(Integer.valueOf(i8));
                        if (f7 != null) {
                            fFloatValue = f7.floatValue();
                        } else {
                            fFloatValue = ((Number) ((InterfaceC1182c) this.f1369u).b(Integer.valueOf(i8))).floatValue();
                        }
                        ((C0886f0) this.f1367s).j(fFloatValue2 - fFloatValue);
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0075p(C0894j0 c0894j0, int i7, int i8, C0886f0 c0886f0, p0.s sVar, InterfaceC1182c interfaceC1182c) {
        this.f1366r = c0894j0;
        this.f1364p = i7;
        this.f1365q = i8;
        this.f1367s = c0886f0;
        this.f1368t = sVar;
        this.f1369u = interfaceC1182c;
    }
}
