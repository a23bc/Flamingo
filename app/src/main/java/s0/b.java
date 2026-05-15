package s0;

import Q0.K;
import android.view.autofill.AutofillManager;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1210l implements l5.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f15822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K f15823q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, K k7) {
        super(4);
        this.f15822p = cVar;
        this.f15823q = k7;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.f15822p;
        cVar.f15829f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        ((AutofillManager) cVar.f15824a.f13847p).requestAutofill(cVar.f15826c, this.f15823q.f5831p, cVar.f15829f);
        return Y4.o.f8736a;
    }
}
