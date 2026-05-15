package m5;

import s5.InterfaceC1436a;
import s5.InterfaceC1438c;

/* JADX INFO: renamed from: m5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1215q extends AbstractC1201c implements InterfaceC1438c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14434u;

    public AbstractC1215q(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f14434u = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1215q) {
            AbstractC1215q abstractC1215q = (AbstractC1215q) obj;
            return f().equals(abstractC1215q.f()) && this.f14422r.equals(abstractC1215q.f14422r) && this.f14423s.equals(abstractC1215q.f14423s) && AbstractC1209k.a(this.f14420p, abstractC1215q.f14420p);
        }
        if (obj instanceof InterfaceC1438c) {
            return obj.equals(i());
        }
        return false;
    }

    public final int hashCode() {
        return this.f14423s.hashCode() + A0.e.C(this.f14422r, f().hashCode() * 31, 31);
    }

    public final InterfaceC1436a i() {
        if (this.f14434u) {
            return this;
        }
        InterfaceC1436a interfaceC1436a = this.f14419o;
        if (interfaceC1436a != null) {
            return interfaceC1436a;
        }
        InterfaceC1436a interfaceC1436aE = e();
        this.f14419o = interfaceC1436aE;
        return interfaceC1436aE;
    }

    public final String toString() {
        InterfaceC1436a interfaceC1436aI = i();
        return interfaceC1436aI != this ? interfaceC1436aI.toString() : Z1.l.t(new StringBuilder("property "), this.f14422r, " (Kotlin reflection is not available)");
    }
}
