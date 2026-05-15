package L2;

import A2.C0013n;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* JADX INFO: renamed from: o */
    public final Handler f4144o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ m f4145p;

    public l(m mVar, F2.j jVar) {
        this.f4145p = mVar;
        Handler handlerJ = w2.t.j(this);
        this.f4144o = handlerJ;
        jVar.f(this, handlerJ);
    }

    public final void a(long j3) {
        Surface surface;
        m mVar = this.f4145p;
        if (this != mVar.f4176x1 || mVar.Z == null) {
            return;
        }
        if (j3 == Long.MAX_VALUE) {
            mVar.f2262M0 = true;
            return;
        }
        try {
            mVar.u0(j3);
            mVar.A0(mVar.f4172s1);
            mVar.f2266O0.f297e++;
            q qVar = mVar.f4153Y0;
            boolean z6 = qVar.f4193d != 3;
            qVar.f4193d = 3;
            qVar.f4199k.getClass();
            qVar.f4195f = w2.t.D(SystemClock.elapsedRealtime());
            if (z6 && (surface = mVar.f4161g1) != null) {
                V.o oVar = mVar.f4150V0;
                Handler handler = (Handler) oVar.f7342p;
                if (handler != null) {
                    handler.post(new x(oVar, surface, SystemClock.elapsedRealtime()));
                }
                mVar.f4164j1 = true;
            }
            mVar.c0(j3);
        } catch (C0013n e7) {
            mVar.f2264N0 = e7;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i8 = message.arg2;
        int i9 = w2.t.f18881a;
        a(((((long) i7) & 4294967295L) << 32) | (4294967295L & ((long) i8)));
        return true;
    }
}
