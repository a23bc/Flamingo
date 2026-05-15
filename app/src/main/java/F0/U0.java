package f0;

import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements InterfaceC2111f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0909r0 f11758p;

    public /* synthetic */ U0(C0909r0 c0909r0, int i7) {
        this.f11757o = i7;
        this.f11758p = c0909r0;
    }

    @Override // z5.InterfaceC2111f
    public final Object f(Object obj, c5.d dVar) {
        switch (this.f11757o) {
            case 0:
                this.f11758p.setValue(obj);
                break;
            default:
                this.f11758p.setValue(obj);
                break;
        }
        return Y4.o.f8736a;
    }
}
