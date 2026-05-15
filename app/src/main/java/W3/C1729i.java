package w3;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: w3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1729i {
    public static final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f19202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f19203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f19204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f19205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f19206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f19207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f19208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f19209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f19210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f19211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f19212w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1741o f19215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f19216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f19217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t2.T f19218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t2.T f19219g;
    public final Bundle h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f19220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1 f19221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E4.I f19222k;

    static {
        int i7 = w2.t.f18881a;
        l = Integer.toString(0, 36);
        f19202m = Integer.toString(1, 36);
        f19203n = Integer.toString(2, 36);
        f19204o = Integer.toString(9, 36);
        f19205p = Integer.toString(3, 36);
        f19206q = Integer.toString(4, 36);
        f19207r = Integer.toString(5, 36);
        f19208s = Integer.toString(6, 36);
        f19209t = Integer.toString(11, 36);
        f19210u = Integer.toString(7, 36);
        f19211v = Integer.toString(8, 36);
        f19212w = Integer.toString(10, 36);
    }

    public C1729i(int i7, int i8, InterfaceC1741o interfaceC1741o, PendingIntent pendingIntent, E4.I i9, w1 w1Var, t2.T t7, t2.T t8, Bundle bundle, Bundle bundle2, n1 n1Var) {
        this.f19213a = i7;
        this.f19214b = i8;
        this.f19215c = interfaceC1741o;
        this.f19216d = pendingIntent;
        this.f19222k = i9;
        this.f19217e = w1Var;
        this.f19218f = t7;
        this.f19219g = t8;
        this.h = bundle;
        this.f19220i = bundle2;
        this.f19221j = n1Var;
    }

    public static C1729i a(Bundle bundle) {
        E4.b0 b0VarF;
        InterfaceC1741o interfaceC1741o;
        IBinder binder = bundle.getBinder(f19212w);
        if (binder instanceof BinderC1727h) {
            return ((BinderC1727h) binder).f19201c;
        }
        int i7 = bundle.getInt(l, 0);
        int i8 = bundle.getInt(f19211v, 0);
        IBinder binder2 = bundle.getBinder(f19202m);
        binder2.getClass();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f19203n);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f19204o);
        if (parcelableArrayList != null) {
            E4.F fO = E4.I.o();
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i9);
                bundle2.getClass();
                fO.a(C1709a.b(i8, bundle2));
            }
            b0VarF = fO.f();
        } else {
            E4.G g6 = E4.I.f1870p;
            b0VarF = E4.b0.f1913s;
        }
        E4.b0 b0Var = b0VarF;
        Bundle bundle3 = bundle.getBundle(f19205p);
        w1 w1VarA = bundle3 == null ? w1.f19385b : w1.a(bundle3);
        Bundle bundle4 = bundle.getBundle(f19207r);
        t2.T tB = bundle4 == null ? t2.T.f16353b : t2.T.b(bundle4);
        Bundle bundle5 = bundle.getBundle(f19206q);
        t2.T tB2 = bundle5 == null ? t2.T.f16353b : t2.T.b(bundle5);
        Bundle bundle6 = bundle.getBundle(f19208s);
        Bundle bundle7 = bundle.getBundle(f19209t);
        Bundle bundle8 = bundle.getBundle(f19210u);
        n1 n1VarR = bundle8 == null ? n1.f19254F : n1.r(i8, bundle8);
        Bundle bundle9 = bundle7;
        int i10 = i1.f19223i;
        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1741o)) {
            C1739n c1739n = new C1739n();
            c1739n.f19253c = binder2;
            interfaceC1741o = c1739n;
        } else {
            interfaceC1741o = (InterfaceC1741o) iInterfaceQueryLocalInterface;
        }
        if (bundle6 == null) {
            bundle6 = Bundle.EMPTY;
        }
        Bundle bundle10 = bundle6;
        if (bundle9 == null) {
            bundle9 = Bundle.EMPTY;
        }
        return new C1729i(i7, i8, interfaceC1741o, pendingIntent, b0Var, w1VarA, tB2, tB, bundle10, bundle9, n1VarR);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, this.f19213a);
        bundle.putBinder(f19202m, this.f19215c.asBinder());
        bundle.putParcelable(f19203n, this.f19216d);
        E4.I i8 = this.f19222k;
        if (!i8.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i8.size());
            Iterator<E> it = i8.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1709a) it.next()).c());
            }
            bundle.putParcelableArrayList(f19204o, arrayList);
        }
        w1 w1Var = this.f19217e;
        w1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        E4.p0 it2 = w1Var.f19387a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((v1) it2.next()).b());
        }
        bundle2.putParcelableArrayList(w1.f19386c, arrayList2);
        bundle.putBundle(f19205p, bundle2);
        t2.T t7 = this.f19218f;
        bundle.putBundle(f19206q, t7.c());
        t2.T t8 = this.f19219g;
        bundle.putBundle(f19207r, t8.c());
        bundle.putBundle(f19208s, this.h);
        bundle.putBundle(f19209t, this.f19220i);
        bundle.putBundle(f19210u, this.f19221j.q(k1.g(t7, t8), false, false).t(i7));
        bundle.putInt(f19211v, this.f19214b);
        return bundle;
    }
}
