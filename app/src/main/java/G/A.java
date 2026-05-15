package G;

import H.b0;
import H.e0;
import d5.EnumC0830a;
import x.EnumC1862l0;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class A implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f2483a;

    public A(x xVar) {
        this.f2483a = xVar;
    }

    @Override // H.b0
    public final int a() {
        x xVar = this.f2483a;
        return (int) (xVar.g().f2554p == EnumC2048l0.f20894o ? xVar.g().g() & 4294967295L : xVar.g().g() >> 32);
    }

    @Override // H.b0
    public final float b() {
        x xVar = this.f2483a;
        return (xVar.f2614d.f2151b.h() * 500) + xVar.f2614d.f2152c.h();
    }

    @Override // H.b0
    public final Y0.b c() {
        return new Y0.b(-1, -1);
    }

    @Override // H.b0
    public final Object d(int i7, e0 e0Var) {
        V1.a aVar = x.f2610w;
        x xVar = this.f2483a;
        xVar.getClass();
        Object objC = xVar.c(EnumC1862l0.f19772o, new w(xVar, i7, null), e0Var);
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        Y4.o oVar = Y4.o.f8736a;
        if (objC != enumC0830a) {
            objC = oVar;
        }
        return objC == enumC0830a ? objC : oVar;
    }

    @Override // H.b0
    public final int e() {
        x xVar = this.f2483a;
        return (-xVar.g().f2551m) + xVar.g().f2555q;
    }

    @Override // H.b0
    public final float f() {
        x xVar = this.f2483a;
        int iH = xVar.f2614d.f2151b.h();
        int iH2 = xVar.f2614d.f2152c.h();
        return xVar.d() ? (iH * 500) + iH2 + 100 : (iH * 500) + iH2;
    }
}
