package f0;

/* JADX INFO: renamed from: f0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0901n extends IllegalStateException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11848o;

    public C0901n(String str) {
        this.f11848o = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f11848o;
    }
}
