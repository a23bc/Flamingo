package M;

import X.AbstractC0498r0;
import d.C0746L;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import y0.C1980m;
import y0.C1987t;

/* JADX INFO: renamed from: M.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0254d implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4537o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ long f4538p;

    public /* synthetic */ C0254d(long j3, int i7) {
        this.f4537o = i7;
        this.f4538p = j3;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        long j3 = this.f4538p;
        switch (this.f4537o) {
            case 0:
                v0.d dVar = (v0.d) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f18208o.f() >> 32)) / 2.0f;
                return dVar.a(new C0256e(fIntBitsToFloat, AbstractC0498r0.q(dVar, fIntBitsToFloat), new C1980m(j3, 5)));
            case 1:
                ((Y0.j) obj).i(X.Y.f8018c, new X.X(M.f4421o, this.f4538p, X.W.f8009p, true));
                return oVar;
            case 2:
                v0.d dVar2 = (v0.d) obj;
                AbstractC1209k.f(dVar2, "$this$drawWithCache");
                return dVar2.a(new C0254d(j3, 3));
            default:
                Q0.N n7 = (Q0.N) obj;
                AbstractC1209k.f(n7, "$this$onDrawWithContent");
                List listE0 = Z4.o.e0(new C1987t(C1987t.f20261i), new C1987t(C1987t.b(j3, 0.3f)), new C1987t(C1987t.b(j3, 0.6f)), new C1987t(j3), new C1987t(j3), new C1987t(j3), new C1987t(j3), new C1987t(j3));
                n7.a();
                A0.e.w(n7, C0746L.D(14, listE0), 0L, 0L, 0.0f, null, null, 62);
                return oVar;
        }
    }
}
