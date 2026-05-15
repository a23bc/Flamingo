package q1;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import O0.Z;
import Q0.K;
import Z4.w;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import m5.AbstractC1209k;
import r1.C1411e;
import r1.z;

/* JADX INFO: renamed from: q1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1363d implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f15458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15459c;

    public /* synthetic */ C1363d(ViewGroup viewGroup, Object obj, int i7) {
        this.f15457a = i7;
        this.f15458b = viewGroup;
        this.f15459c = obj;
    }

    @Override // O0.Z
    public final int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        switch (this.f15457a) {
            case 0:
                q qVar = (q) this.f15458b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                AbstractC1209k.c(layoutParams);
                qVar.measure(AbstractC1368i.l(qVar, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return qVar.getMeasuredHeight();
            default:
                return A0.e.i(this, interfaceC0327y, list, i7);
        }
    }

    @Override // O0.Z
    public final int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        switch (this.f15457a) {
            case 0:
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                q qVar = (q) this.f15458b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                AbstractC1209k.c(layoutParams);
                qVar.measure(iMakeMeasureSpec, AbstractC1368i.l(qVar, 0, i7, layoutParams.height));
                return qVar.getMeasuredWidth();
            default:
                return A0.e.l(this, interfaceC0327y, list, i7);
        }
    }

    @Override // O0.Z
    public final int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        switch (this.f15457a) {
            case 0:
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                q qVar = (q) this.f15458b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                AbstractC1209k.c(layoutParams);
                qVar.measure(iMakeMeasureSpec, AbstractC1368i.l(qVar, 0, i7, layoutParams.height));
                return qVar.getMeasuredWidth();
            default:
                return A0.e.f(this, interfaceC0327y, list, i7);
        }
    }

    @Override // O0.Z
    public final int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        switch (this.f15457a) {
            case 0:
                q qVar = (q) this.f15458b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                AbstractC1209k.c(layoutParams);
                qVar.measure(AbstractC1368i.l(qVar, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return qVar.getMeasuredHeight();
            default:
                return A0.e.c(this, interfaceC0327y, list, i7);
        }
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        switch (this.f15457a) {
            case 0:
                q qVar = (q) this.f15458b;
                int childCount = qVar.getChildCount();
                w wVar = w.f8819o;
                if (childCount == 0) {
                    return interfaceC0298b0.k(n1.a.j(j3), n1.a.i(j3), wVar, C1361b.f15450r);
                }
                if (n1.a.j(j3) != 0) {
                    qVar.getChildAt(0).setMinimumWidth(n1.a.j(j3));
                }
                if (n1.a.i(j3) != 0) {
                    qVar.getChildAt(0).setMinimumHeight(n1.a.i(j3));
                }
                int iJ = n1.a.j(j3);
                int iH = n1.a.h(j3);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                AbstractC1209k.c(layoutParams);
                int iL = AbstractC1368i.l(qVar, iJ, iH, layoutParams.width);
                int i7 = n1.a.i(j3);
                int iG = n1.a.g(j3);
                ViewGroup.LayoutParams layoutParams2 = qVar.getLayoutParams();
                AbstractC1209k.c(layoutParams2);
                qVar.measure(iL, AbstractC1368i.l(qVar, i7, iG, layoutParams2.height));
                return interfaceC0298b0.k(qVar.getMeasuredWidth(), qVar.getMeasuredHeight(), wVar, new C1362c(qVar, (K) this.f15459c, 1));
            default:
                ((z) this.f15458b).setParentLayoutDirection((n1.n) this.f15459c);
                return interfaceC0298b0.k(0, 0, w.f8819o, C1411e.f15675s);
        }
    }
}
