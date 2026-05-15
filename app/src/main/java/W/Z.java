package w;

import d2.C0821i;
import j5.AbstractC1107a;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import x0.C1892b;
import x0.C1893c;
import x0.C1895e;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f18602p;

    /* JADX INFO: renamed from: q */
    public static final Z f18592q = new Z(1, 0);

    /* JADX INFO: renamed from: r */
    public static final Z f18593r = new Z(1, 1);

    /* JADX INFO: renamed from: s */
    public static final Z f18594s = new Z(1, 2);

    /* JADX INFO: renamed from: t */
    public static final Z f18595t = new Z(1, 3);

    /* JADX INFO: renamed from: u */
    public static final Z f18596u = new Z(1, 4);

    /* JADX INFO: renamed from: v */
    public static final Z f18597v = new Z(1, 5);

    /* JADX INFO: renamed from: w */
    public static final Z f18598w = new Z(1, 6);

    /* JADX INFO: renamed from: x */
    public static final Z f18599x = new Z(1, 7);

    /* JADX INFO: renamed from: y */
    public static final Z f18600y = new Z(1, 8);

    /* JADX INFO: renamed from: z */
    public static final Z f18601z = new Z(1, 9);

    /* JADX INFO: renamed from: A */
    public static final Z f18582A = new Z(1, 10);

    /* JADX INFO: renamed from: B */
    public static final Z f18583B = new Z(1, 11);

    /* JADX INFO: renamed from: C */
    public static final Z f18584C = new Z(1, 12);

    /* JADX INFO: renamed from: D */
    public static final Z f18585D = new Z(1, 13);

    /* JADX INFO: renamed from: E */
    public static final Z f18586E = new Z(1, 14);

    /* JADX INFO: renamed from: F */
    public static final Z f18587F = new Z(1, 15);

    /* JADX INFO: renamed from: G */
    public static final Z f18588G = new Z(1, 16);

    /* JADX INFO: renamed from: H */
    public static final Z f18589H = new Z(1, 17);

    /* JADX INFO: renamed from: I */
    public static final Z f18590I = new Z(1, 18);

    /* JADX INFO: renamed from: J */
    public static final Z f18591J = new Z(1, 19);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i7, int i8) {
        super(i7);
        this.f18602p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f18602p) {
            case 0:
                return Y4.o.f8736a;
            case 1:
                ((InterfaceC1180a) obj).a();
                return Y4.o.f8736a;
            case 2:
                long j3 = ((n1.h) obj).f14512a;
                return new C1682o(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            case 3:
                C1682o c1682o = (C1682o) obj;
                return new n1.h((((long) Float.floatToRawIntBits(c1682o.f18720a)) << 32) | (((long) Float.floatToRawIntBits(c1682o.f18721b)) & 4294967295L));
            case 4:
                return new C1681n(((n1.g) obj).f14511o);
            case 5:
                return new n1.g(((C1681n) obj).f18716a);
            case 6:
                return new C1681n(((Number) obj).floatValue());
            case 7:
                return Float.valueOf(((C1681n) obj).f18716a);
            case 8:
                long j7 = ((n1.k) obj).f14514a;
                return new C1682o((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                C1682o c1682o2 = (C1682o) obj;
                return new n1.k(i6.h.a(Math.round(c1682o2.f18720a), Math.round(c1682o2.f18721b)));
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                long j8 = ((n1.m) obj).f14520a;
                return new C1682o((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                C1682o c1682o3 = (C1682o) obj;
                int iRound = Math.round(c1682o3.f18720a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c1682o3.f18721b);
                return new n1.m(AbstractC1107a.b(iRound, iRound2 >= 0 ? iRound2 : 0));
            case 12:
                return new C1681n(((Number) obj).intValue());
            case 13:
                return Integer.valueOf((int) ((C1681n) obj).f18716a);
            case 14:
                long j9 = ((C1892b) obj).f19867a;
                return new C1682o(C1892b.d(j9), C1892b.e(j9));
            case 15:
                C1682o c1682o4 = (C1682o) obj;
                return new C1892b(AbstractC1110d.g(c1682o4.f18720a, c1682o4.f18721b));
            case 16:
                C1893c c1893c = (C1893c) obj;
                return new C1684q(c1893c.f19869a, c1893c.f19870b, c1893c.f19871c, c1893c.f19872d);
            case 17:
                C1684q c1684q = (C1684q) obj;
                return new C1893c(c1684q.f18735a, c1684q.f18736b, c1684q.f18737c, c1684q.f18738d);
            case 18:
                long j10 = ((C1895e) obj).f19880a;
                return new C1682o(C1895e.d(j10), C1895e.b(j10));
            default:
                C1682o c1682o5 = (C1682o) obj;
                return new C1895e(i6.h.i(c1682o5.f18720a, c1682o5.f18721b));
        }
    }
}
