package E4;

import java.util.Comparator;

/* JADX INFO: renamed from: E4.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0124w extends AbstractC0126y {
    public static AbstractC0126y f(int i7) {
        return i7 < 0 ? AbstractC0126y.f1998b : i7 > 0 ? AbstractC0126y.f1999c : AbstractC0126y.f1997a;
    }

    @Override // E4.AbstractC0126y
    public final AbstractC0126y a(int i7, int i8) {
        return f(i7 < i8 ? -1 : i7 > i8 ? 1 : 0);
    }

    @Override // E4.AbstractC0126y
    public final AbstractC0126y b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // E4.AbstractC0126y
    public final AbstractC0126y c(boolean z6, boolean z7) {
        return f(z6 == z7 ? 0 : z6 ? 1 : -1);
    }

    @Override // E4.AbstractC0126y
    public final AbstractC0126y d(boolean z6, boolean z7) {
        return f(z7 == z6 ? 0 : z7 ? 1 : -1);
    }

    @Override // E4.AbstractC0126y
    public final int e() {
        return 0;
    }
}
