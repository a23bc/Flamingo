package F2;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements D4.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2184p;

    public /* synthetic */ b(int i7, int i8) {
        this.f2183o = i8;
        this.f2184p = i7;
    }

    @Override // D4.j
    public final Object get() {
        switch (this.f2183o) {
            case 0:
                return new HandlerThread(c.k(this.f2184p, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.k(this.f2184p, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
