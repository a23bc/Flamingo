package F2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.datastore.preferences.protobuf.C0535h;
import java.nio.ByteBuffer;
import w2.AbstractC1697a;
import z2.C2081b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f2187q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f2188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2189s;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(yos.music.player.logic.YosPlaybackService r15) {
        /*
            Method dump skipped, instruction units count: 8790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.c.<init>(yos.music.player.logic.YosPlaybackService):void");
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        f fVar = (f) cVar.f2188r;
        AbstractC1697a.i(fVar.f2205c == null);
        HandlerThread handlerThread = fVar.f2204b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) cVar.f2187q;
        mediaCodec.setCallback(fVar, handler);
        fVar.f2205c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        ((k) cVar.f2189s).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        cVar.f2185o = 1;
    }

    public static String k(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // F2.j
    public void B(Surface surface) {
        ((MediaCodec) this.f2187q).setOutputSurface(surface);
    }

    @Override // F2.j
    public ByteBuffer D(int i7) {
        return ((MediaCodec) this.f2187q).getOutputBuffer(i7);
    }

    @Override // F2.j
    public int F() {
        ((k) this.f2189s).g();
        f fVar = (f) this.f2188r;
        synchronized (fVar.f2203a) {
            try {
                IllegalStateException illegalStateException = fVar.f2214n;
                if (illegalStateException != null) {
                    fVar.f2214n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f2211j;
                if (codecException != null) {
                    fVar.f2211j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.f2212k;
                if (cryptoException != null) {
                    fVar.f2212k = null;
                    throw cryptoException;
                }
                int i7 = -1;
                if (fVar.l > 0 || fVar.f2213m) {
                    return -1;
                }
                C0535h c0535h = fVar.f2206d;
                int i8 = c0535h.f9479b;
                int i9 = c0535h.f9480c;
                if (!(i8 == i9)) {
                    if (i8 == i9) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i7 = ((int[]) c0535h.f9482e)[i8];
                    c0535h.f9479b = (i8 + 1) & c0535h.f9481d;
                }
                return i7;
            } finally {
            }
        }
    }

    @Override // F2.j
    public void a() {
        try {
            if (this.f2185o == 1) {
                ((k) this.f2189s).shutdown();
                f fVar = (f) this.f2188r;
                synchronized (fVar.f2203a) {
                    fVar.f2213m = true;
                    fVar.f2204b.quit();
                    fVar.a();
                }
            }
            this.f2185o = 2;
            if (this.f2186p) {
                return;
            }
            try {
                int i7 = w2.t.f18881a;
                if (i7 >= 30 && i7 < 33) {
                    ((MediaCodec) this.f2187q).stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f2186p) {
                try {
                    int i8 = w2.t.f18881a;
                    if (i8 >= 30 && i8 < 33) {
                        ((MediaCodec) this.f2187q).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // F2.j
    public void b(int i7, int i8, int i9, long j3) {
        ((k) this.f2189s).b(i7, i8, i9, j3);
    }

    @Override // F2.j
    public void c(int i7, C2081b c2081b, long j3, int i8) {
        ((k) this.f2189s).c(i7, c2081b, j3, i8);
    }

    @Override // F2.j
    public void d(Bundle bundle) {
        ((k) this.f2189s).d(bundle);
    }

    @Override // F2.j
    public int e(MediaCodec.BufferInfo bufferInfo) {
        ((k) this.f2189s).g();
        f fVar = (f) this.f2188r;
        synchronized (fVar.f2203a) {
            try {
                IllegalStateException illegalStateException = fVar.f2214n;
                if (illegalStateException != null) {
                    fVar.f2214n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f2211j;
                if (codecException != null) {
                    fVar.f2211j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.f2212k;
                if (cryptoException != null) {
                    fVar.f2212k = null;
                    throw cryptoException;
                }
                if (fVar.l > 0 || fVar.f2213m) {
                    return -1;
                }
                C0535h c0535h = fVar.f2207e;
                int i7 = c0535h.f9479b;
                int i8 = c0535h.f9480c;
                if (i7 == i8) {
                    return -1;
                }
                if (i7 == i8) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i9 = ((int[]) c0535h.f9482e)[i7];
                c0535h.f9479b = c0535h.f9481d & (i7 + 1);
                if (i9 >= 0) {
                    AbstractC1697a.j(fVar.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f2208f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i9 == -2) {
                    fVar.h = (MediaFormat) fVar.f2209g.remove();
                }
                return i9;
            } finally {
            }
        }
    }

    @Override // F2.j
    public void f(L2.l lVar, Handler handler) {
        ((MediaCodec) this.f2187q).setOnFrameRenderedListener(new C0132a(this, lVar, 0), handler);
    }

    @Override // F2.j
    public void flush() {
        ((k) this.f2189s).flush();
        ((MediaCodec) this.f2187q).flush();
        f fVar = (f) this.f2188r;
        synchronized (fVar.f2203a) {
            fVar.l++;
            Handler handler = fVar.f2205c;
            int i7 = w2.t.f18881a;
            handler.post(new B2.e(4, fVar));
        }
        ((MediaCodec) this.f2187q).start();
    }

    @Override // F2.j
    public void g(long j3, int i7) {
        ((MediaCodec) this.f2187q).releaseOutputBuffer(i7, j3);
    }

    @Override // F2.j
    public boolean h(r rVar) {
        f fVar = (f) this.f2188r;
        synchronized (fVar.f2203a) {
            fVar.f2215o = rVar;
        }
        return true;
    }

    @Override // F2.j
    public void j(int i7, boolean z6) {
        ((MediaCodec) this.f2187q).releaseOutputBuffer(i7, z6);
    }

    @Override // F2.j
    public void n(int i7) {
        ((MediaCodec) this.f2187q).setVideoScalingMode(i7);
    }

    @Override // F2.j
    public MediaFormat x() {
        MediaFormat mediaFormat;
        f fVar = (f) this.f2188r;
        synchronized (fVar.f2203a) {
            try {
                mediaFormat = fVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // F2.j
    public ByteBuffer y(int i7) {
        return ((MediaCodec) this.f2187q).getInputBuffer(i7);
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, k kVar) {
        this.f2187q = mediaCodec;
        this.f2188r = new f(handlerThread);
        this.f2189s = kVar;
        this.f2185o = 0;
    }
}
