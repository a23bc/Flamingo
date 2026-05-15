package R0;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;
import t.C1443E;

/* JADX INFO: renamed from: R0.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0412v0 implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A2.I f6541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t.J f6542p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t.K f6543q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t.J f6544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1443E f6545s;

    public C0412v0(A2.I i7) {
        this.f6541o = i7;
        long[] jArr = t.Q.f16032a;
        this.f6542p = new t.J();
        t.K k7 = t.S.f16033a;
        this.f6543q = new t.K();
        this.f6544r = new t.J();
        C1443E c1443e = t.N.f16028a;
        this.f6545s = new C1443E();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        C1443E c1443e;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            c1443e = this.f6545s;
            if (i7 >= size) {
                break;
            }
            c1443e.h(i7, (View) arrayList.get(i7));
            i7++;
        }
        int size2 = arrayList.size() - 1;
        t.K k7 = this.f6543q;
        t.J j3 = this.f6542p;
        if (size2 >= 0) {
            while (true) {
                int i8 = size2 - 1;
                View view = (View) arrayList.get(size2);
                A2.I i9 = this.f6541o;
                int nextFocusForwardId = view.getNextFocusForwardId();
                ((C0414w0) i9.f80p).getClass();
                View viewM = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : M.m(2, view, viewGroup);
                if (viewM != null && c1443e.d(viewM) >= 0) {
                    j3.m(view, viewM);
                    k7.a(viewM);
                }
                if (i8 < 0) {
                    break;
                } else {
                    size2 = i8;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i10 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) j3.g(view2)) != null && !k7.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    t.J j7 = this.f6544r;
                    View view4 = (View) j7.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    j7.m(view2, view3);
                    view2 = (View) j3.g(view2);
                }
            }
            if (i10 < 0) {
                return;
            } else {
                size3 = i10;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        t.J j3 = this.f6544r;
        View view3 = (View) j3.g(view);
        View view4 = (View) j3.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f6542p.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        C1443E c1443e = this.f6545s;
        return c1443e.e(view) < c1443e.e(view2) ? -1 : 1;
    }
}
