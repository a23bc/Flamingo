package H;

import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.a1;
import java.util.Map;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import o0.AbstractC1253j;
import o0.C1249f;
import o0.C1252i;
import o0.InterfaceC1246c;
import o0.InterfaceC1250g;
import o0.InterfaceC1251h;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements InterfaceC1251h, InterfaceC1246c {

    /* JADX INFO: renamed from: o */
    public final C1252i f2874o;

    /* JADX INFO: renamed from: p */
    public final C1249f f2875p;

    /* JADX INFO: renamed from: q */
    public final t.K f2876q;

    public g0(InterfaceC1251h interfaceC1251h, Map map, C1249f c1249f) {
        D.J j3 = new D.J(7, interfaceC1251h);
        a1 a1Var = AbstractC1253j.f14649a;
        this.f2874o = new C1252i(map, j3);
        this.f2875p = c1249f;
        t.K k7 = t.S.f16033a;
        this.f2876q = new t.K();
    }

    @Override // o0.InterfaceC1246c
    public final void a(Object obj, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(-858296452);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(dVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(this) ? 256 : 128;
        }
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            this.f2875p.a(obj, dVar, c0912t, i8 & 126);
            boolean zH = c0912t.h(this) | c0912t.h(obj);
            Object objK = c0912t.K();
            if (zH || objK == C0903o.f11850a) {
                objK = new D.h0(this, 5, obj);
                c0912t.i0(objK);
            }
            C0879c.d(obj, (InterfaceC1182c) objK, c0912t);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(i7, 1, this, obj, dVar);
        }
    }

    @Override // o0.InterfaceC1246c
    public final void b(Object obj) {
        this.f2875p.b(obj);
    }

    @Override // o0.InterfaceC1251h
    public final boolean c(Object obj) {
        return this.f2874o.c(obj);
    }

    @Override // o0.InterfaceC1251h
    public final InterfaceC1250g d(String str, InterfaceC1180a interfaceC1180a) {
        return this.f2874o.d(str, interfaceC1180a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    @Override // o0.InterfaceC1251h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map e() {
        /*
            r14 = this;
            t.K r0 = r14.f2876q
            java.lang.Object[] r1 = r0.f16010b
            long[] r0 = r0.f16009a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            o0.f r11 = r14.f2875p
            r11.b(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            o0.i r0 = r14.f2874o
            java.util.Map r0 = r0.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g0.e():java.util.Map");
    }

    @Override // o0.InterfaceC1251h
    public final Object f(String str) {
        return this.f2874o.f(str);
    }
}
