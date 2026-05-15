package Y4;

import java.io.Serializable;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1180a f8732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile Object f8733p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f8734q;

    public m(InterfaceC1180a interfaceC1180a) {
        AbstractC1209k.f(interfaceC1180a, "initializer");
        this.f8732o = interfaceC1180a;
        this.f8733p = n.f8735a;
        this.f8734q = this;
    }

    @Override // Y4.e
    public final Object getValue() {
        Object objA;
        Object obj = this.f8733p;
        n nVar = n.f8735a;
        if (obj != nVar) {
            return obj;
        }
        synchronized (this.f8734q) {
            objA = this.f8733p;
            if (objA == nVar) {
                InterfaceC1180a interfaceC1180a = this.f8732o;
                AbstractC1209k.c(interfaceC1180a);
                objA = interfaceC1180a.a();
                this.f8733p = objA;
                this.f8732o = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f8733p != n.f8735a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
