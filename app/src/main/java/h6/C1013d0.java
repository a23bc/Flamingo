package h6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0888g0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import w3.C1760y;

/* JADX INFO: renamed from: h6.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1013d0 extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f13016q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1013d0(InterfaceC0878b0 interfaceC0878b0, C0888g0 c0888g0, c5.d dVar, int i7) {
        super(1, dVar);
        this.f13014o = i7;
        this.f13015p = interfaceC0878b0;
        this.f13016q = c0888g0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        c5.d dVar = (c5.d) obj;
        switch (this.f13014o) {
            case 0:
                C1013d0 c1013d0 = new C1013d0(this.f13015p, this.f13016q, dVar, 0);
                Y4.o oVar = Y4.o.f8736a;
                c1013d0.invokeSuspend(oVar);
                return oVar;
            default:
                C1013d0 c1013d02 = new C1013d0(this.f13015p, this.f13016q, dVar, 1);
                Y4.o oVar2 = Y4.o.f8736a;
                c1013d02.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        C0888g0 c0888g0 = this.f13016q;
        InterfaceC0878b0 interfaceC0878b0 = this.f13015p;
        switch (this.f13014o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                b6.i iVar = b6.i.f10421a;
                C1760y c1760y = b6.i.f10423c;
                interfaceC0878b0.setValue(Boolean.valueOf(c1760y != null ? c1760y.r0() : false));
                C1760y c1760y2 = b6.i.f10423c;
                c0888g0.j(c1760y2 != null ? c1760y2.i() : 0);
                break;
            default:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                b6.i iVar2 = b6.i.f10421a;
                C1760y c1760y3 = b6.i.f10423c;
                interfaceC0878b0.setValue(Boolean.valueOf(c1760y3 != null ? c1760y3.r0() : false));
                C1760y c1760y4 = b6.i.f10423c;
                c0888g0.j(c1760y4 != null ? c1760y4.i() : 0);
                break;
        }
        return oVar;
    }
}
