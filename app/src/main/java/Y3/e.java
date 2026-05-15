package Y3;

import I4.y;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: o */
    public final j f8707o;

    /* JADX INFO: renamed from: p */
    public final y f8708p;

    public e(j jVar, y yVar) {
        this.f8707o = jVar;
        this.f8708p = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8707o.f8716o != this) {
            return;
        }
        if (h.f8714t.m(this.f8707o, this, h.f(this.f8708p))) {
            h.c(this.f8707o);
        }
    }
}
