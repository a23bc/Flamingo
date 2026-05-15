package c0;

import Q0.N;
import j5.AbstractC1110d;
import java.lang.reflect.InvocationTargetException;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import t.J;
import w.C1670c;
import x0.C1892b;
import x0.C1895e;
import y0.C1987t;

/* JADX INFO: renamed from: c0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0712d extends x {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final J f10549M;

    public C0712d(B.k kVar, boolean z6, float f7, Y.h hVar, Y.i iVar) {
        super(kVar, z6, f7, hVar, iVar);
        this.f10549M = new J();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // c0.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(B.m r19, long r20, float r22) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            t.J r2 = r0.f10549M
            java.lang.Object[] r3 = r2.f16004b
            java.lang.Object[] r4 = r2.f16005c
            long[] r5 = r2.f16003a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5b
            r8 = 0
        L12:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L56
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L2c:
            if (r13 >= r11) goto L54
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L50
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r4[r14]
            c0.p r14 = (c0.p) r14
            B.m r15 = (B.m) r15
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            f0.j0 r7 = r14.f10587k
            r7.setValue(r15)
            Y4.o r7 = Y4.o.f8736a
            w5.q r14 = r14.f10585i
            r14.U(r7)
        L50:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L2c
        L54:
            if (r11 != r12) goto L5b
        L56:
            if (r8 == r6) goto L5b
            int r8 = r8 + 1
            goto L12
        L5b:
            r3 = 0
            boolean r4 = r0.f10608D
            if (r4 == 0) goto L68
            long r5 = r1.f600a
            x0.b r7 = new x0.b
            r7.<init>(r5)
            goto L69
        L68:
            r7 = r3
        L69:
            c0.p r5 = new c0.p
            r6 = r22
            r5.<init>(r7, r6, r4)
            r2.m(r1, r5)
            w5.B r2 = r0.n0()
            c0.c r4 = new c0.c
            r4.<init>(r5, r0, r1, r3)
            r1 = 3
            w5.AbstractC1767D.t(r2, r3, r4, r1)
            Q0.AbstractC0347f.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0712d.B0(B.m, long, float):void");
    }

    @Override // c0.x
    public final void C0(N n7) {
        float f7;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        float f8;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i7;
        C0712d c0712d = this;
        float f9 = ((h) c0712d.f10611G.a()).f10561d;
        if (f9 == 0.0f) {
            return;
        }
        J j3 = c0712d.f10549M;
        Object[] objArr5 = j3.f16004b;
        Object[] objArr6 = j3.f16005c;
        long[] jArr3 = j3.f16003a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j7 = jArr3[i8];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j7) < 128) {
                        int i12 = (i8 << 3) + i11;
                        Object obj = objArr5[i12];
                        p pVar = (p) objArr6[i12];
                        long jB = C1987t.b(c0712d.f10610F.a(), f9);
                        if (pVar.f10581d == null) {
                            long jF = n7.f();
                            float f10 = q.f10588a;
                            i7 = i9;
                            pVar.f10581d = Float.valueOf(Math.max(C1895e.d(jF), C1895e.b(jF)) * 0.3f);
                        } else {
                            i7 = i9;
                        }
                        C1892b c1892b = pVar.f10578a;
                        A0.c cVar = n7.f5853o;
                        if (c1892b == null) {
                            f8 = f9;
                            jArr2 = jArr3;
                            objArr3 = objArr5;
                            pVar.f10578a = new C1892b(cVar.R());
                        } else {
                            f8 = f9;
                            jArr2 = jArr3;
                            objArr3 = objArr5;
                        }
                        if (pVar.f10582e == null) {
                            pVar.f10582e = new C1892b(AbstractC1110d.g(C1895e.d(n7.f()) / 2.0f, C1895e.b(n7.f()) / 2.0f));
                        }
                        float fFloatValue = (!((Boolean) pVar.f10587k.getValue()).booleanValue() || ((Boolean) pVar.f10586j.getValue()).booleanValue()) ? ((Number) pVar.f10583f.e()).floatValue() : 1.0f;
                        Float f11 = pVar.f10581d;
                        AbstractC1209k.c(f11);
                        float f12 = fFloatValue;
                        float fJ = AbstractC1113a.J(f11.floatValue(), pVar.f10579b, ((Number) pVar.f10584g.e()).floatValue());
                        C1892b c1892b2 = pVar.f10578a;
                        AbstractC1209k.c(c1892b2);
                        float fD = C1892b.d(c1892b2.f19867a);
                        C1892b c1892b3 = pVar.f10582e;
                        AbstractC1209k.c(c1892b3);
                        objArr4 = objArr6;
                        float fD2 = C1892b.d(c1892b3.f19867a);
                        C1670c c1670c = pVar.h;
                        float fJ2 = AbstractC1113a.J(fD, fD2, ((Number) c1670c.e()).floatValue());
                        C1892b c1892b4 = pVar.f10578a;
                        AbstractC1209k.c(c1892b4);
                        float fE = C1892b.e(c1892b4.f19867a);
                        C1892b c1892b5 = pVar.f10582e;
                        AbstractC1209k.c(c1892b5);
                        long jG = AbstractC1110d.g(fJ2, AbstractC1113a.J(fE, C1892b.e(c1892b5.f19867a), ((Number) c1670c.e()).floatValue()));
                        long jB2 = C1987t.b(jB, C1987t.d(jB) * f12);
                        if (pVar.f10580c) {
                            float fD3 = C1895e.d(n7.f());
                            float fB = C1895e.b(n7.f());
                            A0.b bVar = cVar.f54p;
                            long jW = bVar.W();
                            bVar.S().l();
                            ((A.b) bVar.f50p).o(0.0f, 0.0f, fD3, fB, 1);
                            A0.e.s(fJ, 120, jB2, jG, n7);
                            n1.c.A(bVar, jW);
                        } else {
                            A0.e.s(fJ, 120, jB2, jG, n7);
                        }
                    } else {
                        f8 = f9;
                        jArr2 = jArr3;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        i7 = i9;
                    }
                    j7 >>= i7;
                    i11++;
                    c0712d = this;
                    f9 = f8;
                    jArr3 = jArr2;
                    objArr5 = objArr3;
                    i9 = i7;
                    objArr6 = objArr4;
                }
                f7 = f9;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
                if (i10 != i9) {
                    return;
                }
            } else {
                f7 = f9;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
            }
            if (i8 == length) {
                return;
            }
            i8++;
            c0712d = this;
            f9 = f7;
            jArr3 = jArr;
            objArr5 = objArr;
            objArr6 = objArr2;
        }
    }

    @Override // c0.x
    public final void E0(B.m mVar) throws IllegalAccessException, InvocationTargetException {
        p pVar = (p) this.f10549M.g(mVar);
        if (pVar != null) {
            pVar.f10587k.setValue(Boolean.TRUE);
            pVar.f10585i.U(Y4.o.f8736a);
        }
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        this.f10549M.a();
    }
}
