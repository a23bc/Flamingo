package F;

import H.S;
import f0.C0888g0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0888g0 f2151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0888g0 f2152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S f2155f;

    public v(int i7, int i8, int i9) {
        this.f2150a = i9;
        switch (i9) {
            case 1:
                this.f2151b = new C0888g0(i7);
                this.f2152c = new C0888g0(i8);
                this.f2155f = new S(i7, 90, 200);
                break;
            default:
                this.f2151b = new C0888g0(i7);
                this.f2152c = new C0888g0(i8);
                this.f2155f = new S(i7, 30, 100);
                break;
        }
    }

    public final void a(int i7, int i8) {
        switch (this.f2150a) {
            case 0:
                if (i7 < 0.0f) {
                    C.b.a("Index should be non-negative (" + i7 + ')');
                }
                this.f2151b.j(i7);
                this.f2155f.b(i7);
                this.f2152c.j(i8);
                break;
            default:
                if (i7 < 0.0f) {
                    C.b.a("Index should be non-negative");
                }
                this.f2151b.j(i7);
                this.f2155f.b(i7);
                this.f2152c.j(i8);
                break;
        }
    }
}
