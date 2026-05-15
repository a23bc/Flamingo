package B0;

import A2.C0001b;
import K0.C0237e;
import K0.t;
import K0.u;
import M5.C0281a;
import Q0.C0363t;
import Q0.K;
import Q0.N;
import R0.C0415x;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import c0.C;
import c0.D;
import c0.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import t.C1463s;
import w.AbstractC1671d;
import w.AbstractC1692z;
import w.C1670c;
import w.n0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x0.C1892b;
import x0.C1895e;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public boolean f605a;

    /* JADX INFO: renamed from: b */
    public Object f606b;

    /* JADX INFO: renamed from: c */
    public Object f607c = AbstractC1671d.a(0.0f);

    /* JADX INFO: renamed from: d */
    public Object f608d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Object f609e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z6, InterfaceC1180a interfaceC1180a) {
        this.f605a = z6;
        this.f606b = (AbstractC1210l) interfaceC1180a;
    }

    public boolean a(float f7, float f8) {
        ViewParent viewParentD;
        if (this.f605a && (viewParentD = d(0)) != null) {
            try {
                return viewParentD.onNestedPreFling((NestedScrollView) this.f608d, f7, f8);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentD);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(int r14, int r15, int r16, int r17, int[] r18, int r19, int[] r20) {
        /*
            r13 = this;
            r0 = r18
            r7 = r19
            boolean r1 = r13.f605a
            r9 = 0
            if (r1 == 0) goto La0
            android.view.ViewParent r2 = r13.d(r7)
            if (r2 != 0) goto L11
            goto La0
        L11:
            r10 = 1
            if (r14 != 0) goto L22
            if (r15 != 0) goto L22
            if (r16 != 0) goto L22
            if (r17 == 0) goto L1b
            goto L22
        L1b:
            if (r0 == 0) goto La0
            r0[r9] = r9
            r0[r10] = r9
            return r9
        L22:
            java.lang.Object r1 = r13.f608d
            r3 = r1
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            if (r0 == 0) goto L33
            r3.getLocationInWindow(r0)
            r1 = r0[r9]
            r4 = r0[r10]
            r11 = r1
            r12 = r4
            goto L35
        L33:
            r11 = r9
            r12 = r11
        L35:
            if (r20 != 0) goto L4c
            java.lang.Object r1 = r13.f609e
            int[] r1 = (int[]) r1
            if (r1 != 0) goto L42
            r1 = 2
            int[] r1 = new int[r1]
            r13.f609e = r1
        L42:
            java.lang.Object r1 = r13.f609e
            int[] r1 = (int[]) r1
            r1[r9] = r9
            r1[r10] = r9
            r8 = r1
            goto L4e
        L4c:
            r8 = r20
        L4e:
            boolean r1 = r2 instanceof G1.InterfaceC0146m
            if (r1 == 0) goto L61
            r1 = r2
            G1.m r1 = (G1.InterfaceC0146m) r1
            r4 = r15
            r5 = r16
            r6 = r17
            r2 = r3
            r3 = r14
            r1.c(r2, r3, r4, r5, r6, r7, r8)
        L5f:
            r3 = r2
            goto L90
        L61:
            r1 = r8[r9]
            int r1 = r1 + r16
            r8[r9] = r1
            r1 = r8[r10]
            int r1 = r1 + r17
            r8[r10] = r1
            boolean r1 = r2 instanceof G1.InterfaceC0145l
            if (r1 == 0) goto L81
            r1 = r2
            G1.l r1 = (G1.InterfaceC0145l) r1
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r19
            r2 = r3
            r3 = r14
            r1.f(r2, r3, r4, r5, r6, r7)
            goto L5f
        L81:
            if (r19 != 0) goto L90
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.onNestedScroll(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L8d
            goto L90
        L8d:
            java.util.Objects.toString(r2)
        L90:
            if (r0 == 0) goto L9f
            r3.getLocationInWindow(r0)
            r14 = r0[r9]
            int r14 = r14 - r11
            r0[r9] = r14
            r14 = r0[r10]
            int r14 = r14 - r12
            r0[r10] = r14
        L9f:
            return r10
        La0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.a.b(int, int, int, int, int[], int, int[]):boolean");
    }

    public void c(N n7, float f7, long j3) {
        float fFloatValue = ((Number) ((C1670c) this.f607c).e()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = C1987t.b(j3, fFloatValue);
            if (!this.f605a) {
                A0.e.s(f7, 124, jB, 0L, n7);
                return;
            }
            float fD = C1895e.d(n7.f());
            float fB = C1895e.b(n7.f());
            A0.b bVar = n7.f5853o.f54p;
            long jW = bVar.W();
            bVar.S().l();
            ((A.b) bVar.f50p).o(0.0f, 0.0f, fD, fB, 1);
            A0.e.s(f7, 124, jB, 0L, n7);
            n1.c.A(bVar, jW);
        }
    }

    public ViewParent d(int i7) {
        if (i7 == 0) {
            return (ViewParent) this.f606b;
        }
        if (i7 != 1) {
            return null;
        }
        return (ViewParent) this.f607c;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [l5.a, m5.l] */
    public void e(B.j jVar, InterfaceC1765B interfaceC1765B) {
        boolean z6 = jVar instanceof B.h;
        ArrayList arrayList = (ArrayList) this.f608d;
        if (z6) {
            arrayList.add(jVar);
        } else if (jVar instanceof B.i) {
            arrayList.remove(((B.i) jVar).f597a);
        } else if (jVar instanceof B.d) {
            arrayList.add(jVar);
        } else if (jVar instanceof B.e) {
            arrayList.remove(((B.e) jVar).f590a);
        } else if (jVar instanceof B.b) {
            arrayList.add(jVar);
        } else if (jVar instanceof B.c) {
            arrayList.remove(((B.c) jVar).f589a);
        } else if (!(jVar instanceof B.a)) {
            return;
        } else {
            arrayList.remove(((B.a) jVar).f588a);
        }
        B.j jVar2 = (B.j) Z4.n.y0(arrayList);
        if (AbstractC1209k.a((B.j) this.f609e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            c0.h hVar = (c0.h) ((AbstractC1210l) this.f606b).a();
            float f7 = z6 ? hVar.f10560c : jVar instanceof B.d ? hVar.f10559b : jVar instanceof B.b ? hVar.f10558a : 0.0f;
            n0 n0Var = v.f10603a;
            boolean z7 = jVar2 instanceof B.h;
            n0 n0Var2 = v.f10603a;
            if (!z7 && ((jVar2 instanceof B.d) || (jVar2 instanceof B.b))) {
                n0Var2 = new n0(45, AbstractC1692z.f18767b, 2);
            }
            AbstractC1767D.t(interfaceC1765B, null, new C(this, f7, n0Var2, null), 3);
        } else {
            B.j jVar3 = (B.j) this.f609e;
            n0 n0Var3 = v.f10603a;
            boolean z8 = jVar3 instanceof B.h;
            n0 n0Var4 = v.f10603a;
            if (!z8 && !(jVar3 instanceof B.d) && (jVar3 instanceof B.b)) {
                n0Var4 = new n0(150, AbstractC1692z.f18767b, 2);
            }
            AbstractC1767D.t(interfaceC1765B, null, new D(this, n0Var4, null), 3);
        }
        this.f609e = jVar2;
    }

    public K5.g f(F5.v vVar) throws IOException {
        K5.e eVar = (K5.e) this.f608d;
        try {
            String strB = F5.v.b(vVar, "Content-Type");
            long jE = eVar.e(vVar);
            return new K5.g(strB, jE, M3.a.E(new J5.c(this, eVar.d(vVar), jE)));
        } catch (IOException e7) {
            AbstractC1209k.f((J5.h) this.f606b, "call");
            i(e7);
            throw e7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int g(V.o oVar, C0415x c0415x, boolean z6) {
        byte b7;
        C0237e c0237e;
        int i7;
        int i8;
        C0363t c0363t = (C0363t) this.f609e;
        if (this.f605a) {
            return 0;
        }
        try {
            this.f605a = true;
            C0001b c0001bD = ((A.b) this.f608d).D(oVar, c0415x);
            C1463s c1463s = (C1463s) c0001bD.f223q;
            int iH = c1463s.h();
            for (int i9 = 0; i9 < iH; i9++) {
                u uVar = (u) c1463s.i(i9);
                if (!uVar.f3913d && !uVar.h) {
                }
                b7 = false;
                break;
            }
            b7 = true;
            int iH2 = c1463s.h();
            int i10 = 0;
            while (true) {
                c0237e = (C0237e) this.f607c;
                if (i10 >= iH2) {
                    break;
                }
                u uVar2 = (u) c1463s.i(i10);
                if (b7 != false || t.a(uVar2)) {
                    ((K) this.f606b).B(uVar2.f3912c, (C0363t) this.f609e, uVar2.f3917i, true);
                    if (!c0363t.f6072o.g()) {
                        c0237e.a(uVar2.f3910a, c0363t, t.a(uVar2));
                        c0363t.clear();
                    }
                }
                i10++;
            }
            boolean zB = c0237e.b(c0001bD, z6);
            if (c0001bD.f222p) {
                i7 = 0;
            } else {
                int iH3 = c1463s.h();
                for (int i11 = 0; i11 < iH3; i11++) {
                    u uVar3 = (u) c1463s.i(i11);
                    if (!C1892b.b(t.f(uVar3, true), 0L) && uVar3.b()) {
                        i7 = 1;
                        break;
                    }
                }
                i7 = 0;
            }
            int iH4 = c1463s.h();
            int i12 = 0;
            while (true) {
                if (i12 >= iH4) {
                    i8 = 0;
                    break;
                }
                if (((u) c1463s.i(i12)).b()) {
                    i8 = 1;
                    break;
                }
                i12++;
            }
            int i13 = (zB ? 1 : 0) | (i7 << 1) | (i8 << 2);
            this.f605a = false;
            return i13;
        } catch (Throwable th) {
            this.f605a = false;
            throw th;
        }
    }

    public F5.u h(boolean z6) throws IOException {
        try {
            F5.u uVarF = ((K5.e) this.f608d).f(z6);
            if (uVarF != null) {
                uVarF.f2456m = this;
            }
            return uVarF;
        } catch (IOException e7) {
            AbstractC1209k.f((J5.h) this.f606b, "call");
            i(e7);
            throw e7;
        }
    }

    public void i(IOException iOException) {
        this.f605a = true;
        ((J5.d) this.f607c).c(iOException);
        J5.k kVarG = ((K5.e) this.f608d).g();
        J5.h hVar = (J5.h) this.f606b;
        synchronized (kVarG) {
            try {
                AbstractC1209k.f(hVar, "call");
                if (!(iOException instanceof M5.C)) {
                    if (!(kVarG.f3792g != null) || (iOException instanceof C0281a)) {
                        kVarG.f3794j = true;
                        if (kVarG.f3796m == 0) {
                            J5.k.d(hVar.f3770o, kVarG.f3787b, iOException);
                            kVarG.l++;
                        }
                    }
                } else if (((M5.C) iOException).f4829o == 8) {
                    int i7 = kVarG.f3797n + 1;
                    kVarG.f3797n = i7;
                    if (i7 > 1) {
                        kVarG.f3794j = true;
                        kVarG.l++;
                    }
                } else if (((M5.C) iOException).f4829o != 9 || !hVar.f3767A) {
                    kVarG.f3794j = true;
                    kVarG.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
