package H;

import f0.C0879c;
import f0.C0894j0;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f2819b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f2822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2823f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2820c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0894j0 f2824g = C0879c.t(null);

    public T(Object obj, U u7) {
        this.f2818a = obj;
        this.f2819b = u7;
    }

    public final T a() {
        if (this.f2823f) {
            C.b.c("Pin should not be called on an already disposed item ");
        }
        if (this.f2821d == 0) {
            this.f2819b.f2825o.add(this);
            T t7 = (T) this.f2824g.getValue();
            if (t7 != null) {
                t7.a();
            } else {
                t7 = null;
            }
            this.f2822e = t7;
        }
        this.f2821d++;
        return this;
    }

    public final void b() {
        if (this.f2823f) {
            return;
        }
        if (this.f2821d <= 0) {
            C.b.c("Release should only be called once");
        }
        int i7 = this.f2821d - 1;
        this.f2821d = i7;
        if (i7 == 0) {
            this.f2819b.f2825o.remove(this);
            T t7 = this.f2822e;
            if (t7 != null) {
                t7.b();
            }
            this.f2822e = null;
        }
    }
}
