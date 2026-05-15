package O0;

import Q0.C0342c0;
import R0.C0415x;
import android.os.Handler;
import d.C0746L;
import f0.AbstractC0918w;
import f0.C0879c;
import f0.C0898l0;
import f0.C0924z;
import f0.EnumC0900m0;
import f0.InterfaceC0895k;
import h0.C0994b;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import p0.AbstractC1289f;
import t.C1445G;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC0895k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final h0.e f5351A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f5352B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f5353C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f5354D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q0.K f5355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0918w f5356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public D0 f5357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t.J f5360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t.J f5361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final L f5362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final I f5363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t.J f5364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0 f5365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final t.J f5366z;

    public S(Q0.K k7, D0 d02) {
        this.f5355o = k7;
        this.f5357q = d02;
        long[] jArr = t.Q.f16032a;
        this.f5360t = new t.J();
        this.f5361u = new t.J();
        this.f5362v = new L(this);
        this.f5363w = new I(this);
        this.f5364x = new t.J();
        this.f5365y = new C0();
        this.f5366z = new t.J();
        this.f5351A = new h0.e(new Object[16]);
        this.f5354D = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void a(J j3) {
        t.K k7;
        C0898l0 c0898l0 = j3.f5325f;
        if (c0898l0 != null) {
            c0898l0.h.set(EnumC0900m0.f11841p);
            n0.j jVar = c0898l0.f11834j;
            if (jVar.f14494d.h()) {
                k7 = jVar.f14494d;
                t.K k8 = t.S.f16033a;
                jVar.f14494d = new t.K();
                jVar.f14493c.h();
            } else {
                k7 = null;
            }
            jVar.b();
            C0924z c0924z = c0898l0.f11826a;
            c0924z.f11960E = null;
            if (k7 != null) {
                c0924z.f11964I.f14500k = k7;
                c0924z.f11966K = 1;
            }
            j3.f5325f = null;
            C0924z c0924z2 = j3.f5322c;
            if (c0924z2 != null) {
                c0924z2.a();
            }
            j3.f5322c = null;
        }
    }

    public final void b(int i7) {
        boolean z6;
        boolean z7 = false;
        this.f5352B = 0;
        List listP = this.f5355o.p();
        C0994b c0994b = (C0994b) listP;
        int i8 = (((h0.e) c0994b.f12538p).f12548q - this.f5353C) - 1;
        if (i7 <= i8) {
            this.f5365y.clear();
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    Object objG = this.f5360t.g((Q0.K) c0994b.get(i9));
                    AbstractC1209k.c(objG);
                    ((C1445G) this.f5365y.f5286p).a(((J) objG).f5320a);
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f5357q.c(this.f5365y);
            AbstractC1289f abstractC1289fQ = C0746L.q();
            InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
            AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
            z6 = false;
            while (i8 >= i7) {
                try {
                    Q0.K k7 = (Q0.K) ((C0994b) listP).get(i8);
                    Object objG2 = this.f5360t.g(k7);
                    AbstractC1209k.c(objG2);
                    J j3 = (J) objG2;
                    Object obj = j3.f5320a;
                    if (((C1445G) this.f5365y.f5286p).c(obj)) {
                        this.f5352B++;
                        if (((Boolean) j3.f5326g.getValue()).booleanValue()) {
                            Q0.P p7 = k7.f5822U;
                            C0342c0 c0342c0 = p7.f5869p;
                            Q0.I i10 = Q0.I.f5796q;
                            c0342c0.f5971z = i10;
                            Q0.Y y6 = p7.f5870q;
                            if (y6 != null) {
                                y6.f5919x = i10;
                            }
                            f(j3, false);
                            if (j3.h) {
                                z6 = true;
                            }
                        }
                    } else {
                        Q0.K k8 = this.f5355o;
                        k8.f5806E = true;
                        this.f5360t.k(k7);
                        C0924z c0924z = j3.f5322c;
                        if (c0924z != null) {
                            c0924z.a();
                        }
                        this.f5355o.Q(i8, 1);
                        k8.f5806E = false;
                    }
                    this.f5361u.k(obj);
                    i8--;
                } catch (Throwable th) {
                    C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                    throw th;
                }
            }
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
        } else {
            z6 = false;
        }
        if (z6) {
            synchronized (p0.l.f14941c) {
                t.K k9 = p0.l.f14947j.h;
                if (k9 != null) {
                    if (k9.h()) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                p0.l.a();
            }
        }
        c();
    }

    public final void c() {
        int i7 = ((h0.e) ((C0994b) this.f5355o.p()).f12538p).f12548q;
        t.J j3 = this.f5360t;
        if (j3.f16007e != i7) {
            N0.a.a("Inconsistency between the count of nodes tracked by the state (" + j3.f16007e + ") and the children count on the SubcomposeLayout (" + i7 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i7 - this.f5352B) - this.f5353C < 0) {
            StringBuilder sbV = n1.c.v(i7, "Incorrect state. Total children ", ". Reusable children ");
            sbV.append(this.f5352B);
            sbV.append(". Precomposed children ");
            sbV.append(this.f5353C);
            N0.a.a(sbV.toString());
        }
        t.J j7 = this.f5364x;
        if (j7.f16007e == this.f5353C) {
            return;
        }
        N0.a.a("Incorrect state. Precomposed children " + this.f5353C + ". Map size " + j7.f16007e);
    }

    public final void d(boolean z6) {
        this.f5353C = 0;
        this.f5364x.a();
        List listP = this.f5355o.p();
        int i7 = ((h0.e) ((C0994b) listP).f12538p).f12548q;
        if (this.f5352B != i7) {
            this.f5352B = i7;
            AbstractC1289f abstractC1289fQ = C0746L.q();
            InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
            AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
            for (int i8 = 0; i8 < i7; i8++) {
                try {
                    Q0.K k7 = (Q0.K) ((C0994b) listP).get(i8);
                    J j3 = (J) this.f5360t.g(k7);
                    if (j3 != null && ((Boolean) j3.f5326g.getValue()).booleanValue()) {
                        Q0.P p7 = k7.f5822U;
                        C0342c0 c0342c0 = p7.f5869p;
                        Q0.I i9 = Q0.I.f5796q;
                        c0342c0.f5971z = i9;
                        Q0.Y y6 = p7.f5870q;
                        if (y6 != null) {
                            y6.f5919x = i9;
                        }
                        f(j3, z6);
                        j3.f5320a = w0.f5465a;
                    }
                } catch (Throwable th) {
                    C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                    throw th;
                }
            }
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
            this.f5361u.a();
        }
        c();
    }

    @Override // f0.InterfaceC0895k
    public final void e() {
        d(false);
    }

    public final void f(J j3, boolean z6) {
        C0924z c0924z;
        if (z6 || !j3.h) {
            j3.f5326g = C0879c.t(Boolean.FALSE);
        } else {
            j3.f5326g.setValue(Boolean.FALSE);
        }
        if (j3.f5325f != null) {
            a(j3);
            return;
        }
        if (z6) {
            C0924z c0924z2 = j3.f5322c;
            if (c0924z2 != null) {
                c0924z2.l();
                return;
            }
            return;
        }
        Q0.q0 outOfFrameExecutor = ((C0415x) Q0.O.a(this.f5355o)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (j3.h || (c0924z = j3.f5322c) == null) {
                return;
            }
            c0924z.l();
            return;
        }
        E0.K k7 = new E0.K(4, j3);
        Handler handler = ((C0415x) outOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new B2.e(8, k7));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // f0.InterfaceC0895k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r17 = this;
            r0 = r17
            Q0.K r1 = r0.f5355o
            r2 = 1
            r1.f5806E = r2
            t.J r2 = r0.f5360t
            java.lang.Object[] r3 = r2.f16005c
            long[] r4 = r2.f16003a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            O0.J r13 = (O0.J) r13
            f0.z r13 = r13.f5322c
            if (r13 == 0) goto L47
            r13.a()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r1.P()
            r1.f5806E = r6
            r2.a()
            t.J r1 = r0.f5361u
            r1.a()
            r0.f5353C = r6
            r0.f5352B = r6
            t.J r1 = r0.f5364x
            r1.a()
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.S.g():void");
    }

    @Override // f0.InterfaceC0895k
    public final void h() {
        d(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0 A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:60:0x00b5, B:63:0x00c1, B:74:0x00eb, B:76:0x00fd, B:80:0x0114, B:82:0x0118, B:86:0x0125, B:92:0x0179, B:85:0x0120, B:87:0x013f, B:88:0x015c, B:90:0x0162, B:91:0x0176, B:78:0x0102, B:71:0x00d0, B:73:0x00de, B:97:0x0185, B:98:0x018f), top: B:101:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:60:0x00b5, B:63:0x00c1, B:74:0x00eb, B:76:0x00fd, B:80:0x0114, B:82:0x0118, B:86:0x0125, B:92:0x0179, B:85:0x0120, B:87:0x013f, B:88:0x015c, B:90:0x0162, B:91:0x0176, B:78:0x0102, B:71:0x00d0, B:73:0x00de, B:97:0x0185, B:98:0x018f), top: B:101:0x00b5 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(Q0.K r21, java.lang.Object r22, boolean r23, l5.e r24) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.S.i(Q0.K, java.lang.Object, boolean, l5.e):void");
    }

    public final Q0.K j(Object obj) {
        t.J j3;
        int i7;
        if (this.f5352B == 0) {
            return null;
        }
        Q0.K k7 = this.f5355o;
        C0994b c0994b = (C0994b) k7.p();
        int i8 = ((h0.e) c0994b.f12538p).f12548q - this.f5353C;
        int i9 = i8 - this.f5352B;
        int i10 = i8 - 1;
        int i11 = i10;
        while (true) {
            j3 = this.f5360t;
            if (i11 < i9) {
                i7 = -1;
                break;
            }
            Object objG = j3.g((Q0.K) c0994b.get(i11));
            AbstractC1209k.c(objG);
            if (AbstractC1209k.a(((J) objG).f5320a, obj)) {
                i7 = i11;
                break;
            }
            i11--;
        }
        if (i7 == -1) {
            while (i10 >= i9) {
                Object objG2 = j3.g((Q0.K) c0994b.get(i10));
                AbstractC1209k.c(objG2);
                J j7 = (J) objG2;
                Object obj2 = j7.f5320a;
                if (obj2 == w0.f5465a || this.f5357q.d(obj, obj2)) {
                    j7.f5320a = obj;
                    i11 = i10;
                    i7 = i11;
                    break;
                }
                i10--;
            }
            i11 = i10;
        }
        if (i7 == -1) {
            return null;
        }
        if (i11 != i9) {
            k7.f5806E = true;
            k7.M(i11, i9, 1);
            k7.f5806E = false;
        }
        this.f5352B--;
        Q0.K k8 = (Q0.K) c0994b.get(i9);
        Object objG3 = j3.g(k8);
        AbstractC1209k.c(objG3);
        J j8 = (J) objG3;
        j8.f5326g = C0879c.t(Boolean.TRUE);
        j8.f5324e = true;
        j8.f5323d = true;
        return k8;
    }
}
