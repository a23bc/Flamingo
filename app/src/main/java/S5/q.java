package S5;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Closeable {

    /* JADX INFO: renamed from: o */
    public boolean f6805o;

    /* JADX INFO: renamed from: p */
    public int f6806p;

    /* JADX INFO: renamed from: q */
    public final ReentrantLock f6807q = new ReentrantLock();

    /* JADX INFO: renamed from: r */
    public final RandomAccessFile f6808r;

    public q(RandomAccessFile randomAccessFile) {
        this.f6808r = randomAccessFile;
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f6807q;
        reentrantLock.lock();
        try {
            if (this.f6805o) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f6808r.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final k c(long j3) {
        ReentrantLock reentrantLock = this.f6807q;
        reentrantLock.lock();
        try {
            if (this.f6805o) {
                throw new IllegalStateException("closed");
            }
            this.f6806p++;
            reentrantLock.unlock();
            return new k(this, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f6807q;
        reentrantLock.lock();
        try {
            if (this.f6805o) {
                return;
            }
            this.f6805o = true;
            if (this.f6806p != 0) {
                return;
            }
            synchronized (this) {
                this.f6808r.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
