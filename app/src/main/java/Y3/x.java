package y3;

import V4.C0459f;
import a.AbstractC0509a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.X;
import d.C0743I;
import d.C0746L;
import j5.AbstractC1107a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.AbstractC1223y;
import m5.C1216r;
import m5.C1218t;
import q.S0;
import t5.C1521e;
import t5.C1523g;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinkedHashMap f20486A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f20487B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f20488C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final z5.y f20489D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final z5.t f20490E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f20492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f20493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f20494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable[] f20495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z4.k f20497g;
    public final J h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J f20498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z5.u f20499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f20500k;
    public final LinkedHashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f20501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f20502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0597u f20503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0743I f20504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m f20505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f20506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EnumC0593p f20507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final G3.a f20508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Y1.l f20509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C2011D f20511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f20512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractC1210l f20513y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f20514z;

    public x(Context context) {
        Object next;
        AbstractC1209k.f(context, "context");
        this.f20491a = context;
        Iterator it = t5.j.H(context, C2013b.f20394r).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f20492b = (Activity) next;
        this.f20497g = new Z4.k();
        Z4.v vVar = Z4.v.f8818o;
        this.h = z5.z.b(vVar);
        J jB = z5.z.b(vVar);
        this.f20498i = jB;
        this.f20499j = new z5.u(jB);
        this.f20500k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.f20501m = new LinkedHashMap();
        this.f20502n = new LinkedHashMap();
        this.f20506r = new CopyOnWriteArrayList();
        this.f20507s = EnumC0593p.f9746p;
        int i7 = 2;
        this.f20508t = new G3.a(i7, this);
        this.f20509u = new Y1.l(i7, this);
        this.f20510v = true;
        C2011D c2011d = new C2011D();
        this.f20511w = c2011d;
        this.f20512x = new LinkedHashMap();
        this.f20486A = new LinkedHashMap();
        c2011d.a(new w(c2011d));
        c2011d.a(new C2014c(this.f20491a));
        this.f20488C = new ArrayList();
        AbstractC0509a.O(new r1.x(8, this));
        z5.y yVarA = z5.z.a(2, y5.a.f20529p);
        this.f20489D = yVarA;
        this.f20490E = new z5.t(yVarA);
    }

    public static void i(x xVar, String str) {
        xVar.getClass();
        AbstractC1209k.f(str, "route");
        int i7 = s.f20461v;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        AbstractC1209k.b(uri);
        S0 s02 = new S0(uri, null, null);
        u uVar = xVar.f20493c;
        if (uVar == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + s02 + ". Navigation graph has not been set for NavController " + xVar + '.').toString());
        }
        r rVarG = uVar.g(s02);
        if (rVarG == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + s02 + " cannot be found in the navigation graph " + xVar.f20493c);
        }
        Bundle bundle = rVarG.f20457p;
        s sVar = rVarG.f20456o;
        Bundle bundleC = sVar.c(bundle);
        if (bundleC == null) {
            bundleC = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        xVar.h(sVar, bundleC, null);
    }

    public static /* synthetic */ void m(x xVar, C2019h c2019h) {
        xVar.l(c2019h, false, new Z4.k());
    }

    public final void a(s sVar, Bundle bundle, C2019h c2019h, List list) {
        Object objPrevious;
        Object objPrevious2;
        s sVar2 = c2019h.f20407p;
        boolean z6 = sVar2 instanceof InterfaceC2015d;
        boolean z7 = true;
        Z4.k kVar = this.f20497g;
        if (!z6) {
            while (!kVar.isEmpty() && (((C2019h) kVar.last()).f20407p instanceof InterfaceC2015d) && k(((C2019h) kVar.last()).f20407p.f20467t, true, false)) {
            }
        }
        Z4.k<C2019h> kVar2 = new Z4.k();
        boolean z8 = sVar instanceof u;
        Context context = this.f20491a;
        Object obj = null;
        if (z8) {
            s sVar3 = sVar2;
            do {
                AbstractC1209k.c(sVar3);
                sVar3 = sVar3.f20463p;
                if (sVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (AbstractC1209k.a(((C2019h) objPrevious2).f20407p, sVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    C2019h c2019hJ = (C2019h) objPrevious2;
                    if (c2019hJ == null) {
                        c2019hJ = C0746L.j(context, sVar3, bundle, f(), this.f20505q);
                    }
                    kVar2.addFirst(c2019hJ);
                    if (!kVar.isEmpty() && ((C2019h) kVar.last()).f20407p == sVar3) {
                        m(this, (C2019h) kVar.last());
                    }
                }
                if (sVar3 == null) {
                    break;
                }
            } while (sVar3 != sVar);
        }
        s sVar4 = kVar2.isEmpty() ? sVar2 : ((C2019h) kVar2.first()).f20407p;
        while (sVar4 != null && d(sVar4.f20467t) != sVar4) {
            sVar4 = sVar4.f20463p;
            if (sVar4 != null) {
                Bundle bundle2 = (bundle == null || bundle.isEmpty() != z7) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (AbstractC1209k.a(((C2019h) objPrevious).f20407p, sVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                C2019h c2019hJ2 = (C2019h) objPrevious;
                if (c2019hJ2 == null) {
                    c2019hJ2 = C0746L.j(context, sVar4, sVar4.c(bundle2), f(), this.f20505q);
                }
                kVar2.addFirst(c2019hJ2);
            }
            z7 = true;
        }
        if (!kVar2.isEmpty()) {
            sVar2 = ((C2019h) kVar2.first()).f20407p;
        }
        while (!kVar.isEmpty() && (((C2019h) kVar.last()).f20407p instanceof u)) {
            s sVar5 = ((C2019h) kVar.last()).f20407p;
            AbstractC1209k.d(sVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((u) sVar5).n(sVar2.f20467t, false) != null) {
                break;
            } else {
                m(this, (C2019h) kVar.last());
            }
        }
        C2019h c2019h2 = (C2019h) kVar.i();
        if (c2019h2 == null) {
            c2019h2 = (C2019h) kVar2.i();
        }
        if (!AbstractC1209k.a(c2019h2 != null ? c2019h2.f20407p : null, this.f20493c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                s sVar6 = ((C2019h) objPrevious3).f20407p;
                u uVar = this.f20493c;
                AbstractC1209k.c(uVar);
                if (AbstractC1209k.a(sVar6, uVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C2019h c2019hJ3 = (C2019h) obj;
            if (c2019hJ3 == null) {
                u uVar2 = this.f20493c;
                AbstractC1209k.c(uVar2);
                u uVar3 = this.f20493c;
                AbstractC1209k.c(uVar3);
                c2019hJ3 = C0746L.j(context, uVar2, uVar3.c(bundle), f(), this.f20505q);
            }
            kVar2.addFirst(c2019hJ3);
        }
        for (C2019h c2019h3 : kVar2) {
            Object obj2 = this.f20512x.get(this.f20511w.b(c2019h3.f20407p.f20462o));
            if (obj2 == null) {
                throw new IllegalStateException(Z1.l.t(new StringBuilder("NavigatorBackStack for "), sVar.f20462o, " should already be created").toString());
            }
            ((C2021j) obj2).a(c2019h3);
        }
        kVar.addAll(kVar2);
        kVar.addLast(c2019h);
        for (C2019h c2019h4 : Z4.n.C0(kVar2, c2019h)) {
            u uVar4 = c2019h4.f20407p.f20463p;
            if (uVar4 != null) {
                g(c2019h4, e(uVar4.f20467t));
            }
        }
    }

    public final boolean b() {
        Z4.k kVar;
        while (true) {
            kVar = this.f20497g;
            if (kVar.isEmpty() || !(((C2019h) kVar.last()).f20407p instanceof u)) {
                break;
            }
            m(this, (C2019h) kVar.last());
        }
        C2019h c2019h = (C2019h) kVar.o();
        ArrayList arrayList = this.f20488C;
        if (c2019h != null) {
            arrayList.add(c2019h);
        }
        this.f20487B++;
        q();
        int i7 = this.f20487B - 1;
        this.f20487B = i7;
        if (i7 == 0) {
            ArrayList<C2019h> arrayListL0 = Z4.n.L0(arrayList);
            arrayList.clear();
            for (C2019h c2019h2 : arrayListL0) {
                Iterator it = this.f20506r.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    s sVar = c2019h2.f20407p;
                    c2019h2.c();
                    throw null;
                }
                this.f20489D.q(c2019h2);
            }
            ArrayList arrayListL02 = Z4.n.L0(kVar);
            J j3 = this.h;
            j3.getClass();
            j3.j(null, arrayListL02);
            ArrayList arrayListN = n();
            J j7 = this.f20498i;
            j7.getClass();
            j7.j(null, arrayListN);
        }
        return c2019h != null;
    }

    public final boolean c(ArrayList arrayList, s sVar, boolean z6, boolean z7) {
        x xVar;
        boolean z8;
        String str;
        C1216r c1216r = new C1216r();
        Z4.k kVar = new Z4.k();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                xVar = this;
                z8 = z7;
                break;
            }
            AbstractC2010C abstractC2010C = (AbstractC2010C) it.next();
            C1216r c1216r2 = new C1216r();
            C2019h c2019h = (C2019h) this.f20497g.last();
            xVar = this;
            z8 = z7;
            xVar.f20514z = new k(c1216r2, c1216r, xVar, z8, kVar);
            abstractC2010C.e(c2019h, z8);
            xVar.f20514z = null;
            if (!c1216r2.f14435o) {
                break;
            }
            z7 = z8;
        }
        if (z8) {
            LinkedHashMap linkedHashMap = xVar.f20501m;
            if (!z6) {
                C1521e c1521e = new C1521e(new C1523g(t5.j.H(sVar, C2013b.f20395s), new l(this, 0), 1));
                while (c1521e.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((s) c1521e.next()).f20467t);
                    C2020i c2020i = (C2020i) kVar.i();
                    linkedHashMap.put(numValueOf, c2020i != null ? c2020i.f20418o : null);
                }
            }
            if (!kVar.isEmpty()) {
                C2020i c2020i2 = (C2020i) kVar.first();
                C1521e c1521e2 = new C1521e(new C1523g(t5.j.H(d(c2020i2.f20419p), C2013b.f20396t), new l(this, 1), 1));
                while (true) {
                    boolean zHasNext = c1521e2.hasNext();
                    str = c2020i2.f20418o;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((s) c1521e2.next()).f20467t), str);
                }
                xVar.f20502n.put(str, kVar);
            }
        }
        r();
        return c1216r.f14435o;
    }

    public final s d(int i7) {
        s sVar;
        u uVar;
        u uVar2 = this.f20493c;
        if (uVar2 == null) {
            return null;
        }
        if (uVar2.f20467t == i7) {
            return uVar2;
        }
        C2019h c2019h = (C2019h) this.f20497g.o();
        if (c2019h == null || (sVar = c2019h.f20407p) == null) {
            sVar = this.f20493c;
            AbstractC1209k.c(sVar);
        }
        if (sVar.f20467t == i7) {
            return sVar;
        }
        if (sVar instanceof u) {
            uVar = (u) sVar;
        } else {
            uVar = sVar.f20463p;
            AbstractC1209k.c(uVar);
        }
        return uVar.n(i7, true);
    }

    public final C2019h e(int i7) {
        Object objPrevious;
        Z4.k kVar = this.f20497g;
        ListIterator listIterator = kVar.listIterator(kVar.b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C2019h) objPrevious).f20407p.f20467t == i7) {
                break;
            }
        }
        C2019h c2019h = (C2019h) objPrevious;
        if (c2019h != null) {
            return c2019h;
        }
        StringBuilder sbV = n1.c.v(i7, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        C2019h c2019h2 = (C2019h) kVar.o();
        sbV.append(c2019h2 != null ? c2019h2.f20407p : null);
        throw new IllegalArgumentException(sbV.toString().toString());
    }

    public final EnumC0593p f() {
        return this.f20503o == null ? EnumC0593p.f9747q : this.f20507s;
    }

    public final void g(C2019h c2019h, C2019h c2019h2) {
        this.f20500k.put(c2019h, c2019h2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(c2019h2) == null) {
            linkedHashMap.put(c2019h2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c2019h2);
        AbstractC1209k.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(y3.s r26, android.os.Bundle r27, y3.z r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.x.h(y3.s, android.os.Bundle, y3.z):void");
    }

    public final void j() {
        Z4.k kVar = this.f20497g;
        if (kVar.isEmpty()) {
            return;
        }
        C2019h c2019h = (C2019h) kVar.o();
        s sVar = c2019h != null ? c2019h.f20407p : null;
        AbstractC1209k.c(sVar);
        if (k(sVar.f20467t, true, false)) {
            b();
        }
    }

    public final boolean k(int i7, boolean z6, boolean z7) {
        s sVar;
        Z4.k kVar = this.f20497g;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Z4.n.E0(kVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                sVar = null;
                break;
            }
            sVar = ((C2019h) it.next()).f20407p;
            AbstractC2010C abstractC2010CB = this.f20511w.b(sVar.f20462o);
            if (z6 || sVar.f20467t != i7) {
                arrayList.add(abstractC2010CB);
            }
            if (sVar.f20467t == i7) {
                break;
            }
        }
        if (sVar != null) {
            return c(arrayList, sVar, z6, z7);
        }
        int i8 = s.f20461v;
        AbstractC1107a.q(this.f20491a, i7);
        return false;
    }

    public final void l(C2019h c2019h, boolean z6, Z4.k kVar) {
        m mVar;
        z5.u uVar;
        Set set;
        Z4.k kVar2 = this.f20497g;
        C2019h c2019h2 = (C2019h) kVar2.last();
        if (!AbstractC1209k.a(c2019h2, c2019h)) {
            throw new IllegalStateException(("Attempted to pop " + c2019h.f20407p + ", which is not the top of the back stack (" + c2019h2.f20407p + ')').toString());
        }
        kVar2.removeLast();
        C2021j c2021j = (C2021j) this.f20512x.get(this.f20511w.b(c2019h2.f20407p.f20462o));
        boolean z7 = true;
        if ((c2021j == null || (uVar = c2021j.f20427f) == null || (set = (Set) ((J) uVar.f21324o).getValue()) == null || !set.contains(c2019h2)) && !this.l.containsKey(c2019h2)) {
            z7 = false;
        }
        EnumC0593p enumC0593p = c2019h2.f20413v.f9756g;
        EnumC0593p enumC0593p2 = EnumC0593p.f9747q;
        if (enumC0593p.compareTo(enumC0593p2) >= 0) {
            if (z6) {
                c2019h2.f(enumC0593p2);
                kVar.addFirst(new C2020i(c2019h2));
            }
            if (z7) {
                c2019h2.f(enumC0593p2);
            } else {
                c2019h2.f(EnumC0593p.f9745o);
                p(c2019h2);
            }
        }
        if (z6 || z7 || (mVar = this.f20505q) == null) {
            return;
        }
        String str = c2019h2.f20411t;
        AbstractC1209k.f(str, "backStackEntryId");
        X x6 = (X) mVar.f20437b.remove(str);
        if (x6 != null) {
            x6.a();
        }
    }

    public final ArrayList n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20512x.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((J) ((C2021j) it.next()).f20427f.f21324o).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C2019h c2019h = (C2019h) obj;
                if (!arrayList.contains(c2019h) && c2019h.f20416y.compareTo(EnumC0593p.f9748r) < 0) {
                    arrayList2.add(obj);
                }
            }
            Z4.t.l0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f20497g) {
            C2019h c2019h2 = (C2019h) obj2;
            if (!arrayList.contains(c2019h2) && c2019h2.f20416y.compareTo(EnumC0593p.f9748r) >= 0) {
                arrayList3.add(obj2);
            }
        }
        Z4.t.l0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((C2019h) obj3).f20407p instanceof u)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean o(int i7, Bundle bundle, z zVar) {
        s sVar;
        C2019h c2019h;
        s sVar2;
        u uVar;
        s sVarN;
        LinkedHashMap linkedHashMap = this.f20501m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i7));
        Collection collectionValues = linkedHashMap.values();
        AbstractC1209k.f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (AbstractC1209k.a((String) it.next(), str)) {
                it.remove();
            }
        }
        Z4.k<C2020i> kVar = (Z4.k) AbstractC1223y.b(this.f20502n).remove(str);
        ArrayList arrayList = new ArrayList();
        C2019h c2019h2 = (C2019h) this.f20497g.o();
        if ((c2019h2 == null || (sVar = c2019h2.f20407p) == null) && (sVar = this.f20493c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (kVar != null) {
            for (C2020i c2020i : kVar) {
                int i8 = c2020i.f20419p;
                if (sVar.f20467t == i8) {
                    sVarN = sVar;
                } else {
                    if (sVar instanceof u) {
                        uVar = (u) sVar;
                    } else {
                        uVar = sVar.f20463p;
                        AbstractC1209k.c(uVar);
                    }
                    sVarN = uVar.n(i8, true);
                }
                Context context = this.f20491a;
                if (sVarN == null) {
                    int i9 = s.f20461v;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC1107a.q(context, c2020i.f20419p) + " cannot be found from the current destination " + sVar).toString());
                }
                arrayList.add(c2020i.a(context, sVarN, f(), this.f20505q));
                sVar = sVarN;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((C2019h) obj).f20407p instanceof u)) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            C2019h c2019h3 = (C2019h) it2.next();
            List list = (List) Z4.n.y0(arrayList2);
            if (list != null && (c2019h = (C2019h) Z4.n.x0(list)) != null && (sVar2 = c2019h.f20407p) != null) {
                str2 = sVar2.f20462o;
            }
            if (AbstractC1209k.a(str2, c2019h3.f20407p.f20462o)) {
                list.add(c2019h3);
            } else {
                arrayList2.add(Z4.o.f0(c2019h3));
            }
        }
        C1216r c1216r = new C1216r();
        for (List list2 : arrayList2) {
            AbstractC2010C abstractC2010CB = this.f20511w.b(((C2019h) Z4.n.q0(list2)).f20407p.f20462o);
            Bundle bundle2 = bundle;
            this.f20513y = new C0459f(c1216r, arrayList, new C1218t(), this, bundle2, 3);
            abstractC2010CB.d(list2, zVar);
            this.f20513y = null;
            bundle = bundle2;
        }
        return c1216r.f14435o;
    }

    public final void p(C2019h c2019h) {
        AbstractC1209k.f(c2019h, "child");
        C2019h c2019h2 = (C2019h) this.f20500k.remove(c2019h);
        if (c2019h2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c2019h2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C2021j c2021j = (C2021j) this.f20512x.get(this.f20511w.b(c2019h2.f20407p.f20462o));
            if (c2021j != null) {
                c2021j.b(c2019h2);
            }
            linkedHashMap.remove(c2019h2);
        }
    }

    public final void q() {
        s sVar;
        AtomicInteger atomicInteger;
        z5.u uVar;
        Set set;
        ArrayList<C2019h> arrayListL0 = Z4.n.L0(this.f20497g);
        if (arrayListL0.isEmpty()) {
            return;
        }
        s sVar2 = ((C2019h) Z4.n.x0(arrayListL0)).f20407p;
        if (sVar2 instanceof InterfaceC2015d) {
            Iterator it = Z4.n.E0(arrayListL0).iterator();
            while (it.hasNext()) {
                sVar = ((C2019h) it.next()).f20407p;
                if (!(sVar instanceof u) && !(sVar instanceof InterfaceC2015d)) {
                    break;
                }
            }
            sVar = null;
        } else {
            sVar = null;
        }
        HashMap map = new HashMap();
        for (C2019h c2019h : Z4.n.E0(arrayListL0)) {
            EnumC0593p enumC0593p = c2019h.f20416y;
            s sVar3 = c2019h.f20407p;
            if (sVar2 != null && sVar3.f20467t == sVar2.f20467t) {
                EnumC0593p enumC0593p2 = EnumC0593p.f9749s;
                if (enumC0593p != enumC0593p2) {
                    C2021j c2021j = (C2021j) this.f20512x.get(this.f20511w.b(sVar3.f20462o));
                    if (AbstractC1209k.a((c2021j == null || (uVar = c2021j.f20427f) == null || (set = (Set) ((J) uVar.f21324o).getValue()) == null) ? null : Boolean.valueOf(set.contains(c2019h)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.l.get(c2019h)) != null && atomicInteger.get() == 0)) {
                        map.put(c2019h, EnumC0593p.f9748r);
                    } else {
                        map.put(c2019h, enumC0593p2);
                    }
                }
                sVar2 = sVar2.f20463p;
            } else if (sVar == null || sVar3.f20467t != sVar.f20467t) {
                c2019h.f(EnumC0593p.f9747q);
            } else {
                if (enumC0593p == EnumC0593p.f9749s) {
                    c2019h.f(EnumC0593p.f9748r);
                } else {
                    EnumC0593p enumC0593p3 = EnumC0593p.f9748r;
                    if (enumC0593p != enumC0593p3) {
                        map.put(c2019h, enumC0593p3);
                    }
                }
                sVar = sVar.f20463p;
            }
        }
        for (C2019h c2019h2 : arrayListL0) {
            EnumC0593p enumC0593p4 = (EnumC0593p) map.get(c2019h2);
            if (enumC0593p4 != null) {
                c2019h2.f(enumC0593p4);
            } else {
                c2019h2.i();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l5.a, m5.i] */
    public final void r() {
        int i7;
        boolean z6 = false;
        if (this.f20510v) {
            Z4.k kVar = this.f20497g;
            if ((kVar instanceof Collection) && kVar.isEmpty()) {
                i7 = 0;
            } else {
                Iterator it = kVar.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    if (!(((C2019h) it.next()).f20407p instanceof u) && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i7 > 1) {
                z6 = true;
            }
        }
        Y1.l lVar = this.f20509u;
        lVar.f10811a = z6;
        ?? r02 = lVar.f10813c;
        if (r02 != 0) {
            r02.a();
        }
    }
}
