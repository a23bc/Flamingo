package j2;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: j2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1103f implements InterfaceC1098a {

    /* JADX INFO: renamed from: a */
    public static final C1103f f13698a = new C1103f();

    /* JADX INFO: renamed from: b */
    public static final E5.d f13699b = new E5.d();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f13700c = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r5, j2.C1105h r6, java.lang.String r7, e5.AbstractC0865c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof j2.C1099b
            if (r0 == 0) goto L13
            r0 = r8
            j2.b r0 = (j2.C1099b) r0
            int r1 = r0.f13683u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13683u = r1
            goto L18
        L13:
            j2.b r0 = new j2.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f13681s
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13683u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            E5.d r5 = r0.f13680r
            java.lang.String r7 = r0.f13679q
            j2.g r6 = r0.f13678p
            android.content.Context r0 = r0.f13677o
            android.support.v4.media.session.b.K(r8)
            r8 = r5
            r5 = r0
            goto L4f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            android.support.v4.media.session.b.K(r8)
            r0.f13677o = r5
            r0.f13678p = r6
            r0.f13679q = r7
            E5.d r8 = j2.C1103f.f13699b
            r0.f13680r = r8
            r0.f13683u = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r0 = 0
            java.util.LinkedHashMap r1 = j2.C1103f.f13700c     // Catch: java.lang.Throwable -> L62
            r1.remove(r7)     // Catch: java.lang.Throwable -> L62
            java.io.File r5 = r6.a(r5, r7)     // Catch: java.lang.Throwable -> L62
            r5.delete()     // Catch: java.lang.Throwable -> L62
            r8.f(r0)
            Y4.o r5 = Y4.o.f8736a
            return r5
        L62:
            r5 = move-exception
            r8.f(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C1103f.a(android.content.Context, j2.h, java.lang.String, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r7, j2.InterfaceC1104g r8, java.lang.String r9, e5.AbstractC0865c r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof j2.C1100c
            if (r0 == 0) goto L13
            r0 = r10
            j2.c r0 = (j2.C1100c) r0
            int r1 = r0.f13690u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13690u = r1
            goto L18
        L13:
            j2.c r0 = new j2.c
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f13688s
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13690u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L57
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.io.Serializable r7 = r0.f13686q
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.f13685p
            E5.a r8 = (E5.a) r8
            java.lang.Object r9 = r0.f13684o
            java.lang.String r9 = (java.lang.String) r9
            android.support.v4.media.session.b.K(r10)     // Catch: java.lang.Throwable -> L37
            goto L89
        L37:
            r7 = move-exception
            goto La1
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            E5.d r7 = r0.f13687r
            java.io.Serializable r8 = r0.f13686q
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f13685p
            j2.g r8 = (j2.InterfaceC1104g) r8
            java.lang.Object r2 = r0.f13684o
            android.content.Context r2 = (android.content.Context) r2
            android.support.v4.media.session.b.K(r10)
            r10 = r7
            r7 = r2
            goto L6d
        L57:
            android.support.v4.media.session.b.K(r10)
            r0.f13684o = r7
            r0.f13685p = r8
            r0.f13686q = r9
            E5.d r10 = j2.C1103f.f13699b
            r0.f13687r = r10
            r0.f13690u = r4
            java.lang.Object r2 = r10.d(r0)
            if (r2 != r1) goto L6d
            goto L85
        L6d:
            java.util.LinkedHashMap r2 = j2.C1103f.f13700c     // Catch: java.lang.Throwable -> L90
            java.lang.Object r4 = r2.get(r9)     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L93
            r0.f13684o = r9     // Catch: java.lang.Throwable -> L90
            r0.f13685p = r10     // Catch: java.lang.Throwable -> L90
            r0.f13686q = r2     // Catch: java.lang.Throwable -> L90
            r0.f13687r = r5     // Catch: java.lang.Throwable -> L90
            r0.f13690u = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r7 = r8.b(r7, r9)     // Catch: java.lang.Throwable -> L90
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            r8 = r10
            r10 = r7
            r7 = r2
        L89:
            r4 = r10
            O1.g r4 = (O1.InterfaceC0335g) r4     // Catch: java.lang.Throwable -> L37
            r7.put(r9, r4)     // Catch: java.lang.Throwable -> L37
            goto L94
        L90:
            r7 = move-exception
            r8 = r10
            goto La1
        L93:
            r8 = r10
        L94:
            java.lang.String r7 = "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>"
            m5.AbstractC1209k.d(r4, r7)     // Catch: java.lang.Throwable -> L37
            O1.g r4 = (O1.InterfaceC0335g) r4     // Catch: java.lang.Throwable -> L37
            E5.d r8 = (E5.d) r8
            r8.f(r5)
            return r4
        La1:
            E5.d r8 = (E5.d) r8
            r8.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C1103f.b(android.content.Context, j2.g, java.lang.String, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.content.Context r6, j2.InterfaceC1104g r7, java.lang.String r8, e5.AbstractC0865c r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof j2.C1101d
            if (r0 == 0) goto L13
            r0 = r9
            j2.d r0 = (j2.C1101d) r0
            int r1 = r0.f13693q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13693q = r1
            goto L18
        L13:
            j2.d r0 = new j2.d
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f13691o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13693q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            android.support.v4.media.session.b.K(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            android.support.v4.media.session.b.K(r9)
            goto L42
        L36:
            android.support.v4.media.session.b.K(r9)
            r0.f13693q = r4
            java.lang.Object r9 = r5.b(r6, r7, r8, r0)
            if (r9 != r1) goto L42
            goto L50
        L42:
            O1.g r9 = (O1.InterfaceC0335g) r9
            z5.e r6 = r9.b()
            r0.f13693q = r3
            java.lang.Object r6 = z5.z.g(r6, r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C1103f.c(android.content.Context, j2.g, java.lang.String, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r6, b2.r0 r7, java.lang.String r8, b2.C0668k0 r9, e5.AbstractC0865c r10) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r10 instanceof j2.C1102e
            if (r0 == 0) goto L13
            r0 = r10
            j2.e r0 = (j2.C1102e) r0
            int r1 = r0.f13697r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13697r = r1
            goto L18
        L13:
            j2.e r0 = new j2.e
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f13695p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13697r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            android.support.v4.media.session.b.K(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            l5.e r9 = r0.f13694o
            android.support.v4.media.session.b.K(r10)
            goto L46
        L38:
            android.support.v4.media.session.b.K(r10)
            r0.f13694o = r9
            r0.f13697r = r4
            java.lang.Object r10 = r5.b(r6, r7, r8, r0)
            if (r10 != r1) goto L46
            goto L53
        L46:
            O1.g r10 = (O1.InterfaceC0335g) r10
            r6 = 0
            r0.f13694o = r6
            r0.f13697r = r3
            java.lang.Object r6 = r10.a(r9, r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C1103f.d(android.content.Context, b2.r0, java.lang.String, b2.k0, e5.c):java.lang.Object");
    }
}
