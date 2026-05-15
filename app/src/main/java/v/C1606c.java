package v;

import d2.C0821i;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import w.AbstractC1671d;
import w.C1682o;
import w.C1684q;
import y0.AbstractC1959I;
import y0.C1967Q;
import y0.C1987t;

/* JADX INFO: renamed from: v.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1606c extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f18062p;

    /* JADX INFO: renamed from: q */
    public static final C1606c f18052q = new C1606c(1, 0);

    /* JADX INFO: renamed from: r */
    public static final C1606c f18053r = new C1606c(1, 1);

    /* JADX INFO: renamed from: s */
    public static final C1606c f18054s = new C1606c(1, 2);

    /* JADX INFO: renamed from: t */
    public static final C1606c f18055t = new C1606c(1, 3);

    /* JADX INFO: renamed from: u */
    public static final C1606c f18056u = new C1606c(1, 4);

    /* JADX INFO: renamed from: v */
    public static final C1606c f18057v = new C1606c(1, 5);

    /* JADX INFO: renamed from: w */
    public static final C1606c f18058w = new C1606c(1, 6);

    /* JADX INFO: renamed from: x */
    public static final C1606c f18059x = new C1606c(1, 7);

    /* JADX INFO: renamed from: y */
    public static final C1606c f18060y = new C1606c(1, 8);

    /* JADX INFO: renamed from: z */
    public static final C1606c f18061z = new C1606c(1, 9);

    /* JADX INFO: renamed from: A */
    public static final C1606c f18046A = new C1606c(1, 10);

    /* JADX INFO: renamed from: B */
    public static final C1606c f18047B = new C1606c(1, 11);

    /* JADX INFO: renamed from: C */
    public static final C1606c f18048C = new C1606c(1, 12);

    /* JADX INFO: renamed from: D */
    public static final C1606c f18049D = new C1606c(1, 13);

    /* JADX INFO: renamed from: E */
    public static final C1606c f18050E = new C1606c(1, 14);

    /* JADX INFO: renamed from: F */
    public static final C1606c f18051F = new C1606c(1, 15);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1606c(int i7, int i8) {
        super(i7);
        this.f18062p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f18062p) {
            case 0:
                return AbstractC1110d.I(androidx.compose.animation.b.e(AbstractC1671d.l(220, 90, null, 4), 2).a(androidx.compose.animation.b.h(AbstractC1671d.l(220, 90, null, 4), 0.92f, 4)), androidx.compose.animation.b.f(AbstractC1671d.l(90, 0, null, 6), 2));
            case 1:
                return obj;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 5:
                long jA = C1987t.a(((C1987t) obj).f20264a, z0.d.f21054x);
                return new C1684q(C1987t.d(jA), C1987t.h(jA), C1987t.g(jA), C1987t.e(jA));
            case 6:
                return obj;
            case 7:
                long j3 = ((C1967Q) obj).f20226a;
                return new C1682o(C1967Q.b(j3), C1967Q.c(j3));
            case 8:
                C1682o c1682o = (C1682o) obj;
                return new C1967Q(AbstractC1959I.h(c1682o.f18720a, c1682o.f18721b));
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return AbstractC1671d.k(0.0f, 0.0f, null, 7);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                ((Number) obj).intValue();
                return 0;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((Number) obj).intValue();
                return 0;
            case 12:
                ((Number) obj).intValue();
                return 0;
            case 13:
                ((Number) obj).intValue();
                return 0;
            case 14:
                return androidx.compose.animation.b.f9113c;
            default:
                ((InterfaceC1180a) obj).a();
                return Y4.o.f8736a;
        }
    }
}
