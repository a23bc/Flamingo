package G1;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.view.View;
import c.C0706d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p.C1276e;
import p.ViewOnKeyListenerC1277f;
import x3.AbstractServiceC1940y;
import x3.C1931p;

/* JADX INFO: loaded from: classes.dex */
public final class T implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2666s;

    public /* synthetic */ T(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f2662o = i7;
        this.f2666s = obj;
        this.f2663p = obj2;
        this.f2664q = obj3;
        this.f2665r = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2662o) {
            case 0:
                V.i((View) this.f2663p, (Z) this.f2664q, (V.o) this.f2665r);
                ((ValueAnimator) this.f2666s).start();
                return;
            case 1:
                C1276e c1276e = (C1276e) this.f2663p;
                if (c1276e != null) {
                    k.I i7 = (k.I) this.f2666s;
                    ((ViewOnKeyListenerC1277f) i7.f13847p).f14788N = true;
                    c1276e.f14773b.c(false);
                    ((ViewOnKeyListenerC1277f) i7.f13847p).f14788N = false;
                }
                p.n nVar = (p.n) this.f2664q;
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((p.l) this.f2665r).q(nVar, null, 4);
                    return;
                }
                return;
            case 2:
                IBinder binder = ((Messenger) ((k.I) this.f2663p).f13847p).getBinder();
                k.I i8 = (k.I) this.f2666s;
                C1931p c1931p = (C1931p) ((AbstractServiceC1940y) i8.f13847p).f20128s.get(binder);
                if (c1931p == null) {
                    return;
                }
                AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) i8.f13847p;
                abstractServiceC1940y.getClass();
                HashMap map = c1931p.f20097f;
                String str = (String) this.f2664q;
                IBinder iBinder = (IBinder) this.f2665r;
                try {
                    if (iBinder == null) {
                        map.remove(str);
                    } else {
                        List list = (List) map.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((F1.b) it.next()).f2175a) {
                                    it.remove();
                                }
                            }
                            if (list.size() == 0) {
                                map.remove(str);
                            }
                        }
                    }
                    return;
                } finally {
                    abstractServiceC1940y.f20129t = null;
                }
            default:
                IBinder binder2 = ((Messenger) ((k.I) this.f2663p).f13847p).getBinder();
                k.I i9 = (k.I) this.f2666s;
                C1931p c1931p2 = (C1931p) ((AbstractServiceC1940y) i9.f13847p).f20128s.get(binder2);
                Bundle bundle = (Bundle) this.f2664q;
                if (c1931p2 == null) {
                    Objects.toString(bundle);
                    return;
                }
                AbstractServiceC1940y abstractServiceC1940y2 = (AbstractServiceC1940y) i9.f13847p;
                abstractServiceC1940y2.f20129t = c1931p2;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                ((C0706d) this.f2665r).c(-1, null);
                abstractServiceC1940y2.f20129t = null;
                return;
        }
    }

    public T(View view, Z z6, V.o oVar, ValueAnimator valueAnimator) {
        this.f2662o = 0;
        this.f2663p = view;
        this.f2664q = z6;
        this.f2665r = oVar;
        this.f2666s = valueAnimator;
    }

    public T(k.I i7, k.I i8, String str, Bundle bundle, C0706d c0706d) {
        this.f2662o = 3;
        this.f2666s = i7;
        this.f2663p = i8;
        this.f2664q = bundle;
        this.f2665r = c0706d;
    }
}
