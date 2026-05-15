package h4;

import S5.C;
import S5.C0427g;
import S5.G;
import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class g implements C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C f12740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B0.b f12741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12742q;

    public g(C c7, B0.b bVar) {
        AbstractC1209k.f(c7, "delegate");
        this.f12740o = c7;
        this.f12741p = bVar;
    }

    @Override // S5.C
    public final G a() {
        return this.f12740o.a();
    }

    public final void b() {
        this.f12740o.close();
    }

    public final void c() {
        this.f12740o.flush();
    }

    @Override // S5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        try {
            b();
        } catch (IOException e7) {
            this.f12742q = true;
            this.f12741p.b(e7);
        }
    }

    @Override // S5.C
    public final void e(long j3, C0427g c0427g) throws Exception {
        if (this.f12742q) {
            c0427g.w(j3);
            return;
        }
        try {
            AbstractC1209k.f(c0427g, "source");
            this.f12740o.e(j3, c0427g);
        } catch (IOException e7) {
            this.f12742q = true;
            this.f12741p.b(e7);
        }
    }

    @Override // S5.C, java.io.Flushable
    public final void flush() throws Exception {
        try {
            c();
        } catch (IOException e7) {
            this.f12742q = true;
            this.f12741p.b(e7);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f12740o + ')';
    }
}
