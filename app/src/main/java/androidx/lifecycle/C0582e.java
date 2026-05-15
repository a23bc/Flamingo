package androidx.lifecycle;

import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0582e implements InterfaceC0595s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f9739p;

    public /* synthetic */ C0582e(int i7, Object obj) {
        this.f9738o = i7;
        this.f9739p = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        switch (this.f9738o) {
            case 0:
                new HashMap();
                InterfaceC0587j[] interfaceC0587jArr = (InterfaceC0587j[]) this.f9739p;
                if (interfaceC0587jArr.length > 0) {
                    InterfaceC0587j interfaceC0587j = interfaceC0587jArr[0];
                    throw null;
                }
                if (interfaceC0587jArr.length <= 0) {
                    return;
                }
                InterfaceC0587j interfaceC0587j2 = interfaceC0587jArr[0];
                throw null;
            default:
                if (enumC0592o == EnumC0592o.ON_CREATE) {
                    interfaceC0597u.h().l(this);
                    ((L) this.f9739p).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0592o).toString());
                }
        }
    }
}
