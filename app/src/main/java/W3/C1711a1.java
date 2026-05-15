package w3;

/* JADX INFO: renamed from: w3.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1711a1 implements h1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h1 f19136p;

    public /* synthetic */ C1711a1(h1 h1Var, int i7) {
        this.f19135o = i7;
        this.f19136p = h1Var;
    }

    @Override // w3.h1
    public final Object i(A0 a0, final C1747r0 c1747r0, final int i7) {
        switch (this.f19135o) {
            case 0:
                if (a0 != null) {
                    throw new ClassCastException();
                }
                final int i8 = 0;
                i1.r1(null, c1747r0, i7, this.f19136p, new w2.c() { // from class: w3.b1
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
                    @Override // w2.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void c(java.lang.Object r15) {
                        /*
                            r14 = this;
                            int r1 = r2
                            w3.r0 r2 = r1
                            r3 = 1
                            r4 = -1
                            int r0 = r3
                            switch(r0) {
                                case 0: goto L44;
                                default: goto Lb;
                            }
                        Lb:
                            I4.y r15 = (I4.y) r15
                            java.lang.Object r15 = r15.get()     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1c java.util.concurrent.CancellationException -> L1e
                            w3.z1 r15 = (w3.z1) r15     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1c java.util.concurrent.CancellationException -> L1e
                            java.lang.String r0 = "SessionResult must not be null"
                            w2.AbstractC1697a.g(r15, r0)     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1c java.util.concurrent.CancellationException -> L1e
                            goto L40
                        L19:
                            r0 = move-exception
                        L1a:
                            r15 = r0
                            goto L21
                        L1c:
                            r0 = move-exception
                            goto L1a
                        L1e:
                            r0 = move-exception
                            r15 = r0
                            goto L36
                        L21:
                            java.lang.String r0 = "Session operation failed"
                            w2.AbstractC1697a.x(r0, r15)
                            w3.z1 r0 = new w3.z1
                            java.lang.Throwable r15 = r15.getCause()
                            boolean r15 = r15 instanceof java.lang.UnsupportedOperationException
                            if (r15 == 0) goto L31
                            r4 = -6
                        L31:
                            r0.<init>(r4)
                            r15 = r0
                            goto L40
                        L36:
                            java.lang.String r0 = "Session operation cancelled"
                            w2.AbstractC1697a.x(r0, r15)
                            w3.z1 r15 = new w3.z1
                            r15.<init>(r3)
                        L40:
                            w3.i1.v1(r2, r1, r15)
                            return
                        L44:
                            java.lang.String r5 = "no error message provided"
                            I4.y r15 = (I4.y) r15
                            java.lang.Object r15 = r15.get()     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.CancellationException -> L59
                            w3.t r15 = (w3.C1750t) r15     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.CancellationException -> L59
                            java.lang.String r0 = "LibraryResult must not be null"
                            w2.AbstractC1697a.g(r15, r0)     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.CancellationException -> L59
                            goto L97
                        L54:
                            r0 = move-exception
                        L55:
                            r15 = r0
                            goto L5c
                        L57:
                            r0 = move-exception
                            goto L55
                        L59:
                            r0 = move-exception
                            r15 = r0
                            goto L7a
                        L5c:
                            java.lang.String r0 = "Library operation failed"
                            w2.AbstractC1697a.x(r0, r15)
                            java.lang.String r15 = w3.C1750t.f19351g
                            w3.x1 r11 = new w3.x1
                            android.os.Bundle r15 = android.os.Bundle.EMPTY
                            r11.<init>(r5, r4, r15)
                            w3.t r6 = new w3.t
                            int r7 = r11.f19394a
                            long r8 = android.os.SystemClock.elapsedRealtime()
                            r12 = 0
                            r13 = 4
                            r10 = 0
                            r6.<init>(r7, r8, r10, r11, r12, r13)
                        L78:
                            r15 = r6
                            goto L97
                        L7a:
                            java.lang.String r0 = "Library operation cancelled"
                            w2.AbstractC1697a.x(r0, r15)
                            java.lang.String r15 = w3.C1750t.f19351g
                            w3.x1 r11 = new w3.x1
                            android.os.Bundle r15 = android.os.Bundle.EMPTY
                            r11.<init>(r5, r3, r15)
                            w3.t r6 = new w3.t
                            int r7 = r11.f19394a
                            long r8 = android.os.SystemClock.elapsedRealtime()
                            r12 = 0
                            r13 = 4
                            r10 = 0
                            r6.<init>(r7, r8, r10, r11, r12, r13)
                            goto L78
                        L97:
                            w3.q0 r0 = r2.f19339d     // Catch: android.os.RemoteException -> La0
                            w2.AbstractC1697a.j(r0)     // Catch: android.os.RemoteException -> La0
                            r0.i(r1, r15)     // Catch: android.os.RemoteException -> La0
                            goto Lb3
                        La0:
                            r0 = move-exception
                            r15 = r0
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            java.lang.String r1 = "Failed to send result to browser "
                            r0.<init>(r1)
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            w2.AbstractC1697a.x(r0, r15)
                        Lb3:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: w3.C1714b1.c(java.lang.Object):void");
                    }
                });
                throw null;
            default:
                final int i9 = 1;
                return i1.r1(a0, c1747r0, i7, this.f19136p, new w2.c() { // from class: w3.b1
                    @Override // w2.c
                    public final void c(Object v3) {
                        /*
                            this = this;
                            int r1 = r2
                            w3.r0 r2 = r1
                            r3 = 1
                            r4 = -1
                            int r0 = r3
                            switch(r0) {
                                case 0: goto L44;
                                default: goto Lb;
                            }
                        Lb:
                            I4.y r15 = (I4.y) r15
                            java.lang.Object r15 = r15.get()     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1c java.util.concurrent.CancellationException -> L1e
                            w3.z1 r15 = (w3.z1) r15     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1c java.util.concurrent.CancellationException -> L1e
                            java.lang.String r0 = "SessionResult must not be null"
                            w2.AbstractC1697a.g(r15, r0)     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1c java.util.concurrent.CancellationException -> L1e
                            goto L40
                        L19:
                            r0 = move-exception
                        L1a:
                            r15 = r0
                            goto L21
                        L1c:
                            r0 = move-exception
                            goto L1a
                        L1e:
                            r0 = move-exception
                            r15 = r0
                            goto L36
                        L21:
                            java.lang.String r0 = "Session operation failed"
                            w2.AbstractC1697a.x(r0, r15)
                            w3.z1 r0 = new w3.z1
                            java.lang.Throwable r15 = r15.getCause()
                            boolean r15 = r15 instanceof java.lang.UnsupportedOperationException
                            if (r15 == 0) goto L31
                            r4 = -6
                        L31:
                            r0.<init>(r4)
                            r15 = r0
                            goto L40
                        L36:
                            java.lang.String r0 = "Session operation cancelled"
                            w2.AbstractC1697a.x(r0, r15)
                            w3.z1 r15 = new w3.z1
                            r15.<init>(r3)
                        L40:
                            w3.i1.v1(r2, r1, r15)
                            return
                        L44:
                            java.lang.String r5 = "no error message provided"
                            I4.y r15 = (I4.y) r15
                            java.lang.Object r15 = r15.get()     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.CancellationException -> L59
                            w3.t r15 = (w3.C1750t) r15     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.CancellationException -> L59
                            java.lang.String r0 = "LibraryResult must not be null"
                            w2.AbstractC1697a.g(r15, r0)     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.CancellationException -> L59
                            goto L97
                        L54:
                            r0 = move-exception
                        L55:
                            r15 = r0
                            goto L5c
                        L57:
                            r0 = move-exception
                            goto L55
                        L59:
                            r0 = move-exception
                            r15 = r0
                            goto L7a
                        L5c:
                            java.lang.String r0 = "Library operation failed"
                            w2.AbstractC1697a.x(r0, r15)
                            java.lang.String r15 = w3.C1750t.f19351g
                            w3.x1 r11 = new w3.x1
                            android.os.Bundle r15 = android.os.Bundle.EMPTY
                            r11.<init>(r5, r4, r15)
                            w3.t r6 = new w3.t
                            int r7 = r11.f19394a
                            long r8 = android.os.SystemClock.elapsedRealtime()
                            r12 = 0
                            r13 = 4
                            r10 = 0
                            r6.<init>(r7, r8, r10, r11, r12, r13)
                        L78:
                            r15 = r6
                            goto L97
                        L7a:
                            java.lang.String r0 = "Library operation cancelled"
                            w2.AbstractC1697a.x(r0, r15)
                            java.lang.String r15 = w3.C1750t.f19351g
                            w3.x1 r11 = new w3.x1
                            android.os.Bundle r15 = android.os.Bundle.EMPTY
                            r11.<init>(r5, r3, r15)
                            w3.t r6 = new w3.t
                            int r7 = r11.f19394a
                            long r8 = android.os.SystemClock.elapsedRealtime()
                            r12 = 0
                            r13 = 4
                            r10 = 0
                            r6.<init>(r7, r8, r10, r11, r12, r13)
                            goto L78
                        L97:
                            w3.q0 r0 = r2.f19339d     // Catch: android.os.RemoteException -> La0
                            w2.AbstractC1697a.j(r0)     // Catch: android.os.RemoteException -> La0
                            r0.i(r1, r15)     // Catch: android.os.RemoteException -> La0
                            goto Lb3
                        La0:
                            r0 = move-exception
                            r15 = r0
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            java.lang.String r1 = "Failed to send result to browser "
                            r0.<init>(r1)
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            w2.AbstractC1697a.x(r0, r15)
                        Lb3:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: w3.C1714b1.c(java.lang.Object):void");
                    }
                });
        }
    }
}
