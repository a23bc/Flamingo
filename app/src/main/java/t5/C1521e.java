package t5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1210l;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: t5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1521e implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Iterator f17095p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f17097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1524h f17098s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17094o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17096q = -1;

    public C1521e(C1522f c1522f) {
        this.f17098s = c1522f;
        this.f17095p = c1522f.f17099a.iterator();
    }

    public void b() {
        Object next;
        C1522f c1522f;
        do {
            Iterator it = this.f17095p;
            if (!it.hasNext()) {
                this.f17096q = 0;
                return;
            } else {
                next = it.next();
                c1522f = (C1522f) this.f17098s;
            }
        } while (((Boolean) c1522f.f17101c.b(next)).booleanValue() != c1522f.f17100b);
        this.f17097r = next;
        this.f17096q = 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [l5.c, m5.l] */
    public void c() {
        Iterator it = this.f17095p;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((AbstractC1210l) ((C1523g) this.f17098s).f17103b).b(next)).booleanValue()) {
                this.f17096q = 1;
                this.f17097r = next;
                return;
            }
        }
        this.f17096q = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17094o) {
            case 0:
                if (this.f17096q == -1) {
                    b();
                }
                if (this.f17096q == 1) {
                }
                break;
            default:
                if (this.f17096q == -1) {
                    c();
                }
                if (this.f17096q == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17094o) {
            case 0:
                if (this.f17096q == -1) {
                    b();
                }
                if (this.f17096q == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f17097r;
                this.f17097r = null;
                this.f17096q = -1;
                return obj;
            default:
                if (this.f17096q == -1) {
                    c();
                }
                if (this.f17096q == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f17097r;
                this.f17097r = null;
                this.f17096q = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17094o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1521e(C1523g c1523g) {
        this.f17098s = c1523g;
        this.f17095p = ((InterfaceC1524h) c1523g.f17104c).iterator();
    }
}
