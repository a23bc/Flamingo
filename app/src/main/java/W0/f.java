package w0;

import A2.W;
import O0.w0;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import Q0.K;
import Q0.M;
import Q0.j0;
import R0.C0415x;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a */
    public static final int[] f18777a = new int[2];

    public static final boolean A(int i7, M m7, u uVar, C1893c c1893c) {
        u uVarH;
        h0.e eVar = new h0.e(new u[16]);
        if (!uVar.f15637o.f15636B) {
            N0.a.b("visitChildren called on an unattached node");
        }
        h0.e eVar2 = new h0.e(new AbstractC1397o[16]);
        AbstractC1397o abstractC1397o = uVar.f15637o;
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15642t;
        if (abstractC1397o2 == null) {
            AbstractC0347f.b(eVar2, abstractC1397o);
        } else {
            eVar2.b(abstractC1397o2);
        }
        while (true) {
            int i8 = eVar2.f12548q;
            if (i8 == 0) {
                break;
            }
            AbstractC1397o abstractC1397oF = (AbstractC1397o) eVar2.l(i8 - 1);
            if ((abstractC1397oF.f15640r & 1024) == 0) {
                AbstractC0347f.b(eVar2, abstractC1397oF);
            } else {
                while (true) {
                    if (abstractC1397oF == null) {
                        break;
                    }
                    if ((abstractC1397oF.f15639q & 1024) != 0) {
                        h0.e eVar3 = null;
                        while (abstractC1397oF != null) {
                            if (abstractC1397oF instanceof u) {
                                u uVar2 = (u) abstractC1397oF;
                                if (uVar2.f15636B) {
                                    eVar.b(uVar2);
                                }
                            } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                int i9 = 0;
                                for (AbstractC1397o abstractC1397o3 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o3 != null; abstractC1397o3 = abstractC1397o3.f15642t) {
                                    if ((abstractC1397o3.f15639q & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC1397oF = abstractC1397o3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (abstractC1397oF != null) {
                                                eVar3.b(abstractC1397oF);
                                                abstractC1397oF = null;
                                            }
                                            eVar3.b(abstractC1397o3);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC1397oF = AbstractC0347f.f(eVar3);
                        }
                    } else {
                        abstractC1397oF = abstractC1397oF.f15642t;
                    }
                }
            }
        }
        while (eVar.f12548q != 0 && (uVarH = h(eVar, c1893c, i7)) != null) {
            if (uVarH.C0().f18797a) {
                return ((Boolean) m7.b(uVarH)).booleanValue();
            }
            if (l(i7, m7, uVarH, c1893c)) {
                return true;
            }
            eVar.k(uVarH);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0197 A[EDGE_INSN: B:337:0x0197->B:307:0x0197 BREAK  A[LOOP:5: B:269:0x012c->B:342:0x012c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean B(w0.u r12, w0.u r13, int r14, Q0.M r15) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.B(w0.u, w0.u, int, Q0.M):boolean");
    }

    public static final Integer C(int i7) {
        if (i7 == 5) {
            return 33;
        }
        if (i7 == 6) {
            return 130;
        }
        if (i7 == 3) {
            return 17;
        }
        if (i7 == 4) {
            return 66;
        }
        if (i7 == 1) {
            return 2;
        }
        return i7 == 2 ? 1 : null;
    }

    public static final C1696d D(int i7) {
        if (i7 == 1) {
            return new C1696d(2);
        }
        if (i7 == 2) {
            return new C1696d(1);
        }
        if (i7 == 17) {
            return new C1696d(3);
        }
        if (i7 == 33) {
            return new C1696d(5);
        }
        if (i7 == 66) {
            return new C1696d(4);
        }
        if (i7 != 130) {
            return null;
        }
        return new C1696d(6);
    }

    public static final Boolean E(int i7, M m7, u uVar, C1893c c1893c) {
        int iOrdinal = uVar.D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                u uVarN = n(uVar);
                if (uVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = uVarN.D0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolE = E(i7, m7, uVarN, c1893c);
                        if (!AbstractC1209k.a(boolE, Boolean.FALSE)) {
                            return boolE;
                        }
                        if (c1893c == null) {
                            if (uVarN.D0() != t.f18813p) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            u uVarG = g(uVarN);
                            if (uVarG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c1893c = j(uVarG);
                        }
                        return Boolean.valueOf(l(i7, m7, uVar, c1893c));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new W();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c1893c == null) {
                    c1893c = j(uVarN);
                }
                return Boolean.valueOf(l(i7, m7, uVar, c1893c));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return uVar.C0().f18797a ? (Boolean) m7.b(uVar) : c1893c == null ? Boolean.valueOf(i(uVar, i7, m7)) : Boolean.valueOf(A(i7, m7, uVar, c1893c));
                }
                throw new W();
            }
        }
        return Boolean.valueOf(i(uVar, i7, m7));
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(w0.u r7, Q0.M r8) {
        /*
            w0.t r0 = r7.D0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = w(r7, r8)
            if (r0 != 0) goto L7d
            w0.n r0 = r7.C0()
            boolean r0 = r0.f18797a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            A2.W r7 = new A2.W
            r7.<init>()
            throw r7
        L37:
            w0.u r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            w0.t r6 = r0.D0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            A2.W r7 = new A2.W
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            w0.n r7 = r0.C0()
            boolean r7 = r7.f18797a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.b(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = w(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.a(w0.u, Q0.M):boolean");
    }

    public static final boolean b(C1893c c1893c, C1893c c1893c2, C1893c c1893c3, int i7) {
        float f7;
        float f8;
        if (c(i7, c1893c3, c1893c) || !c(i7, c1893c2, c1893c)) {
            return false;
        }
        float f9 = c1893c3.f19870b;
        float f10 = c1893c3.f19872d;
        float f11 = c1893c3.f19869a;
        float f12 = c1893c3.f19871c;
        float f13 = c1893c.f19872d;
        float f14 = c1893c.f19870b;
        float f15 = c1893c.f19871c;
        float f16 = c1893c.f19869a;
        if (i7 == 3) {
            if (f16 < f12) {
                return true;
            }
        } else if (i7 == 4) {
            if (f15 > f11) {
                return true;
            }
        } else if (i7 == 5) {
            if (f14 < f10) {
                return true;
            }
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f13 > f9) {
                return true;
            }
        }
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        if (i7 == 3) {
            f7 = f16 - c1893c2.f19871c;
        } else if (i7 == 4) {
            f7 = c1893c2.f19869a - f15;
        } else if (i7 == 5) {
            f7 = f14 - c1893c2.f19872d;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f7 = c1893c2.f19870b - f13;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (i7 == 3) {
            f8 = f16 - f11;
        } else if (i7 == 4) {
            f8 = f12 - f15;
        } else if (i7 == 5) {
            f8 = f14 - f9;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f8 = f10 - f13;
        }
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        return f7 < f8;
    }

    public static final boolean c(int i7, C1893c c1893c, C1893c c1893c2) {
        if (i7 == 3 || i7 == 4) {
            return c1893c.f19872d > c1893c2.f19870b && c1893c.f19870b < c1893c2.f19872d;
        }
        if (i7 == 5 || i7 == 6) {
            return c1893c.f19871c > c1893c2.f19869a && c1893c.f19869a < c1893c2.f19871c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final C1893c d(View view, C0415x c0415x) {
        int[] iArr = f18777a;
        view.getLocationInWindow(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        c0415x.getLocationInWindow(iArr);
        float f7 = i7 - iArr[0];
        float f8 = i8 - iArr[1];
        return new C1893c(f7, f8, view.getWidth() + f7, view.getHeight() + f8);
    }

    public static final boolean e(u uVar, boolean z6) {
        int iOrdinal = uVar.D0().ordinal();
        if (iOrdinal == 0) {
            ((k) ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner()).g(null);
            uVar.B0(t.f18812o, t.f18815r);
            return true;
        }
        if (iOrdinal == 1) {
            u uVarN = n(uVar);
            if (!(uVarN != null ? e(uVarN, z6) : true)) {
                return false;
            }
            uVar.B0(t.f18813p, t.f18815r);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new W();
        }
        if (z6) {
            ((k) ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner()).g(null);
            uVar.B0(t.f18814q, t.f18815r);
        }
        return z6;
    }

    public static final void f(u uVar, h0.e eVar) {
        if (!uVar.f15637o.f15636B) {
            N0.a.b("visitChildren called on an unattached node");
        }
        h0.e eVar2 = new h0.e(new AbstractC1397o[16]);
        AbstractC1397o abstractC1397o = uVar.f15637o;
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15642t;
        if (abstractC1397o2 == null) {
            AbstractC0347f.b(eVar2, abstractC1397o);
        } else {
            eVar2.b(abstractC1397o2);
        }
        while (true) {
            int i7 = eVar2.f12548q;
            if (i7 == 0) {
                return;
            }
            AbstractC1397o abstractC1397oF = (AbstractC1397o) eVar2.l(i7 - 1);
            if ((abstractC1397oF.f15640r & 1024) == 0) {
                AbstractC0347f.b(eVar2, abstractC1397oF);
            } else {
                while (true) {
                    if (abstractC1397oF == null) {
                        break;
                    }
                    if ((abstractC1397oF.f15639q & 1024) != 0) {
                        h0.e eVar3 = null;
                        while (abstractC1397oF != null) {
                            if (abstractC1397oF instanceof u) {
                                u uVar2 = (u) abstractC1397oF;
                                if (uVar2.f15636B && !AbstractC0347f.x(uVar2).f5829e0) {
                                    if (uVar2.C0().f18797a) {
                                        eVar.b(uVar2);
                                    } else {
                                        f(uVar2, eVar);
                                    }
                                }
                            } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                int i8 = 0;
                                for (AbstractC1397o abstractC1397o3 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o3 != null; abstractC1397o3 = abstractC1397o3.f15642t) {
                                    if ((abstractC1397o3.f15639q & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            abstractC1397oF = abstractC1397o3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (abstractC1397oF != null) {
                                                eVar3.b(abstractC1397oF);
                                                abstractC1397oF = null;
                                            }
                                            eVar3.b(abstractC1397o3);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC1397oF = AbstractC0347f.f(eVar3);
                        }
                    } else {
                        abstractC1397oF = abstractC1397oF.f15642t;
                    }
                }
            }
        }
    }

    public static final u g(u uVar) {
        u uVar2 = ((k) ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner()).h;
        if (uVar2 == null || !uVar2.f15636B) {
            return null;
        }
        return uVar2;
    }

    public static final u h(h0.e eVar, C1893c c1893c, int i7) {
        C1893c c1893cH;
        if (i7 == 3) {
            c1893cH = c1893c.h((c1893c.f19871c - c1893c.f19869a) + 1, 0.0f);
        } else if (i7 == 4) {
            c1893cH = c1893c.h(-((c1893c.f19871c - c1893c.f19869a) + 1), 0.0f);
        } else if (i7 == 5) {
            c1893cH = c1893c.h(0.0f, (c1893c.f19872d - c1893c.f19870b) + 1);
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c1893cH = c1893c.h(0.0f, -((c1893c.f19872d - c1893c.f19870b) + 1));
        }
        Object[] objArr = eVar.f12546o;
        int i8 = eVar.f12548q;
        u uVar = null;
        for (int i9 = 0; i9 < i8; i9++) {
            u uVar2 = (u) objArr[i9];
            if (r(uVar2)) {
                C1893c c1893cJ = j(uVar2);
                if (o(c1893cJ, c1893cH, c1893c, i7)) {
                    uVar = uVar2;
                    c1893cH = c1893cJ;
                }
            }
        }
        return uVar;
    }

    public static final boolean i(u uVar, int i7, InterfaceC1182c interfaceC1182c) {
        C1893c c1893c;
        h0.e eVar = new h0.e(new u[16]);
        f(uVar, eVar);
        int i8 = eVar.f12548q;
        if (i8 <= 1) {
            u uVar2 = (u) (i8 == 0 ? null : eVar.f12546o[0]);
            if (uVar2 != null) {
                return ((Boolean) interfaceC1182c.b(uVar2)).booleanValue();
            }
        } else {
            if (i7 == 7) {
                i7 = 4;
            }
            if (i7 == 4 || i7 == 6) {
                C1893c c1893cJ = j(uVar);
                float f7 = c1893cJ.f19870b;
                float f8 = c1893cJ.f19869a;
                c1893c = new C1893c(f8, f7, f8, f7);
            } else {
                if (i7 != 3 && i7 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C1893c c1893cJ2 = j(uVar);
                float f9 = c1893cJ2.f19872d;
                float f10 = c1893cJ2.f19871c;
                c1893c = new C1893c(f10, f9, f10, f9);
            }
            u uVarH = h(eVar, c1893c, i7);
            if (uVarH != null) {
                return ((Boolean) interfaceC1182c.b(uVarH)).booleanValue();
            }
        }
        return false;
    }

    public static final C1893c j(u uVar) {
        j0 j0Var = uVar.f15644v;
        return j0Var != null ? w0.i(j0Var).m(j0Var, false) : C1893c.f19868e;
    }

    public static final boolean k(u uVar, M m7) {
        int iOrdinal = uVar.D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                u uVarN = n(uVar);
                if (uVarN != null) {
                    return k(uVarN, m7) || m(uVar, uVarN, 1, m7);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return uVar.C0().f18797a ? ((Boolean) m7.b(uVar)).booleanValue() : x(uVar, m7);
                }
                throw new W();
            }
        }
        return x(uVar, m7);
    }

    public static final boolean l(int i7, M m7, u uVar, C1893c c1893c) {
        if (A(i7, m7, uVar, c1893c)) {
            return true;
        }
        Boolean bool = (Boolean) z(uVar, i7, new w(((k) ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner()).h, uVar, c1893c, i7, m7, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(u uVar, u uVar2, int i7, M m7) {
        if (B(uVar, uVar2, i7, m7)) {
            return true;
        }
        Boolean bool = (Boolean) z(uVar, i7, new w(((k) ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner()).h, uVar, uVar2, i7, m7, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x006d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final w0.u n(w0.u r8) {
        /*
            r0.o r0 = r8.f15637o
            boolean r0 = r0.f15636B
            r1 = 0
            if (r0 != 0) goto L9
            goto Lac
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            N0.a.b(r0)
        L10:
            h0.e r0 = new h0.e
            r2 = 16
            r0.o[] r3 = new r0.AbstractC1397o[r2]
            r0.<init>(r3)
            r0.o r8 = r8.f15637o
            r0.o r3 = r8.f15642t
            if (r3 != 0) goto L23
            Q0.AbstractC0347f.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f12548q
            if (r8 == 0) goto Lac
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            r0.o r8 = (r0.AbstractC1397o) r8
            int r3 = r8.f15640r
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            Q0.AbstractC0347f.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f15639q
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La9
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof w0.u
            r5 = 1
            if (r4 == 0) goto L6e
            w0.u r8 = (w0.u) r8
            r0.o r4 = r8.f15637o
            boolean r4 = r4.f15636B
            if (r4 == 0) goto La4
            w0.t r4 = r8.D0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6d
            if (r4 == r5) goto L6d
            r5 = 2
            if (r4 == r5) goto L6d
            r8 = 3
            if (r4 != r8) goto L67
            goto La4
        L67:
            A2.W r8 = new A2.W
            r8.<init>()
            throw r8
        L6d:
            return r8
        L6e:
            int r4 = r8.f15639q
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La4
            boolean r4 = r8 instanceof Q0.AbstractC0358n
            if (r4 == 0) goto La4
            r4 = r8
            Q0.n r4 = (Q0.AbstractC0358n) r4
            r0.o r4 = r4.f6056D
            r6 = 0
        L7e:
            if (r4 == 0) goto La1
            int r7 = r4.f15639q
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9e
            int r6 = r6 + 1
            if (r6 != r5) goto L8c
            r8 = r4
            goto L9e
        L8c:
            if (r3 != 0) goto L95
            h0.e r3 = new h0.e
            r0.o[] r7 = new r0.AbstractC1397o[r2]
            r3.<init>(r7)
        L95:
            if (r8 == 0) goto L9b
            r3.b(r8)
            r8 = r1
        L9b:
            r3.b(r4)
        L9e:
            r0.o r4 = r4.f15642t
            goto L7e
        La1:
            if (r6 != r5) goto La4
            goto L45
        La4:
            r0.o r8 = Q0.AbstractC0347f.f(r3)
            goto L45
        La9:
            r0.o r8 = r8.f15642t
            goto L3c
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.n(w0.u):w0.u");
    }

    public static final boolean o(C1893c c1893c, C1893c c1893c2, C1893c c1893c3, int i7) {
        if (!p(i7, c1893c, c1893c3)) {
            return false;
        }
        if (p(i7, c1893c2, c1893c3) && !b(c1893c3, c1893c, c1893c2, i7)) {
            return !b(c1893c3, c1893c2, c1893c, i7) && q(i7, c1893c3, c1893c) < q(i7, c1893c3, c1893c2);
        }
        return true;
    }

    public static final boolean p(int i7, C1893c c1893c, C1893c c1893c2) {
        float f7 = c1893c.f19869a;
        float f8 = c1893c.f19871c;
        if (i7 == 3) {
            float f9 = c1893c2.f19871c;
            float f10 = c1893c2.f19869a;
            return (f9 > f8 || f10 >= f8) && f10 > f7;
        }
        if (i7 == 4) {
            float f11 = c1893c2.f19869a;
            float f12 = c1893c2.f19871c;
            return (f11 < f7 || f12 <= f7) && f12 < f8;
        }
        float f13 = c1893c.f19870b;
        float f14 = c1893c.f19872d;
        if (i7 == 5) {
            float f15 = c1893c2.f19872d;
            float f16 = c1893c2.f19870b;
            return (f15 > f14 || f16 >= f14) && f16 > f13;
        }
        if (i7 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f17 = c1893c2.f19870b;
        float f18 = c1893c2.f19872d;
        return (f17 < f13 || f18 <= f13) && f18 < f14;
    }

    public static final long q(int i7, C1893c c1893c, C1893c c1893c2) {
        float f7;
        float f8;
        float f9 = c1893c2.f19870b;
        float f10 = c1893c2.f19872d;
        float f11 = c1893c2.f19869a;
        float f12 = c1893c2.f19871c;
        if (i7 == 3) {
            f7 = c1893c.f19869a - f12;
        } else if (i7 == 4) {
            f7 = f11 - c1893c.f19871c;
        } else if (i7 == 5) {
            f7 = c1893c.f19870b - f10;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f7 = f9 - c1893c.f19872d;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j3 = (long) f7;
        if (i7 == 3 || i7 == 4) {
            float f13 = c1893c.f19872d;
            float f14 = c1893c.f19870b;
            float f15 = 2;
            f8 = (((f13 - f14) / f15) + f14) - (((f10 - f9) / f15) + f9);
        } else {
            if (i7 != 5 && i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f16 = c1893c.f19871c;
            float f17 = c1893c.f19869a;
            float f18 = 2;
            f8 = (((f16 - f17) / f18) + f17) - (((f12 - f11) / f18) + f11);
        }
        long j7 = (long) f8;
        return (j7 * j7) + (((long) 13) * j3 * j3);
    }

    public static final boolean r(u uVar) {
        K k7;
        j0 j0Var;
        K k8;
        j0 j0Var2 = uVar.f15644v;
        return (j0Var2 == null || (k7 = j0Var2.f6024C) == null || !k7.J() || (j0Var = uVar.f15644v) == null || (k8 = j0Var.f6024C) == null || !k8.I()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l5.c, m5.l] */
    public static final EnumC1694b s(u uVar, int i7) {
        int iOrdinal = uVar.D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                u uVarN = n(uVar);
                if (uVarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC1694b enumC1694bS = s(uVarN, i7);
                EnumC1694b enumC1694b = EnumC1694b.f18770o;
                if (enumC1694bS == enumC1694b) {
                    enumC1694bS = null;
                }
                if (enumC1694bS != null) {
                    return enumC1694bS;
                }
                if (uVar.f18818D) {
                    return enumC1694b;
                }
                uVar.f18818D = true;
                try {
                    n nVarC0 = uVar.C0();
                    C1693a c1693a = new C1693a(i7);
                    i focusOwner = ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner();
                    u uVar2 = ((k) focusOwner).h;
                    nVarC0.f18806k.b(c1693a);
                    u uVar3 = ((k) focusOwner).h;
                    if (!c1693a.f18769b) {
                        return (uVar2 == uVar3 || uVar3 == null) ? enumC1694b : p.f18809d == p.f18808c ? EnumC1694b.f18771p : EnumC1694b.f18772q;
                    }
                    p pVar = p.f18807b;
                    return EnumC1694b.f18771p;
                } finally {
                    uVar.f18818D = false;
                }
            }
            if (iOrdinal == 2) {
                return EnumC1694b.f18771p;
            }
            if (iOrdinal != 3) {
                throw new W();
            }
        }
        return EnumC1694b.f18770o;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l5.c, m5.l] */
    public static final EnumC1694b t(u uVar, int i7) {
        if (!uVar.f18819E) {
            uVar.f18819E = true;
            try {
                n nVarC0 = uVar.C0();
                C1693a c1693a = new C1693a(i7);
                i focusOwner = ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner();
                u uVar2 = ((k) focusOwner).h;
                nVarC0.f18805j.b(c1693a);
                u uVar3 = ((k) focusOwner).h;
                if (c1693a.f18769b) {
                    p pVar = p.f18807b;
                    return EnumC1694b.f18771p;
                }
                if (uVar2 != uVar3 && uVar3 != null) {
                    return p.f18809d == p.f18808c ? EnumC1694b.f18771p : EnumC1694b.f18772q;
                }
            } finally {
                uVar.f18819E = false;
            }
        }
        return EnumC1694b.f18770o;
    }

    public static final EnumC1694b u(u uVar, int i7) {
        AbstractC1397o abstractC1397oF;
        C0352h0 c0352h0;
        int iOrdinal = uVar.D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                u uVarN = n(uVar);
                if (uVarN != null) {
                    return s(uVarN, i7);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new W();
                }
                if (!uVar.f15637o.f15636B) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                AbstractC1397o abstractC1397o = uVar.f15637o.f15641s;
                K kX = AbstractC0347f.x(uVar);
                loop0: while (true) {
                    if (kX == null) {
                        abstractC1397oF = null;
                        break;
                    }
                    if ((kX.f5821T.f6005f.f15640r & 1024) != 0) {
                        while (abstractC1397o != null) {
                            if ((abstractC1397o.f15639q & 1024) != 0) {
                                abstractC1397oF = abstractC1397o;
                                h0.e eVar = null;
                                while (abstractC1397oF != null) {
                                    if (abstractC1397oF instanceof u) {
                                        break loop0;
                                    }
                                    if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                        int i8 = 0;
                                        for (AbstractC1397o abstractC1397o2 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
                                            if ((abstractC1397o2.f15639q & 1024) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    abstractC1397oF = abstractC1397o2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new h0.e(new AbstractC1397o[16]);
                                                    }
                                                    if (abstractC1397oF != null) {
                                                        eVar.b(abstractC1397oF);
                                                        abstractC1397oF = null;
                                                    }
                                                    eVar.b(abstractC1397o2);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    abstractC1397oF = AbstractC0347f.f(eVar);
                                }
                            }
                            abstractC1397o = abstractC1397o.f15641s;
                        }
                    }
                    kX = kX.v();
                    abstractC1397o = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
                }
                u uVar2 = (u) abstractC1397oF;
                if (uVar2 == null) {
                    return EnumC1694b.f18770o;
                }
                int iOrdinal2 = uVar2.D0().ordinal();
                if (iOrdinal2 == 0) {
                    return t(uVar2, i7);
                }
                if (iOrdinal2 == 1) {
                    return u(uVar2, i7);
                }
                if (iOrdinal2 == 2) {
                    return EnumC1694b.f18771p;
                }
                if (iOrdinal2 != 3) {
                    throw new W();
                }
                EnumC1694b enumC1694bU = u(uVar2, i7);
                EnumC1694b enumC1694b = enumC1694bU != EnumC1694b.f18770o ? enumC1694bU : null;
                return enumC1694b == null ? t(uVar2, i7) : enumC1694b;
            }
        }
        return EnumC1694b.f18770o;
    }

    /* JADX WARN: Removed duplicated region for block: B:340:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01f9 A[ADDED_TO_REGION, LOOP:9: B:342:0x01f9->B:349:0x020b, LOOP_START, PHI: r12
  0x01f9: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:341:0x01f7, B:349:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean v(w0.u r18) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.v(w0.u):boolean");
    }

    public static final boolean w(u uVar, M m7) {
        Object[] objArr = new u[16];
        if (!uVar.f15637o.f15636B) {
            N0.a.b("visitChildren called on an unattached node");
        }
        h0.e eVar = new h0.e(new AbstractC1397o[16]);
        AbstractC1397o abstractC1397o = uVar.f15637o;
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15642t;
        if (abstractC1397o2 == null) {
            AbstractC0347f.b(eVar, abstractC1397o);
        } else {
            eVar.b(abstractC1397o2);
        }
        int i7 = 0;
        while (true) {
            int i8 = eVar.f12548q;
            if (i8 == 0) {
                break;
            }
            AbstractC1397o abstractC1397oF = (AbstractC1397o) eVar.l(i8 - 1);
            if ((abstractC1397oF.f15640r & 1024) == 0) {
                AbstractC0347f.b(eVar, abstractC1397oF);
            } else {
                while (true) {
                    if (abstractC1397oF == null) {
                        break;
                    }
                    if ((abstractC1397oF.f15639q & 1024) != 0) {
                        h0.e eVar2 = null;
                        while (abstractC1397oF != null) {
                            if (abstractC1397oF instanceof u) {
                                u uVar2 = (u) abstractC1397oF;
                                int i9 = i7 + 1;
                                if (objArr.length < i9) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i9, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i7] = uVar2;
                                i7 = i9;
                            } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                int i10 = 0;
                                for (AbstractC1397o abstractC1397o3 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o3 != null; abstractC1397o3 = abstractC1397o3.f15642t) {
                                    if ((abstractC1397o3.f15639q & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC1397oF = abstractC1397o3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (abstractC1397oF != null) {
                                                eVar2.b(abstractC1397oF);
                                                abstractC1397oF = null;
                                            }
                                            eVar2.b(abstractC1397o3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC1397oF = AbstractC0347f.f(eVar2);
                        }
                    } else {
                        abstractC1397oF = abstractC1397oF.f15642t;
                    }
                }
            }
        }
        Z4.l.o0(objArr, v.f18821o, 0, i7);
        int i11 = i7 - 1;
        if (i11 < objArr.length) {
            while (i11 >= 0) {
                u uVar3 = (u) objArr[i11];
                if (r(uVar3) && a(uVar3, m7)) {
                    return true;
                }
                i11--;
            }
        }
        return false;
    }

    public static final boolean x(u uVar, M m7) {
        Object[] objArr = new u[16];
        if (!uVar.f15637o.f15636B) {
            N0.a.b("visitChildren called on an unattached node");
        }
        h0.e eVar = new h0.e(new AbstractC1397o[16]);
        AbstractC1397o abstractC1397o = uVar.f15637o;
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15642t;
        if (abstractC1397o2 == null) {
            AbstractC0347f.b(eVar, abstractC1397o);
        } else {
            eVar.b(abstractC1397o2);
        }
        int i7 = 0;
        while (true) {
            int i8 = eVar.f12548q;
            if (i8 == 0) {
                break;
            }
            AbstractC1397o abstractC1397oF = (AbstractC1397o) eVar.l(i8 - 1);
            if ((abstractC1397oF.f15640r & 1024) == 0) {
                AbstractC0347f.b(eVar, abstractC1397oF);
            } else {
                while (true) {
                    if (abstractC1397oF == null) {
                        break;
                    }
                    if ((abstractC1397oF.f15639q & 1024) != 0) {
                        h0.e eVar2 = null;
                        while (abstractC1397oF != null) {
                            if (abstractC1397oF instanceof u) {
                                u uVar2 = (u) abstractC1397oF;
                                int i9 = i7 + 1;
                                if (objArr.length < i9) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i9, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i7] = uVar2;
                                i7 = i9;
                            } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                int i10 = 0;
                                for (AbstractC1397o abstractC1397o3 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o3 != null; abstractC1397o3 = abstractC1397o3.f15642t) {
                                    if ((abstractC1397o3.f15639q & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC1397oF = abstractC1397o3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (abstractC1397oF != null) {
                                                eVar2.b(abstractC1397oF);
                                                abstractC1397oF = null;
                                            }
                                            eVar2.b(abstractC1397o3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC1397oF = AbstractC0347f.f(eVar2);
                        }
                    } else {
                        abstractC1397oF = abstractC1397oF.f15642t;
                    }
                }
            }
        }
        Z4.l.o0(objArr, v.f18821o, 0, i7);
        for (int i11 = 0; i11 < i7; i11++) {
            u uVar3 = (u) objArr[i11];
            if (r(uVar3) && k(uVar3, m7)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof C0415x) {
            return ((C0415x) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00ab A[PHI: r0
  0x00ab: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int) binds: [B:179:0x00a9, B:182:0x00ae, B:185:0x00b2, B:188:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(w0.u r10, int r11, l5.InterfaceC1182c r12) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.z(w0.u, int, l5.c):java.lang.Object");
    }
}
