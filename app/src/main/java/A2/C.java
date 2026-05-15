package A2;

import t2.C1476e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements w2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f68o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1476e f69p;

    public /* synthetic */ C(C1476e c1476e, int i7) {
        this.f68o = i7;
        this.f69p = c1476e;
    }

    @Override // w2.g
    public final void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f68o) {
            case 0:
                v3.P(this.f69p);
                break;
            default:
                v3.P(this.f69p);
                break;
        }
    }
}
