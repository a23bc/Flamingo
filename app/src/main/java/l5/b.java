package L5;

import F5.o;
import J5.k;
import J5.n;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f4319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f4322u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, o oVar) {
        super(nVar);
        AbstractC1209k.f(oVar, "url");
        this.f4322u = nVar;
        this.f4319r = oVar;
        this.f4320s = -1L;
        this.f4321t = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4317p) {
            return;
        }
        if (this.f4321t) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!G5.b.f(this)) {
                ((k) this.f4322u.f3809c).l();
                b();
            }
        }
        this.f4317p = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r10.f4321t == false) goto L30;
     */
    @Override // L5.a, S5.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(long r11, S5.C0427g r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.b.k(long, S5.g):long");
    }
}
