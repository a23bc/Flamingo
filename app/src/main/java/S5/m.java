package S5;

import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E f6794o;

    public m(E e7) {
        AbstractC1209k.f(e7, "delegate");
        this.f6794o = e7;
    }

    @Override // S5.E
    public final G a() {
        return this.f6794o.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6794o.close();
    }

    @Override // S5.E
    public long k(long j3, C0427g c0427g) {
        AbstractC1209k.f(c0427g, "sink");
        return this.f6794o.k(j3, c0427g);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f6794o + ')';
    }
}
