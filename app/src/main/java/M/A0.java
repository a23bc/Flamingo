package M;

import D.AbstractC0060d;
import R0.AbstractC0403q0;
import X.Q0;
import X.R0;
import androidx.compose.foundation.layout.FillElement;
import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.InterfaceC1626w;
import y0.AbstractC1959I;
import y0.C1980m;
import y0.C1987t;
import yos.music.player.data.libraries.SettingsLibrary;
import z.C2053o;
import z.EnumC2048l0;
import z.I0;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f4344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4345q;

    public /* synthetic */ A0(int i7, Object obj, boolean z6) {
        this.f4343o = i7;
        this.f4345q = obj;
        this.f4344p = z6;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1398p interfaceC1398pB;
        switch (this.f4343o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t.X(805428266);
                boolean z6 = c0912t.j(AbstractC0403q0.f6513n) == n1.n.f14522p;
                B0 b0 = (B0) this.f4345q;
                C0894j0 c0894j0 = b0.f4370f;
                boolean z7 = ((EnumC2048l0) c0894j0.getValue()) == EnumC2048l0.f20894o || !z6;
                boolean zF = c0912t.f(b0);
                Object objK = c0912t.K();
                f0.W w7 = C0903o.f11850a;
                if (zF || objK == w7) {
                    objK = new D.J(11, b0);
                    c0912t.i0(objK);
                }
                InterfaceC0878b0 interfaceC0878b0X = C0879c.x((InterfaceC1182c) objK, c0912t);
                Object objK2 = c0912t.K();
                if (objK2 == w7) {
                    C2053o c2053o = new C2053o(new t0(interfaceC0878b0X, 28));
                    c0912t.i0(c2053o);
                    objK2 = c2053o;
                }
                I0 i02 = (I0) objK2;
                boolean zF2 = c0912t.f(i02) | c0912t.f(b0);
                Object objK3 = c0912t.K();
                if (zF2 || objK3 == w7) {
                    objK3 = new z0(i02, b0);
                    c0912t.i0(objK3);
                }
                InterfaceC1398p interfaceC1398pB2 = androidx.compose.foundation.gestures.a.b((z0) objK3, (EnumC2048l0) c0894j0.getValue(), this.f4344p && b0.f4366b.h() != 0.0f, z7);
                c0912t.p(false);
                return interfaceC1398pB2;
            case 1:
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) obj;
                C0912t c0912t2 = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t2.X(-196777734);
                final long j3 = ((Q0) c0912t2.j(R0.f7988a)).f7986a;
                boolean zE = c0912t2.e(j3);
                final InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f4345q;
                boolean zF3 = zE | c0912t2.f(interfaceC1180a);
                final boolean z8 = this.f4344p;
                boolean zG = zF3 | c0912t2.g(z8);
                Object objK4 = c0912t2.K();
                if (zG || objK4 == C0903o.f11850a) {
                    objK4 = new InterfaceC1182c() { // from class: X.g
                        @Override // l5.InterfaceC1182c
                        public final Object b(Object obj4) {
                            v0.d dVar = (v0.d) obj4;
                            return dVar.a(new C0478h(interfaceC1180a, z8, AbstractC0498r0.q(dVar, Float.intBitsToFloat((int) (dVar.f18208o.f() >> 32)) / 2.0f), new C1980m(j3, 5)));
                        }
                    };
                    c0912t2.i0(objK4);
                }
                InterfaceC1398p interfaceC1398pB3 = androidx.compose.ui.draw.a.b(interfaceC1398p, (InterfaceC1182c) objK4);
                c0912t2.p(false);
                return interfaceC1398pB3;
            default:
                C0912t c0912t3 = (C0912t) obj2;
                ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
                long jB = t6.a.b(this.f4344p ? AbstractC1959I.d(4294440951L) : C1987t.f20259f, C1987t.f20255b, c0912t3);
                C1395m c1395m = C1395m.f15634a;
                FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                c0912t3.X(82299268);
                if (SettingsLibrary.INSTANCE.getBarBlurEffect()) {
                    interfaceC1398pB = dev.chrisbanes.haze.a.a(c1395m, (T4.l) this.f4345q, T4.m.a(new T4.m(jB, C1987t.b(jB, ((double) AbstractC1959I.o(jB)) >= 0.5d ? 0.83f : 0.9f), 24, 8), jB, C1987t.b(jB, 0.7f), 32, 8));
                } else {
                    interfaceC1398pB = androidx.compose.foundation.a.b(c1395m, jB, AbstractC1959I.f20180a);
                }
                c0912t3.p(false);
                AbstractC0060d.d(c0912t3, fillElement.f(interfaceC1398pB));
                return Y4.o.f8736a;
        }
    }

    public A0(boolean z6, T4.l lVar) {
        this.f4343o = 2;
        this.f4344p = z6;
        this.f4345q = lVar;
    }
}
