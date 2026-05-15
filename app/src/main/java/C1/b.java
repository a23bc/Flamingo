package C1;

import E4.AbstractC0126y;
import E4.C0124w;
import E4.Z;
import H.O;
import H.n0;
import Q0.K;
import R0.AbstractC0416x0;
import android.graphics.Rect;
import android.view.View;
import d2.C0821i;
import f0.P;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l3.C1172d;
import m5.AbstractC1209k;
import s3.C1433c;
import t.J;
import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f933o;

    public /* synthetic */ b(int i7) {
        this.f933o = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f933o) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b7 = bArr[i7];
                    byte b8 = bArr2[i7];
                    if (b7 != b8) {
                        return b7 - b8;
                    }
                }
                return 0;
            case 1:
                return AbstractC1209k.g(((n0) obj2).f2911a, ((n0) obj).f2911a);
            case 2:
                return AbstractC1209k.g(((O) obj).getIndex(), ((O) obj2).getIndex());
            case 3:
                return ((C1487p) obj2).f16698i - ((C1487p) obj).f16698i;
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                return Integer.compare(((J2.f) ((List) obj).get(0)).f3647t, ((J2.f) ((List) obj2).get(0)).f3647t);
            case 6:
                return ((J2.e) Collections.max((List) obj)).compareTo((J2.e) Collections.max((List) obj2));
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0124w.f(J2.n.c((J2.n) Collections.max(list, new b(9)), (J2.n) Collections.max(list2, new b(9)))).a(list.size(), list2.size()).b((J2.n) Collections.max(list, new b(10)), (J2.n) Collections.max(list2, new b(10)), new b(10)).e();
            case 8:
                return ((J2.k) ((List) obj).get(0)).compareTo((J2.k) ((List) obj2).get(0));
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return J2.n.c((J2.n) obj, (J2.n) obj2);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                J2.n nVar = (J2.n) obj;
                J2.n nVar2 = (J2.n) obj2;
                Z zA = (nVar.f3708s && nVar.f3711v) ? J2.o.f3716j : J2.o.f3716j.a();
                AbstractC0126y abstractC0126yB = AbstractC0126y.f1997a;
                boolean z6 = nVar.f3709t.f16606y;
                int i8 = nVar.f3713x;
                if (z6) {
                    abstractC0126yB = abstractC0126yB.b(Integer.valueOf(i8), Integer.valueOf(nVar2.f3713x), J2.o.f3716j.a());
                }
                return abstractC0126yB.b(Integer.valueOf(nVar.f3714y), Integer.valueOf(nVar2.f3714y), zA).b(Integer.valueOf(i8), Integer.valueOf(nVar2.f3713x), zA).e();
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((K2.n) obj).f4036a - ((K2.n) obj2).f4036a;
            case 12:
                return Float.compare(((K2.n) obj).f4038c, ((K2.n) obj2).f4038c);
            case 13:
                K k7 = (K) obj;
                K k8 = (K) obj2;
                float f7 = k7.f5822U.f5869p.f5958S;
                float f8 = k8.f5822U.f5869p.f5958S;
                return f7 == f8 ? AbstractC1209k.g(k7.x(), k8.x()) : Float.compare(f7, f8);
            case 14:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                J j3 = AbstractC0416x0.f6642d;
                Object objG = j3.g(view);
                AbstractC1209k.c(objG);
                Rect rect = (Rect) objG;
                Object objG2 = j3.g(view2);
                AbstractC1209k.c(objG2);
                Rect rect2 = (Rect) objG2;
                int i9 = rect.top - rect2.top;
                return i9 == 0 ? rect.bottom - rect2.bottom : i9;
            case 15:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                J j7 = AbstractC0416x0.f6642d;
                Object objG3 = j7.g(view3);
                AbstractC1209k.c(objG3);
                Rect rect3 = (Rect) objG3;
                Object objG4 = j7.g(view4);
                AbstractC1209k.c(objG4);
                Rect rect4 = (Rect) objG4;
                int i10 = rect3.left - rect4.left;
                return i10 == 0 ? (rect3.right - rect4.right) * AbstractC0416x0.f6641c : AbstractC0416x0.f6641c * i10;
            case 16:
                Y4.h hVar = (Y4.h) obj;
                Y4.h hVar2 = (Y4.h) obj2;
                return (((Number) hVar.f8727p).intValue() - ((Number) hVar.f8726o).intValue()) - (((Number) hVar2.f8727p).intValue() - ((Number) hVar2.f8726o).intValue());
            case 17:
                return AbstractC1209k.g(((P) obj).f11729b, ((P) obj2).f11729b);
            case 18:
                return Integer.compare(((C1172d) obj2).f14204b, ((C1172d) obj).f14204b);
            case 19:
                return Integer.compare(((s3.d) obj).f15890a.f15893b, ((s3.d) obj2).f15890a.f15893b);
            default:
                return Long.compare(((C1433c) obj).f15887b, ((C1433c) obj2).f15887b);
        }
    }
}
