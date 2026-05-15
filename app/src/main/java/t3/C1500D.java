package t3;

/* JADX INFO: renamed from: t3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1500D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16801e;

    public C1500D(int i7, int i8) {
        this(Integer.MIN_VALUE, i7, i8);
    }

    public final void a() {
        int i7 = this.f16800d;
        this.f16800d = i7 == Integer.MIN_VALUE ? this.f16798b : i7 + this.f16799c;
        this.f16801e = this.f16797a + this.f16800d;
    }

    public final void b() {
        if (this.f16800d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public C1500D(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = "";
        }
        this.f16797a = str;
        this.f16798b = i8;
        this.f16799c = i9;
        this.f16800d = Integer.MIN_VALUE;
        this.f16801e = "";
    }
}
