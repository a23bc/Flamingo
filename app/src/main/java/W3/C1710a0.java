package w3;

import D2.HandlerC0085a;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;
import w2.AbstractC1697a;
import x3.BinderC1900B;
import x3.C1899A;
import x3.C1903E;
import x3.C1911M;

/* JADX INFO: renamed from: w3.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1710a0 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final C1899A f19130a = new C1899A(this);

    /* JADX INFO: renamed from: b */
    public HandlerC0085a f19131b;

    /* JADX INFO: renamed from: c */
    public BinderC1900B f19132c;

    /* JADX INFO: renamed from: d */
    public final Handler f19133d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1716c0 f19134e;

    public C1710a0(C1716c0 c1716c0, Looper looper) {
        this.f19134e = c1716c0;
        this.f19133d = new Handler(looper, new com.hchen.superlyricapi.a(3, this));
    }

    public final void a(C1903E c1903e) {
        C1716c0 c1716c0 = this.f19134e;
        C1713b0 c1713b0 = c1716c0.l;
        int i7 = c1713b0.f19146g;
        c1716c0.l = new C1713b0(c1903e, c1713b0.f19141b, c1713b0.f19142c, c1713b0.f19143d, c1713b0.f19144e, c1713b0.f19145f, i7, c1713b0.h);
        k();
    }

    public final void b(boolean z6) {
        C1716c0 c1716c0 = this.f19134e;
        C1760y c1760y = c1716c0.f19154b;
        c1760y.getClass();
        AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z6);
        c1760y.f19400d.A(c1716c0.f19154b, new v1("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY), bundle);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i(8, null, null);
    }

    public final void c(Bundle bundle) {
        C1716c0 c1716c0 = this.f19134e;
        B2.h hVar = c1716c0.f19163m;
        c1716c0.f19163m = new B2.h((n1) hVar.f749a, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, bundle, null);
        C1760y c1760y = c1716c0.f19154b;
        c1760y.getClass();
        AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
        c1760y.f19400d.getClass();
    }

    public final void d(C1911M c1911m) {
        C1716c0 c1716c0 = this.f19134e;
        C1713b0 c1713b0 = c1716c0.l;
        int i7 = c1713b0.f19146g;
        c1716c0.l = new C1713b0(c1713b0.f19140a, c1713b0.f19141b, c1911m, c1713b0.f19143d, c1713b0.f19144e, c1713b0.f19145f, i7, c1713b0.h);
        k();
    }

    public final void e(x3.m0 m0Var) {
        C1716c0 c1716c0 = this.f19134e;
        C1713b0 c1713b0 = c1716c0.l;
        x3.m0 m0VarP0 = C1716c0.P0(m0Var);
        int i7 = c1713b0.f19146g;
        c1716c0.l = new C1713b0(c1713b0.f19140a, m0VarP0, c1713b0.f19142c, c1713b0.f19143d, c1713b0.f19144e, c1713b0.f19145f, i7, c1713b0.h);
        k();
    }

    public final void f(List list) {
        C1716c0 c1716c0 = this.f19134e;
        C1713b0 c1713b0 = c1716c0.l;
        List listO0 = C1716c0.O0(list);
        int i7 = c1713b0.f19146g;
        c1716c0.l = new C1713b0(c1713b0.f19140a, c1713b0.f19141b, c1713b0.f19142c, listO0, c1713b0.f19144e, c1713b0.f19145f, i7, c1713b0.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        C1716c0 c1716c0 = this.f19134e;
        C1713b0 c1713b0 = c1716c0.l;
        int i7 = c1713b0.f19146g;
        c1716c0.l = new C1713b0(c1713b0.f19140a, c1713b0.f19141b, c1713b0.f19142c, c1713b0.f19143d, charSequence, c1713b0.f19145f, i7, c1713b0.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        C1716c0 c1716c0 = this.f19134e;
        C1760y c1760y = c1716c0.f19154b;
        c1760y.getClass();
        AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
        Bundle bundle2 = Bundle.EMPTY;
        v1 v1Var = new v1(str, bundle2);
        if (bundle == null) {
            bundle = bundle2;
        }
        c1760y.f19400d.A(c1716c0.f19154b, v1Var, bundle);
    }

    public final void i(int i7, Object obj, Bundle bundle) {
        HandlerC0085a handlerC0085a = this.f19131b;
        if (handlerC0085a != null) {
            Message messageObtainMessage = handlerC0085a.obtainMessage(i7, obj);
            if (bundle != null) {
                messageObtainMessage.setData(bundle);
            }
            messageObtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler != null) {
            HandlerC0085a handlerC0085a = new HandlerC0085a(this, handler.getLooper());
            this.f19131b = handlerC0085a;
            handlerC0085a.f1463b = true;
        } else {
            HandlerC0085a handlerC0085a2 = this.f19131b;
            if (handlerC0085a2 != null) {
                handlerC0085a2.f1463b = false;
                handlerC0085a2.removeCallbacksAndMessages(null);
                this.f19131b = null;
            }
        }
    }

    public final void k() {
        Handler handler = this.f19133d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, 500L);
    }
}
