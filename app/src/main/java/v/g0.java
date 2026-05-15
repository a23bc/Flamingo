package v;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        b0 b0Var2 = (b0) obj2;
        return N5.l.r(Float.valueOf((b0Var.f18034o.h() == 0.0f && b0Var.f18044y == null) ? -1.0f : b0Var.f18034o.h()), Float.valueOf((b0Var2.f18034o.h() == 0.0f && b0Var2.f18044y == null) ? -1.0f : b0Var2.f18034o.h()));
    }
}
