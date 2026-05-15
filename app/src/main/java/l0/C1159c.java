package l0;

import j5.AbstractC1107a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import n5.InterfaceC1237a;
import t.H;
import t.I;
import t.L;
import t.M;
import t5.C1523g;
import t5.i;

/* JADX INFO: renamed from: l0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1159c implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f14155r;

    public C1159c(Object obj, Map map) {
        this.f14152o = 0;
        this.f14154q = obj;
        this.f14155r = map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l5.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l5.a, m5.l] */
    public void b() {
        Object objB;
        int i7 = this.f14153p;
        C1523g c1523g = (C1523g) this.f14155r;
        if (i7 == -2) {
            objB = ((AbstractC1210l) c1523g.f17103b).a();
        } else {
            ?? r02 = c1523g.f17104c;
            Object obj = this.f14154q;
            AbstractC1209k.c(obj);
            objB = r02.b(obj);
        }
        this.f14154q = objB;
        this.f14153p = objB == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14152o) {
            case 0:
                if (this.f14153p < ((Map) this.f14155r).size()) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                if (this.f14153p < 0) {
                    b();
                }
                if (this.f14153p == 1) {
                }
                break;
        }
        return ((i) this.f14154q).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14152o) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f14154q;
                this.f14153p++;
                Object obj2 = ((Map) this.f14155r).get(obj);
                if (obj2 != null) {
                    this.f14154q = ((C1157a) obj2).f14147b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                return ((i) this.f14154q).next();
            case 2:
                return ((i) this.f14154q).next();
            default:
                if (this.f14153p < 0) {
                    b();
                }
                if (this.f14153p == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f14154q;
                AbstractC1209k.d(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f14153p = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14152o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i7 = this.f14153p;
                if (i7 != -1) {
                    ((I) this.f14155r).f16002p.h(i7);
                    this.f14153p = -1;
                    return;
                }
                return;
            case 2:
                int i8 = this.f14153p;
                if (i8 != -1) {
                    ((M) this.f14155r).f16027p.m(i8);
                    this.f14153p = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1159c(C1523g c1523g) {
        this.f14152o = 3;
        this.f14155r = c1523g;
        this.f14153p = -2;
    }

    public C1159c(M m7) {
        this.f14152o = 2;
        this.f14155r = m7;
        this.f14153p = -1;
        this.f14154q = AbstractC1107a.t(new L(m7, this, null));
    }

    public C1159c(I i7) {
        this.f14152o = 1;
        this.f14155r = i7;
        this.f14153p = -1;
        this.f14154q = AbstractC1107a.t(new H(i7, this, null));
    }
}
