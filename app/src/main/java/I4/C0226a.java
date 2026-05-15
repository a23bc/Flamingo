package I4;

/* JADX INFO: renamed from: I4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0226a {

    /* JADX INFO: renamed from: c */
    public static final C0226a f3498c;

    /* JADX INFO: renamed from: d */
    public static final C0226a f3499d;

    /* JADX INFO: renamed from: a */
    public final boolean f3500a;

    /* JADX INFO: renamed from: b */
    public final RuntimeException f3501b;

    static {
        if (p.f3524r) {
            f3499d = null;
            f3498c = null;
        } else {
            f3499d = new C0226a(false, null);
            f3498c = new C0226a(true, null);
        }
    }

    public C0226a(boolean z6, RuntimeException runtimeException) {
        this.f3500a = z6;
        this.f3501b = runtimeException;
    }
}
