package S5;

import java.util.concurrent.locks.ReentrantLock;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class k implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f6790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6792q;

    public k(q qVar, long j3) {
        AbstractC1209k.f(qVar, "fileHandle");
        this.f6790o = qVar;
        this.f6791p = j3;
    }

    @Override // S5.E
    public final G a() {
        return G.f6762d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6792q) {
            return;
        }
        this.f6792q = true;
        q qVar = this.f6790o;
        ReentrantLock reentrantLock = qVar.f6807q;
        reentrantLock.lock();
        try {
            int i7 = qVar.f6806p - 1;
            qVar.f6806p = i7;
            if (i7 == 0) {
                if (qVar.f6805o) {
                    synchronized (qVar) {
                        qVar.f6808r.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) {
        long j7;
        long j8;
        int i7;
        AbstractC1209k.f(c0427g, "sink");
        if (this.f6792q) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f6790o;
        long j9 = this.f6791p;
        qVar.getClass();
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
        }
        long j10 = j3 + j9;
        long j11 = j9;
        while (true) {
            if (j11 >= j10) {
                j7 = -1;
                break;
            }
            z zVarZ = c0427g.z(1);
            byte[] bArr = zVarZ.f6825a;
            int i8 = zVarZ.f6827c;
            j7 = -1;
            int iMin = (int) Math.min(j10 - j11, 8192 - i8);
            synchronized (qVar) {
                AbstractC1209k.f(bArr, "array");
                qVar.f6808r.seek(j11);
                i7 = 0;
                while (true) {
                    if (i7 >= iMin) {
                        break;
                    }
                    int i9 = qVar.f6808r.read(bArr, i8, iMin - i7);
                    if (i9 != -1) {
                        i7 += i9;
                    } else if (i7 == 0) {
                        i7 = -1;
                    }
                }
            }
            if (i7 == -1) {
                if (zVarZ.f6826b == zVarZ.f6827c) {
                    c0427g.f6784o = zVarZ.a();
                    A.a(zVarZ);
                }
                if (j9 == j11) {
                    j8 = -1;
                }
            } else {
                zVarZ.f6827c += i7;
                long j12 = i7;
                j11 += j12;
                c0427g.f6785p += j12;
            }
        }
        j8 = j11 - j9;
        if (j8 != j7) {
            this.f6791p += j8;
        }
        return j8;
    }
}
