package f4;

import O0.InterfaceC0319p;
import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;
import v.C1606c;
import w.InterfaceC1652A;
import w.j0;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f12179p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f12180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12185v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC1398p interfaceC1398p, p pVar, String str, InterfaceC0319p interfaceC0319p, C1980m c1980m, int i7) {
        super(2);
        this.f12180q = interfaceC1398p;
        this.f12182s = pVar;
        this.f12183t = str;
        this.f12184u = interfaceC0319p;
        this.f12185v = c1980m;
        this.f12181r = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12179p) {
            case 0:
                ((Number) obj2).intValue();
                int iB = C0879c.B(this.f12181r | 1);
                p pVar = (p) this.f12182s;
                InterfaceC0319p interfaceC0319p = (InterfaceC0319p) this.f12184u;
                r.c(this.f12180q, pVar, (String) this.f12183t, interfaceC0319p, (C1980m) this.f12185v, (C0912t) obj, iB);
                break;
            default:
                ((Number) obj2).intValue();
                int iB2 = C0879c.B(this.f12181r | 1);
                n0.d dVar = (n0.d) this.f12185v;
                i6.g.b((j0) this.f12182s, this.f12180q, (InterfaceC1652A) this.f12183t, (C1606c) this.f12184u, dVar, (C0912t) obj, iB2);
                break;
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j0 j0Var, InterfaceC1398p interfaceC1398p, InterfaceC1652A interfaceC1652A, C1606c c1606c, n0.d dVar, int i7) {
        super(2);
        this.f12182s = j0Var;
        this.f12180q = interfaceC1398p;
        this.f12183t = interfaceC1652A;
        this.f12184u = c1606c;
        this.f12185v = dVar;
        this.f12181r = i7;
    }
}
