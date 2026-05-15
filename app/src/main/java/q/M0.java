package q;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15205g;
    public boolean h;

    public final void a(int i7, int i8) {
        this.f15201c = i7;
        this.f15202d = i8;
        this.h = true;
        if (this.f15205g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f15199a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f15200b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f15199a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f15200b = i8;
        }
    }
}
