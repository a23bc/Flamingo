package E4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends Z implements Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Y f1898p = new Y(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Y f1899q = new Y(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1900o;

    public /* synthetic */ Y(int i7) {
        this.f1900o = i7;
    }

    @Override // E4.Z
    public final Z a() {
        switch (this.f1900o) {
            case 0:
                return f1899q;
            default:
                return f1898p;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1900o) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f1900o) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
