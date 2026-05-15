package q;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Toolbar f15229p;

    public /* synthetic */ T0(Toolbar toolbar, int i7) {
        this.f15228o = i7;
        this.f15229p = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15228o) {
            case 0:
                W0 w02 = this.f15229p.f9080c0;
                p.n nVar = w02 == null ? null : w02.f15243p;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f15229p.m();
                break;
        }
    }
}
