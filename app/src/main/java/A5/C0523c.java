package a5;

import G1.AbstractC0157y;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: a5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0523c extends AbstractC0157y implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8859s;

    public C0523c(C0525e c0525e, int i7) {
        this.f8859s = i7;
        AbstractC1209k.f(c0525e, "map");
        this.f2745r = c0525e;
        this.f2743p = -1;
        this.f2744q = c0525e.f8871v;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8859s) {
            case 0:
                c();
                int i7 = this.f2742o;
                C0525e c0525e = (C0525e) this.f2745r;
                if (i7 >= c0525e.f8869t) {
                    throw new NoSuchElementException();
                }
                this.f2742o = i7 + 1;
                this.f2743p = i7;
                C0524d c0524d = new C0524d(c0525e, i7);
                f();
                return c0524d;
            case 1:
                c();
                int i8 = this.f2742o;
                C0525e c0525e2 = (C0525e) this.f2745r;
                if (i8 >= c0525e2.f8869t) {
                    throw new NoSuchElementException();
                }
                this.f2742o = i8 + 1;
                this.f2743p = i8;
                Object obj = c0525e2.f8864o[i8];
                f();
                return obj;
            default:
                c();
                int i9 = this.f2742o;
                C0525e c0525e3 = (C0525e) this.f2745r;
                if (i9 >= c0525e3.f8869t) {
                    throw new NoSuchElementException();
                }
                this.f2742o = i9 + 1;
                this.f2743p = i9;
                Object[] objArr = c0525e3.f8865p;
                AbstractC1209k.c(objArr);
                Object obj2 = objArr[this.f2743p];
                f();
                return obj2;
        }
    }
}
