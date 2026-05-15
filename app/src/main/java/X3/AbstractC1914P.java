package x3;

import D2.HandlerC0087c;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: x3.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1914P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20000c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HandlerC0087c f20002e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19998a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1913O f19999b = new C1913O(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f20001d = new WeakReference(null);

    public final void C(S s7, Handler handler) {
        synchronized (this.f19998a) {
            try {
                this.f20001d = new WeakReference(s7);
                HandlerC0087c handlerC0087c = this.f20002e;
                HandlerC0087c handlerC0087c2 = null;
                if (handlerC0087c != null) {
                    handlerC0087c.removeCallbacksAndMessages(null);
                }
                if (s7 != null && handler != null) {
                    handlerC0087c2 = new HandlerC0087c(this, handler.getLooper(), 7);
                }
                this.f20002e = handlerC0087c2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(S s7, Handler handler) {
        if (this.f20000c) {
            this.f20000c = false;
            handler.removeMessages(1);
            m0 m0VarD = s7.d();
            long j3 = m0VarD == null ? 0L : m0VarD.f20072s;
            boolean z6 = m0VarD != null && m0VarD.f20068o == 3;
            boolean z7 = (516 & j3) != 0;
            boolean z8 = (j3 & 514) != 0;
            if (z6 && z8) {
                h();
            } else {
                if (z6 || !z7) {
                    return;
                }
                i();
            }
        }
    }

    public boolean g(Intent intent) {
        S s7;
        HandlerC0087c handlerC0087c;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f19998a) {
                s7 = (S) this.f20001d.get();
                handlerC0087c = this.f20002e;
            }
            if (s7 != null && handlerC0087c != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                f0 f0VarC = s7.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(s7, handlerC0087c);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(s7, handlerC0087c);
                    return true;
                }
                if (!this.f20000c) {
                    this.f20000c = true;
                    handlerC0087c.sendMessageDelayed(handlerC0087c.obtainMessage(1, f0VarC), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                handlerC0087c.removeMessages(1);
                this.f20000c = false;
                m0 m0VarD = s7.d();
                if (((m0VarD == null ? 0L : m0VarD.f20072s) & 32) != 0) {
                    y();
                }
                return true;
            }
        }
        return false;
    }

    public void B() {
    }

    public void f() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void r() {
    }

    public void y() {
    }

    public void z() {
    }

    public void A(long j3) {
    }

    public void b(C1910L c1910l) {
    }

    public void q(C1910L c1910l) {
    }

    public void s(long j3) {
    }

    public void t(float f7) {
    }

    public void u(n0 n0Var) {
    }

    public void v(n0 n0Var) {
    }

    public void w(int i7) {
    }

    public void x(int i7) {
    }

    public void c(C1910L c1910l, int i7) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
