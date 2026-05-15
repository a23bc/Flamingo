package R0;

/* JADX INFO: renamed from: R0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0380f extends AbstractC0372b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0380f f6452c;

    @Override // R0.AbstractC0372b
    public final int[] e(int i7) {
        int length = i().length();
        if (length <= 0 || i7 >= length) {
            return null;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        while (i7 < length && i().charAt(i7) == '\n' && (i().charAt(i7) == '\n' || (i7 != 0 && i().charAt(i7 - 1) != '\n'))) {
            i7++;
        }
        if (i7 >= length) {
            return null;
        }
        int i8 = i7 + 1;
        while (i8 < length && !m(i8)) {
            i8++;
        }
        return h(i7, i8);
    }

    @Override // R0.AbstractC0372b
    public final int[] k(int i7) {
        int length = i().length();
        if (length <= 0 || i7 <= 0) {
            return null;
        }
        if (i7 > length) {
            i7 = length;
        }
        while (i7 > 0 && i().charAt(i7 - 1) == '\n' && !m(i7)) {
            i7--;
        }
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        while (i8 > 0 && (i().charAt(i8) == '\n' || (i8 != 0 && i().charAt(i8 - 1) != '\n'))) {
            i8--;
        }
        return h(i8, i7);
    }

    public final boolean m(int i7) {
        if (i7 <= 0 || i().charAt(i7 - 1) == '\n') {
            return false;
        }
        return i7 == i().length() || i().charAt(i7) == '\n';
    }
}
