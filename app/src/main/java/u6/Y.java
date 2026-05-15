package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.Z0;
import w.AbstractC1671d;
import w.C1658G;
import w.C1670c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f17546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f17547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1670c f17548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1658G f17549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1670c f17550t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z0 z02, C1670c c1670c, C1658G c1658g, C1670c c1670c2, c5.d dVar) {
        super(2, dVar);
        this.f17547q = z02;
        this.f17548r = c1670c;
        this.f17549s = c1658g;
        this.f17550t = c1670c2;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        Y y6 = new Y(this.f17547q, this.f17548r, this.f17549s, this.f17550t, dVar);
        y6.f17546p = obj;
        return y6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1765B interfaceC1765B;
        Y y6;
        InterfaceC1765B interfaceC1765B2;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17545o;
        C1670c c1670c = this.f17548r;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            interfaceC1765B = (InterfaceC1765B) this.f17546p;
            if (!((Boolean) this.f17547q.getValue()).booleanValue()) {
                return Y4.o.f8736a;
            }
            Object value = this.f17549s.f18518q.getValue();
            this.f17546p = interfaceC1765B;
            this.f17545o = 1;
            if (c1670c.g(this, value) == enumC0830a) {
            }
            return enumC0830a;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1765B2 = (InterfaceC1765B) this.f17546p;
            android.support.v4.media.session.b.K(obj);
            y6 = this;
            AbstractC1767D.t(interfaceC1765B2, null, new W(c1670c, null), 3);
            AbstractC1767D.t(interfaceC1765B2, null, new X(y6.f17550t, null), 3);
            return Y4.o.f8736a;
        }
        InterfaceC1765B interfaceC1765B3 = (InterfaceC1765B) this.f17546p;
        android.support.v4.media.session.b.K(obj);
        interfaceC1765B = interfaceC1765B3;
        Float f7 = new Float(1.3f);
        w.n0 n0VarL = AbstractC1671d.l((int) (1400 * 0.4f), 0, E0.f17383a, 2);
        this.f17546p = interfaceC1765B;
        this.f17545o = 2;
        y6 = this;
        if (C1670c.c(this.f17548r, f7, n0VarL, null, null, y6, 12) != enumC0830a) {
            interfaceC1765B2 = interfaceC1765B;
            AbstractC1767D.t(interfaceC1765B2, null, new W(c1670c, null), 3);
            AbstractC1767D.t(interfaceC1765B2, null, new X(y6.f17550t, null), 3);
            return Y4.o.f8736a;
        }
        return enumC0830a;
    }
}
