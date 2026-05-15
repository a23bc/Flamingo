package f4;

import d5.EnumC0830a;
import m5.C1199a;
import m5.InterfaceC1205g;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC2111f, InterfaceC1205g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f12195o;

    public k(p pVar) {
        this.f12195o = pVar;
    }

    @Override // m5.InterfaceC1205g
    public final Y4.c a() {
        return new C1199a(2, 4, p.class, this.f12195o, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2111f) && (obj instanceof InterfaceC1205g)) {
            return a().equals(((InterfaceC1205g) obj).a());
        }
        return false;
    }

    @Override // z5.InterfaceC2111f
    public final Object f(Object obj, c5.d dVar) {
        this.f12195o.k((i) obj);
        Y4.o oVar = Y4.o.f8736a;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return oVar;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
