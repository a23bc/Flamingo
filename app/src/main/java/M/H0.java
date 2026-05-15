package M;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import g1.C0957C;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements O0.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0 f4408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0957C f4410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1180a f4411d;

    public H0(B0 b0, int i7, C0957C c0957c, InterfaceC1180a interfaceC1180a) {
        this.f4408a = b0;
        this.f4409b = i7;
        this.f4410c = c0957c;
        this.f4411d = interfaceC1180a;
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
        O0.m0 m0VarD = y6.d(n1.a.a(j3, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(m0VarD.f5417p, n1.a.g(j3));
        return interfaceC0298b0.k(m0VarD.f5416o, iMin, Z4.w.f8819o, new G0(this, m0VarD, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return AbstractC1209k.a(this.f4408a, h02.f4408a) && this.f4409b == h02.f4409b && AbstractC1209k.a(this.f4410c, h02.f4410c) && AbstractC1209k.a(this.f4411d, h02.f4411d);
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
        return this.f4411d.hashCode() + ((this.f4410c.hashCode() + (((this.f4408a.hashCode() * 31) + this.f4409b) * 31)) * 31);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f4408a + ", cursorOffset=" + this.f4409b + ", transformedText=" + this.f4410c + ", textLayoutResultProvider=" + this.f4411d + ')';
    }
}
