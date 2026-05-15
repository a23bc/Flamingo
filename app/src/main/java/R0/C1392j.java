package r0;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: r0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1392j implements InterfaceC1398p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1398p f15630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1398p f15631b;

    public C1392j(InterfaceC1398p interfaceC1398p, InterfaceC1398p interfaceC1398p2) {
        this.f15630a = interfaceC1398p;
        this.f15631b = interfaceC1398p2;
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return this.f15631b.b(this.f15630a.b(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1392j)) {
            return false;
        }
        C1392j c1392j = (C1392j) obj;
        return AbstractC1209k.a(this.f15630a, c1392j.f15630a) && AbstractC1209k.a(this.f15631b, c1392j.f15631b);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    public final int hashCode() {
        return (this.f15631b.hashCode() * 31) + this.f15630a.hashCode();
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return this.f15630a.j(interfaceC1182c) && this.f15631b.j(interfaceC1182c);
    }

    public final String toString() {
        return Z1.l.s(new StringBuilder("["), (String) b("", C1391i.f15629p), ']');
    }
}
