package m5;

import s5.InterfaceC1436a;

/* JADX INFO: renamed from: m5.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1207i extends AbstractC1201c implements InterfaceC1206h, InterfaceC1436a, Y4.c {

    /* JADX INFO: renamed from: u */
    public final int f14429u;

    /* JADX INFO: renamed from: v */
    public final int f14430v;

    public AbstractC1207i(int i7, Class cls, String str, String str2, int i8) {
        this(i7, i8, cls, C1200b.f14418o, str, str2);
    }

    @Override // m5.AbstractC1201c
    public final InterfaceC1436a e() {
        AbstractC1221w.f14440a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1207i) {
            AbstractC1207i abstractC1207i = (AbstractC1207i) obj;
            return this.f14422r.equals(abstractC1207i.f14422r) && this.f14423s.equals(abstractC1207i.f14423s) && this.f14430v == abstractC1207i.f14430v && this.f14429u == abstractC1207i.f14429u && AbstractC1209k.a(this.f14420p, abstractC1207i.f14420p) && f().equals(abstractC1207i.f());
        }
        if (!(obj instanceof AbstractC1207i)) {
            return false;
        }
        InterfaceC1436a interfaceC1436a = this.f14419o;
        if (interfaceC1436a == null) {
            e();
            this.f14419o = this;
            interfaceC1436a = this;
        }
        return obj.equals(interfaceC1436a);
    }

    @Override // m5.InterfaceC1206h
    public final int getArity() {
        return this.f14429u;
    }

    public final int hashCode() {
        f();
        return this.f14423s.hashCode() + A0.e.C(this.f14422r, f().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC1436a interfaceC1436a = this.f14419o;
        if (interfaceC1436a == null) {
            e();
            this.f14419o = this;
            interfaceC1436a = this;
        }
        if (interfaceC1436a != this) {
            return interfaceC1436a.toString();
        }
        String str = this.f14422r;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : Z1.l.q("function ", str, " (Kotlin reflection is not available)");
    }

    public AbstractC1207i(int i7, int i8, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f14429u = i7;
        this.f14430v = 0;
    }
}
