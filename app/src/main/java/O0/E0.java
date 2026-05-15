package O0;

import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0324v[] f5291q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E0(C0324v[] c0324vArr, int i7) {
        super(2);
        this.f5290p = i7;
        this.f5291q = c0324vArr;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5290p) {
            case 0:
                return Float.valueOf(w0.e((l0) obj, true, this.f5291q, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(w0.e((l0) obj, false, this.f5291q, ((Number) obj2).floatValue()));
        }
    }
}
