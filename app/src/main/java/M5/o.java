package M5;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Closeable {

    /* JADX INFO: renamed from: N */
    public static final B f4877N;

    /* JADX INFO: renamed from: A */
    public long f4878A;

    /* JADX INFO: renamed from: B */
    public long f4879B;

    /* JADX INFO: renamed from: C */
    public long f4880C;

    /* JADX INFO: renamed from: D */
    public final B f4881D;

    /* JADX INFO: renamed from: E */
    public B f4882E;

    /* JADX INFO: renamed from: F */
    public long f4883F;

    /* JADX INFO: renamed from: G */
    public long f4884G;

    /* JADX INFO: renamed from: H */
    public long f4885H;

    /* JADX INFO: renamed from: I */
    public long f4886I;

    /* JADX INFO: renamed from: J */
    public final Socket f4887J;

    /* JADX INFO: renamed from: K */
    public final x f4888K;

    /* JADX INFO: renamed from: L */
    public final k f4889L;

    /* JADX INFO: renamed from: M */
    public final LinkedHashSet f4890M;

    /* JADX INFO: renamed from: o */
    public final h f4891o;

    /* JADX INFO: renamed from: p */
    public final LinkedHashMap f4892p = new LinkedHashMap();

    /* JADX INFO: renamed from: q */
    public final String f4893q;

    /* JADX INFO: renamed from: r */
    public int f4894r;

    /* JADX INFO: renamed from: s */
    public int f4895s;

    /* JADX INFO: renamed from: t */
    public boolean f4896t;

    /* JADX INFO: renamed from: u */
    public final I5.d f4897u;

    /* JADX INFO: renamed from: v */
    public final I5.c f4898v;

    /* JADX INFO: renamed from: w */
    public final I5.c f4899w;

    /* JADX INFO: renamed from: x */
    public final I5.c f4900x;

    /* JADX INFO: renamed from: y */
    public final A f4901y;

    /* JADX INFO: renamed from: z */
    public long f4902z;

    static {
        B b7 = new B();
        b7.c(7, 65535);
        b7.c(5, 16384);
        f4877N = b7;
    }

    public o(B2.h hVar) {
        this.f4891o = (h) hVar.f754f;
        String str = (String) hVar.f751c;
        if (str == null) {
            AbstractC1209k.m("connectionName");
            throw null;
        }
        this.f4893q = str;
        this.f4895s = 3;
        I5.d dVar = (I5.d) hVar.f749a;
        this.f4897u = dVar;
        this.f4898v = dVar.e();
        this.f4899w = dVar.e();
        this.f4900x = dVar.e();
        this.f4901y = A.f4826a;
        B b7 = new B();
        b7.c(7, 16777216);
        this.f4881D = b7;
        this.f4882E = f4877N;
        this.f4886I = r0.a();
        Socket socket = (Socket) hVar.f750b;
        if (socket == null) {
            AbstractC1209k.m("socket");
            throw null;
        }
        this.f4887J = socket;
        S5.w wVar = (S5.w) hVar.f753e;
        if (wVar == null) {
            AbstractC1209k.m("sink");
            throw null;
        }
        this.f4888K = new x(wVar);
        S5.y yVar = (S5.y) hVar.f752d;
        if (yVar == null) {
            AbstractC1209k.m("source");
            throw null;
        }
        this.f4889L = new k(this, new s(yVar));
        this.f4890M = new LinkedHashSet();
    }

    public final void b(int i7, int i8, IOException iOException) {
        int i9;
        Object[] array;
        Z1.l.w(i7, "connectionCode");
        Z1.l.w(i8, "streamCode");
        byte[] bArr = G5.b.f2765a;
        try {
            h(i7);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4892p.isEmpty()) {
                array = null;
            } else {
                array = this.f4892p.values().toArray(new w[0]);
                this.f4892p.clear();
            }
        }
        w[] wVarArr = (w[]) array;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(i8, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f4888K.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4887J.close();
        } catch (IOException unused4) {
        }
        this.f4898v.e();
        this.f4899w.e();
        this.f4900x.e();
    }

    public final synchronized w c(int i7) {
        return (w) this.f4892p.get(Integer.valueOf(i7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(1, 9, null);
    }

    public final synchronized boolean d(long j3) {
        if (this.f4896t) {
            return false;
        }
        if (this.f4879B < this.f4878A) {
            if (j3 >= this.f4880C) {
                return false;
            }
        }
        return true;
    }

    public final void flush() {
        this.f4888K.flush();
    }

    public final synchronized w g(int i7) {
        w wVar;
        wVar = (w) this.f4892p.remove(Integer.valueOf(i7));
        notifyAll();
        return wVar;
    }

    public final void h(int i7) {
        Z1.l.w(i7, "statusCode");
        synchronized (this.f4888K) {
            synchronized (this) {
                if (this.f4896t) {
                    return;
                }
                this.f4896t = true;
                this.f4888K.g(G5.b.f2765a, this.f4894r, i7);
            }
        }
    }

    public final synchronized void i(long j3) {
        long j7 = this.f4883F + j3;
        this.f4883F = j7;
        long j8 = j7 - this.f4884G;
        if (j8 >= this.f4881D.a() / 2) {
            o(j8, 0);
            this.f4884G += j8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4888K.f4946q);
        r6 = r2;
        r8.f4885H += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r9, boolean r10, S5.C0427g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            M5.x r12 = r8.f4888K
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f4885H     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f4886I     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f4892p     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            M5.x r4 = r8.f4888K     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f4946q     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f4885H     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f4885H = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            M5.x r4 = r8.f4888K
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.o.j(int, boolean, S5.g, long):void");
    }

    public final void n(int i7, int i8) {
        Z1.l.w(i8, "errorCode");
        this.f4898v.c(new j(this.f4893q + '[' + i7 + "] writeSynReset", this, i7, i8, 2), 0L);
    }

    public final void o(long j3, int i7) {
        this.f4898v.c(new n(this.f4893q + '[' + i7 + "] windowUpdate", this, i7, j3), 0L);
    }
}
