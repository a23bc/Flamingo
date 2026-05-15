package i6;

import d2.C0821i;
import f0.C0879c;
import f0.C0912t;
import j5.AbstractC1107a;
import j5.AbstractC1109c;
import k.AbstractC1113a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y3.x f13521p;

    public /* synthetic */ c(y3.x xVar, int i7, int i8) {
        this.f13520o = i8;
        this.f13521p = xVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f13520o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                y3.x xVar = this.f13521p;
                AbstractC1209k.f(xVar, "$navController");
                g.g(xVar, c0912t, C0879c.B(1));
                break;
            case 1:
                y3.x xVar2 = this.f13521p;
                AbstractC1209k.f(xVar2, "$navController");
                z.e(xVar2, c0912t, C0879c.B(1));
                break;
            case 2:
                y3.x xVar3 = this.f13521p;
                AbstractC1209k.f(xVar3, "$navController");
                j6.i.b(xVar3, c0912t, C0879c.B(1));
                break;
            case 3:
                y3.x xVar4 = this.f13521p;
                AbstractC1209k.f(xVar4, "$navController");
                j6.o.b(xVar4, c0912t, C0879c.B(1));
                break;
            case 4:
                y3.x xVar5 = this.f13521p;
                AbstractC1209k.f(xVar5, "$navController");
                k6.f.b(xVar5, c0912t, C0879c.B(1));
                break;
            case 5:
                y3.x xVar6 = this.f13521p;
                AbstractC1209k.f(xVar6, "$navController");
                h.h(xVar6, c0912t, C0879c.B(1));
                break;
            case 6:
                y3.x xVar7 = this.f13521p;
                AbstractC1209k.f(xVar7, "$navController");
                AbstractC1113a.k(xVar7, c0912t, C0879c.B(1));
                break;
            case 7:
                y3.x xVar8 = this.f13521p;
                AbstractC1209k.f(xVar8, "$navController");
                g.h(xVar8, c0912t, C0879c.B(1));
                break;
            case 8:
                y3.x xVar9 = this.f13521p;
                AbstractC1209k.f(xVar9, "$navController");
                j0.k.f(xVar9, c0912t, C0879c.B(1));
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                y3.x xVar10 = this.f13521p;
                AbstractC1209k.f(xVar10, "$navController");
                AbstractC1107a.g(xVar10, c0912t, C0879c.B(1));
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                y3.x xVar11 = this.f13521p;
                AbstractC1209k.f(xVar11, "$navController");
                AbstractC1109c.h(xVar11, c0912t, C0879c.B(1));
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                y3.x xVar12 = this.f13521p;
                AbstractC1209k.f(xVar12, "$navController");
                h.d(xVar12, c0912t, C0879c.B(1));
                break;
            case 12:
                y3.x xVar13 = this.f13521p;
                AbstractC1209k.f(xVar13, "$navController");
                j0.k.e(xVar13, c0912t, C0879c.B(1));
                break;
            case 13:
                y3.x xVar14 = this.f13521p;
                AbstractC1209k.f(xVar14, "$navController");
                AbstractC1107a.a(xVar14, c0912t, C0879c.B(1));
                break;
            case 14:
                y3.x xVar15 = this.f13521p;
                AbstractC1209k.f(xVar15, "$navController");
                j0.k.g(xVar15, c0912t, C0879c.B(1));
                break;
            case 15:
                y3.x xVar16 = this.f13521p;
                AbstractC1209k.f(xVar16, "$navController");
                AbstractC1107a.e(xVar16, c0912t, C0879c.B(1));
                break;
            default:
                y3.x xVar17 = this.f13521p;
                AbstractC1209k.f(xVar17, "$navController");
                h.j(xVar17, c0912t, C0879c.B(1));
                break;
        }
        return Y4.o.f8736a;
    }
}
