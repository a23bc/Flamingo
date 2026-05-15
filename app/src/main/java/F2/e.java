package F2;

import D2.HandlerC0087c;
import N2.K;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import z2.C2081b;

/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ArrayDeque f2195u = new ArrayDeque();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f2196v = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MediaCodec f2197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HandlerThread f2198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerC0087c f2199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReference f2200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final K f2201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2202t;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        K k7 = new K();
        this.f2197o = mediaCodec;
        this.f2198p = handlerThread;
        this.f2201s = k7;
        this.f2200r = new AtomicReference();
    }

    public static d a() {
        ArrayDeque arrayDeque = f2195u;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(d dVar) {
        ArrayDeque arrayDeque = f2195u;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override // F2.k
    public final void b(int i7, int i8, int i9, long j3) {
        g();
        d dVarA = a();
        dVarA.f2190a = i7;
        dVarA.f2191b = i8;
        dVarA.f2193d = j3;
        dVarA.f2194e = i9;
        HandlerC0087c handlerC0087c = this.f2199q;
        int i10 = w2.t.f18881a;
        handlerC0087c.obtainMessage(1, dVarA).sendToTarget();
    }

    @Override // F2.k
    public final void c(int i7, C2081b c2081b, long j3, int i8) {
        g();
        d dVarA = a();
        dVarA.f2190a = i7;
        dVarA.f2191b = 0;
        dVarA.f2193d = j3;
        dVarA.f2194e = i8;
        int i9 = c2081b.f21109f;
        MediaCodec.CryptoInfo cryptoInfo = dVarA.f2192c;
        cryptoInfo.numSubSamples = i9;
        int[] iArr = c2081b.f21107d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c2081b.f21108e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c2081b.f21105b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c2081b.f21104a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c2081b.f21106c;
        if (w2.t.f18881a >= 24) {
            A3.a.n();
            cryptoInfo.setPattern(A3.a.e(c2081b.f21110g, c2081b.h));
        }
        this.f2199q.obtainMessage(2, dVarA).sendToTarget();
    }

    @Override // F2.k
    public final void d(Bundle bundle) {
        g();
        HandlerC0087c handlerC0087c = this.f2199q;
        int i7 = w2.t.f18881a;
        handlerC0087c.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // F2.k
    public final void flush() {
        if (this.f2202t) {
            try {
                HandlerC0087c handlerC0087c = this.f2199q;
                handlerC0087c.getClass();
                handlerC0087c.removeCallbacksAndMessages(null);
                K k7 = this.f2201s;
                k7.d();
                HandlerC0087c handlerC0087c2 = this.f2199q;
                handlerC0087c2.getClass();
                handlerC0087c2.obtainMessage(3).sendToTarget();
                k7.c();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // F2.k
    public final void g() {
        RuntimeException runtimeException = (RuntimeException) this.f2200r.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // F2.k
    public final void shutdown() {
        if (this.f2202t) {
            flush();
            this.f2198p.quit();
        }
        this.f2202t = false;
    }

    @Override // F2.k
    public final void start() {
        if (this.f2202t) {
            return;
        }
        HandlerThread handlerThread = this.f2198p;
        handlerThread.start();
        this.f2199q = new HandlerC0087c(this, handlerThread.getLooper(), 2);
        this.f2202t = true;
    }
}
