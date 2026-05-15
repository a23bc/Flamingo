package M;

import Q0.AbstractC0347f;
import R0.AbstractC0403q0;
import R0.S0;
import android.graphics.Paint;
import f0.C0886f0;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import g1.C0969k;
import g1.C0980v;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1216r;
import m5.C1217s;
import m5.C1220v;
import w5.InterfaceC1786g0;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1965O;
import y0.C1980m;
import y0.InterfaceC1985r;
import z.C2026a0;
import z.P0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4617o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f4618p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f4619q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f4620r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f4621s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f4622t;

    public /* synthetic */ k0(C0980v c0980v, V.e eVar, C0969k c0969k, C0265j c0265j, C0276v c0276v) {
        this.f4617o = 1;
        this.f4618p = c0980v;
        this.f4619q = eVar;
        this.f4620r = c0969k;
        this.f4621s = c0265j;
        this.f4622t = c0276v;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj2 = this.f4622t;
        Object obj3 = this.f4618p;
        Object obj4 = this.f4621s;
        Object obj5 = this.f4620r;
        Object obj6 = this.f4619q;
        switch (this.f4617o) {
            case 0:
                Q0.N n7 = (Q0.N) obj;
                n7.a();
                float fH = ((V.k) obj6).f7337c.h();
                if (fH != 0.0f) {
                    int i7 = b1.L.f9944c;
                    int i8 = (int) (((C0980v) obj3).f12385b >> 32);
                    ((B2.m) obj5).a(i8);
                    E0 e0D = ((Z) obj4).d();
                    C1893c c1893cC = e0D != null ? e0D.f4386a.c(i8) : new C1893c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(n7.v(n0.f4644a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f7 = fFloor / 2;
                    float f8 = c1893cC.f19869a + f7;
                    A0.c cVar = n7.f5853o;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f54p.W() >> 32)) - f7;
                    if (f8 > fIntBitsToFloat) {
                        f8 = fIntBitsToFloat;
                    }
                    if (f8 >= f7) {
                        f7 = f8;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f7)) + 0.5f : (float) Math.rint(f7);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c1893cC.f19870b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c1893cC.f19872d)) & 4294967295L);
                    C1965O c1965o = (C1965O) obj2;
                    InterfaceC1985r interfaceC1985r = cVar.f53o.f46c;
                    w2.l lVarG = cVar.f56r;
                    if (lVarG == null) {
                        lVarG = AbstractC1959I.g();
                        lVarG.o(1);
                        cVar.f56r = lVarG;
                    }
                    c1965o.a(fH, cVar.f54p.W(), lVarG);
                    if (!AbstractC1209k.a((C1980m) lVarG.f18863d, null)) {
                        lVarG.i(null);
                    }
                    if (lVarG.f18860a != 3) {
                        lVarG.g(3);
                    }
                    Paint paint = (Paint) lVarG.f18861b;
                    if (paint.getStrokeWidth() != fFloor) {
                        lVarG.n(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        ((Paint) lVarG.f18861b).setStrokeMiter(4.0f);
                    }
                    if (lVarG.d() != 0) {
                        lVarG.l(0);
                    }
                    if (lVarG.e() != 0) {
                        lVarG.m(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        lVarG.j(1);
                    }
                    interfaceC1985r.f(jFloatToRawIntBits, jFloatToRawIntBits2, lVarG);
                }
                return oVar;
            case 1:
                V.u uVar = (V.u) obj;
                V.q qVar = ((V.e) obj6).f7314a;
                uVar.h = (C0980v) obj3;
                uVar.f7375i = (C0969k) obj5;
                uVar.f7370c = (C0265j) obj4;
                uVar.f7371d = (C0276v) obj2;
                uVar.f7372e = qVar != null ? qVar.f7348D : null;
                uVar.f7373f = qVar != null ? qVar.f7349E : null;
                uVar.f7374g = qVar != null ? (S0) AbstractC0347f.i(qVar, AbstractC0403q0.f6518s) : null;
                return oVar;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                C0894j0 c0894j0 = (C0894j0) obj6;
                AbstractC1209k.f(c0894j0, "$isAnimatingScroll");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj5;
                AbstractC1209k.f(interfaceC1180a, "$calculateScrollBounds");
                C0886f0 c0886f0 = (C0886f0) obj3;
                AbstractC1209k.f(c0886f0, "$offsetY");
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) obj4;
                AbstractC1209k.f(interfaceC0878b0, "$currentAnimateToItemJob$delegate");
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) obj2;
                AbstractC1209k.f(interfaceC0878b02, "$currentFlingJob$delegate");
                InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) interfaceC0878b0.getValue();
                if (interfaceC1786g0 != null) {
                    interfaceC1786g0.c(null);
                }
                InterfaceC1786g0 interfaceC1786g02 = (InterfaceC1786g0) interfaceC0878b02.getValue();
                if (interfaceC1786g02 != null) {
                    interfaceC1786g02.c(null);
                }
                c0894j0.setValue(Boolean.FALSE);
                Y4.h hVar = (Y4.h) interfaceC1180a.a();
                c0886f0.j(i6.h.p(c0886f0.h() + fFloatValue, ((Number) hVar.f8726o).floatValue(), ((Number) hVar.f8727p).floatValue()));
                return oVar;
            default:
                float fFloatValue2 = ((Float) obj).floatValue();
                A3.b bVar = (A3.b) obj6;
                C2026a0 c2026a0F = A3.b.f((y5.c) bVar.f482f);
                if (c2026a0F != null) {
                    bVar.g(c2026a0F);
                    C1220v c1220v = (C1220v) obj5;
                    C2026a0 c2026a0A = ((C2026a0) c1220v.f14439o).a(c2026a0F);
                    c1220v.f14439o = c2026a0A;
                    P0 p02 = (P0) obj4;
                    ((C1217s) obj3).f14436o = p02.g(p02.e(c2026a0A.f20773a));
                    ((C1216r) obj2).f14435o = !z.Z.a(r7 - fFloatValue2);
                }
                return Boolean.valueOf(c2026a0F != null);
        }
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4617o = i7;
        this.f4619q = obj;
        this.f4620r = obj2;
        this.f4618p = obj3;
        this.f4621s = obj4;
        this.f4622t = obj5;
    }
}
