package y3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import t.AbstractC1464t;
import t.U;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20469o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f20471q;

    public t(u uVar) {
        this.f20471q = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20469o + 1 < this.f20471q.f20473w.h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20470p = true;
        U u7 = this.f20471q.f20473w;
        int i7 = this.f20469o + 1;
        this.f20469o = i7;
        Object objI = u7.i(i7);
        AbstractC1209k.e(objI, "nodes.valueAt(++index)");
        return (s) objI;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20470p) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        u uVar = this.f20471q;
        int i7 = this.f20469o;
        U u7 = uVar.f20473w;
        ((s) u7.i(i7)).f20463p = null;
        int i8 = this.f20469o;
        Object[] objArr = u7.f16039q;
        Object obj = objArr[i8];
        Object obj2 = AbstractC1464t.f16109c;
        if (obj != obj2) {
            objArr[i8] = obj2;
            u7.f16037o = true;
        }
        this.f20469o = i8 - 1;
        this.f20470p = false;
    }
}
