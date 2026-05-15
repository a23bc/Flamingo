package K0;

import A2.C0001b;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.j0;
import Q0.x0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import t.C1444F;
import t.C1463s;

/* JADX INFO: renamed from: K0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0243k extends C0244l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1397o f3887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.b f3888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1463s f3889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f3890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0245m f3891g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3893j;

    public C0243k(AbstractC1397o abstractC1397o) {
        this.f3887c = abstractC1397o;
        L0.b bVar = new L0.b(0);
        bVar.f4091c = new long[2];
        this.f3888d = bVar;
        this.f3889e = new C1463s(2);
        this.f3892i = true;
        this.f3893j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // K0.C0244l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(t.C1463s r53, O0.C r54, A2.C0001b r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.C0243k.a(t.s, O0.C, A2.b, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // K0.C0244l
    public final void b(C0001b c0001b) {
        super.b(c0001b);
        C0245m c0245m = this.f3891g;
        if (c0245m == null) {
            return;
        }
        this.h = this.f3892i;
        ?? r12 = c0245m.f3896a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            u uVar = (u) r12.get(i7);
            boolean z6 = uVar.f3913d;
            long j3 = uVar.f3910a;
            boolean zD = c0001b.d(j3);
            boolean z7 = this.f3892i;
            if ((!z6 && !zD) || (!z6 && !z7)) {
                this.f3888d.d(j3);
            }
        }
        this.f3892i = false;
        this.f3893j = c0245m.f3900e == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        h0.e eVar = this.f3894a;
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C0243k) objArr[i8]).c();
        }
        ?? F6 = this.f3887c;
        ?? eVar2 = 0;
        while (F6 != 0) {
            if (F6 instanceof x0) {
                ((x0) F6).Z();
            } else if ((F6.f15639q & 16) != 0 && (F6 instanceof AbstractC0358n)) {
                AbstractC1397o abstractC1397o = ((AbstractC0358n) F6).f6056D;
                int i9 = 0;
                F6 = F6;
                eVar2 = eVar2;
                while (abstractC1397o != null) {
                    if ((abstractC1397o.f15639q & 16) != 0) {
                        i9++;
                        eVar2 = eVar2;
                        if (i9 == 1) {
                            F6 = abstractC1397o;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new h0.e(new AbstractC1397o[16]);
                            }
                            if (F6 != 0) {
                                eVar2.b(F6);
                                F6 = 0;
                            }
                            eVar2.b(abstractC1397o);
                        }
                    }
                    abstractC1397o = abstractC1397o.f15642t;
                    F6 = F6;
                    eVar2 = eVar2;
                }
                if (i9 == 1) {
                }
            }
            F6 = AbstractC0347f.f(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean d(C0001b c0001b) {
        C1463s c1463s = this.f3889e;
        boolean z6 = false;
        z6 = false;
        if (!(c1463s.h() == 0)) {
            AbstractC1397o abstractC1397o = this.f3887c;
            if (abstractC1397o.f15636B) {
                C0245m c0245m = this.f3891g;
                AbstractC1209k.c(c0245m);
                j0 j0Var = this.f3890f;
                AbstractC1209k.c(j0Var);
                long j3 = j0Var.f5418q;
                ?? F6 = abstractC1397o;
                ?? eVar = 0;
                while (F6 != 0) {
                    if (F6 instanceof x0) {
                        ((x0) F6).u(c0245m, EnumC0246n.f3903q, j3);
                    } else if ((F6.f15639q & 16) != 0 && (F6 instanceof AbstractC0358n)) {
                        AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                        int i7 = 0;
                        F6 = F6;
                        eVar = eVar;
                        while (abstractC1397o2 != null) {
                            if ((abstractC1397o2.f15639q & 16) != 0) {
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
                if (abstractC1397o.f15636B) {
                    h0.e eVar2 = this.f3894a;
                    Object[] objArr = eVar2.f12546o;
                    int i8 = eVar2.f12548q;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((C0243k) objArr[i9]).d(c0001b);
                    }
                }
                z6 = true;
            }
        }
        b(c0001b);
        c1463s.b();
        this.f3890f = null;
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r0v5, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean e(C0001b c0001b, boolean z6) {
        if (!(this.f3889e.h() == 0)) {
            ?? F6 = this.f3887c;
            if (F6.f15636B) {
                C0245m c0245m = this.f3891g;
                AbstractC1209k.c(c0245m);
                j0 j0Var = this.f3890f;
                AbstractC1209k.c(j0Var);
                long j3 = j0Var.f5418q;
                ?? F7 = F6;
                ?? eVar = 0;
                while (F7 != 0) {
                    if (F7 instanceof x0) {
                        ((x0) F7).u(c0245m, EnumC0246n.f3901o, j3);
                    } else if ((F7.f15639q & 16) != 0 && (F7 instanceof AbstractC0358n)) {
                        AbstractC1397o abstractC1397o = ((AbstractC0358n) F7).f6056D;
                        int i7 = 0;
                        F7 = F7;
                        eVar = eVar;
                        while (abstractC1397o != null) {
                            if ((abstractC1397o.f15639q & 16) != 0) {
                                i7++;
                                eVar = eVar;
                                if (i7 == 1) {
                                    F7 = abstractC1397o;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new h0.e(new AbstractC1397o[16]);
                                    }
                                    if (F7 != 0) {
                                        eVar.b(F7);
                                        F7 = 0;
                                    }
                                    eVar.b(abstractC1397o);
                                }
                            }
                            abstractC1397o = abstractC1397o.f15642t;
                            F7 = F7;
                            eVar = eVar;
                        }
                        if (i7 == 1) {
                        }
                    }
                    F7 = AbstractC0347f.f(eVar);
                }
                if (F6.f15636B) {
                    h0.e eVar2 = this.f3894a;
                    Object[] objArr = eVar2.f12546o;
                    int i8 = eVar2.f12548q;
                    for (int i9 = 0; i9 < i8; i9++) {
                        C0243k c0243k = (C0243k) objArr[i9];
                        AbstractC1209k.c(this.f3890f);
                        c0243k.e(c0001b, z6);
                    }
                }
                if (F6.f15636B) {
                    ?? eVar3 = 0;
                    while (F6 != 0) {
                        if (F6 instanceof x0) {
                            ((x0) F6).u(c0245m, EnumC0246n.f3902p, j3);
                        } else if ((F6.f15639q & 16) != 0 && (F6 instanceof AbstractC0358n)) {
                            AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                            int i10 = 0;
                            F6 = F6;
                            eVar3 = eVar3;
                            while (abstractC1397o2 != null) {
                                if ((abstractC1397o2.f15639q & 16) != 0) {
                                    i10++;
                                    eVar3 = eVar3;
                                    if (i10 == 1) {
                                        F6 = abstractC1397o2;
                                    } else {
                                        if (eVar3 == 0) {
                                            eVar3 = new h0.e(new AbstractC1397o[16]);
                                        }
                                        if (F6 != 0) {
                                            eVar3.b(F6);
                                            F6 = 0;
                                        }
                                        eVar3.b(abstractC1397o2);
                                    }
                                }
                                abstractC1397o2 = abstractC1397o2.f15642t;
                                F6 = F6;
                                eVar3 = eVar3;
                            }
                            if (i10 == 1) {
                            }
                        }
                        F6 = AbstractC0347f.f(eVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j3, C1444F c1444f) {
        L0.b bVar = this.f3888d;
        if (bVar.b(j3) && c1444f.f(this) < 0) {
            bVar.d(j3);
            this.f3889e.g(j3);
        }
        h0.e eVar = this.f3894a;
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C0243k) objArr[i8]).f(j3, c1444f);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f3887c + ", children=" + this.f3894a + ", pointerIds=" + this.f3888d + ')';
    }
}
