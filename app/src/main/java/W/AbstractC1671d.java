package w;

import d5.EnumC0830a;
import e5.AbstractC0865c;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import r0.C1385c;
import r0.InterfaceC1399q;
import v.C1628y;

/* JADX INFO: renamed from: w.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1671d {

    /* JADX INFO: renamed from: a */
    public static final C1681n f18642a = new C1681n(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C1682o f18643b = new C1682o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C1683p f18644c = new C1683p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C1684q f18645d = new C1684q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C1681n f18646e = new C1681n(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C1682o f18647f = new C1682o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C1683p f18648g = new C1683p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C1684q h = new C1684q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C1670c a(float f7) {
        return new C1670c(Float.valueOf(f7), p0.f18727a, Float.valueOf(0.01f), 8);
    }

    public static C1680m b(float f7, float f8, int i7) {
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        return new C1680m(p0.f18727a, Float.valueOf(f7), new C1681n(f8), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f7, float f8, float f9, InterfaceC1679l interfaceC1679l, l5.e eVar, AbstractC0871i abstractC0871i) {
        o0 o0Var = p0.f18727a;
        Float f10 = new Float(f7);
        Float f11 = new Float(f8);
        C1681n c1681n = new C1681n(new Float(f9).floatValue());
        Object objD = d(new C1680m(o0Var, f10, c1681n, 56), new a0(interfaceC1679l, o0Var, f10, f11, c1681n), Long.MIN_VALUE, new C1628y(eVar), abstractC0871i);
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        Y4.o oVar = Y4.o.f8736a;
        if (objD != enumC0830a) {
            objD = oVar;
        }
        return objD == enumC0830a ? objD : oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(w.C1680m r23, w.InterfaceC1675h r24, long r25, l5.InterfaceC1182c r27, e5.AbstractC0865c r28) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC1671d.d(w.m, w.h, long, l5.c, e5.c):java.lang.Object");
    }

    public static final Object e(C1680m c1680m, C1689w c1689w, boolean z6, InterfaceC1182c interfaceC1182c, AbstractC0865c abstractC0865c) {
        Object objD = d(c1680m, new C1688v(c1689w, c1680m.f18709o, c1680m.f18710p.getValue(), c1680m.f18711q), z6 ? c1680m.f18712r : Long.MIN_VALUE, interfaceC1182c, abstractC0865c);
        return objD == EnumC0830a.f11264o ? objD : Y4.o.f8736a;
    }

    public static final Object f(C1680m c1680m, Float f7, InterfaceC1652A interfaceC1652A, boolean z6, InterfaceC1182c interfaceC1182c, AbstractC0865c abstractC0865c) {
        Object objD = d(c1680m, new a0(interfaceC1652A, c1680m.f18709o, c1680m.f18710p.getValue(), f7, c1680m.f18711q), z6 ? c1680m.f18712r : Long.MIN_VALUE, interfaceC1182c, abstractC0865c);
        return objD == EnumC0830a.f11264o ? objD : Y4.o.f8736a;
    }

    public static final r g(r rVar) {
        r rVarC = rVar.c();
        int iB = rVarC.b();
        for (int i7 = 0; i7 < iB; i7++) {
            rVarC.e(i7, rVar.a(i7));
        }
        return rVarC;
    }

    public static C1680m h(C1680m c1680m, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = ((Number) c1680m.f18710p.getValue()).floatValue();
        }
        if ((i7 & 2) != 0) {
            f8 = ((C1681n) c1680m.f18711q).f18716a;
        }
        return new C1680m(c1680m.f18709o, Float.valueOf(f7), new C1681n(f8), c1680m.f18712r, c1680m.f18713s, c1680m.f18714t);
    }

    public static final void i(C1678k c1678k, long j3, float f7, InterfaceC1675h interfaceC1675h, C1680m c1680m, InterfaceC1182c interfaceC1182c) {
        long jC = f7 == 0.0f ? interfaceC1675h.c() : (long) ((j3 - c1678k.f18700c) / f7);
        c1678k.f18704g = j3;
        c1678k.f18702e.setValue(interfaceC1675h.b(jC));
        c1678k.f18703f = interfaceC1675h.f(jC);
        if (interfaceC1675h.g(jC)) {
            c1678k.h = c1678k.f18704g;
            c1678k.f18705i.setValue(Boolean.FALSE);
        }
        m(c1678k, c1680m);
        interfaceC1182c.b(c1678k);
    }

    public static final float j(c5.i iVar) {
        InterfaceC1399q interfaceC1399q = (InterfaceC1399q) iVar.n(C1385c.f15611D);
        float fR = interfaceC1399q != null ? interfaceC1399q.r() : 1.0f;
        if (fR >= 0.0f) {
            return fR;
        }
        AbstractC1666O.b("negative scale factor");
        return fR;
    }

    public static S k(float f7, float f8, Object obj, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 1.0f;
        }
        if ((i7 & 2) != 0) {
            f8 = 1500.0f;
        }
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return new S(f7, f8, obj);
    }

    public static n0 l(int i7, int i8, InterfaceC1690x interfaceC1690x, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 300;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            interfaceC1690x = AbstractC1692z.f18766a;
        }
        return new n0(i7, i8, interfaceC1690x);
    }

    public static final void m(C1678k c1678k, C1680m c1680m) {
        c1680m.f18710p.setValue(c1678k.f18702e.getValue());
        r rVar = c1680m.f18711q;
        r rVar2 = c1678k.f18703f;
        int iB = rVar.b();
        for (int i7 = 0; i7 < iB; i7++) {
            rVar.e(i7, rVar2.a(i7));
        }
        c1680m.f18713s = c1678k.h;
        c1680m.f18712r = c1678k.f18704g;
        c1680m.f18714t = ((Boolean) c1678k.f18705i.getValue()).booleanValue();
    }
}
