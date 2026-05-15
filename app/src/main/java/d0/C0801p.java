package d0;

import f0.C0879c;
import f0.C0886f0;
import f0.C0894j0;
import java.util.Collection;
import java.util.Iterator;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0801p {

    /* JADX INFO: renamed from: a */
    public final S f11056a;

    /* JADX INFO: renamed from: b */
    public final E0.K f11057b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1182c f11058c;

    /* JADX INFO: renamed from: d */
    public final E f11059d;

    /* JADX INFO: renamed from: e */
    public final C0800o f11060e;

    /* JADX INFO: renamed from: f */
    public final C0894j0 f11061f;

    /* JADX INFO: renamed from: g */
    public final f0.G f11062g;
    public final f0.G h;

    /* JADX INFO: renamed from: i */
    public final C0886f0 f11063i;

    /* JADX INFO: renamed from: j */
    public final C0886f0 f11064j;

    /* JADX INFO: renamed from: k */
    public final C0894j0 f11065k;
    public final C0894j0 l;

    /* JADX INFO: renamed from: m */
    public final C0799n f11066m;

    public C0801p(o0 o0Var, S s7, E0.K k7, InterfaceC1182c interfaceC1182c) {
        w.S s8 = AbstractC0778b.f10953a;
        this.f11056a = s7;
        this.f11057b = k7;
        this.f11058c = interfaceC1182c;
        this.f11059d = new E();
        this.f11060e = new C0800o(this);
        this.f11061f = C0879c.t(o0Var);
        this.f11062g = C0879c.o(new C0792i(this, 4));
        this.h = C0879c.o(new C0792i(this, 2));
        this.f11063i = new C0886f0(Float.NaN);
        C0879c.n(f0.W.f11767t, new C0792i(this, 3));
        this.f11064j = new C0886f0(0.0f);
        this.f11065k = C0879c.t(null);
        this.l = C0879c.t(new F(Z4.w.f8819o));
        this.f11066m = new C0799n(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, x.EnumC1862l0 r8, d0.C0780c r9, e5.AbstractC0865c r10) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0801p.a(java.lang.Object, x.l0, d0.c, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(x.EnumC1862l0 r8, b2.C0641K r9, e5.AbstractC0865c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0801p.b(x.l0, b2.K, e5.c):java.lang.Object");
    }

    public final Object c(float f7, float f8, Object obj) {
        F fD = d();
        float fD2 = fD.d(obj);
        float fFloatValue = ((Number) this.f11057b.a()).floatValue();
        if (fD2 != f7 && !Float.isNaN(fD2)) {
            S s7 = this.f11056a;
            if (fD2 < f7) {
                if (f8 >= fFloatValue) {
                    Object objB = fD.b(f7, true);
                    AbstractC1209k.c(objB);
                    return objB;
                }
                Object objB2 = fD.b(f7, true);
                AbstractC1209k.c(objB2);
                if (f7 >= Math.abs(Math.abs(((Number) s7.b(Float.valueOf(Math.abs(fD.d(objB2) - fD2)))).floatValue()) + fD2)) {
                    return objB2;
                }
            } else {
                if (f8 <= (-fFloatValue)) {
                    Object objB3 = fD.b(f7, false);
                    AbstractC1209k.c(objB3);
                    return objB3;
                }
                Object objB4 = fD.b(f7, false);
                AbstractC1209k.c(objB4);
                float fAbs = Math.abs(fD2 - Math.abs(((Number) s7.b(Float.valueOf(Math.abs(fD2 - fD.d(objB4))))).floatValue()));
                if (f7 >= 0.0f ? f7 <= fAbs : Math.abs(f7) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final F d() {
        return (F) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final float e(float f7) {
        Float fValueOf;
        C0886f0 c0886f0 = this.f11063i;
        float fH = (Float.isNaN(c0886f0.h()) ? 0.0f : c0886f0.h()) + f7;
        float fC = d().c();
        Collection collectionValues = d().f10847a.values();
        AbstractC1209k.f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return i6.h.p(fH, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        C0886f0 c0886f0 = this.f11063i;
        if (Float.isNaN(c0886f0.h())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c0886f0.h();
    }

    public final void g(Object obj) {
        this.f11061f.setValue(obj);
    }

    public final void h(Object obj) {
        this.f11065k.setValue(obj);
    }
}
