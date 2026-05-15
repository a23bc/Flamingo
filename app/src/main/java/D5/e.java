package D5;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f1619r;

    static {
        int i7 = k.f1627c;
        int i8 = k.f1628d;
        long j3 = k.f1629e;
        String str = k.f1625a;
        e eVar = new e();
        eVar.f1621q = new c(j3, str, i7, i8);
        f1619r = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // w5.AbstractC1805x
    public final String toString() {
        return "Dispatchers.Default";
    }
}
