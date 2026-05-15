package k0;

/* JADX INFO: renamed from: k0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1137n extends AbstractC1136m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14000r;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14000r) {
            case 0:
                int i7 = this.f13999q;
                this.f13999q = i7 + 2;
                Object[] objArr = this.f13997o;
                return new C1124a(objArr[i7], 0, objArr[i7 + 1]);
            case 1:
                int i8 = this.f13999q;
                this.f13999q = i8 + 2;
                return this.f13997o[i8];
            default:
                int i9 = this.f13999q;
                this.f13999q = i9 + 2;
                return this.f13997o[i9 + 1];
        }
    }
}
