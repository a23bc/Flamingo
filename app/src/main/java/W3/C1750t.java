package w3;

/* JADX INFO: renamed from: w3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1750t {

    /* JADX INFO: renamed from: g */
    public static final String f19351g;
    public static final String h;

    /* JADX INFO: renamed from: i */
    public static final String f19352i;

    /* JADX INFO: renamed from: j */
    public static final String f19353j;

    /* JADX INFO: renamed from: k */
    public static final String f19354k;
    public static final String l;

    /* JADX INFO: renamed from: a */
    public final int f19355a;

    /* JADX INFO: renamed from: b */
    public final long f19356b;

    /* JADX INFO: renamed from: c */
    public final Object f19357c;

    /* JADX INFO: renamed from: d */
    public final int f19358d;

    /* JADX INFO: renamed from: e */
    public final C1726g0 f19359e;

    /* JADX INFO: renamed from: f */
    public final x1 f19360f;

    static {
        int i7 = w2.t.f18881a;
        f19351g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f19352i = Integer.toString(2, 36);
        f19353j = Integer.toString(3, 36);
        f19354k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public C1750t(int i7, long j3, C1726g0 c1726g0, x1 x1Var, Object obj, int i8) {
        this.f19355a = i7;
        this.f19356b = j3;
        this.f19359e = c1726g0;
        this.f19360f = x1Var;
        this.f19357c = obj;
        this.f19358d = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w3.C1750t a(android.os.Bundle r10) {
        /*
            java.lang.String r0 = w3.C1750t.f19351g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = w3.C1750t.h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = w3.C1750t.f19352i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            w3.g0 r0 = w3.C1726g0.a(r0)
            r6 = r0
        L21:
            java.lang.String r0 = w3.C1750t.l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            w3.x1 r0 = w3.x1.a(r0)
        L2d:
            r7 = r0
            goto L38
        L2f:
            if (r3 == 0) goto L37
            w3.x1 r0 = new w3.x1
            r0.<init>(r3)
            goto L2d
        L37:
            r7 = r2
        L38:
            java.lang.String r0 = w3.C1750t.f19354k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L7f
            r0 = 2
            java.lang.String r8 = w3.C1750t.f19353j
            if (r9 == r0) goto L81
            r0 = 3
            if (r9 == r0) goto L53
            r10 = 4
            if (r9 != r10) goto L4d
            goto L7f
        L4d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L53:
            android.os.IBinder r10 = r10.getBinder(r8)
            if (r10 != 0) goto L5a
            goto L7f
        L5a:
            E4.I r10 = t2.BinderC1478g.a(r10)
            E4.F r0 = E4.I.o()
        L62:
            int r2 = r10.size()
            if (r1 >= r2) goto L7b
            java.lang.Object r2 = r10.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            t2.G r2 = t2.G.a(r2)
            r0.a(r2)
            int r1 = r1 + 1
            goto L62
        L7b:
            E4.b0 r2 = r0.f()
        L7f:
            r8 = r2
            goto L8d
        L81:
            android.os.Bundle r10 = r10.getBundle(r8)
            if (r10 != 0) goto L88
            goto L7f
        L88:
            t2.G r2 = t2.G.a(r10)
            goto L7f
        L8d:
            w3.t r2 = new w3.t
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C1750t.a(android.os.Bundle):w3.t");
    }
}
