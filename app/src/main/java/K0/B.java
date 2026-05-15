package K0;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1396n;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC1396n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C f3820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f3821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U3.h f3823d;

    public B() {
        U3.h hVar = new U3.h();
        hVar.f7045r = this;
        hVar.f7043p = z.f3936o;
        this.f3823d = hVar;
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    public final InterfaceC1182c k() {
        C c7 = this.f3820a;
        if (c7 != null) {
            return c7;
        }
        AbstractC1209k.m("onTouchEvent");
        throw null;
    }
}
