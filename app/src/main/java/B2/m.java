package B2;

import M.V;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f780b;

    public /* synthetic */ m(int i7, int i8) {
        this.f779a = i7;
        this.f780b = i8;
    }

    public int a(int i7) {
        if (i7 >= 0 && i7 <= this.f779a) {
            V.y(i7, this.f780b, i7);
        }
        return i7;
    }

    public int b(int i7) {
        if (i7 >= 0 && i7 <= this.f780b) {
            V.z(i7, this.f779a, i7);
        }
        return i7;
    }
}
