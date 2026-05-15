package Y4;

import java.io.Serializable;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class p implements e, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1180a f8737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f8738p;

    @Override // Y4.e
    public final Object getValue() {
        if (this.f8738p == n.f8735a) {
            InterfaceC1180a interfaceC1180a = this.f8737o;
            AbstractC1209k.c(interfaceC1180a);
            this.f8738p = interfaceC1180a.a();
            this.f8737o = null;
        }
        return this.f8738p;
    }

    public final String toString() {
        return this.f8738p != n.f8735a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
