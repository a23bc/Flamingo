package E4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class O implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final O f1884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ O[] f1885p;

    static {
        O o7 = new O("INSTANCE", 0);
        f1884o = o7;
        f1885p = new O[]{o7};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f1885p.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
