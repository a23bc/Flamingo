package z;

import Q0.AbstractC0347f;
import R0.C0415x;
import android.view.ViewTreeObserver;
import d5.EnumC0830a;
import e5.AbstractC0865c;
import e5.AbstractC0871i;
import java.lang.reflect.Method;
import x.C1808A;
import x.C1875s;
import x.EnumC1862l0;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: a */
    public I0 f20711a;

    /* JADX INFO: renamed from: b */
    public C1875s f20712b;

    /* JADX INFO: renamed from: c */
    public S f20713c;

    /* JADX INFO: renamed from: d */
    public EnumC2048l0 f20714d;

    /* JADX INFO: renamed from: e */
    public boolean f20715e;

    /* JADX INFO: renamed from: f */
    public J0.d f20716f;

    /* JADX INFO: renamed from: g */
    public final H0 f20717g;
    public final C1808A h;

    /* JADX INFO: renamed from: i */
    public boolean f20718i;

    /* JADX INFO: renamed from: j */
    public int f20719j = 1;

    /* JADX INFO: renamed from: k */
    public InterfaceC2058q0 f20720k = androidx.compose.foundation.gestures.a.f9177b;
    public final M0 l = new M0(this);

    /* JADX INFO: renamed from: m */
    public final p6.f f20721m = new p6.f(7, this);

    public P0(I0 i02, C1875s c1875s, S s7, EnumC2048l0 enumC2048l0, boolean z6, J0.d dVar, H0 h02, C1808A c1808a) {
        this.f20711a = i02;
        this.f20712b = c1875s;
        this.f20713c = s7;
        this.f20714d = enumC2048l0;
        this.f20715e = z6;
        this.f20716f = dVar;
        this.f20717g = h02;
        this.h = c1808a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r12, e5.AbstractC0865c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof z.J0
            if (r0 == 0) goto L13
            r0 = r14
            z.J0 r0 = (z.J0) r0
            int r1 = r0.f20670r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20670r = r1
            goto L18
        L13:
            z.J0 r0 = new z.J0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f20668p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20670r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            m5.u r12 = r0.f20667o
            android.support.v4.media.session.b.K(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L59
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L69
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            android.support.v4.media.session.b.K(r14)
            m5.u r7 = new m5.u
            r7.<init>()
            r7.f14438o = r12
            r11.f20718i = r4
            x.l0 r14 = x.EnumC1862l0.f19772o     // Catch: java.lang.Throwable -> L66
            z.L0 r5 = new z.L0     // Catch: java.lang.Throwable -> L66
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L63
            r0.f20667o = r7     // Catch: java.lang.Throwable -> L63
            r0.f20670r = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r12 = r11.f(r14, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r12 != r1) goto L58
            return r1
        L58:
            r12 = r7
        L59:
            r6.f20718i = r3
            long r12 = r12.f14438o
            n1.r r14 = new n1.r
            r14.<init>(r12)
            return r14
        L63:
            r0 = move-exception
        L64:
            r12 = r0
            goto L69
        L66:
            r0 = move-exception
            r6 = r11
            goto L64
        L69:
            r6.f20718i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z.P0.a(long, e5.c):java.lang.Object");
    }

    public final Object b(long j3, boolean z6, AbstractC0871i abstractC0871i) {
        Y4.o oVar = Y4.o.f8736a;
        if (!z6 || !(this.f20713c instanceof C2047l)) {
            long jA = n1.r.a(j3, 0.0f, 0.0f, this.f20714d == EnumC2048l0.f20895p ? 1 : 2);
            N0 n02 = new N0(this, null);
            C1875s c1875s = this.f20712b;
            if (c1875s == null || !(this.f20711a.d() || this.f20711a.a())) {
                N0 n03 = new N0(n02.f20696r, abstractC0871i);
                n03.f20695q = jA;
                Object objInvokeSuspend = n03.invokeSuspend(oVar);
                if (objInvokeSuspend == EnumC0830a.f11264o) {
                    return objInvokeSuspend;
                }
            } else {
                Object objB = c1875s.b(jA, n02, abstractC0871i);
                if (objB == EnumC0830a.f11264o) {
                    return objB;
                }
            }
        }
        return oVar;
    }

    public final long c(InterfaceC2058q0 interfaceC2058q0, long j3, int i7) {
        long jD = this.f20716f.d(j3, i7);
        long jG = C1892b.g(j3, jD);
        long jE = e(h(interfaceC2058q0.a(g(e(this.f20714d == EnumC2048l0.f20895p ? C1892b.a(jG, 0.0f, 1) : C1892b.a(jG, 0.0f, 2))))));
        H0 h02 = this.f20717g;
        if (h02.f15636B) {
            ViewTreeObserver viewTreeObserver = ((C0415x) AbstractC0347f.y(h02)).getViewTreeObserver();
            try {
                if (C0415x.f6560a1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", new Class[0]);
                    declaredMethod.setAccessible(true);
                    C0415x.f6560a1 = declaredMethod;
                }
                Method method = C0415x.f6560a1;
                if (method != null) {
                    method.invoke(viewTreeObserver, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
        return C1892b.h(C1892b.h(jD, jE), this.f20716f.b(i7, jE, C1892b.g(jG, jE)));
    }

    public final float d(float f7) {
        return this.f20715e ? f7 * (-1) : f7;
    }

    public final long e(long j3) {
        return this.f20715e ? C1892b.i(j3, -1.0f) : j3;
    }

    public final Object f(EnumC1862l0 enumC1862l0, l5.e eVar, AbstractC0865c abstractC0865c) {
        Object objC = this.f20711a.c(enumC1862l0, new O0(this, eVar, null), abstractC0865c);
        return objC == EnumC0830a.f11264o ? objC : Y4.o.f8736a;
    }

    public final float g(long j3) {
        return Float.intBitsToFloat((int) (this.f20714d == EnumC2048l0.f20895p ? j3 >> 32 : j3 & 4294967295L));
    }

    public final long h(float f7) {
        long jFloatToRawIntBits;
        long j3;
        if (f7 == 0.0f) {
            return 0L;
        }
        if (this.f20714d == EnumC2048l0.f20895p) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f7);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j3 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f7);
            j3 = jFloatToRawIntBits3 << 32;
        }
        return j3 | (4294967295L & jFloatToRawIntBits);
    }
}
