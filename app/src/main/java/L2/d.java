package L2;

import t2.s0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f4108p;

    public /* synthetic */ d(e eVar, z zVar, int i7) {
        this.f4107o = i7;
        this.f4108p = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4107o) {
            case 0:
                this.f4108p.getClass();
                break;
            case 1:
                this.f4108p.l();
                break;
            default:
                this.f4108p.i();
                break;
        }
    }

    public /* synthetic */ d(e eVar, z zVar, s0 s0Var) {
        this.f4107o = 0;
        this.f4108p = zVar;
    }
}
