package z5;

import A5.AbstractC0027c;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.AbstractC1773a;
import w5.EnumC1766C;
import w5.q0;
import w5.w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a */
    public static final B5.u f21344a = new B5.u("NO_VALUE", 0);

    /* JADX INFO: renamed from: b */
    public static final B5.u f21345b = new B5.u("NONE", 0);

    /* JADX INFO: renamed from: c */
    public static final B5.u f21346c = new B5.u("PENDING", 0);

    public static y a(int i7, y5.a aVar) {
        int i8 = (i7 & 1) != 0 ? 0 : 1;
        int i9 = (i7 & 2) == 0 ? 16 : 0;
        if ((i7 & 4) != 0) {
            aVar = y5.a.f20528o;
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(n1.c.s(i8, "replay cannot be negative, but was ").toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(n1.c.s(i9, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i8 <= 0 && i9 <= 0 && aVar != y5.a.f20528o) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i10 = i9 + i8;
        if (i10 < 0) {
            i10 = Integer.MAX_VALUE;
        }
        return new y(i8, i10, aVar);
    }

    public static final J b(Object obj) {
        if (obj == null) {
            obj = AbstractC0027c.f538b;
        }
        return new J(obj);
    }

    public static final void c(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    public static final Object d(InterfaceC2110e interfaceC2110e, l5.e eVar, AbstractC0871i abstractC0871i) {
        int i7 = AbstractC2116k.f21297a;
        C2115j c2115j = new C2115j(eVar, null);
        c5.j jVar = c5.j.f10685o;
        y5.a aVar = y5.a.f20528o;
        Object objB = new A5.o(c2115j, interfaceC2110e, jVar, -2, aVar).a(jVar, 0, aVar).b(A5.t.f576o, abstractC0871i);
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        Y4.o oVar = Y4.o.f8736a;
        if (objB != enumC0830a) {
            objB = oVar;
        }
        return objB == enumC0830a ? objB : oVar;
    }

    public static final InterfaceC2110e e(InterfaceC2110e interfaceC2110e) {
        if (interfaceC2110e instanceof H) {
            return interfaceC2110e;
        }
        if (!(interfaceC2110e instanceof C2109d)) {
            return new C2109d(interfaceC2110e);
        }
        ((C2109d) interfaceC2110e).getClass();
        return interfaceC2110e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0080, code lost:
    
        if (r2.f(r9, r0) == r1) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006e A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:59:0x002e, B:70:0x0051, B:74:0x0066, B:76:0x006e, B:66:0x0046, B:69:0x004d), top: B:88:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0083  */
    /* JADX WARN: Type inference failed for: r7v0, types: [y5.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [y5.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [y5.q] */
    /* JADX WARN: Type inference failed for: r7v3, types: [y5.q] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0080 -> B:60:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(z5.InterfaceC2111f r6, y5.o r7, boolean r8, e5.AbstractC0865c r9) {
        /*
            boolean r0 = r9 instanceof z5.C2112g
            if (r0 == 0) goto L13
            r0 = r9
            z5.g r0 = (z5.C2112g) r0
            int r1 = r0.f21285t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21285t = r1
            goto L18
        L13:
            z5.g r0 = new z5.g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f21284s
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f21285t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f21283r
            y5.b r6 = r0.f21282q
            y5.q r7 = r0.f21281p
            z5.f r2 = r0.f21280o
            android.support.v4.media.session.b.K(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L51
        L34:
            r6 = move-exception
            goto L8c
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f21283r
            y5.b r6 = r0.f21282q
            y5.q r7 = r0.f21281p
            z5.f r2 = r0.f21280o
            android.support.v4.media.session.b.K(r9)     // Catch: java.lang.Throwable -> L34
            goto L66
        L4a:
            android.support.v4.media.session.b.K(r9)
            y5.b r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L51:
            r0.f21280o = r6     // Catch: java.lang.Throwable -> L34
            r0.f21281p = r7     // Catch: java.lang.Throwable -> L34
            r0.f21282q = r9     // Catch: java.lang.Throwable -> L34
            r0.f21283r = r8     // Catch: java.lang.Throwable -> L34
            r0.f21285t = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L62
            goto L82
        L62:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L66:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L83
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f21280o = r2     // Catch: java.lang.Throwable -> L34
            r0.f21281p = r7     // Catch: java.lang.Throwable -> L34
            r0.f21282q = r6     // Catch: java.lang.Throwable -> L34
            r0.f21283r = r8     // Catch: java.lang.Throwable -> L34
            r0.f21285t = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.f(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L82:
            return r1
        L83:
            if (r8 == 0) goto L89
            r6 = 0
            r7.c(r6)
        L89:
            Y4.o r6 = Y4.o.f8736a
            return r6
        L8c:
            throw r6     // Catch: java.lang.Throwable -> L8d
        L8d:
            r9 = move-exception
            if (r8 == 0) goto L93
            y5.j.b(r7, r6)
        L93:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.z.f(z5.f, y5.o, boolean, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(z5.InterfaceC2110e r6, e5.AbstractC0865c r7) {
        /*
            boolean r0 = r7 instanceof z5.m
            if (r0 == 0) goto L13
            r0 = r7
            z5.m r0 = (z5.m) r0
            int r1 = r0.f21306r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21306r = r1
            goto L18
        L13:
            z5.m r0 = new z5.m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21305q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f21306r
            B5.u r3 = A5.AbstractC0027c.f538b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            R0.b1 r6 = r0.f21304p
            m5.v r0 = r0.f21303o
            android.support.v4.media.session.b.K(r7)     // Catch: A5.C0025a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            android.support.v4.media.session.b.K(r7)
            m5.v r7 = new m5.v
            r7.<init>()
            r7.f14439o = r3
            R0.b1 r2 = new R0.b1
            r5 = 2
            r2.<init>(r5, r7)
            r0.f21303o = r7     // Catch: A5.C0025a -> L56
            r0.f21304p = r2     // Catch: A5.C0025a -> L56
            r0.f21306r = r4     // Catch: A5.C0025a -> L56
            java.lang.Object r6 = r6.b(r2, r0)     // Catch: A5.C0025a -> L56
            if (r6 != r1) goto L54
            return r1
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            z5.f r1 = r7.f532o
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r6 = r0.f14439o
            if (r6 == r3) goto L63
            return r6
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.z.g(z5.e, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(z5.InterfaceC2110e r5, l5.e r6, e5.AbstractC0865c r7) {
        /*
            boolean r0 = r7 instanceof z5.n
            if (r0 == 0) goto L13
            r0 = r7
            z5.n r0 = (z5.n) r0
            int r1 = r0.f21311s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21311s = r1
            goto L18
        L13:
            z5.n r0 = new z5.n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21310r
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f21311s
            B5.u r3 = A5.AbstractC0027c.f538b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            X.g0 r5 = r0.f21309q
            m5.v r6 = r0.f21308p
            l5.e r0 = r0.f21307o
            android.support.v4.media.session.b.K(r7)     // Catch: A5.C0025a -> L2f
            goto L63
        L2f:
            r7 = move-exception
            goto L5f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            android.support.v4.media.session.b.K(r7)
            m5.v r7 = new m5.v
            r7.<init>()
            r7.f14439o = r3
            X.g0 r2 = new X.g0
            r2.<init>(r6, r7)
            r0.f21307o = r6     // Catch: A5.C0025a -> L5a
            r0.f21308p = r7     // Catch: A5.C0025a -> L5a
            r0.f21309q = r2     // Catch: A5.C0025a -> L5a
            r0.f21311s = r4     // Catch: A5.C0025a -> L5a
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: A5.C0025a -> L5a
            if (r5 != r1) goto L57
            return r1
        L57:
            r0 = r6
            r6 = r7
            goto L63
        L5a:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L5f:
            z5.f r1 = r7.f532o
            if (r1 != r5) goto L7c
        L63:
            java.lang.Object r5 = r6.f14439o
            if (r5 == r3) goto L68
            return r5
        L68:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.z.h(z5.e, l5.e, e5.c):java.lang.Object");
    }

    public static final InterfaceC2110e i(v vVar, c5.i iVar, int i7, y5.a aVar) {
        return ((i7 == 0 || i7 == -3) && aVar == y5.a.f20528o) ? vVar : new A5.j(vVar, iVar, i7, aVar);
    }

    public static final u j(z3.t tVar, B5.d dVar, G g6, Float f7) {
        y5.g.l.getClass();
        y5.f fVar = y5.f.f20563a;
        y5.a aVar = y5.a.f20528o;
        V1.a aVar2 = new V1.a(tVar, c5.j.f10685o);
        J jB = b(f7);
        EnumC1766C enumC1766C = g6.equals(C2105C.f21252a) ? EnumC1766C.f19467o : EnumC1766C.f19470r;
        q qVar = new q(g6, (InterfaceC2110e) aVar2.f7389o, jB, f7, null);
        c5.i iVarU = AbstractC1767D.u(dVar, (c5.i) aVar2.f7390p);
        AbstractC1773a q0Var = enumC1766C == EnumC1766C.f19468p ? new q0(iVarU, qVar) : new w0(iVarU, true);
        q0Var.h0(enumC1766C, q0Var, qVar);
        return new u(jB);
    }
}
