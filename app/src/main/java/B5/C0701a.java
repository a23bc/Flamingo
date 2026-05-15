package b5;

import java.util.Comparator;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0701a implements Comparator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0701a f10401p = new C0701a(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0701a f10402q = new C0701a(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10403o;

    public /* synthetic */ C0701a(int i7) {
        this.f10403o = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10403o) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC1209k.f(comparable, "a");
                AbstractC1209k.f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC1209k.f(comparable3, "a");
                AbstractC1209k.f(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f10403o) {
            case 0:
                return f10402q;
            default:
                return f10401p;
        }
    }
}
