package c6;

import A2.F;
import A2.RunnableC0022x;
import A2.d0;
import B2.h;
import C1.k;
import I4.E;
import I4.q;
import I4.y;
import L2.C0247a;
import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import java.util.List;
import m5.AbstractC1209k;
import t2.V;
import w2.g;
import w2.t;
import w3.A0;
import w3.C1747r0;
import w3.C1749s0;
import w3.InterfaceC1728h0;
import w3.J0;
import w3.K0;
import w3.RunnableC1718d;
import w3.V0;
import w3.g1;
import w3.n1;
import w3.v1;
import w3.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1728h0, g, J0, q {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f10699o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f10700p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f10701q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f10702r;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i7) {
        this.f10699o = i7;
        this.f10700p = obj;
        this.f10701q = obj2;
        this.f10702r = obj3;
    }

    @Override // w3.InterfaceC1728h0
    public void a(k kVar) {
        F f7 = (F) this.f10700p;
        AbstractC1209k.f((C0247a) this.f10702r, "this$0");
        if (((CharSequence) this.f10701q) != null) {
            ((Notification) kVar.f960p).flags |= 16777216;
        }
        f7.a(kVar);
    }

    @Override // I4.q
    public y apply(Object obj) {
        Object obj2 = this.f10701q;
        Object obj3 = this.f10702r;
        Object obj4 = this.f10700p;
        switch (this.f10699o) {
            case 3:
                A0 a0 = (A0) obj4;
                Handler handler = a0.l;
                C1747r0 c1747r0 = (C1747r0) obj2;
                RunnableC0022x runnableC0022x = new RunnableC0022x(a0, c1747r0, new d0(a0, (V0) obj3, (C1749s0) obj, 14));
                z1 z1Var = new z1(0);
                int i7 = t.f18881a;
                E e7 = new E();
                t.G(handler, new d0(e7, runnableC0022x, z1Var, 9));
                return e7;
            default:
                List list = (List) obj;
                A0 a02 = (A0) obj4;
                Handler handler2 = a02.l;
                C1747r0 c1747r02 = (C1747r0) obj2;
                RunnableC0022x runnableC0022x2 = new RunnableC0022x(a02, c1747r02, new RunnableC1718d(a02, (g1) obj3, c1747r02, list, 5));
                z1 z1Var2 = new z1(0);
                int i8 = t.f18881a;
                E e8 = new E();
                t.G(handler2, new d0(e8, runnableC0022x2, z1Var2, 9));
                return e8;
        }
    }

    @Override // w2.g
    public void b(Object obj) {
        ((V) obj).C(((n1) ((h) this.f10700p).f749a).f19291c.f19418a, ((n1) ((h) this.f10701q).f749a).f19291c.f19418a, ((Integer) this.f10702r).intValue());
    }

    @Override // w3.J0
    public void f(C1747r0 c1747r0) {
        K0 k02 = (K0) this.f10700p;
        Bundle bundle = (Bundle) this.f10702r;
        if (bundle == null) {
            k02.getClass();
            bundle = Bundle.EMPTY;
        }
        k02.f19002g.l(c1747r0, (v1) this.f10701q, bundle);
    }
}
