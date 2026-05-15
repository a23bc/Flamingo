package h4;

import D2.B;
import D5.l;
import S5.C0423c;
import S5.G;
import S5.r;
import S5.t;
import S5.u;
import S5.w;
import S5.y;
import Y4.o;
import j5.AbstractC1109c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import m5.AbstractC1209k;
import u5.AbstractC1545g;
import u5.AbstractC1552n;
import u5.C1543e;
import w5.AbstractC1767D;
import w5.y0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable, Flushable {

    /* JADX INFO: renamed from: E */
    public static final C1543e f12723E = new C1543e("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: A */
    public boolean f12724A;

    /* JADX INFO: renamed from: B */
    public boolean f12725B;

    /* JADX INFO: renamed from: C */
    public boolean f12726C;

    /* JADX INFO: renamed from: D */
    public final d f12727D;

    /* JADX INFO: renamed from: o */
    public final u f12728o;

    /* JADX INFO: renamed from: p */
    public final long f12729p;

    /* JADX INFO: renamed from: q */
    public final u f12730q;

    /* JADX INFO: renamed from: r */
    public final u f12731r;

    /* JADX INFO: renamed from: s */
    public final u f12732s;

    /* JADX INFO: renamed from: t */
    public final LinkedHashMap f12733t;

    /* JADX INFO: renamed from: u */
    public final B5.d f12734u;

    /* JADX INFO: renamed from: v */
    public long f12735v;

    /* JADX INFO: renamed from: w */
    public int f12736w;

    /* JADX INFO: renamed from: x */
    public w f12737x;

    /* JADX INFO: renamed from: y */
    public boolean f12738y;

    /* JADX INFO: renamed from: z */
    public boolean f12739z;

    public f(long j3, D5.d dVar, r rVar, u uVar) {
        this.f12728o = uVar;
        this.f12729p = j3;
        if (j3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f12730q = uVar.d("journal");
        this.f12731r = uVar.d("journal.tmp");
        this.f12732s = uVar.d("journal.bkp");
        this.f12733t = new LinkedHashMap(0, 0.75f, true);
        y0 y0VarC = AbstractC1767D.c();
        dVar.getClass();
        this.f12734u = AbstractC1767D.a(I0.c.L(y0VarC, l.f1632q.D(1)));
        this.f12727D = new d(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:78:0x0001, B:82:0x0011, B:86:0x0018, B:88:0x0020, B:90:0x0030, B:98:0x003e, B:100:0x0056, B:104:0x0073, B:106:0x0083, B:108:0x008a, B:101:0x005c, B:103:0x006c, B:112:0x00aa, B:114:0x00b1, B:117:0x00b6, B:119:0x00c7, B:122:0x00cc, B:127:0x0107, B:129:0x0112, B:133:0x011b, B:123:0x00e4, B:125:0x00f9, B:126:0x0104, B:111:0x009a, B:136:0x0120, B:137:0x0127), top: B:140:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(h4.f r9, D2.B r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.f.b(h4.f, D2.B, boolean):void");
    }

    public static void s(String str) {
        C1543e c1543e = f12723E;
        c1543e.getClass();
        AbstractC1209k.f(str, "input");
        if (c1543e.f17323o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized B c(String str) {
        try {
            if (this.f12724A) {
                throw new IllegalStateException("cache is closed");
            }
            s(str);
            g();
            C1003b c1003b = (C1003b) this.f12733t.get(str);
            if ((c1003b != null ? c1003b.f12716g : null) != null) {
                return null;
            }
            if (c1003b != null && c1003b.h != 0) {
                return null;
            }
            if (!this.f12725B && !this.f12726C) {
                w wVar = this.f12737x;
                AbstractC1209k.c(wVar);
                wVar.v("DIRTY");
                wVar.m(32);
                wVar.v(str);
                wVar.m(10);
                wVar.flush();
                if (this.f12738y) {
                    return null;
                }
                if (c1003b == null) {
                    c1003b = new C1003b(this, str);
                    this.f12733t.put(str, c1003b);
                }
                B b7 = new B(this, c1003b);
                c1003b.f12716g = b7;
                return b7;
            }
            h();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f12739z && !this.f12724A) {
                for (C1003b c1003b : (C1003b[]) this.f12733t.values().toArray(new C1003b[0])) {
                    B b7 = c1003b.f12716g;
                    if (b7 != null) {
                        C1003b c1003b2 = (C1003b) b7.f1459p;
                        if (AbstractC1209k.a(c1003b2.f12716g, b7)) {
                            c1003b2.f12715f = true;
                        }
                    }
                }
                r();
                AbstractC1767D.f(this.f12734u, null);
                w wVar = this.f12737x;
                AbstractC1209k.c(wVar);
                wVar.close();
                this.f12737x = null;
                this.f12724A = true;
                return;
            }
            this.f12724A = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C1004c d(String str) {
        C1004c c1004cA;
        if (this.f12724A) {
            throw new IllegalStateException("cache is closed");
        }
        s(str);
        g();
        C1003b c1003b = (C1003b) this.f12733t.get(str);
        if (c1003b != null && (c1004cA = c1003b.a()) != null) {
            boolean z6 = true;
            this.f12736w++;
            w wVar = this.f12737x;
            AbstractC1209k.c(wVar);
            wVar.v("READ");
            wVar.m(32);
            wVar.v(str);
            wVar.m(10);
            if (this.f12736w < 2000) {
                z6 = false;
            }
            if (z6) {
                h();
            }
            return c1004cA;
        }
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f12739z) {
            if (this.f12724A) {
                throw new IllegalStateException("cache is closed");
            }
            r();
            w wVar = this.f12737x;
            AbstractC1209k.c(wVar);
            wVar.flush();
        }
    }

    public final synchronized void g() {
        try {
            if (this.f12739z) {
                return;
            }
            this.f12727D.b(this.f12731r);
            if (this.f12727D.c(this.f12732s)) {
                if (this.f12727D.c(this.f12730q)) {
                    this.f12727D.b(this.f12732s);
                } else {
                    this.f12727D.j(this.f12732s, this.f12730q);
                }
            }
            if (this.f12727D.c(this.f12730q)) {
                try {
                    n();
                    j();
                    this.f12739z = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC1109c.p(this.f12727D, this.f12728o);
                        this.f12724A = false;
                        t();
                        this.f12739z = true;
                    } catch (Throwable th) {
                        this.f12724A = false;
                        throw th;
                    }
                }
            }
            t();
            this.f12739z = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void h() {
        AbstractC1767D.t(this.f12734u, null, new e(this, null), 3);
    }

    public final w i() {
        d dVar = this.f12727D;
        dVar.getClass();
        u uVar = this.f12730q;
        AbstractC1209k.f(uVar, "file");
        dVar.getClass();
        AbstractC1209k.f(uVar, "file");
        dVar.f12721b.getClass();
        File fileE = uVar.e();
        Logger logger = t.f6809a;
        return M3.a.D(new g(new C0423c(new FileOutputStream(fileE, true), 1, new G()), new B0.b(22, this)));
    }

    public final void j() {
        Iterator it = this.f12733t.values().iterator();
        long j3 = 0;
        while (it.hasNext()) {
            C1003b c1003b = (C1003b) it.next();
            int i7 = 0;
            if (c1003b.f12716g == null) {
                while (i7 < 2) {
                    j3 += c1003b.f12711b[i7];
                    i7++;
                }
            } else {
                c1003b.f12716g = null;
                while (i7 < 2) {
                    u uVar = (u) c1003b.f12712c.get(i7);
                    d dVar = this.f12727D;
                    dVar.b(uVar);
                    dVar.b((u) c1003b.f12713d.get(i7));
                    i7++;
                }
                it.remove();
            }
        }
        this.f12735v = j3;
    }

    public final void n() throws Throwable {
        o oVar;
        y yVarE = M3.a.E(this.f12727D.i(this.f12730q));
        Throwable th = null;
        try {
            String strS = yVarE.s(Long.MAX_VALUE);
            String strS2 = yVarE.s(Long.MAX_VALUE);
            String strS3 = yVarE.s(Long.MAX_VALUE);
            String strS4 = yVarE.s(Long.MAX_VALUE);
            String strS5 = yVarE.s(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strS) || !"1".equals(strS2) || !AbstractC1209k.a(String.valueOf(1), strS3) || !AbstractC1209k.a(String.valueOf(2), strS4) || strS5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strS + ", " + strS2 + ", " + strS3 + ", " + strS4 + ", " + strS5 + ']');
            }
            int i7 = 0;
            while (true) {
                try {
                    o(yVarE.s(Long.MAX_VALUE));
                    i7++;
                } catch (EOFException unused) {
                    this.f12736w = i7 - this.f12733t.size();
                    if (yVarE.b()) {
                        this.f12737x = i();
                    } else {
                        t();
                    }
                    oVar = o.f8736a;
                    try {
                        yVarE.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                yVarE.close();
            } catch (Throwable th4) {
                N5.l.k(th3, th4);
            }
            th = th3;
            oVar = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC1209k.c(oVar);
    }

    public final void o(String str) throws IOException {
        String strSubstring;
        int iW = AbstractC1545g.W(str, ' ', 0, 6);
        if (iW == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i7 = iW + 1;
        int iW2 = AbstractC1545g.W(str, ' ', i7, 4);
        LinkedHashMap linkedHashMap = this.f12733t;
        if (iW2 == -1) {
            strSubstring = str.substring(i7);
            AbstractC1209k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iW == 6 && AbstractC1552n.K(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i7, iW2);
            AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Object c1003b = linkedHashMap.get(strSubstring);
        if (c1003b == null) {
            c1003b = new C1003b(this, strSubstring);
            linkedHashMap.put(strSubstring, c1003b);
        }
        C1003b c1003b2 = (C1003b) c1003b;
        if (iW2 == -1 || iW != 5 || !AbstractC1552n.K(str, "CLEAN", false)) {
            if (iW2 == -1 && iW == 5 && AbstractC1552n.K(str, "DIRTY", false)) {
                c1003b2.f12716g = new B(this, c1003b2);
                return;
            } else {
                if (iW2 != -1 || iW != 4 || !AbstractC1552n.K(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iW2 + 1);
        AbstractC1209k.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        List listJ0 = AbstractC1545g.j0(strSubstring2, new char[]{' '});
        c1003b2.f12714e = true;
        c1003b2.f12716g = null;
        int size = listJ0.size();
        c1003b2.f12717i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listJ0);
        }
        try {
            int size2 = listJ0.size();
            for (int i8 = 0; i8 < size2; i8++) {
                c1003b2.f12711b[i8] = Long.parseLong((String) listJ0.get(i8));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listJ0);
        }
    }

    public final void q(C1003b c1003b) {
        w wVar;
        int i7 = c1003b.h;
        String str = c1003b.f12710a;
        if (i7 > 0 && (wVar = this.f12737x) != null) {
            wVar.v("DIRTY");
            wVar.m(32);
            wVar.v(str);
            wVar.m(10);
            wVar.flush();
        }
        if (c1003b.h > 0 || c1003b.f12716g != null) {
            c1003b.f12715f = true;
            return;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            this.f12727D.b((u) c1003b.f12712c.get(i8));
            long j3 = this.f12735v;
            long[] jArr = c1003b.f12711b;
            this.f12735v = j3 - jArr[i8];
            jArr[i8] = 0;
        }
        this.f12736w++;
        w wVar2 = this.f12737x;
        if (wVar2 != null) {
            wVar2.v("REMOVE");
            wVar2.m(32);
            wVar2.v(str);
            wVar2.m(10);
        }
        this.f12733t.remove(str);
        if (this.f12736w >= 2000) {
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        q(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f12735v
            long r2 = r4.f12729p
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f12733t
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            h4.b r1 = (h4.C1003b) r1
            boolean r2 = r1.f12715f
            if (r2 != 0) goto L12
            r4.q(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f12725B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.f.r():void");
    }

    public final synchronized void t() {
        o oVar;
        try {
            w wVar = this.f12737x;
            if (wVar != null) {
                wVar.close();
            }
            w wVarD = M3.a.D(this.f12727D.h(this.f12731r));
            Throwable th = null;
            try {
                wVarD.v("libcore.io.DiskLruCache");
                wVarD.m(10);
                wVarD.v("1");
                wVarD.m(10);
                wVarD.c(1);
                wVarD.m(10);
                wVarD.c(2);
                wVarD.m(10);
                wVarD.m(10);
                for (C1003b c1003b : this.f12733t.values()) {
                    if (c1003b.f12716g != null) {
                        wVarD.v("DIRTY");
                        wVarD.m(32);
                        wVarD.v(c1003b.f12710a);
                        wVarD.m(10);
                    } else {
                        wVarD.v("CLEAN");
                        wVarD.m(32);
                        wVarD.v(c1003b.f12710a);
                        for (long j3 : c1003b.f12711b) {
                            wVarD.m(32);
                            wVarD.c(j3);
                        }
                        wVarD.m(10);
                    }
                }
                oVar = o.f8736a;
                try {
                    wVarD.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    wVarD.close();
                } catch (Throwable th4) {
                    N5.l.k(th3, th4);
                }
                oVar = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            AbstractC1209k.c(oVar);
            if (this.f12727D.c(this.f12730q)) {
                this.f12727D.j(this.f12730q, this.f12732s);
                this.f12727D.j(this.f12731r, this.f12730q);
                this.f12727D.b(this.f12732s);
            } else {
                this.f12727D.j(this.f12731r, this.f12730q);
            }
            this.f12737x = i();
            this.f12736w = 0;
            this.f12738y = false;
            this.f12726C = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
