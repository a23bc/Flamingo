package X3;

import N3.v;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k.I;
import w2.AbstractC1697a;
import x3.AbstractServiceC1940y;
import x3.C1929n;
import x3.C1931p;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f8298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8301t;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f8296o = i7;
        this.f8301t = obj;
        this.f8297p = obj2;
        this.f8298q = obj3;
        this.f8299r = obj4;
        this.f8300s = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8296o) {
            case 0:
                try {
                    if (!(((Y3.j) this.f8297p).f8716o instanceof Y3.a)) {
                        String string = ((UUID) this.f8298q).toString();
                        v vVarH = ((m) this.f8301t).f8304c.h(string);
                        if (vVarH == null || vVarH.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((m) this.f8301t).f8303b.g(string, (N3.i) this.f8299r);
                        ((Context) this.f8300s).startService(V3.a.b((Context) this.f8300s, string, (N3.i) this.f8299r));
                    }
                    ((Y3.j) this.f8297p).j(null);
                    return;
                } catch (Throwable th) {
                    ((Y3.j) this.f8297p).k(th);
                    return;
                }
            default:
                IBinder binder = ((Messenger) ((I) this.f8297p).f13847p).getBinder();
                I i7 = (I) this.f8301t;
                C1931p c1931p = (C1931p) ((AbstractServiceC1940y) i7.f13847p).f20128s.get(binder);
                if (c1931p == null) {
                    return;
                }
                AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) i7.f13847p;
                abstractServiceC1940y.getClass();
                HashMap map = c1931p.f20097f;
                String str = (String) this.f8298q;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    IBinder iBinder = (IBinder) this.f8299r;
                    Bundle bundle = (Bundle) this.f8300s;
                    if (!zHasNext) {
                        arrayList.add(new F1.b(iBinder, bundle));
                        map.put(str, arrayList);
                        C1929n c1929n = new C1929n(abstractServiceC1940y, str, c1931p, str, bundle);
                        abstractServiceC1940y.f20129t = c1931p;
                        if (bundle == null) {
                            c1929n.a();
                        } else {
                            c1929n.f20082c = 1;
                            c1929n.a();
                        }
                        abstractServiceC1940y.f20129t = null;
                        if (c1929n.f20081b) {
                            abstractServiceC1940y.f20129t = null;
                            return;
                        }
                        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c1931p.f20092a + " id=" + str);
                    }
                    F1.b bVar = (F1.b) it.next();
                    if (iBinder == bVar.f2175a) {
                        Bundle bundle2 = (Bundle) bVar.f2176b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            AbstractC1697a.j(bundle2);
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
        }
    }
}
