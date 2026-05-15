package A0;

import A2.W;
import android.graphics.Paint;
import android.graphics.Shader;
import m5.AbstractC1209k;
import n1.n;
import w2.l;
import y0.AbstractC1959I;
import y0.AbstractC1983p;
import y0.C1973f;
import y0.C1976i;
import y0.C1980m;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f53o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f54p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f55q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f56r;

    public c() {
        n1.e eVar = d.f57a;
        n nVar = n.f14521o;
        g gVar = g.f58a;
        a aVar = new a();
        aVar.f44a = eVar;
        aVar.f45b = nVar;
        aVar.f46c = gVar;
        aVar.f47d = 0L;
        this.f53o = aVar;
        this.f54p = new b(this);
    }

    public static l a(c cVar, long j3, d dVar, float f7, int i7) {
        l lVarE = cVar.e(dVar);
        if (f7 != 1.0f) {
            j3 = C1987t.b(j3, C1987t.d(j3) * f7);
        }
        if (!C1987t.c(AbstractC1959I.c(((Paint) lVarE.f18861b).getColor()), j3)) {
            lVarE.h(j3);
        }
        if (((Shader) lVarE.f18862c) != null) {
            lVarE.k(null);
        }
        if (!AbstractC1209k.a((C1980m) lVarE.f18863d, null)) {
            lVarE.i(null);
        }
        if (lVarE.f18860a != i7) {
            lVarE.g(i7);
        }
        if (((Paint) lVarE.f18861b).isFilterBitmap()) {
            return lVarE;
        }
        lVarE.j(1);
        return lVarE;
    }

    @Override // A0.f
    public final b A() {
        return this.f54p;
    }

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return n1.c.h(j3, this);
    }

    @Override // A0.f
    public final void H(C1976i c1976i, long j3, d dVar, int i7) {
        this.f53o.f46c.e(c1976i, a(this, j3, dVar, 1.0f, i7));
    }

    @Override // A0.f
    public final void J(AbstractC1983p abstractC1983p, long j3, long j7, float f7, d dVar, C1980m c1980m, int i7) {
        int i8 = (int) (j3 >> 32);
        int i9 = (int) (j3 & 4294967295L);
        this.f53o.f46c.t(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (4294967295L & j7)) + Float.intBitsToFloat(i9), c(abstractC1983p, dVar, f7, c1980m, i7, 1));
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return n1.c.f(f7, this);
    }

    @Override // A0.f
    public final void O(long j3, long j7, long j8, float f7, int i7) {
        InterfaceC1985r interfaceC1985r = this.f53o.f46c;
        l lVarG = this.f56r;
        if (lVarG == null) {
            lVarG = AbstractC1959I.g();
            lVarG.o(1);
            this.f56r = lVarG;
        }
        if (!C1987t.c(AbstractC1959I.c(((Paint) lVarG.f18861b).getColor()), j3)) {
            lVarG.h(j3);
        }
        if (((Shader) lVarG.f18862c) != null) {
            lVarG.k(null);
        }
        if (!AbstractC1209k.a((C1980m) lVarG.f18863d, null)) {
            lVarG.i(null);
        }
        if (lVarG.f18860a != 3) {
            lVarG.g(3);
        }
        Paint paint = (Paint) lVarG.f18861b;
        if (paint.getStrokeWidth() != f7) {
            lVarG.n(f7);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) lVarG.f18861b).setStrokeMiter(4.0f);
        }
        if (lVarG.d() != i7) {
            lVarG.l(i7);
        }
        if (lVarG.e() != 0) {
            lVarG.m(0);
        }
        if (!paint.isFilterBitmap()) {
            lVarG.j(1);
        }
        interfaceC1985r.f(j7, j8, lVarG);
    }

    @Override // A0.f
    public final long R() {
        return i6.h.A(this.f54p.W());
    }

    @Override // A0.f
    public final void U(long j3, long j7, long j8, float f7, d dVar, int i7) {
        int i8 = (int) (j7 >> 32);
        int i9 = (int) (j7 & 4294967295L);
        this.f53o.f46c.t(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (4294967295L & j8)) + Float.intBitsToFloat(i9), a(this, j3, dVar, f7, i7));
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return n1.c.k(j3, this);
    }

    @Override // A0.f
    public final void W(C1976i c1976i, AbstractC1983p abstractC1983p, float f7, d dVar, int i7) {
        this.f53o.f46c.e(c1976i, c(abstractC1983p, dVar, f7, null, i7, 1));
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return n1.c.j(j3, this);
    }

    @Override // n1.d
    public final float b() {
        return this.f53o.f44a.b();
    }

    @Override // A0.f
    public final void b0(long j3, long j7, long j8, long j9, d dVar, int i7) {
        int i8 = (int) (j7 >> 32);
        int i9 = (int) (j7 & 4294967295L);
        this.f53o.f46c.c(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), a(this, j3, dVar, 1.0f, i7));
    }

    public final l c(AbstractC1983p abstractC1983p, d dVar, float f7, C1980m c1980m, int i7, int i8) {
        l lVarE = e(dVar);
        if (abstractC1983p != null) {
            abstractC1983p.a(f7, this.f54p.W(), lVarE);
        } else {
            if (((Shader) lVarE.f18862c) != null) {
                lVarE.k(null);
            }
            long jC = AbstractC1959I.c(((Paint) lVarE.f18861b).getColor());
            long j3 = C1987t.f20255b;
            if (!C1987t.c(jC, j3)) {
                lVarE.h(j3);
            }
            if (((Paint) lVarE.f18861b).getAlpha() / 255.0f != f7) {
                lVarE.f(f7);
            }
        }
        if (!AbstractC1209k.a((C1980m) lVarE.f18863d, c1980m)) {
            lVarE.i(c1980m);
        }
        if (lVarE.f18860a != i7) {
            lVarE.g(i7);
        }
        if (((Paint) lVarE.f18861b).isFilterBitmap() == i8) {
            return lVarE;
        }
        lVarE.j(i8);
        return lVarE;
    }

    public final void d(C1973f c1973f, C1980m c1980m) {
        this.f53o.f46c.p(c1973f, c(null, h.f59b, 1.0f, c1980m, 3, 1));
    }

    public final l e(d dVar) {
        if (AbstractC1209k.a(dVar, h.f59b)) {
            l lVar = this.f55q;
            if (lVar != null) {
                return lVar;
            }
            l lVarG = AbstractC1959I.g();
            lVarG.o(0);
            this.f55q = lVarG;
            return lVarG;
        }
        if (!(dVar instanceof i)) {
            throw new W();
        }
        l lVarG2 = this.f56r;
        if (lVarG2 == null) {
            lVarG2 = AbstractC1959I.g();
            lVarG2.o(1);
            this.f56r = lVarG2;
        }
        Paint paint = (Paint) lVarG2.f18861b;
        float strokeWidth = paint.getStrokeWidth();
        i iVar = (i) dVar;
        float f7 = iVar.f60b;
        if (strokeWidth != f7) {
            lVarG2.n(f7);
        }
        int iD = lVarG2.d();
        int i7 = iVar.f62d;
        if (iD != i7) {
            lVarG2.l(i7);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f8 = iVar.f61c;
        if (strokeMiter != f8) {
            ((Paint) lVarG2.f18861b).setStrokeMiter(f8);
        }
        int iE = lVarG2.e();
        int i8 = iVar.f63e;
        if (iE == i8) {
            return lVarG2;
        }
        lVarG2.m(i8);
        return lVarG2;
    }

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
    }

    @Override // A0.f
    public final long f() {
        return this.f54p.W();
    }

    @Override // A0.f
    public final n getLayoutDirection() {
        return this.f53o.f45b;
    }

    @Override // A0.f
    public final void h0(C1973f c1973f, long j3, long j7, long j8, float f7, C1980m c1980m, int i7) {
        this.f53o.f46c.m(c1973f, j3, j7, j8, c(null, h.f59b, f7, c1980m, 3, i7));
    }

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
    }

    @Override // n1.d
    public final float n() {
        return this.f53o.f44a.n();
    }

    @Override // A0.f
    public final void p(float f7, long j3, long j7) {
        this.f53o.f46c.j(f7, j7, a(this, j3, h.f59b, 1.0f, 3));
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return n1.c.i(j3, this);
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
