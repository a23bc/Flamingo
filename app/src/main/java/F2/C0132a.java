package F2;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: F2.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0132a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ L2.l f2181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j f2182c;

    public /* synthetic */ C0132a(j jVar, L2.l lVar, int i7) {
        this.f2180a = i7;
        this.f2182c = jVar;
        this.f2181b = lVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j7) {
        switch (this.f2180a) {
            case 0:
                ((c) this.f2182c).getClass();
                L2.l lVar = this.f2181b;
                lVar.getClass();
                if (w2.t.f18881a >= 30) {
                    lVar.a(j3);
                } else {
                    Handler handler = lVar.f4144o;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                }
                break;
            default:
                ((A0.b) this.f2182c).getClass();
                L2.l lVar2 = this.f2181b;
                lVar2.getClass();
                if (w2.t.f18881a >= 30) {
                    lVar2.a(j3);
                } else {
                    Handler handler2 = lVar2.f4144o;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                }
                break;
        }
    }
}
