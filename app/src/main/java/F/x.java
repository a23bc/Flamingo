package F;

import l5.InterfaceC1182c;
import r0.InterfaceC1396n;
import r0.InterfaceC1398p;
import z.I0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC1396n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0 f2160b;

    public /* synthetic */ x(I0 i02, int i7) {
        this.f2159a = i7;
        this.f2160b = i02;
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        switch (this.f2159a) {
        }
        return eVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        int i7 = this.f2159a;
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        switch (this.f2159a) {
        }
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }
}
