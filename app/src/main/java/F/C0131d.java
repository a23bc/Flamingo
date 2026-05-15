package F;

import H.b0;
import H.e0;
import d5.EnumC0830a;
import x.EnumC1862l0;
import z.EnumC2048l0;

/* JADX INFO: renamed from: F.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131d implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f2067a;

    public C0131d(A a4) {
        this.f2067a = a4;
    }

    @Override // H.b0
    public final int a() {
        A a4 = this.f2067a;
        return (int) (a4.g().f2127o == EnumC2048l0.f20894o ? a4.g().g() & 4294967295L : a4.g().g() >> 32);
    }

    @Override // H.b0
    public final float b() {
        A a4 = this.f2067a;
        return (a4.f2028e.f2151b.h() * 500) + a4.f2028e.f2152c.h();
    }

    @Override // H.b0
    public final Y0.b c() {
        return new Y0.b(this.f2067a.g().f2126n, 1);
    }

    @Override // H.b0
    public final Object d(int i7, e0 e0Var) {
        V1.a aVar = A.f2023x;
        A a4 = this.f2067a;
        a4.getClass();
        Object objC = a4.c(EnumC1862l0.f19772o, new z(a4, i7, null), e0Var);
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        Y4.o oVar = Y4.o.f8736a;
        if (objC != enumC0830a) {
            objC = oVar;
        }
        return objC == enumC0830a ? objC : oVar;
    }

    @Override // H.b0
    public final int e() {
        A a4 = this.f2067a;
        return (-a4.g().l) + a4.g().f2128p;
    }

    @Override // H.b0
    public final float f() {
        A a4 = this.f2067a;
        int iH = a4.f2028e.f2151b.h();
        int iH2 = a4.f2028e.f2152c.h();
        return a4.d() ? (iH * 500) + iH2 + 100 : (iH * 500) + iH2;
    }
}
