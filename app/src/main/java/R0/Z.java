package R0;

import android.view.Choreographer;
import l5.InterfaceC1182c;
import w5.C1793k;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1793k f6400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f6401p;

    public Z(C1793k c1793k, C0371a0 c0371a0, InterfaceC1182c interfaceC1182c) {
        this.f6400o = c1793k;
        this.f6401p = interfaceC1182c;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object objL;
        try {
            objL = this.f6401p.b(Long.valueOf(j3));
        } catch (Throwable th) {
            objL = android.support.v4.media.session.b.l(th);
        }
        this.f6400o.resumeWith(objL);
    }
}
