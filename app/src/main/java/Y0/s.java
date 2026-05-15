package Y0;

import d2.C0821i;
import java.util.ArrayList;
import java.util.List;
import m5.AbstractC1210l;
import y0.InterfaceC1963M;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f8514p;

    /* JADX INFO: renamed from: q */
    public static final s f8504q = new s(2, 0);

    /* JADX INFO: renamed from: r */
    public static final s f8505r = new s(2, 1);

    /* JADX INFO: renamed from: s */
    public static final s f8506s = new s(2, 2);

    /* JADX INFO: renamed from: t */
    public static final s f8507t = new s(2, 3);

    /* JADX INFO: renamed from: u */
    public static final s f8508u = new s(2, 4);

    /* JADX INFO: renamed from: v */
    public static final s f8509v = new s(2, 5);

    /* JADX INFO: renamed from: w */
    public static final s f8510w = new s(2, 6);

    /* JADX INFO: renamed from: x */
    public static final s f8511x = new s(2, 7);

    /* JADX INFO: renamed from: y */
    public static final s f8512y = new s(2, 8);

    /* JADX INFO: renamed from: z */
    public static final s f8513z = new s(2, 9);

    /* JADX INFO: renamed from: A */
    public static final s f8495A = new s(2, 10);

    /* JADX INFO: renamed from: B */
    public static final s f8496B = new s(2, 11);

    /* JADX INFO: renamed from: C */
    public static final s f8497C = new s(2, 12);

    /* JADX INFO: renamed from: D */
    public static final s f8498D = new s(2, 13);

    /* JADX INFO: renamed from: E */
    public static final s f8499E = new s(2, 14);

    /* JADX INFO: renamed from: F */
    public static final s f8500F = new s(2, 15);

    /* JADX INFO: renamed from: G */
    public static final s f8501G = new s(2, 16);

    /* JADX INFO: renamed from: H */
    public static final s f8502H = new s(2, 17);

    /* JADX INFO: renamed from: I */
    public static final s f8503I = new s(2, 18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i7, int i8) {
        super(i7);
        this.f8514p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Y4.c cVar;
        switch (this.f8514p) {
            case 0:
                return (s0.d) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListL0 = Z4.n.L0(list);
                arrayListL0.addAll(list2);
                return arrayListL0;
            case 2:
                return (s0.n) obj;
            case 3:
                return (Y4.o) obj;
            case 4:
                return (Y4.o) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (Y4.o) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                g gVar = (g) obj;
                int i7 = ((g) obj2).f8444a;
                return gVar;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return (InterfaceC1963M) obj;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListL02 = Z4.n.L0(list3);
                arrayListL02.addAll(list4);
                return arrayListL02;
            case 13:
                Float f7 = (Float) obj;
                ((Number) obj2).floatValue();
                return f7;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f8430a) == null) {
                    str = aVar2.f8430a;
                }
                if (aVar == null || (cVar = aVar.f8431b) == null) {
                    cVar = aVar2.f8431b;
                }
                return new a(str, cVar);
            case 17:
                return obj == null ? obj2 : obj;
            default:
                o oVar = (o) obj2;
                j jVar = ((o) obj).f8484d;
                w wVar = t.f8546s;
                Object objG = jVar.f8473o.g(wVar);
                if (objG == null) {
                    objG = Float.valueOf(0.0f);
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = oVar.f8484d.f8473o.g(wVar);
                if (objG2 == null) {
                    objG2 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objG2).floatValue()));
        }
    }
}
