package X;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import w.C1670c;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7879o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f7880p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(Object obj, c5.d dVar, int i7) {
        super(1, dVar);
        this.f7879o = i7;
        this.f7880p = obj;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        c5.d dVar = (c5.d) obj;
        switch (this.f7879o) {
            case 0:
                B0 b0 = new B0((K0) this.f7880p, dVar, 0);
                Y4.o oVar = Y4.o.f8736a;
                b0.invokeSuspend(oVar);
                return oVar;
            case 1:
                B0 b02 = new B0((K0) this.f7880p, dVar, 1);
                Y4.o oVar2 = Y4.o.f8736a;
                b02.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                B0 b03 = new B0((K0) this.f7880p, dVar, 2);
                Y4.o oVar3 = Y4.o.f8736a;
                b03.invokeSuspend(oVar3);
                return oVar3;
            case 3:
                B0 b04 = new B0((K0) this.f7880p, dVar, 3);
                Y4.o oVar4 = Y4.o.f8736a;
                b04.invokeSuspend(oVar4);
                return oVar4;
            default:
                B0 b05 = new B0((C1670c) this.f7880p, dVar, 4);
                Y4.o oVar5 = Y4.o.f8736a;
                b05.invokeSuspend(oVar5);
                return oVar5;
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj2 = this.f7880p;
        switch (this.f7879o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                ((K0) obj2).f7938A = false;
                break;
            case 1:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                ((K0) obj2).f();
                break;
            case 2:
                EnumC0830a enumC0830a3 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                K0 k02 = (K0) obj2;
                k02.d(k02.f7938A);
                break;
            case 3:
                EnumC0830a enumC0830a4 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                ((K0) obj2).o();
                break;
            default:
                EnumC0830a enumC0830a5 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                C1670c.a((C1670c) obj2);
                break;
        }
        return oVar;
    }
}
