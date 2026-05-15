package w5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class T implements Runnable, Comparable, N {
    private volatile Object _heap;

    /* JADX INFO: renamed from: o */
    public long f19505o;

    /* JADX INFO: renamed from: p */
    public int f19506p = -1;

    public T(long j3) {
        this.f19505o = j3;
    }

    @Override // w5.N
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                B5.u uVar = AbstractC1767D.f19474b;
                if (obj == uVar) {
                    return;
                }
                U u7 = obj instanceof U ? (U) obj : null;
                if (u7 != null) {
                    u7.c(this);
                }
                this._heap = uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final B5.x b() {
        Object obj = this._heap;
        if (obj instanceof B5.x) {
            return (B5.x) obj;
        }
        return null;
    }

    public final int c(long j3, U u7, V v3) {
        synchronized (this) {
            if (this._heap == AbstractC1767D.f19474b) {
                return 2;
            }
            synchronized (u7) {
                try {
                    T[] tArr = u7.f926a;
                    T t7 = tArr != null ? tArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V.f19508u;
                    v3.getClass();
                    if (V.f19510w.get(v3) != 0) {
                        return 1;
                    }
                    if (t7 == null) {
                        u7.f19507c = j3;
                    } else {
                        long j7 = t7.f19505o;
                        if (j7 - j3 < 0) {
                            j3 = j7;
                        }
                        if (j3 - u7.f19507c > 0) {
                            u7.f19507c = j3;
                        }
                    }
                    long j8 = this.f19505o;
                    long j9 = u7.f19507c;
                    if (j8 - j9 < 0) {
                        this.f19505o = j9;
                    }
                    u7.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f19505o - ((T) obj).f19505o;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    public final void e(U u7) {
        if (this._heap == AbstractC1767D.f19474b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u7;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f19505o + ']';
    }
}
