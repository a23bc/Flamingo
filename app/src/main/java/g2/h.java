package g2;

import a.AbstractC0509a;
import f0.C0912t;
import m5.AbstractC1210l;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f12431p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z1.o f12432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n0.d f12435t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Z1.o oVar, int i7, int i8, n0.d dVar, int i9) {
        super(2);
        this.f12432q = oVar;
        this.f12433r = i7;
        this.f12434s = i8;
        this.f12435t = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12431p) {
            case 0:
                ((Number) obj2).intValue();
                n0.d dVar = this.f12435t;
                AbstractC0509a.d(this.f12433r, 3073, this.f12434s, this.f12432q, (C0912t) obj, dVar);
                break;
            default:
                ((Number) obj2).intValue();
                n0.d dVar2 = this.f12435t;
                Z1.o oVar = this.f12432q;
                AbstractC1267a.g(this.f12433r, this.f12434s, 3073, oVar, (C0912t) obj, dVar2);
                break;
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Z1.o oVar, int i7, n0.d dVar, int i8, int i9) {
        super(2);
        this.f12432q = oVar;
        this.f12433r = i7;
        this.f12435t = dVar;
        this.f12434s = i9;
    }
}
