package F2;

import A2.O;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.datastore.preferences.protobuf.C0535h;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f2204b;

    /* JADX INFO: renamed from: c */
    public Handler f2205c;
    public MediaFormat h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f2210i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f2211j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f2212k;
    public long l;

    /* JADX INFO: renamed from: m */
    public boolean f2213m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f2214n;

    /* JADX INFO: renamed from: o */
    public r f2215o;

    /* JADX INFO: renamed from: a */
    public final Object f2203a = new Object();

    /* JADX INFO: renamed from: d */
    public final C0535h f2206d = new C0535h();

    /* JADX INFO: renamed from: e */
    public final C0535h f2207e = new C0535h();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f2208f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f2209g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f2204b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f2209g;
        if (!arrayDeque.isEmpty()) {
            this.f2210i = (MediaFormat) arrayDeque.getLast();
        }
        C0535h c0535h = this.f2206d;
        c0535h.f9480c = c0535h.f9479b;
        C0535h c0535h2 = this.f2207e;
        c0535h2.f9480c = c0535h2.f9479b;
        this.f2208f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f2203a) {
            this.f2214n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f2203a) {
            this.f2212k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f2203a) {
            this.f2211j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        O o7;
        synchronized (this.f2203a) {
            this.f2206d.a(i7);
            r rVar = this.f2215o;
            if (rVar != null && (o7 = rVar.f2236a.f2275U) != null) {
                o7.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        O o7;
        synchronized (this.f2203a) {
            try {
                MediaFormat mediaFormat = this.f2210i;
                if (mediaFormat != null) {
                    this.f2207e.a(-2);
                    this.f2209g.add(mediaFormat);
                    this.f2210i = null;
                }
                this.f2207e.a(i7);
                this.f2208f.add(bufferInfo);
                r rVar = this.f2215o;
                if (rVar != null && (o7 = rVar.f2236a.f2275U) != null) {
                    o7.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f2203a) {
            this.f2207e.a(-2);
            this.f2209g.add(mediaFormat);
            this.f2210i = null;
        }
    }
}
