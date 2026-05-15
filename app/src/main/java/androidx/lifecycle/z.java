package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ A f9764o;

    public z(A a4) {
        this.f9764o = a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f9764o.f9677a) {
            obj = this.f9764o.f9680d;
            this.f9764o.f9680d = A.h;
        }
        this.f9764o.a(obj);
    }
}
