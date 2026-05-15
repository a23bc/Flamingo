package M;

import f0.C0888g0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import w.C1681n;
import y0.C1960J;
import y0.C1973f;
import y0.C1980m;
import y0.InterfaceC1985r;
import z.t1;

/* JADX INFO: renamed from: M.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0256e implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4542o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ float f4543p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f4544q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f4545r;

    public /* synthetic */ C0256e(float f7, C1973f c1973f, C1980m c1980m) {
        this.f4542o = 0;
        this.f4543p = f7;
        this.f4544q = c1973f;
        this.f4545r = c1980m;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        long jI;
        switch (this.f4542o) {
            case 0:
                float f7 = this.f4543p;
                C1973f c1973f = (C1973f) this.f4544q;
                C1980m c1980m = (C1980m) this.f4545r;
                Q0.N n7 = (Q0.N) obj;
                n7.a();
                A0.c cVar = n7.f5853o;
                A0.b bVar = cVar.f54p;
                long jW = bVar.W();
                bVar.S().l();
                try {
                    A.b bVar2 = (A.b) bVar.f50p;
                    bVar2.J(f7, 0.0f);
                    InterfaceC1985r interfaceC1985rS = ((A0.b) bVar2.f3p).S();
                    int i7 = (int) 0;
                    interfaceC1985rS.h(Float.intBitsToFloat(i7), Float.intBitsToFloat(i7));
                    interfaceC1985rS.i();
                    interfaceC1985rS.h(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i7));
                    cVar.d(c1973f, c1980m);
                    n1.c.A(bVar, jW);
                    return Y4.o.f8736a;
                } catch (Throwable th) {
                    n1.c.A(bVar, jW);
                    throw th;
                }
            case 1:
                C1960J c1960j = (C1960J) obj;
                AbstractC1209k.f((C0888g0) this.f4544q, "$parentHeight");
                D4.i iVar = (D4.i) this.f4545r;
                AbstractC1209k.f(iVar, "$yosBottomSheetConfig");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.u((1 - iVar.p()) * (r1.h() - this.f4543p));
                return Y4.o.f8736a;
            default:
                long jLongValue = ((Long) obj).longValue();
                t1 t1Var = (t1) this.f4544q;
                if (t1Var.f20959b == Long.MIN_VALUE) {
                    t1Var.f20959b = jLongValue;
                }
                float f8 = t1Var.f20962e;
                C1681n c1681n = new C1681n(f8);
                float f9 = this.f4543p;
                C1681n c1681n2 = t1.f20957f;
                if (f9 == 0.0f) {
                    jI = t1Var.f20958a.e(new C1681n(f8), c1681n2, t1Var.f20960c);
                } else {
                    jI = AbstractC1267a.I((jLongValue - t1Var.f20959b) / f9);
                }
                long j3 = jI;
                float f10 = ((C1681n) t1Var.f20958a.o(j3, c1681n, c1681n2, t1Var.f20960c)).f18716a;
                t1Var.f20960c = (C1681n) t1Var.f20958a.w(j3, c1681n, c1681n2, t1Var.f20960c);
                t1Var.f20959b = jLongValue;
                float f11 = t1Var.f20962e - f10;
                t1Var.f20962e = f10;
                ((InterfaceC1182c) this.f4545r).b(Float.valueOf(f11));
                return Y4.o.f8736a;
        }
    }

    public /* synthetic */ C0256e(Object obj, float f7, Object obj2, int i7) {
        this.f4542o = i7;
        this.f4544q = obj;
        this.f4543p = f7;
        this.f4545r = obj2;
    }
}
