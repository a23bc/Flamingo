package Q0;

import D.AbstractC0060d;
import H.C0163e;
import K0.C0245m;
import K0.EnumC0246n;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import R0.C0415x;
import android.os.SystemClock;
import android.view.MotionEvent;
import j5.AbstractC1107a;
import java.util.ArrayList;
import java.util.HashSet;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import r0.InterfaceC1396n;

/* JADX INFO: renamed from: Q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0341c extends AbstractC1397o implements A, InterfaceC0360p, A0, x0, P0.d, P0.e, v0, InterfaceC0369z, InterfaceC0361q, w0.e, w0.o, w0.q, t0, v0.b {

    /* JADX INFO: renamed from: C */
    public InterfaceC1396n f5937C;

    /* JADX INFO: renamed from: D */
    public P0.a f5938D;

    /* JADX INFO: renamed from: E */
    public HashSet f5939E;

    /* JADX WARN: Removed duplicated region for block: B:80:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(boolean r6) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0341c.B0(boolean):void");
    }

    public final void C0() {
        if (!this.f15636B) {
            N0.a.b("unInitializeModifier called on unattached node");
        }
        InterfaceC1396n interfaceC1396n = this.f5937C;
        if ((this.f15639q & 32) != 0) {
            boolean z6 = interfaceC1396n instanceof D.Y;
            P0.f fVar = AbstractC0060d.f1306c;
            if (z6) {
                P0.c modifierLocalManager = ((C0415x) AbstractC0347f.y(this)).getModifierLocalManager();
                ((D.Y) interfaceC1396n).getClass();
                modifierLocalManager.f5706d.b(AbstractC0347f.x(this));
                modifierLocalManager.f5707e.b(fVar);
                modifierLocalManager.a();
            }
            if (interfaceC1396n instanceof D.Y) {
                D.Y y6 = (D.Y) interfaceC1396n;
                y6.getClass();
                D.x0 x0Var = (D.x0) fVar.f5709a.a();
                D.x0 x0Var2 = y6.f1285a;
                y6.f1286b.setValue(new D.E(x0Var2, x0Var));
                y6.f1287c.setValue(new D.u0(x0Var, x0Var2));
            }
        }
        if ((this.f15639q & 8) != 0) {
            ((C0415x) AbstractC0347f.y(this)).F();
        }
    }

    public final void D0() {
        if (this.f15636B) {
            this.f5939E.clear();
            ((C0415x) AbstractC0347f.y(this)).getSnapshotObserver().a(this, C0345e.f5975q, new C0339b(this, 1));
        }
    }

    @Override // w0.o
    public final void G(w0.l lVar) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        N0.a.b("applyFocusProperties called on wrong node");
        interfaceC1396n.getClass();
        throw new ClassCastException();
    }

    @Override // Q0.v0
    public final Object M(n1.d dVar, Object obj) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((O0.j0) interfaceC1396n).i(dVar);
    }

    @Override // Q0.x0
    public final boolean S() {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((K0.B) interfaceC1396n).f3823d.getClass();
        return true;
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        int i7;
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        Y0.j jVarL = ((Y0.k) interfaceC1396n).l();
        AbstractC1209k.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (jVarL.f8475q) {
            jVar.f8475q = true;
        }
        if (jVarL.f8476r) {
            jVar.f8476r = true;
        }
        t.J j3 = jVarL.f8473o;
        Object[] objArr = j3.f16004b;
        Object[] objArr2 = j3.f16005c;
        long[] jArr = j3.f16003a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j7 = jArr[i8];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j7) < 128) {
                        int i12 = (i8 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        Y0.w wVar = (Y0.w) obj;
                        t.J j8 = jVar.f8473o;
                        if (!j8.b(wVar)) {
                            j8.m(wVar, obj2);
                        } else if (obj2 instanceof Y0.a) {
                            Object objG = j8.g(wVar);
                            i7 = i9;
                            AbstractC1209k.d(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            Y0.a aVar = (Y0.a) objG;
                            String str = aVar.f8430a;
                            if (str == null) {
                                str = ((Y0.a) obj2).f8430a;
                            }
                            Y4.c cVar = aVar.f8431b;
                            if (cVar == null) {
                                cVar = ((Y0.a) obj2).f8431b;
                            }
                            j8.m(wVar, new Y0.a(str, cVar));
                        }
                        i7 = i9;
                    } else {
                        i7 = i9;
                    }
                    j7 >>= i7;
                    i11++;
                    i9 = i7;
                }
                if (i10 != i9) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    @Override // Q0.x0
    public final void X() {
        Z();
    }

    @Override // Q0.x0
    public final void Z() {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        U3.h hVar = ((K0.B) interfaceC1396n).f3823d;
        if (((K0.z) hVar.f7043p) == K0.z.f3937p) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            K0.B b7 = (K0.B) hVar.f7045r;
            ((K0.C) b7.k()).b(motionEventObtain);
            motionEventObtain.recycle();
            hVar.f7043p = K0.z.f3936o;
            b7.f3822c = false;
            hVar.f7044q = null;
        }
    }

    @Override // Q0.InterfaceC0360p
    public final void a(N n7) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((v0.f) interfaceC1396n).a(n7);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // v0.b
    public final n1.d b() {
        return AbstractC0347f.x(this).f5814M;
    }

    @Override // Q0.A
    public final int c(T t7, O0.Y y6, int i7) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((O0.G) interfaceC1396n).c(t7, y6, i7);
    }

    @Override // Q0.A
    public final int d(T t7, O0.Y y6, int i7) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((O0.G) interfaceC1396n).d(t7, y6, i7);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((O0.G) interfaceC1396n).e(interfaceC0298b0, y6, j3);
    }

    @Override // v0.b
    public final long f() {
        return AbstractC1107a.E(AbstractC0347f.v(this, 128).f5418q);
    }

    @Override // Q0.InterfaceC0360p
    public final void f0() {
        AbstractC0347f.m(this);
    }

    @Override // Q0.A
    public final int g(T t7, O0.Y y6, int i7) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((O0.G) interfaceC1396n).g(t7, y6, i7);
    }

    @Override // Q0.x0
    public final void g0() {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((K0.B) interfaceC1396n).f3823d.getClass();
    }

    @Override // v0.b
    public final n1.n getLayoutDirection() {
        return AbstractC0347f.x(this).f5815N;
    }

    @Override // Q0.A
    public final int h(T t7, O0.Y y6, int i7) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((O0.G) interfaceC1396n).h(t7, y6, i7);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // P0.d
    public final N5.l j() {
        P0.a aVar = this.f5938D;
        return aVar != null ? aVar : P0.b.f5702g;
    }

    @Override // w0.e
    public final void l0(w0.t tVar) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        N0.a.b("onFocusEvent called on wrong node");
        interfaceC1396n.getClass();
        throw new ClassCastException();
    }

    @Override // Q0.x0
    public final long q() {
        return D0.f5781a;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        B0(true);
    }

    @Override // r0.AbstractC1397o
    public final void s0() {
        if (this.f5937C instanceof K0.B) {
            Z();
        }
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        C0();
    }

    public final String toString() {
        return this.f5937C.toString();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // Q0.x0
    public final void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        boolean z6;
        boolean z7;
        boolean z8;
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        U3.h hVar = ((K0.B) interfaceC1396n).f3823d;
        hVar.getClass();
        ?? r13 = c0245m.f3896a;
        int size = r13.size();
        for (int i7 = 0; i7 < size; i7++) {
            K0.u uVar = (K0.u) r13.get(i7);
            if (K0.t.a(uVar) || K0.t.c(uVar)) {
                z6 = false;
                break;
            }
        }
        z6 = true;
        if (!z6) {
            z7 = false;
            break;
        }
        int size2 = r13.size();
        for (int i8 = 0; i8 < size2; i8++) {
            if (((K0.u) r13.get(i8)).b()) {
                z7 = false;
                break;
            }
        }
        z7 = true;
        K0.B b7 = (K0.B) hVar.f7045r;
        if (b7.f3822c) {
            z8 = true;
        } else {
            int size3 = r13.size();
            int i9 = 0;
            while (true) {
                if (i9 < size3) {
                    K0.u uVar2 = (K0.u) r13.get(i9);
                    if (K0.t.a(uVar2) || K0.t.c(uVar2)) {
                        break;
                    } else {
                        i9++;
                    }
                } else if (z7) {
                    break;
                } else {
                    z8 = false;
                }
            }
            z8 = true;
        }
        if (((K0.z) hVar.f7043p) != K0.z.f3938q) {
            if (enumC0246n == EnumC0246n.f3901o && z8) {
                hVar.f7044q = c0245m;
                hVar.D(c0245m, !z6 || b7.f3822c);
            }
            if (enumC0246n == EnumC0246n.f3902p && z6 && c0245m.equals((C0245m) hVar.f7044q) && b7.f3822c) {
                int size4 = r13.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    ((K0.u) r13.get(i10)).a();
                }
            }
            if (enumC0246n == EnumC0246n.f3903q && !z8 && !c0245m.equals((C0245m) hVar.f7044q)) {
                hVar.D(c0245m, true);
            }
        }
        if (enumC0246n == EnumC0246n.f3903q) {
            int size5 = r13.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size5) {
                    hVar.f7043p = K0.z.f3936o;
                    b7.f3822c = false;
                    hVar.f7044q = null;
                    break;
                } else if (!K0.t.c((K0.u) r13.get(i11))) {
                    break;
                } else {
                    i11++;
                }
            }
            if (c0245m.equals((C0245m) hVar.f7044q) && z6) {
                int size6 = r13.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size6) {
                        break;
                    }
                    if (!((K0.u) r13.get(i12)).b()) {
                        i12++;
                    } else if (!b7.f3822c) {
                        hVar.m0(c0245m);
                        return;
                    }
                }
                int size7 = r13.size();
                for (int i13 = 0; i13 < size7; i13++) {
                    ((K0.u) r13.get(i13)).a();
                }
            }
        }
    }

    @Override // Q0.t0
    public final boolean w() {
        return this.f15636B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // P0.e
    public final Object y(P0.f fVar) {
        C0352h0 c0352h0;
        this.f5939E.add(fVar);
        if (!this.f15637o.f15636B) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1397o abstractC1397o = this.f15637o.f15641s;
        K kX = AbstractC0347f.x(this);
        while (kX != null) {
            if ((kX.f5821T.f6005f.f15640r & 32) != 0) {
                while (abstractC1397o != null) {
                    if ((abstractC1397o.f15639q & 32) != 0) {
                        ?? F6 = abstractC1397o;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof P0.d) {
                                P0.d dVar = (P0.d) F6;
                                if (dVar.j().s(fVar)) {
                                    return dVar.j().z(fVar);
                                }
                            } else if ((F6.f15639q & 32) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                                int i7 = 0;
                                F6 = F6;
                                eVar = eVar;
                                while (abstractC1397o2 != null) {
                                    if ((abstractC1397o2.f15639q & 32) != 0) {
                                        i7++;
                                        eVar = eVar;
                                        if (i7 == 1) {
                                            F6 = abstractC1397o2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar.b(F6);
                                                F6 = 0;
                                            }
                                            eVar.b(abstractC1397o2);
                                        }
                                    }
                                    abstractC1397o2 = abstractC1397o2.f15642t;
                                    F6 = F6;
                                    eVar = eVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F6 = AbstractC0347f.f(eVar);
                        }
                    }
                    abstractC1397o = abstractC1397o.f15641s;
                }
            }
            kX = kX.v();
            abstractC1397o = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
        }
        return fVar.f5709a.a();
    }

    @Override // Q0.InterfaceC0361q
    public final void z(j0 j0Var) {
        InterfaceC1396n interfaceC1396n = this.f5937C;
        AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C0163e c0163e = (C0163e) interfaceC1396n;
        if (c0163e.f2861a) {
            return;
        }
        c0163e.f2861a = true;
        ArrayList arrayList = c0163e.f2862b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((c5.d) arrayList.get(i7)).resumeWith(Y4.o.f8736a);
        }
        arrayList.clear();
    }

    @Override // Q0.InterfaceC0369z
    public final void Q(O0.C c7) {
    }

    @Override // Q0.InterfaceC0369z
    public final void r(long j3) {
    }
}
