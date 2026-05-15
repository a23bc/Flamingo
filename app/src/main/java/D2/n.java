package D2;

import A2.d0;
import A2.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H2.A f1528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1529c;

    public n(CopyOnWriteArrayList copyOnWriteArrayList, int i7, H2.A a4) {
        this.f1529c = copyOnWriteArrayList;
        this.f1527a = i7;
        this.f1528b = a4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D2.o, java.lang.Object] */
    public final void a() {
        for (m mVar : this.f1529c) {
            w2.t.G(mVar.f1525a, new l(this, mVar.f1526b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D2.o, java.lang.Object] */
    public final void b() {
        for (m mVar : this.f1529c) {
            w2.t.G(mVar.f1525a, new l(this, mVar.f1526b, 1));
        }
    }

    public final void c(int i7) {
        for (m mVar : this.f1529c) {
            w2.t.G(mVar.f1525a, new k0(this, mVar.f1526b, i7, 2));
        }
    }

    public final void d(Exception exc) {
        for (m mVar : this.f1529c) {
            w2.t.G(mVar.f1525a, new d0(this, mVar.f1526b, exc, 3));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D2.o, java.lang.Object] */
    public final void e() {
        for (m mVar : this.f1529c) {
            w2.t.G(mVar.f1525a, new l(this, mVar.f1526b, 0));
        }
    }
}
