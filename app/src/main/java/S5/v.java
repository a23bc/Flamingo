package S5;

/* JADX INFO: loaded from: classes.dex */
public final class v implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f6812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0427g f6813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z f6814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6817t;

    public v(i iVar) {
        this.f6812o = iVar;
        C0427g c0427gL = iVar.l();
        this.f6813p = c0427gL;
        z zVar = c0427gL.f6784o;
        this.f6814q = zVar;
        this.f6815r = zVar != null ? zVar.f6826b : -1;
    }

    @Override // S5.E
    public final G a() {
        return this.f6812o.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6816s = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f6826b) goto L15;
     */
    @Override // S5.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(long r9, S5.C0427g r11) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            m5.AbstractC1209k.f(r11, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f6816s
            if (r3 != 0) goto L63
            S5.z r3 = r8.f6814q
            S5.g r4 = r8.f6813p
            if (r3 == 0) goto L2b
            S5.z r5 = r4.f6784o
            if (r3 != r5) goto L23
            int r3 = r8.f6815r
            m5.AbstractC1209k.c(r5)
            int r5 = r5.f6826b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f6817t
            r2 = 1
            long r0 = r0 + r2
            S5.i r2 = r8.f6812o
            boolean r0 = r2.f(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            S5.z r0 = r8.f6814q
            if (r0 != 0) goto L4c
            S5.z r0 = r4.f6784o
            if (r0 == 0) goto L4c
            r8.f6814q = r0
            int r0 = r0.f6826b
            r8.f6815r = r0
        L4c:
            long r0 = r4.f6785p
            long r2 = r8.f6817t
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r9, r0)
            S5.g r2 = r8.f6813p
            long r4 = r8.f6817t
            r3 = r11
            r2.c(r3, r4, r6)
            long r9 = r8.f6817t
            long r9 = r9 + r6
            r8.f6817t = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r9 = A0.e.D(r11, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.v.k(long, S5.g):long");
    }
}
