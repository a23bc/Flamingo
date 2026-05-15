package f4;

import A2.W;
import L2.C0247a;
import O0.C0318o;
import O0.InterfaceC0319p;
import android.graphics.drawable.Drawable;
import d5.EnumC0830a;
import e4.C0858g;
import e4.C0862k;
import e5.AbstractC0871i;
import m5.AbstractC1209k;
import p4.C1297c;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f12192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p f12194q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, c5.d dVar) {
        super(2, dVar);
        this.f12194q = pVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new j(this.f12194q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((p4.h) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f12193p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            p pVar2 = this.f12194q;
            C0862k c0862k = (C0862k) pVar2.f12209F.getValue();
            p4.h hVar = (p4.h) pVar2.f12208E.getValue();
            p4.g gVarA = p4.h.a(hVar);
            gVarA.f15028d = new C0247a(26, pVar2);
            gVarA.f15044v = null;
            gVarA.f15045w = null;
            gVarA.f15046x = null;
            C1297c c1297c = hVar.f15051E;
            if (c1297c.f15015a == null) {
                gVarA.f15042t = new o(pVar2);
                gVarA.f15044v = null;
                gVarA.f15045w = null;
                gVarA.f15046x = null;
            }
            if (c1297c.f15016b == null) {
                InterfaceC0319p interfaceC0319p = pVar2.f12204A;
                int i8 = y.f12241b;
                gVarA.f15043u = AbstractC1209k.a(interfaceC0319p, C0318o.f5426b) ? true : AbstractC1209k.a(interfaceC0319p, C0318o.f5428d) ? q4.g.f15591p : q4.g.f15590o;
            }
            if (c1297c.f15018d != q4.d.f15585o) {
                gVarA.f15031g = q4.d.f15586p;
            }
            p4.h hVarA = gVarA.a();
            this.f12192o = pVar2;
            this.f12193p = 1;
            c0862k.getClass();
            Object objH = AbstractC1767D.h(new C0858g(null, c0862k, hVarA), this);
            if (objH == enumC0830a) {
                return enumC0830a;
            }
            pVar = pVar2;
            obj = objH;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f12192o;
            android.support.v4.media.session.b.K(obj);
        }
        p4.i iVar = (p4.i) obj;
        pVar.getClass();
        if (iVar instanceof p4.n) {
            p4.n nVar = (p4.n) iVar;
            return new h(pVar.j(nVar.f15092a), nVar);
        }
        if (!(iVar instanceof p4.d)) {
            throw new W();
        }
        Drawable drawable = ((p4.d) iVar).f15020a;
        return new f(drawable != null ? pVar.j(drawable) : null, (p4.d) iVar);
    }
}
