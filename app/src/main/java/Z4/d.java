package Z4;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f8806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8808q;

    public d(e eVar, int i7, int i8) {
        this.f8806o = eVar;
        this.f8807p = i7;
        android.support.v4.media.session.b.g(i7, i8, eVar.b());
        this.f8808q = i8 - i7;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        return this.f8808q;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f8808q;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(Z1.l.p("index: ", i7, i8, ", size: "));
        }
        return this.f8806o.get(this.f8807p + i7);
    }
}
