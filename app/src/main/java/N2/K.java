package N2;

/* JADX INFO: loaded from: classes.dex */
public final class K implements s4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4991a;

    public /* synthetic */ K(boolean z6) {
        this.f4991a = z6;
    }

    @Override // s4.g
    public boolean a() {
        return this.f4991a;
    }

    @Override // s4.g
    public boolean b(q4.h hVar) {
        return this.f4991a;
    }

    public synchronized void c() {
        while (!this.f4991a) {
            wait();
        }
    }

    public synchronized void d() {
        this.f4991a = false;
    }

    public synchronized boolean e() {
        if (this.f4991a) {
            return false;
        }
        this.f4991a = true;
        notifyAll();
        return true;
    }
}
