package w3;

/* JADX INFO: renamed from: w3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1701D implements w2.g, w2.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t2.Q f18954p;

    public /* synthetic */ C1701D(t2.Q q7, int i7) {
        this.f18953o = i7;
        this.f18954p = q7;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f18953o) {
            case 0:
                v3.O(this.f18954p);
                break;
            default:
                v3.O(this.f18954p);
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        ((r1) obj).h(this.f18954p);
    }
}
