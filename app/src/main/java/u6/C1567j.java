package u6;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: u6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1567j implements O0.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17685a;

    public C1567j(boolean z6) {
        this.f17685a = z6;
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // O0.j0
    public final Object i(n1.d dVar) {
        AbstractC1209k.f(dVar, "<this>");
        return new C1569l(this.f17685a);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }
}
