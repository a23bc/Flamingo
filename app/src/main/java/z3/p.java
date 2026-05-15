package z3;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r0.InterfaceC1386d;
import r0.InterfaceC1398p;
import y3.x;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f21162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f21163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y3.u f21164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f21165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1386d f21166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f21167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f21168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f21169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f21170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f21171y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, y3.u uVar, InterfaceC1398p interfaceC1398p, InterfaceC1386d interfaceC1386d, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC1182c interfaceC1182c3, InterfaceC1182c interfaceC1182c4, int i7, int i8) {
        super(2);
        this.f21162p = i8;
        this.f21163q = xVar;
        this.f21164r = uVar;
        this.f21165s = interfaceC1398p;
        this.f21166t = interfaceC1386d;
        this.f21167u = interfaceC1182c;
        this.f21168v = interfaceC1182c2;
        this.f21169w = interfaceC1182c3;
        this.f21170x = interfaceC1182c4;
        this.f21171y = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21162p) {
            case 0:
                ((Number) obj2).intValue();
                int iB = C0879c.B(this.f21171y | 1);
                InterfaceC1182c interfaceC1182c = this.f21167u;
                InterfaceC1182c interfaceC1182c2 = this.f21168v;
                u.b(this.f21163q, this.f21164r, this.f21165s, this.f21166t, interfaceC1182c, interfaceC1182c2, this.f21169w, this.f21170x, (C0912t) obj, iB);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iB2 = C0879c.B(this.f21171y | 1);
                InterfaceC1182c interfaceC1182c3 = this.f21167u;
                InterfaceC1182c interfaceC1182c4 = this.f21168v;
                u.b(this.f21163q, this.f21164r, this.f21165s, this.f21166t, interfaceC1182c3, interfaceC1182c4, this.f21169w, this.f21170x, (C0912t) obj, iB2);
                break;
            default:
                ((Number) obj2).intValue();
                int iB3 = C0879c.B(this.f21171y | 1);
                InterfaceC1182c interfaceC1182c5 = this.f21167u;
                InterfaceC1182c interfaceC1182c6 = this.f21168v;
                u.b(this.f21163q, this.f21164r, this.f21165s, this.f21166t, interfaceC1182c5, interfaceC1182c6, this.f21169w, this.f21170x, (C0912t) obj, iB3);
                break;
        }
        return Y4.o.f8736a;
    }
}
