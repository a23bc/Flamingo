package O0;

import m5.AbstractC1210l;

/* JADX INFO: renamed from: O0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0323u extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0324v[] f5447q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0323u(C0324v[] c0324vArr, int i7) {
        super(2);
        this.f5446p = i7;
        this.f5447q = c0324vArr;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5446p) {
            case 0:
                return Float.valueOf(w0.e((l0) obj, true, this.f5447q, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(w0.e((l0) obj, false, this.f5447q, ((Number) obj2).floatValue()));
        }
    }
}
