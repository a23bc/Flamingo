package r2;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import i6.g;
import k.AbstractC1113a;
import m5.C1203e;
import p2.C1293c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15760a = new b();

    @Override // androidx.lifecycle.U
    public final Q a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.U
    public final Q b(Class cls, C1293c c1293c) {
        a(cls);
        throw null;
    }

    @Override // androidx.lifecycle.U
    public final Q c(C1203e c1203e, C1293c c1293c) {
        return g.s(AbstractC1113a.G(c1203e));
    }
}
