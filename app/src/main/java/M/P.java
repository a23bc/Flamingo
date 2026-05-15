package M;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import g1.C0957C;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class P implements O0.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0 f4432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0957C f4434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1180a f4435d;

    public P(B0 b0, int i7, C0957C c0957c, InterfaceC1180a interfaceC1180a) {
        this.f4432a = b0;
        this.f4433b = i7;
        this.f4434c = c0957c;
        this.f4435d = interfaceC1180a;
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // O0.G
    public final /* synthetic */ int c(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.b(this, t7, y6, i7);
    }

    @Override // O0.G
    public final /* synthetic */ int d(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.k(this, t7, y6, i7);
    }

    @Override // O0.G
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        long j7;
        if (y6.P(n1.a.g(j3)) < n1.a.h(j3)) {
            j7 = j3;
        } else {
            j7 = j3;
            j3 = n1.a.a(j7, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        O0.m0 m0VarD = y6.d(j3);
        int iMin = Math.min(m0VarD.f5416o, n1.a.h(j7));
        return interfaceC0298b0.k(iMin, m0VarD.f5417p, Z4.w.f8819o, new D.p0(iMin, 1, this, interfaceC0298b0, m0VarD));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        return AbstractC1209k.a(this.f4432a, p7.f4432a) && this.f4433b == p7.f4433b && AbstractC1209k.a(this.f4434c, p7.f4434c) && AbstractC1209k.a(this.f4435d, p7.f4435d);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // O0.G
    public final /* synthetic */ int g(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.h(this, t7, y6, i7);
    }

    @Override // O0.G
    public final /* synthetic */ int h(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.e(this, t7, y6, i7);
    }

    public final int hashCode() {
        return this.f4435d.hashCode() + ((this.f4434c.hashCode() + (((this.f4432a.hashCode() * 31) + this.f4433b) * 31)) * 31);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f4432a + ", cursorOffset=" + this.f4433b + ", transformedText=" + this.f4434c + ", textLayoutResultProvider=" + this.f4435d + ')';
    }
}
