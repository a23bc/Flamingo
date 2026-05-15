package h4;

import java.io.Closeable;
import u5.C1543e;

/* JADX INFO: renamed from: h4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1004c implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1003b f12718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f12720q;

    public C1004c(f fVar, C1003b c1003b) {
        this.f12720q = fVar;
        this.f12718o = c1003b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12719p) {
            return;
        }
        this.f12719p = true;
        f fVar = this.f12720q;
        synchronized (fVar) {
            C1003b c1003b = this.f12718o;
            int i7 = c1003b.h - 1;
            c1003b.h = i7;
            if (i7 == 0 && c1003b.f12715f) {
                C1543e c1543e = f.f12723E;
                fVar.q(c1003b);
            }
        }
    }
}
