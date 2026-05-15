package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: u6.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1579w extends AbstractC0871i implements l5.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0894j0 f17900A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f17901B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ float f17902C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f17903D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f17904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ float f17905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f17906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G f17907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f17910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f17911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p0.s f17914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p0.s f17915z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579w(G g6, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a, C0886f0 c0886f0, InterfaceC1765B interfaceC1765B, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, p0.s sVar, p0.s sVar2, C0894j0 c0894j0, C0888g0 c0888g0, float f7, int i7, c5.d dVar) {
        super(4, dVar);
        this.f17907r = g6;
        this.f17908s = interfaceC1182c;
        this.f17909t = interfaceC1180a;
        this.f17910u = c0886f0;
        this.f17911v = interfaceC1765B;
        this.f17912w = interfaceC0878b0;
        this.f17913x = interfaceC0878b02;
        this.f17914y = sVar;
        this.f17915z = sVar2;
        this.f17900A = c0894j0;
        this.f17901B = c0888g0;
        this.f17902C = f7;
        this.f17903D = i7;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        float fFloatValue = ((Number) obj2).floatValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        G g6 = this.f17907r;
        float f7 = this.f17902C;
        int i7 = this.f17903D;
        C1579w c1579w = new C1579w(g6, this.f17908s, this.f17909t, this.f17910u, this.f17911v, this.f17912w, this.f17913x, this.f17914y, this.f17915z, this.f17900A, this.f17901B, f7, i7, (c5.d) obj4);
        c1579w.f17904o = iIntValue;
        c1579w.f17905p = fFloatValue;
        c1579w.f17906q = zBooleanValue;
        Y4.o oVar = Y4.o.f8736a;
        c1579w.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        int i7 = this.f17904o;
        float f7 = this.f17905p;
        boolean z6 = this.f17906q;
        InterfaceC0878b0 interfaceC0878b0 = this.f17912w;
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) interfaceC0878b0.getValue();
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(null);
        }
        InterfaceC1786g0 interfaceC1786g02 = (InterfaceC1786g0) this.f17913x.getValue();
        if (interfaceC1786g02 != null) {
            interfaceC1786g02.c(null);
        }
        this.f17907r.f17398d.setValue(Boolean.FALSE);
        float f8 = (-((Number) this.f17908s.b(new Integer(i7))).floatValue()) + f7;
        Y4.h hVar = (Y4.h) this.f17909t.a();
        float fP = i6.h.p(f8, ((Number) hVar.f8726o).floatValue(), ((Number) hVar.f8727p).floatValue());
        Y4.o oVar = Y4.o.f8736a;
        InterfaceC1765B interfaceC1765B = this.f17911v;
        if (z6) {
            this.f17910u.j(fP);
            AbstractC1767D.t(interfaceC1765B, null, new C1576t(this.f17914y, this.f17915z, null), 3);
            return oVar;
        }
        interfaceC0878b0.setValue(AbstractC1767D.t(interfaceC1765B, null, new C1578v(this.f17900A, this.f17901B, this.f17902C, i7, this.f17903D, this.f17915z, this.f17914y, fP, this.f17908s, this.f17910u, null), 3));
        return oVar;
    }
}
