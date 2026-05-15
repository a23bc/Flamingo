package Y1;

import android.os.Looper;
import android.util.Log;
import d.C0743I;
import g.C0938e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: A */
    public boolean f8618A;

    /* JADX INFO: renamed from: B */
    public ArrayList f8619B;

    /* JADX INFO: renamed from: C */
    public ArrayList f8620C;

    /* JADX INFO: renamed from: D */
    public ArrayList f8621D;

    /* JADX INFO: renamed from: E */
    public t f8622E;

    /* JADX INFO: renamed from: F */
    public final B3.c f8623F;

    /* JADX INFO: renamed from: b */
    public boolean f8625b;

    /* JADX INFO: renamed from: d */
    public ArrayList f8627d;

    /* JADX INFO: renamed from: f */
    public C0743I f8629f;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f8633k;
    public final j l;

    /* JADX INFO: renamed from: m */
    public final j f8634m;

    /* JADX INFO: renamed from: n */
    public final j f8635n;

    /* JADX INFO: renamed from: o */
    public final j f8636o;

    /* JADX INFO: renamed from: p */
    public final m f8637p;

    /* JADX INFO: renamed from: q */
    public int f8638q;

    /* JADX INFO: renamed from: r */
    public g f8639r;

    /* JADX INFO: renamed from: s */
    public g f8640s;

    /* JADX INFO: renamed from: t */
    public final n f8641t;

    /* JADX INFO: renamed from: u */
    public C0938e f8642u;

    /* JADX INFO: renamed from: v */
    public C0938e f8643v;

    /* JADX INFO: renamed from: w */
    public C0938e f8644w;

    /* JADX INFO: renamed from: x */
    public ArrayDeque f8645x;

    /* JADX INFO: renamed from: y */
    public boolean f8646y;

    /* JADX INFO: renamed from: z */
    public boolean f8647z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f8624a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final U3.h f8626c = new U3.h(8);

    /* JADX INFO: renamed from: e */
    public final i f8628e = new i(this);

    /* JADX INFO: renamed from: g */
    public final l f8630g = new l(0, this);
    public final AtomicInteger h = new AtomicInteger();

    /* JADX INFO: renamed from: i */
    public final Map f8631i = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: j */
    public final Map f8632j = Collections.synchronizedMap(new HashMap());

    public q() {
        Collections.synchronizedMap(new HashMap());
        new CopyOnWriteArrayList();
        this.f8633k = new CopyOnWriteArrayList();
        this.l = new F1.a(this) { // from class: Y1.j

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f8606a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ q f8607b;

            public /* synthetic */ j(q this, int i7) {
                i = i7;
                this.f8607b = this;
            }

            @Override // F1.a
            public final void c(Object obj) {
                switch (i) {
                    case 0:
                        Iterator it = this.f8607b.f8626c.U().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f8607b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f8626c.U().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f8607b;
                        qVar2.getClass();
                        boolean z6 = ((u1.g) obj).f17151a;
                        Iterator it3 = qVar2.f8626c.U().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f8607b;
                        qVar3.getClass();
                        boolean z7 = ((u1.u) obj).f17197a;
                        Iterator it4 = qVar3.f8626c.U().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        this.f8634m = new F1.a(this) { // from class: Y1.j

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f8606a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ q f8607b;

            public /* synthetic */ j(q this, int i7) {
                i = i7;
                this.f8607b = this;
            }

            @Override // F1.a
            public final void c(Object obj) {
                switch (i) {
                    case 0:
                        Iterator it = this.f8607b.f8626c.U().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f8607b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f8626c.U().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f8607b;
                        qVar2.getClass();
                        boolean z6 = ((u1.g) obj).f17151a;
                        Iterator it3 = qVar2.f8626c.U().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f8607b;
                        qVar3.getClass();
                        boolean z7 = ((u1.u) obj).f17197a;
                        Iterator it4 = qVar3.f8626c.U().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        this.f8635n = new F1.a(this) { // from class: Y1.j

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f8606a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ q f8607b;

            public /* synthetic */ j(q this, int i7) {
                i = i7;
                this.f8607b = this;
            }

            @Override // F1.a
            public final void c(Object obj) {
                switch (i) {
                    case 0:
                        Iterator it = this.f8607b.f8626c.U().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f8607b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f8626c.U().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f8607b;
                        qVar2.getClass();
                        boolean z6 = ((u1.g) obj).f17151a;
                        Iterator it3 = qVar2.f8626c.U().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f8607b;
                        qVar3.getClass();
                        boolean z7 = ((u1.u) obj).f17197a;
                        Iterator it4 = qVar3.f8626c.U().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        this.f8636o = new F1.a(this) { // from class: Y1.j

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f8606a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ q f8607b;

            public /* synthetic */ j(q this, int i7) {
                i = i7;
                this.f8607b = this;
            }

            @Override // F1.a
            public final void c(Object obj) {
                switch (i) {
                    case 0:
                        Iterator it = this.f8607b.f8626c.U().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f8607b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f8626c.U().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f8607b;
                        qVar2.getClass();
                        boolean z6 = ((u1.g) obj).f17151a;
                        Iterator it3 = qVar2.f8626c.U().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f8607b;
                        qVar3.getClass();
                        boolean z7 = ((u1.u) obj).f17197a;
                        Iterator it4 = qVar3.f8626c.U().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        this.f8637p = new m(this);
        this.f8638q = -1;
        this.f8641t = new n(this);
        this.f8645x = new ArrayDeque();
        this.f8623F = new B3.c(7, this);
    }

    public static boolean h(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    public final void a() {
        this.f8625b = false;
        this.f8620C.clear();
        this.f8619B.clear();
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f8626c.O().iterator();
        if (!it.hasNext()) {
            return hashSet;
        }
        A0.e.G(it.next());
        throw null;
    }

    public final void c(int i7) {
        try {
            this.f8625b = true;
            Iterator it = ((HashMap) this.f8626c.f7043p).values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
            }
            i(i7, false);
            Iterator it2 = b().iterator();
            if (it2.hasNext()) {
                ((x) it2.next()).a();
                throw null;
            }
            this.f8625b = false;
            e(true);
        } catch (Throwable th) {
            this.f8625b = false;
            throw th;
        }
    }

    public final void d(boolean z6) {
        if (this.f8625b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8639r == null) {
            if (!this.f8618A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8639r.f8598p.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && (this.f8646y || this.f8647z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f8619B == null) {
            this.f8619B = new ArrayList();
            this.f8620C = new ArrayList();
        }
    }

    public final boolean e(boolean z6) {
        boolean z7;
        d(z6);
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f8619B;
            ArrayList arrayList2 = this.f8620C;
            synchronized (this.f8624a) {
                if (this.f8624a.isEmpty()) {
                    z7 = false;
                } else {
                    try {
                        int size = this.f8624a.size();
                        int i7 = 0;
                        z7 = false;
                        while (i7 < size) {
                            a aVar = (a) this.f8624a.get(i7);
                            aVar.getClass();
                            if (h(2)) {
                                aVar.toString();
                            }
                            arrayList.add(aVar);
                            arrayList2.add(Boolean.FALSE);
                            if (aVar.f8568g) {
                                q qVar = aVar.f8575p;
                                if (qVar.f8627d == null) {
                                    qVar.f8627d = new ArrayList();
                                }
                                qVar.f8627d.add(aVar);
                            }
                            i7++;
                            z7 = true;
                        }
                    } finally {
                    }
                }
            }
            if (!z7) {
                k();
                ((HashMap) this.f8626c.f7043p).values().removeAll(Collections.singleton(null));
                return z8;
            }
            this.f8625b = true;
            try {
                j(this.f8619B, this.f8620C);
                a();
                z8 = true;
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.ArrayList r19, java.util.ArrayList r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.q.f(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final void g() {
        U3.h hVar = this.f8626c;
        ArrayList arrayList = (ArrayList) hVar.f7042o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
        }
        Iterator it = ((HashMap) hVar.f7043p).values().iterator();
        while (it.hasNext()) {
            A0.e.G(it.next());
        }
    }

    public final void i(int i7, boolean z6) {
        if (this.f8639r == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i7 != this.f8638q) {
            this.f8638q = i7;
            U3.h hVar = this.f8626c;
            Iterator it = ((ArrayList) hVar.f7042o).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = ((HashMap) hVar.f7043p).values().iterator();
            while (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
            }
            Iterator it3 = hVar.O().iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!((a) arrayList.get(i7)).f8574o) {
                if (i8 != i7) {
                    f(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((a) arrayList.get(i8)).f8574o) {
                        i8++;
                    }
                }
                f(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            f(arrayList, arrayList2, i8, size);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l5.a, m5.i] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l5.a, m5.i] */
    public final void k() {
        synchronized (this.f8624a) {
            try {
                if (!this.f8624a.isEmpty()) {
                    l lVar = this.f8630g;
                    lVar.f10811a = true;
                    ?? r12 = lVar.f10813c;
                    if (r12 != 0) {
                        r12.a();
                    }
                    return;
                }
                l lVar2 = this.f8630g;
                ArrayList arrayList = this.f8627d;
                lVar2.f10811a = (arrayList != null ? arrayList.size() : 0) > 0;
                ?? r02 = lVar2.f10813c;
                if (r02 != 0) {
                    r02.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        g gVar = this.f8639r;
        if (gVar != null) {
            sb.append(gVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f8639r)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }
}
