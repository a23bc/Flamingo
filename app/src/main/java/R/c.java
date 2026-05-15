package R;

import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f6165p;

    public /* synthetic */ c(InterfaceC1180a interfaceC1180a, int i7) {
        this.f6164o = i7;
        this.f6165p = interfaceC1180a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6164o) {
            case 0:
                this.f6165p.a();
                break;
            case 1:
                this.f6165p.a();
                break;
            default:
                this.f6165p.a();
                break;
        }
    }
}
