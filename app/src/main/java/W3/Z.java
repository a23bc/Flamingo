package w3;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import x3.BinderC1915Q;
import x3.C1901C;
import x3.C1922g;
import x3.InterfaceC1923h;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends ResultReceiver {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19108o = 1;

    /* JADX INFO: renamed from: p */
    public Object f19109p;

    public /* synthetic */ Z(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        InterfaceC1923h interfaceC1923h;
        switch (this.f19108o) {
            case 0:
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                ((I4.E) this.f19109p).l(new z1(i7, bundle));
                return;
            default:
                C1901C c1901c = (C1901C) ((WeakReference) this.f19109p).get();
                if (c1901c == null || bundle == null) {
                    return;
                }
                synchronized (c1901c.f19974b) {
                    x3.Y y6 = c1901c.f19977e;
                    IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i8 = BinderC1915Q.f20003d;
                    if (binder == null) {
                        interfaceC1923h = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1923h)) {
                            C1922g c1922g = new C1922g();
                            c1922g.f20040c = binder;
                            interfaceC1923h = c1922g;
                        } else {
                            interfaceC1923h = (InterfaceC1923h) iInterfaceQueryLocalInterface;
                        }
                    }
                    y6.c(interfaceC1923h);
                    c1901c.f19977e.d(M3.a.S(bundle));
                    c1901c.a();
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Handler handler, I4.E e7) {
        super(handler);
        this.f19109p = e7;
    }
}
