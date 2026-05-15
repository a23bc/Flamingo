package f1;

import D.J;
import L2.C0247a;
import d.C0746L;
import w5.AbstractC1767D;
import w5.y0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0746L f11989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0926a f11990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.a f11991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f11992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0247a f11993e;

    public e(C0746L c0746l, C0926a c0926a) {
        V1.a aVar = f.f11994a;
        V1.a aVar2 = f.f11994a;
        c5.j jVar = c5.j.f10685o;
        h hVar = new h();
        x5.d dVar = j1.h.f13673a;
        g gVar = h.f11995a;
        gVar.getClass();
        AbstractC1767D.a(I0.c.L(gVar, dVar).h(jVar).h(new y0(null)));
        C0247a c0247a = new C0247a(24);
        this.f11989a = c0746l;
        this.f11990b = c0926a;
        this.f11991c = aVar;
        this.f11992d = hVar;
        this.f11993e = c0247a;
        new J(25, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a A[Catch: Exception -> 0x0092, TRY_ENTER, TryCatch #2 {Exception -> 0x0092, blocks: (B:15:0x0028, B:17:0x003e, B:20:0x0043, B:22:0x0047, B:28:0x0060, B:45:0x008a, B:46:0x0091, B:24:0x0050, B:25:0x0052, B:26:0x0055, B:27:0x005b), top: B:56:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f1.p a(f1.o r7) {
        /*
            r6 = this;
            V1.a r0 = r6.f11991c
            java.lang.Object r1 = r0.f7389o
            d.L r1 = (d.C0746L) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f7390p     // Catch: java.lang.Throwable -> L24
            t.u r2 = (t.C1465u) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.c(r7)     // Catch: java.lang.Throwable -> L24
            f1.p r2 = (f1.p) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L27
            boolean r3 = r2.f12021p     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f7390p     // Catch: java.lang.Throwable -> L24
            t.u r2 = (t.C1465u) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.e(r7)     // Catch: java.lang.Throwable -> L24
            f1.p r2 = (f1.p) r2     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r7 = move-exception
            goto L9b
        L27:
            monitor-exit(r1)
            f1.h r1 = r6.f11992d     // Catch: java.lang.Exception -> L92
            r1.getClass()     // Catch: java.lang.Exception -> L92
            L2.a r1 = r6.f11993e     // Catch: java.lang.Exception -> L92
            r1.getClass()     // Catch: java.lang.Exception -> L92
            f1.n r2 = r7.f12015a     // Catch: java.lang.Exception -> L92
            java.lang.Object r1 = r1.f4105p     // Catch: java.lang.Exception -> L92
            d.L r1 = (d.C0746L) r1     // Catch: java.lang.Exception -> L92
            int r3 = r7.f12017c     // Catch: java.lang.Exception -> L92
            f1.k r4 = r7.f12016b     // Catch: java.lang.Exception -> L92
            if (r2 == 0) goto L50
            boolean r5 = r2 instanceof f1.C0927b     // Catch: java.lang.Exception -> L92
            if (r5 == 0) goto L43
            goto L50
        L43:
            boolean r5 = r2 instanceof f1.m     // Catch: java.lang.Exception -> L92
            if (r5 == 0) goto L4e
            f1.m r2 = (f1.m) r2     // Catch: java.lang.Exception -> L92
            android.graphics.Typeface r1 = r1.o(r2, r4, r3)     // Catch: java.lang.Exception -> L92
            goto L60
        L4e:
            r1 = 0
            goto L67
        L50:
            int r1 = r1.f10748o     // Catch: java.lang.Exception -> L92
            switch(r1) {
                case 4: goto L5b;
                default: goto L55;
            }     // Catch: java.lang.Exception -> L92
        L55:
            r1 = 0
            android.graphics.Typeface r1 = d.C0746L.n(r1, r4, r3)     // Catch: java.lang.Exception -> L92
            goto L60
        L5b:
            r1 = 0
            android.graphics.Typeface r1 = d.C0746L.l(r1, r4, r3)     // Catch: java.lang.Exception -> L92
        L60:
            f1.p r2 = new f1.p     // Catch: java.lang.Exception -> L92
            r3 = 0
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L92
            r1 = r2
        L67:
            if (r1 == 0) goto L8a
            java.lang.Object r2 = r0.f7389o
            d.L r2 = (d.C0746L) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f7390p     // Catch: java.lang.Throwable -> L84
            t.u r3 = (t.C1465u) r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = r3.c(r7)     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L86
            boolean r3 = r1.f12021p     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L86
            java.lang.Object r0 = r0.f7390p     // Catch: java.lang.Throwable -> L84
            t.u r0 = (t.C1465u) r0     // Catch: java.lang.Throwable -> L84
            r0.d(r7, r1)     // Catch: java.lang.Throwable -> L84
            goto L86
        L84:
            r7 = move-exception
            goto L88
        L86:
            monitor-exit(r2)
            return r1
        L88:
            monitor-exit(r2)
            throw r7
        L8a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L92
            throw r7     // Catch: java.lang.Exception -> L92
        L92:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        L9b:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.a(f1.o):f1.p");
    }

    public final p b(n nVar, k kVar, int i7, int i8) {
        C0926a c0926a = this.f11990b;
        c0926a.getClass();
        int i9 = c0926a.f11988a;
        k kVar2 = (i9 == 0 || i9 == Integer.MAX_VALUE) ? kVar : new k(i6.h.q(kVar.f12008o + i9, 1, 1000));
        this.f11989a.getClass();
        return a(new o(nVar, kVar2, i7, i8, null));
    }
}
