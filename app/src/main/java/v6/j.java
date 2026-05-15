package v6;

import F.C0130c;
import f0.C0912t;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.d f18377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0130c f18378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18379r;

    public /* synthetic */ j(n0.d dVar, C0130c c0130c, int i7, int i8) {
        this.f18376o = i8;
        this.f18377p = dVar;
        this.f18378q = c0130c;
        this.f18379r = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18376o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    this.f18377p.h(this.f18378q, Integer.valueOf(this.f18379r), c0912t, 0);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    this.f18377p.h(this.f18378q, Integer.valueOf(this.f18379r), c0912t2, 0);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    this.f18377p.h(this.f18378q, Integer.valueOf(this.f18379r), c0912t3, 0);
                }
                break;
            default:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    this.f18377p.h(this.f18378q, Integer.valueOf(this.f18379r), c0912t4, 0);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
