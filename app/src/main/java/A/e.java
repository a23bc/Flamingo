package A;

import I.C0211c;
import I.C0218j;
import I.C0224p;
import I.z;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import m5.C1217s;
import w.AbstractC1671d;
import w.C1680m;
import w.C1689w;
import w.InterfaceC1654C;
import w.S;
import w.o0;
import w.p0;
import w5.InterfaceC1765B;
import z.K0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1217s f11o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h f13q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f14r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f15s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K0 f16t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, float f7, InterfaceC1182c interfaceC1182c, K0 k02, c5.d dVar) {
        super(2, dVar);
        this.f13q = hVar;
        this.f14r = f7;
        this.f15s = interfaceC1182c;
        this.f16t = k02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e(this.f13q, this.f14r, this.f15s, this.f16t, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        float f7;
        EnumC0830a enumC0830a;
        long j3;
        float fSignum;
        C1217s c1217s;
        Object objB;
        float f8;
        float f9;
        EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
        int i7 = this.f12p;
        InterfaceC1182c interfaceC1182c = this.f15s;
        h hVar = this.f13q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1689w c1689w = hVar.f24b;
            o0 o0Var = p0.f18727a;
            InterfaceC1654C interfaceC1654C = c1689w.f18761a;
            float f10 = this.f14r;
            float fM = interfaceC1654C.m(0.0f, f10);
            C0211c c0211c = (C0211c) hVar.f23a.f7342p;
            int iN = ((z) c0211c.f3304p.getValue()).f3410c + c0211c.n();
            if (iN == 0) {
                enumC0830a = enumC0830a2;
                fSignum = 0.0f;
                f7 = 0.0f;
            } else {
                int i8 = f10 < 0.0f ? c0211c.f3295e + 1 : c0211c.f3295e;
                int iQ = i6.h.q(((int) (fM / iN)) + i8, 0, c0211c.m());
                c0211c.n();
                int i9 = ((z) c0211c.f3304p.getValue()).f3410c;
                long j7 = i8;
                f7 = 0.0f;
                long j8 = 1;
                long j9 = j7 - j8;
                if (j9 < 0) {
                    enumC0830a = enumC0830a2;
                    j3 = 0;
                } else {
                    enumC0830a = enumC0830a2;
                    j3 = j9;
                }
                int i10 = (int) j3;
                long j10 = j7 + j8;
                if (j10 > 2147483647L) {
                    j10 = 2147483647L;
                }
                int iAbs = Math.abs((i6.h.q(i6.h.q(iQ, i10, (int) j10), 0, c0211c.m()) - i8) * iN) - iN;
                if (iAbs < 0) {
                    iAbs = 0;
                }
                fSignum = iAbs == 0 ? iAbs : iAbs * Math.signum(f10);
            }
            if (Float.isNaN(fSignum)) {
                C.b.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            c1217s = new C1217s();
            float fSignum2 = Math.signum(f10) * Math.abs(fSignum);
            c1217s.f14436o = fSignum2;
            interfaceC1182c.b(new Float(fSignum2));
            float f11 = c1217s.f14436o;
            d dVar = new d(c1217s, interfaceC1182c, 0);
            this.f11o = c1217s;
            this.f12p = 1;
            objB = h.b(this.f13q, this.f16t, f11, this.f14r, dVar, this);
            enumC0830a2 = enumC0830a;
            if (objB != enumC0830a2) {
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        C1217s c1217s2 = this.f11o;
        android.support.v4.media.session.b.K(obj);
        c1217s = c1217s2;
        f7 = 0.0f;
        objB = obj;
        C1680m c1680m = (C1680m) objB;
        V.o oVar = hVar.f23a;
        float fFloatValue = ((Number) c1680m.b()).floatValue();
        C0211c c0211c2 = (C0211c) oVar.f7342p;
        m mVar = c0211c2.l().f3419n;
        ?? r9 = c0211c2.l().f3408a;
        int size = r9.size();
        int i11 = 0;
        float f12 = Float.NEGATIVE_INFINITY;
        float f13 = Float.POSITIVE_INFINITY;
        while (i11 < size) {
            C0218j c0218j = (C0218j) r9.get(i11);
            N5.l.A(c0211c2.l());
            float f14 = f7;
            int i12 = c0211c2.l().f3413f;
            int i13 = c0211c2.l().f3411d;
            int i14 = c0211c2.l().f3409b;
            int i15 = c0218j.f3369j;
            c0211c2.m();
            mVar.getClass();
            float f15 = i15 - 0;
            if (f15 <= f14 && f15 > f12) {
                f12 = f15;
            }
            if (f15 >= f14 && f15 < f13) {
                f13 = f15;
            }
            i11++;
            f7 = f14;
        }
        float f16 = f7;
        if (f12 == Float.NEGATIVE_INFINITY) {
            f12 = f13;
        }
        if (f13 == Float.POSITIVE_INFINITY) {
            f13 = f12;
        }
        if (!c0211c2.d()) {
            if (M3.a.Y(c0211c2, fFloatValue)) {
                f12 = f16;
                f13 = f12;
            } else {
                f13 = f16;
            }
        }
        if (c0211c2.a()) {
            f8 = f12;
            f9 = f13;
        } else if (M3.a.Y(c0211c2, fFloatValue)) {
            f9 = f13;
            f8 = f16;
        } else {
            f8 = f16;
            f9 = f8;
        }
        float fFloatValue2 = ((Number) ((C0224p) oVar.f7343q).d(Float.valueOf(fFloatValue), Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        if (fFloatValue2 != f8 && fFloatValue2 != f9 && fFloatValue2 != f16) {
            C.b.c("Final Snapping Offset Should Be one of " + f8 + ", " + f9 + " or 0.0");
        }
        if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
            fFloatValue2 = f16;
        }
        if (Float.isNaN(fFloatValue2)) {
            C.b.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        c1217s.f14436o = fFloatValue2;
        C1680m c1680mH = AbstractC1671d.h(c1680m, f16, f16, 30);
        S s7 = hVar.f25c;
        d dVar2 = new d(c1217s, interfaceC1182c, 1);
        this.f11o = null;
        this.f12p = 2;
        Object objB2 = l.b(this.f16t, fFloatValue2, fFloatValue2, c1680mH, s7, dVar2, this);
        return objB2 == enumC0830a2 ? enumC0830a2 : objB2;
    }
}
