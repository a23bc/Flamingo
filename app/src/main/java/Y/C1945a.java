package y;

import D.AbstractC0074o;
import Y4.o;
import f0.C0912t;
import r0.C1395m;
import y0.AbstractC1959I;

/* JADX INFO: renamed from: y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1945a implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1945a f20147o = new C1945a();

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C1947c c1947c = (C1947c) obj;
        C0912t c0912t = (C0912t) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0912t.f(c1947c) ? 4 : 2;
        }
        if (c0912t.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            AbstractC0074o.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.a.i(C1395m.f15634a, 0.0f, AbstractC1949e.l, 1), 1.0f), AbstractC1949e.f20164k), c1947c.f20151c, AbstractC1959I.f20180a), c0912t, 0);
        } else {
            c0912t.Q();
        }
        return o.f8736a;
    }
}
