package n0;

import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.AbstractC1223y;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a */
    public static final Object f14483a = new Object();

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement[] f14484b = new StackTraceElement[0];

    /* JADX INFO: renamed from: c */
    public static final k f14485c = new k(0, new long[0], new Object[0]);

    public static final int a(int i7, int i8) {
        return i7 << (((i8 % 10) * 3) + 1);
    }

    public static final d b(C0912t c0912t, int i7, AbstractC1210l abstractC1210l) {
        d dVar;
        c0912t.U(Integer.rotateLeft(i7, 1), f14483a);
        Object objK = c0912t.K();
        if (objK == C0903o.f11850a) {
            dVar = new d(i7, abstractC1210l, true);
            c0912t.i0(dVar);
        } else {
            AbstractC1209k.d(objK, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            dVar = (d) objK;
            dVar.m(abstractC1210l);
        }
        c0912t.p(false);
        return dVar;
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final void d(C0912t c0912t, l5.e eVar) {
        AbstractC1209k.d(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        AbstractC1223y.c(2, eVar);
        eVar.invoke(c0912t, 1);
    }

    public static final d e(int i7, Y4.c cVar, C0912t c0912t) {
        Object objK = c0912t.K();
        if (objK == C0903o.f11850a) {
            objK = new d(i7, cVar, true);
            c0912t.i0(objK);
        }
        d dVar = (d) objK;
        dVar.m(cVar);
        return dVar;
    }

    public static final boolean f(C0915u0 c0915u0, C0915u0 c0915u02) {
        if (c0915u0 == null) {
            return true;
        }
        if (c0915u0 instanceof C0915u0) {
            return !c0915u0.b() || c0915u0.equals(c0915u02) || AbstractC1209k.a(c0915u0.f11931c, c0915u02.f11931c);
        }
        return false;
    }
}
