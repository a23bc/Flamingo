package H;

/* JADX INFO: renamed from: H.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0167i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f2882c;

    public C0167i(int i7, int i8, r rVar) {
        this.f2880a = i7;
        this.f2881b = i8;
        this.f2882c = rVar;
        if (i7 < 0) {
            C.b.a("startIndex should be >= 0");
        }
        if (i8 > 0) {
            return;
        }
        C.b.a("size should be > 0");
    }
}
