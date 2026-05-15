package B2;

import A2.C0016q;
import H2.A;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import t2.e0;
import t2.g0;
import t2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final C0016q h = new C0016q(1);

    /* JADX INFO: renamed from: i */
    public static final Random f771i = new Random();

    /* JADX INFO: renamed from: d */
    public n f775d;

    /* JADX INFO: renamed from: f */
    public String f777f;

    /* JADX INFO: renamed from: a */
    public final g0 f772a = new g0();

    /* JADX INFO: renamed from: b */
    public final e0 f773b = new e0();

    /* JADX INFO: renamed from: c */
    public final HashMap f774c = new HashMap();

    /* JADX INFO: renamed from: e */
    public h0 f776e = h0.f16472a;

    /* JADX INFO: renamed from: g */
    public long f778g = -1;

    public final void a(j jVar) {
        long j3 = jVar.f766c;
        if (j3 != -1) {
            this.f778g = j3;
        }
        this.f777f = null;
    }

    public final synchronized void b(a aVar) {
        n nVar;
        try {
            String str = this.f777f;
            if (str != null) {
                j jVar = (j) this.f774c.get(str);
                jVar.getClass();
                a(jVar);
            }
            Iterator it = this.f774c.values().iterator();
            while (it.hasNext()) {
                j jVar2 = (j) it.next();
                it.remove();
                if (jVar2.f768e && (nVar = this.f775d) != null) {
                    nVar.d(aVar, jVar2.f764a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0099 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final B2.j c(int r18, H2.A r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap r3 = r0.f774c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r4.next()
            B2.j r8 = (B2.j) r8
            long r9 = r8.f766c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L52
            int r9 = r8.f765b
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            B2.k r9 = r8.f770g
            java.util.HashMap r10 = r9.f774c
            java.lang.String r13 = r9.f777f
            java.lang.Object r10 = r10.get(r13)
            B2.j r10 = (B2.j) r10
            if (r10 == 0) goto L45
            long r13 = r10.f766c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f778g
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f2976d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L52
            r8.f766c = r9
        L52:
            H2.A r9 = r8.f767d
            if (r2 != 0) goto L5c
            int r10 = r8.f765b
            if (r1 != r10) goto L16
            r15 = r11
            goto L81
        L5c:
            long r13 = r2.f2976d
            if (r9 != 0) goto L6e
            boolean r10 = r2.b()
            if (r10 != 0) goto L16
            r15 = r11
            long r11 = r8.f766c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L81
        L6e:
            r15 = r11
            long r10 = r9.f2976d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L16
            int r10 = r2.f2974b
            int r11 = r9.f2974b
            if (r10 != r11) goto L16
            int r10 = r2.f2975c
            int r11 = r9.f2975c
            if (r10 != r11) goto L16
        L81:
            long r10 = r8.f766c
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8c
            goto L99
        L8c:
            if (r12 != 0) goto L16
            int r10 = w2.t.f18881a
            H2.A r10 = r5.f767d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L99:
            r5 = r8
            r6 = r10
            goto L16
        L9d:
            if (r5 != 0) goto Laf
            A2.q r4 = B2.k.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            B2.j r5 = new B2.j
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.k.c(int, H2.A):B2.j");
    }

    public final synchronized String d(h0 h0Var, A a4) {
        return c(h0Var.g(a4.f2973a, this.f773b).f16428c, a4).f764a;
    }

    public final void e(a aVar) {
        A a4;
        boolean zP = aVar.f729b.p();
        HashMap map = this.f774c;
        if (zP) {
            String str = this.f777f;
            if (str != null) {
                j jVar = (j) map.get(str);
                jVar.getClass();
                a(jVar);
                return;
            }
            return;
        }
        j jVar2 = (j) map.get(this.f777f);
        int i7 = aVar.f730c;
        A a7 = aVar.f731d;
        this.f777f = c(i7, a7).f764a;
        f(aVar);
        if (a7 == null || !a7.b()) {
            return;
        }
        long j3 = a7.f2976d;
        if (jVar2 != null && jVar2.f766c == j3 && (a4 = jVar2.f767d) != null && a4.f2974b == a7.f2974b && a4.f2975c == a7.f2975c) {
            return;
        }
        c(i7, new A(j3, a7.f2973a));
        this.f775d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:62:0x0001, B:66:0x0010, B:68:0x0014, B:70:0x0024, B:79:0x0036, B:81:0x0042, B:83:0x0048, B:73:0x002b, B:89:0x0053, B:91:0x005f, B:92:0x0063, B:94:0x0068, B:96:0x006e, B:98:0x0085, B:99:0x00b3, B:101:0x00b7, B:102:0x00be, B:104:0x00c8, B:106:0x00cc, B:108:0x00d9, B:111:0x00e0), top: B:116:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(B2.a r10) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.k.f(B2.a):void");
    }

    public final synchronized void g(a aVar, int i7) {
        try {
            this.f775d.getClass();
            boolean z6 = i7 == 0;
            Iterator it = this.f774c.values().iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar.a(aVar)) {
                    it.remove();
                    if (jVar.f768e) {
                        boolean zEquals = jVar.f764a.equals(this.f777f);
                        if (z6 && zEquals) {
                            boolean z7 = jVar.f769f;
                        }
                        if (zEquals) {
                            a(jVar);
                        }
                        this.f775d.d(aVar, jVar.f764a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
