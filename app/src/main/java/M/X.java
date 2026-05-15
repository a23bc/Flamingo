package M;

import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f4492a;

    public X(InterfaceC1182c interfaceC1182c, int i7) {
        this.f4492a = (i7 & 16) != 0 ? null : interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        x6.getClass();
        return this.f4492a == x6.f4492a;
    }

    public final int hashCode() {
        InterfaceC1182c interfaceC1182c = this.f4492a;
        return (interfaceC1182c != null ? interfaceC1182c.hashCode() : 0) * 31;
    }
}
