package E4;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class P extends p0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f1886p = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1887o;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1887o != f1886p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f1887o;
        Object obj2 = f1886p;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f1887o = obj2;
        return obj;
    }
}
