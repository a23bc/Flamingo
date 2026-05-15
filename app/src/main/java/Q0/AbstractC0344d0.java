package Q0;

import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import r0.InterfaceC1396n;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: Q0.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0344d0 implements InterfaceC1396n {
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

    public abstract AbstractC1397o k();

    public abstract void m(AbstractC1397o abstractC1397o);
}
