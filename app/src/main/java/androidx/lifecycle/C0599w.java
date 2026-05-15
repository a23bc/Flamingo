package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.AbstractC1209k;
import r.C1380a;
import s.C1424a;
import s.C1425b;
import s.C1426c;
import s.C1427d;

/* JADX INFO: renamed from: androidx.lifecycle.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0599w extends K {

    /* JADX INFO: renamed from: e */
    public final boolean f9754e;

    /* JADX INFO: renamed from: f */
    public C1424a f9755f = new C1424a();

    /* JADX INFO: renamed from: g */
    public EnumC0593p f9756g;
    public final WeakReference h;

    /* JADX INFO: renamed from: i */
    public int f9757i;

    /* JADX INFO: renamed from: j */
    public boolean f9758j;

    /* JADX INFO: renamed from: k */
    public boolean f9759k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m */
    public final z5.J f9760m;

    public C0599w(InterfaceC0597u interfaceC0597u, boolean z6) {
        this.f9754e = z6;
        EnumC0593p enumC0593p = EnumC0593p.f9746p;
        this.f9756g = enumC0593p;
        this.l = new ArrayList();
        this.h = new WeakReference(interfaceC0597u);
        this.f9760m = z5.z.b(enumC0593p);
    }

    @Override // androidx.lifecycle.K
    public final void a(InterfaceC0596t interfaceC0596t) {
        InterfaceC0595s c0585h;
        Object obj;
        InterfaceC0597u interfaceC0597u;
        ArrayList arrayList = this.l;
        AbstractC1209k.f(interfaceC0596t, "observer");
        q("addObserver");
        EnumC0593p enumC0593p = this.f9756g;
        EnumC0593p enumC0593p2 = EnumC0593p.f9745o;
        if (enumC0593p != enumC0593p2) {
            enumC0593p2 = EnumC0593p.f9746p;
        }
        C0598v c0598v = new C0598v();
        HashMap map = AbstractC0601y.f9762a;
        boolean z6 = interfaceC0596t instanceof InterfaceC0595s;
        boolean z7 = interfaceC0596t instanceof InterfaceC0583f;
        if (z6 && z7) {
            c0585h = new C0585h((InterfaceC0583f) interfaceC0596t, (InterfaceC0595s) interfaceC0596t);
        } else if (z7) {
            c0585h = new C0585h((InterfaceC0583f) interfaceC0596t, (InterfaceC0595s) null);
        } else if (z6) {
            c0585h = (InterfaceC0595s) interfaceC0596t;
        } else {
            Class<?> cls = interfaceC0596t.getClass();
            if (AbstractC0601y.b(cls) == 2) {
                Object obj2 = AbstractC0601y.f9763b.get(cls);
                AbstractC1209k.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0601y.a((Constructor) list.get(0), interfaceC0596t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0587j[] interfaceC0587jArr = new InterfaceC0587j[size];
                if (size > 0) {
                    AbstractC0601y.a((Constructor) list.get(0), interfaceC0596t);
                    throw null;
                }
                c0585h = new C0582e(0, interfaceC0587jArr);
            } else {
                c0585h = new C0585h(interfaceC0596t);
            }
        }
        c0598v.f9753b = c0585h;
        c0598v.f9752a = enumC0593p2;
        C1424a c1424a = this.f9755f;
        C1426c c1426cA = c1424a.a(interfaceC0596t);
        if (c1426cA != null) {
            obj = c1426cA.f15810p;
        } else {
            HashMap map2 = c1424a.f15805s;
            C1426c c1426c = new C1426c(interfaceC0596t, c0598v);
            c1424a.f15819r++;
            C1426c c1426c2 = c1424a.f15817p;
            if (c1426c2 == null) {
                c1424a.f15816o = c1426c;
                c1424a.f15817p = c1426c;
            } else {
                c1426c2.f15811q = c1426c;
                c1426c.f15812r = c1426c2;
                c1424a.f15817p = c1426c;
            }
            map2.put(interfaceC0596t, c1426c);
            obj = null;
        }
        if (((C0598v) obj) == null && (interfaceC0597u = (InterfaceC0597u) this.h.get()) != null) {
            boolean z8 = this.f9757i != 0 || this.f9758j;
            EnumC0593p enumC0593pP = p(interfaceC0596t);
            this.f9757i++;
            while (c0598v.f9752a.compareTo(enumC0593pP) < 0 && this.f9755f.f15805s.containsKey(interfaceC0596t)) {
                arrayList.add(c0598v.f9752a);
                C0590m c0590m = EnumC0592o.Companion;
                EnumC0593p enumC0593p3 = c0598v.f9752a;
                c0590m.getClass();
                AbstractC1209k.f(enumC0593p3, "state");
                int iOrdinal = enumC0593p3.ordinal();
                EnumC0592o enumC0592o = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0592o.ON_RESUME : EnumC0592o.ON_START : EnumC0592o.ON_CREATE;
                if (enumC0592o == null) {
                    throw new IllegalStateException("no event up from " + c0598v.f9752a);
                }
                c0598v.a(interfaceC0597u, enumC0592o);
                arrayList.remove(arrayList.size() - 1);
                enumC0593pP = p(interfaceC0596t);
            }
            if (!z8) {
                u();
            }
            this.f9757i--;
        }
    }

    @Override // androidx.lifecycle.K
    public final EnumC0593p i() {
        return this.f9756g;
    }

    @Override // androidx.lifecycle.K
    public final z5.u j() {
        return new z5.u(this.f9760m);
    }

    @Override // androidx.lifecycle.K
    public final void l(InterfaceC0596t interfaceC0596t) {
        AbstractC1209k.f(interfaceC0596t, "observer");
        q("removeObserver");
        this.f9755f.b(interfaceC0596t);
    }

    public final EnumC0593p p(InterfaceC0596t interfaceC0596t) {
        HashMap map = this.f9755f.f15805s;
        C1426c c1426c = map.containsKey(interfaceC0596t) ? ((C1426c) map.get(interfaceC0596t)).f15812r : null;
        EnumC0593p enumC0593p = c1426c != null ? ((C0598v) c1426c.f15810p).f9752a : null;
        ArrayList arrayList = this.l;
        EnumC0593p enumC0593p2 = arrayList.isEmpty() ? null : (EnumC0593p) arrayList.get(arrayList.size() - 1);
        EnumC0593p enumC0593p3 = this.f9756g;
        AbstractC1209k.f(enumC0593p3, "state1");
        if (enumC0593p == null || enumC0593p.compareTo(enumC0593p3) >= 0) {
            enumC0593p = enumC0593p3;
        }
        return (enumC0593p2 == null || enumC0593p2.compareTo(enumC0593p) >= 0) ? enumC0593p : enumC0593p2;
    }

    public final void q(String str) {
        if (this.f9754e) {
            C1380a.L().f15600a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(Z1.l.q("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void r(EnumC0592o enumC0592o) {
        AbstractC1209k.f(enumC0592o, "event");
        q("handleLifecycleEvent");
        s(enumC0592o.a());
    }

    public final void s(EnumC0593p enumC0593p) {
        if (this.f9756g == enumC0593p) {
            return;
        }
        InterfaceC0597u interfaceC0597u = (InterfaceC0597u) this.h.get();
        EnumC0593p enumC0593p2 = this.f9756g;
        AbstractC1209k.f(enumC0593p2, "current");
        AbstractC1209k.f(enumC0593p, "next");
        if (enumC0593p2 == EnumC0593p.f9746p && enumC0593p == EnumC0593p.f9745o) {
            throw new IllegalStateException(("State must be at least '" + EnumC0593p.f9747q + "' to be moved to '" + enumC0593p + "' in component " + interfaceC0597u).toString());
        }
        EnumC0593p enumC0593p3 = EnumC0593p.f9745o;
        if (enumC0593p2 == enumC0593p3 && enumC0593p2 != enumC0593p) {
            throw new IllegalStateException(("State is '" + enumC0593p3 + "' and cannot be moved to `" + enumC0593p + "` in component " + interfaceC0597u).toString());
        }
        this.f9756g = enumC0593p;
        if (this.f9758j || this.f9757i != 0) {
            this.f9759k = true;
            return;
        }
        this.f9758j = true;
        u();
        this.f9758j = false;
        if (this.f9756g == enumC0593p3) {
            this.f9755f = new C1424a();
        }
    }

    public final void t(EnumC0593p enumC0593p) {
        AbstractC1209k.f(enumC0593p, "state");
        q("setCurrentState");
        s(enumC0593p);
    }

    public final void u() {
        InterfaceC0597u interfaceC0597u = (InterfaceC0597u) this.h.get();
        if (interfaceC0597u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1424a c1424a = this.f9755f;
            if (c1424a.f15819r != 0) {
                C1426c c1426c = c1424a.f15816o;
                AbstractC1209k.c(c1426c);
                EnumC0593p enumC0593p = ((C0598v) c1426c.f15810p).f9752a;
                C1426c c1426c2 = this.f9755f.f15817p;
                AbstractC1209k.c(c1426c2);
                EnumC0593p enumC0593p2 = ((C0598v) c1426c2.f15810p).f9752a;
                if (enumC0593p == enumC0593p2 && this.f9756g == enumC0593p2) {
                    break;
                }
                this.f9759k = false;
                EnumC0593p enumC0593p3 = this.f9756g;
                C1426c c1426c3 = this.f9755f.f15816o;
                AbstractC1209k.c(c1426c3);
                if (enumC0593p3.compareTo(((C0598v) c1426c3.f15810p).f9752a) < 0) {
                    C1424a c1424a2 = this.f9755f;
                    C1425b c1425b = new C1425b(c1424a2.f15817p, c1424a2.f15816o, 1);
                    c1424a2.f15818q.put(c1425b, Boolean.FALSE);
                    while (c1425b.hasNext() && !this.f9759k) {
                        Map.Entry entry = (Map.Entry) c1425b.next();
                        AbstractC1209k.c(entry);
                        InterfaceC0596t interfaceC0596t = (InterfaceC0596t) entry.getKey();
                        C0598v c0598v = (C0598v) entry.getValue();
                        while (c0598v.f9752a.compareTo(this.f9756g) > 0 && !this.f9759k && this.f9755f.f15805s.containsKey(interfaceC0596t)) {
                            C0590m c0590m = EnumC0592o.Companion;
                            EnumC0593p enumC0593p4 = c0598v.f9752a;
                            c0590m.getClass();
                            AbstractC1209k.f(enumC0593p4, "state");
                            int iOrdinal = enumC0593p4.ordinal();
                            EnumC0592o enumC0592o = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0592o.ON_PAUSE : EnumC0592o.ON_STOP : EnumC0592o.ON_DESTROY;
                            if (enumC0592o == null) {
                                throw new IllegalStateException("no event down from " + c0598v.f9752a);
                            }
                            this.l.add(enumC0592o.a());
                            c0598v.a(interfaceC0597u, enumC0592o);
                            ArrayList arrayList = this.l;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C1426c c1426c4 = this.f9755f.f15817p;
                if (!this.f9759k && c1426c4 != null && this.f9756g.compareTo(((C0598v) c1426c4.f15810p).f9752a) > 0) {
                    C1424a c1424a3 = this.f9755f;
                    c1424a3.getClass();
                    C1427d c1427d = new C1427d(c1424a3);
                    c1424a3.f15818q.put(c1427d, Boolean.FALSE);
                    while (c1427d.hasNext() && !this.f9759k) {
                        Map.Entry entry2 = (Map.Entry) c1427d.next();
                        InterfaceC0596t interfaceC0596t2 = (InterfaceC0596t) entry2.getKey();
                        C0598v c0598v2 = (C0598v) entry2.getValue();
                        while (c0598v2.f9752a.compareTo(this.f9756g) < 0 && !this.f9759k && this.f9755f.f15805s.containsKey(interfaceC0596t2)) {
                            this.l.add(c0598v2.f9752a);
                            C0590m c0590m2 = EnumC0592o.Companion;
                            EnumC0593p enumC0593p5 = c0598v2.f9752a;
                            c0590m2.getClass();
                            AbstractC1209k.f(enumC0593p5, "state");
                            int iOrdinal2 = enumC0593p5.ordinal();
                            EnumC0592o enumC0592o2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0592o.ON_RESUME : EnumC0592o.ON_START : EnumC0592o.ON_CREATE;
                            if (enumC0592o2 == null) {
                                throw new IllegalStateException("no event up from " + c0598v2.f9752a);
                            }
                            c0598v2.a(interfaceC0597u, enumC0592o2);
                            ArrayList arrayList2 = this.l;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f9759k = false;
        this.f9760m.i(this.f9756g);
    }
}
