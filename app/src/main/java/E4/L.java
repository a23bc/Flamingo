package E4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class L extends C {
    @Override // E4.C
    public final C b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final M f() {
        int i7 = this.f1859b;
        if (i7 == 0) {
            int i8 = M.f1877q;
            return h0.f1943x;
        }
        if (i7 != 1) {
            M mO = M.o(i7, this.f1858a);
            this.f1859b = mO.size();
            this.f1860c = true;
            return mO;
        }
        Object obj = this.f1858a[0];
        Objects.requireNonNull(obj);
        int i9 = M.f1877q;
        return new n0(obj);
    }
}
