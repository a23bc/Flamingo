package b2;

import a.AbstractC0509a;
import a2.C0512b;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o0 f10260q = new o0(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o0 f10261r = new o0(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o0 f10262s = new o0(2, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o0 f10263t = new o0(2, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o0 f10264u = new o0(2, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o0 f10265v = new o0(2, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final o0 f10266w = new o0(2, 6);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final o0 f10267x = new o0(2, 7);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final o0 f10268y = new o0(2, 8);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final o0 f10269z = new o0(2, 9);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final o0 f10246A = new o0(2, 10);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final o0 f10247B = new o0(2, 11);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final o0 f10248C = new o0(2, 12);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final o0 f10249D = new o0(2, 13);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final o0 f10250E = new o0(2, 14);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final o0 f10251F = new o0(2, 15);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final o0 f10252G = new o0(2, 16);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final o0 f10253H = new o0(2, 17);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final o0 f10254I = new o0(2, 18);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final o0 f10255J = new o0(2, 19);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final o0 f10256K = new o0(2, 20);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final o0 f10257L = new o0(2, 21);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final o0 f10258M = new o0(2, 22);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final o0 f10259N = new o0(2, 23);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i7) {
        super(2);
        this.f10270p = 24;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10270p) {
            case 0:
                Z1.n nVar = (Z1.n) obj2;
                return nVar instanceof g2.s ? nVar : obj;
            case 1:
                Z1.n nVar2 = (Z1.n) obj2;
                return nVar2 instanceof g2.n ? nVar2 : obj;
            case 2:
                Z1.n nVar3 = (Z1.n) obj2;
                return nVar3 instanceof g2.s ? nVar3 : obj;
            case 3:
                Z1.n nVar4 = (Z1.n) obj2;
                return nVar4 instanceof g2.n ? nVar4 : obj;
            case 4:
                Z1.n nVar5 = (Z1.n) obj2;
                return nVar5 instanceof g2.s ? nVar5 : obj;
            case 5:
                Z1.n nVar6 = (Z1.n) obj2;
                return nVar6 instanceof g2.n ? nVar6 : obj;
            case 6:
                Z1.n nVar7 = (Z1.n) obj2;
                return nVar7 instanceof C0647a ? nVar7 : obj;
            case 7:
                Z1.n nVar8 = (Z1.n) obj2;
                return nVar8 instanceof g2.s ? nVar8 : obj;
            case 8:
                Z1.n nVar9 = (Z1.n) obj2;
                return nVar9 instanceof g2.n ? nVar9 : obj;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                Y4.h hVar = (Y4.h) obj;
                Z1.n nVar10 = (Z1.n) obj2;
                return nVar10 instanceof C0512b ? new Y4.h(nVar10, hVar.f8727p) : new Y4.h(hVar.f8726o, ((Z1.o) hVar.f8727p).c(nVar10));
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C0635E c0635e = (C0635E) obj;
                Z1.n nVar11 = (Z1.n) obj2;
                if ((nVar11 instanceof g2.s) || (nVar11 instanceof g2.n) || (nVar11 instanceof C0684z)) {
                    return new C0635E(c0635e.f10038a.c(nVar11), c0635e.f10039b);
                }
                return new C0635E(c0635e.f10038a, c0635e.f10039b.c(nVar11));
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                Z1.n nVar12 = (Z1.n) obj2;
                return nVar12 instanceof g2.n ? nVar12 : obj;
            case 12:
                Z1.n nVar13 = (Z1.n) obj2;
                return nVar13 instanceof g2.s ? nVar13 : obj;
            case 13:
                Z1.n nVar14 = (Z1.n) obj2;
                return nVar14 instanceof g2.n ? nVar14 : obj;
            case 14:
                Z1.n nVar15 = (Z1.n) obj2;
                return nVar15 instanceof g2.s ? nVar15 : obj;
            case 15:
                Y4.h hVar2 = (Y4.h) obj;
                Z1.n nVar16 = (Z1.n) obj2;
                return nVar16 instanceof Z1.c ? new Y4.h(nVar16, hVar2.f8727p) : new Y4.h(hVar2.f8726o, ((Z1.o) hVar2.f8727p).c(nVar16));
            case 16:
                Y4.h hVar3 = (Y4.h) obj;
                Z1.n nVar17 = (Z1.n) obj2;
                return nVar17 instanceof C0512b ? new Y4.h(nVar17, hVar3.f8727p) : new Y4.h(hVar3.f8726o, ((Z1.o) hVar3.f8727p).c(nVar17));
            case 17:
                int iIntValue = ((Number) obj).intValue();
                if (((Z1.n) obj2) instanceof C0512b) {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 18:
                ((C0633C) obj).f10034c = ((n1.i) obj2).f14513a;
                return Y4.o.f8736a;
            case 19:
                ((C0633C) obj).f10035d = (H0) obj2;
                return Y4.o.f8736a;
            case BuildConfig.API_VERSION /* 20 */:
                Z1.n nVar18 = (Z1.n) obj2;
                return nVar18 instanceof C0512b ? nVar18 : obj;
            case 21:
                return obj;
            case 22:
                Z1.n nVar19 = (Z1.n) obj2;
                return nVar19 instanceof g2.s ? nVar19 : obj;
            case 23:
                Z1.n nVar20 = (Z1.n) obj2;
                return nVar20 instanceof g2.n ? nVar20 : obj;
            default:
                ((Number) obj2).intValue();
                AbstractC0509a.e(1, (C0912t) obj);
                return Y4.o.f8736a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i7, int i8) {
        super(i7);
        this.f10270p = i8;
    }
}
