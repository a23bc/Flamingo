package s0;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import k.I;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1210l implements l5.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f15820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15821q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i7) {
        super(4);
        this.f15820p = cVar;
        this.f15821q = i7;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.f15820p;
        I i7 = cVar.f15824a;
        ((AutofillManager) i7.f13847p).notifyViewEntered(cVar.f15826c, this.f15821q, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return Y4.o.f8736a;
    }
}
