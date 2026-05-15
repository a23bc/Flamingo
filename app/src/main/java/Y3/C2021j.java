package y3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import m5.AbstractC1209k;
import z5.J;

/* JADX INFO: renamed from: y3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2021j {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f20422a;

    /* JADX INFO: renamed from: b */
    public final J f20423b;

    /* JADX INFO: renamed from: c */
    public final J f20424c;

    /* JADX INFO: renamed from: d */
    public boolean f20425d;

    /* JADX INFO: renamed from: e */
    public final z5.u f20426e;

    /* JADX INFO: renamed from: f */
    public final z5.u f20427f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2010C f20428g;
    public final /* synthetic */ x h;

    public C2021j(x xVar, AbstractC2010C abstractC2010C) {
        AbstractC1209k.f(abstractC2010C, "navigator");
        this.h = xVar;
        this.f20422a = new ReentrantLock(true);
        J jB = z5.z.b(Z4.v.f8818o);
        this.f20423b = jB;
        J jB2 = z5.z.b(Z4.x.f8820o);
        this.f20424c = jB2;
        this.f20426e = new z5.u(jB);
        this.f20427f = new z5.u(jB2);
        this.f20428g = abstractC2010C;
    }

    public final void a(C2019h c2019h) {
        AbstractC1209k.f(c2019h, "backStackEntry");
        ReentrantLock reentrantLock = this.f20422a;
        reentrantLock.lock();
        try {
            J j3 = this.f20423b;
            ArrayList arrayListC0 = Z4.n.C0((Collection) j3.getValue(), c2019h);
            j3.getClass();
            j3.j(null, arrayListC0);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(y3.C2019h r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C2021j.b(y3.h):void");
    }

    public final void c(C2019h c2019h) {
        AbstractC1209k.f(c2019h, "popUpTo");
        x xVar = this.h;
        AbstractC2010C abstractC2010CB = xVar.f20511w.b(c2019h.f20407p.f20462o);
        if (!abstractC2010CB.equals(this.f20428g)) {
            Object obj = xVar.f20512x.get(abstractC2010CB);
            AbstractC1209k.c(obj);
            ((C2021j) obj).c(c2019h);
            return;
        }
        k kVar = xVar.f20514z;
        if (kVar != null) {
            kVar.b(c2019h);
            d(c2019h);
            return;
        }
        Z4.k kVar2 = xVar.f20497g;
        int iIndexOf = kVar2.indexOf(c2019h);
        if (iIndexOf < 0) {
            c2019h.toString();
            return;
        }
        int i7 = iIndexOf + 1;
        if (i7 != kVar2.f8814q) {
            xVar.k(((C2019h) kVar2.get(i7)).f20407p.f20467t, true, false);
        }
        x.m(xVar, c2019h);
        d(c2019h);
        xVar.r();
        xVar.b();
    }

    public final void d(C2019h c2019h) {
        AbstractC1209k.f(c2019h, "popUpTo");
        ReentrantLock reentrantLock = this.f20422a;
        reentrantLock.lock();
        try {
            J j3 = this.f20423b;
            Iterable iterable = (Iterable) j3.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (AbstractC1209k.a((C2019h) obj, c2019h)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            j3.getClass();
            j3.j(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C2019h c2019h, boolean z6) {
        Object objPrevious;
        AbstractC1209k.f(c2019h, "popUpTo");
        J j3 = this.f20424c;
        Iterable iterable = (Iterable) j3.getValue();
        boolean z7 = iterable instanceof Collection;
        z5.u uVar = this.f20426e;
        if (z7 && ((Collection) iterable).isEmpty()) {
            j3.j(null, Z4.B.Z((Set) j3.getValue(), c2019h));
            List list = (List) ((J) uVar.f21324o).getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                C2019h c2019h2 = (C2019h) objPrevious;
                if (!AbstractC1209k.a(c2019h2, c2019h)) {
                    z5.s sVar = uVar.f21324o;
                    if (((List) ((J) sVar).getValue()).lastIndexOf(c2019h2) < ((List) ((J) sVar).getValue()).lastIndexOf(c2019h)) {
                        break;
                    }
                }
            }
            C2019h c2019h3 = (C2019h) objPrevious;
            if (c2019h3 != null) {
                j3.j(null, Z4.B.Z((Set) j3.getValue(), c2019h3));
            }
            c(c2019h);
        } else {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2019h) it.next()) == c2019h) {
                    Iterable iterable2 = (Iterable) ((J) uVar.f21324o).getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C2019h) it2.next()) == c2019h) {
                            }
                        }
                    }
                }
            }
        }
        this.h.f20486A.put(c2019h, Boolean.valueOf(z6));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l5.c, m5.l] */
    public final void f(C2019h c2019h) {
        AbstractC1209k.f(c2019h, "backStackEntry");
        x xVar = this.h;
        AbstractC2010C abstractC2010CB = xVar.f20511w.b(c2019h.f20407p.f20462o);
        if (!abstractC2010CB.equals(this.f20428g)) {
            Object obj = xVar.f20512x.get(abstractC2010CB);
            if (obj == null) {
                throw new IllegalStateException(Z1.l.t(new StringBuilder("NavigatorBackStack for "), c2019h.f20407p.f20462o, " should already be created").toString());
            }
            ((C2021j) obj).f(c2019h);
            return;
        }
        ?? r02 = xVar.f20513y;
        if (r02 == 0) {
            Objects.toString(c2019h.f20407p);
        } else {
            r02.b(c2019h);
            a(c2019h);
        }
    }
}
