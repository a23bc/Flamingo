package p4;

import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.InterfaceC0583f;
import androidx.lifecycle.InterfaceC0596t;
import androidx.lifecycle.K;

/* JADX INFO: loaded from: classes.dex */
public final class f extends K {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f15023e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f15024f = new e();

    @Override // androidx.lifecycle.K
    public final void a(InterfaceC0596t interfaceC0596t) {
        if (!(interfaceC0596t instanceof InterfaceC0583f)) {
            throw new IllegalArgumentException((interfaceC0596t + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC0583f interfaceC0583f = (InterfaceC0583f) interfaceC0596t;
        e eVar = f15024f;
        interfaceC0583f.d(eVar);
        interfaceC0583f.i(eVar);
        interfaceC0583f.b(eVar);
    }

    @Override // androidx.lifecycle.K
    public final EnumC0593p i() {
        return EnumC0593p.f9749s;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.K
    public final void l(InterfaceC0596t interfaceC0596t) {
    }
}
