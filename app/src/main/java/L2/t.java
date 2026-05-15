package L2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: s */
    public static final t f4202s = new t();

    /* JADX INFO: renamed from: o */
    public volatile long f4203o = -9223372036854775807L;

    /* JADX INFO: renamed from: p */
    public final Handler f4204p;

    /* JADX INFO: renamed from: q */
    public Choreographer f4205q;

    /* JADX INFO: renamed from: r */
    public int f4206r;

    public t() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = w2.t.f18881a;
        Handler handler = new Handler(looper, this);
        this.f4204p = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f4203o = j3;
        Choreographer choreographer = this.f4205q;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            try {
                this.f4205q = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e7) {
                AbstractC1697a.x("Vsync sampling disabled due to platform error", e7);
            }
        } else if (i7 == 2) {
            Choreographer choreographer = this.f4205q;
            if (choreographer != null) {
                int i8 = this.f4206r + 1;
                this.f4206r = i8;
                if (i8 == 1) {
                    choreographer.postFrameCallback(this);
                    return true;
                }
            }
        } else {
            if (i7 != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f4205q;
            if (choreographer2 != null) {
                int i9 = this.f4206r - 1;
                this.f4206r = i9;
                if (i9 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f4203o = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
