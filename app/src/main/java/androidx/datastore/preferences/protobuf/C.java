package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C extends D {
    @Override // androidx.datastore.preferences.protobuf.D
    public final void a(long j3, Object obj) {
        ((AbstractC0529b) ((InterfaceC0547u) o0.f9505d.i(j3, obj))).f9442o = false;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void b(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2, long j3) {
        n0 n0Var = o0.f9505d;
        InterfaceC0547u interfaceC0547uF = (InterfaceC0547u) n0Var.i(j3, abstractC0546t);
        InterfaceC0547u interfaceC0547u = (InterfaceC0547u) n0Var.i(j3, abstractC0546t2);
        int size = interfaceC0547uF.size();
        int size2 = interfaceC0547u.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0529b) interfaceC0547uF).f9442o) {
                interfaceC0547uF = interfaceC0547uF.f(size2 + size);
            }
            interfaceC0547uF.addAll(interfaceC0547u);
        }
        if (size > 0) {
            interfaceC0547u = interfaceC0547uF;
        }
        o0.o(abstractC0546t, j3, interfaceC0547u);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List c(long j3, Object obj) {
        InterfaceC0547u interfaceC0547u = (InterfaceC0547u) o0.f9505d.i(j3, obj);
        if (((AbstractC0529b) interfaceC0547u).f9442o) {
            return interfaceC0547u;
        }
        int size = interfaceC0547u.size();
        InterfaceC0547u interfaceC0547uF = interfaceC0547u.f(size == 0 ? 10 : size * 2);
        o0.o(obj, j3, interfaceC0547uF);
        return interfaceC0547uF;
    }
}
