package g4;

import F5.x;
import S5.r;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends x {

    /* JADX INFO: renamed from: o */
    public final M3.a f12531o;

    /* JADX INFO: renamed from: p */
    public boolean f12532p;

    /* JADX INFO: renamed from: q */
    public final S5.i f12533q;

    public o(S5.i iVar, M3.a aVar) {
        this.f12531o = aVar;
        this.f12533q = iVar;
    }

    @Override // F5.x, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f12532p = true;
        S5.i iVar = this.f12533q;
        if (iVar != null) {
            s4.e.a(iVar);
        }
    }

    @Override // F5.x
    public final M3.a d() {
        return this.f12531o;
    }

    @Override // F5.x
    public final synchronized S5.i g() {
        S5.i iVar;
        try {
            if (this.f12532p) {
                throw new IllegalStateException("closed");
            }
            iVar = this.f12533q;
            if (iVar == null) {
                r rVar = S5.l.f6793a;
                AbstractC1209k.c(null);
                rVar.i(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return iVar;
    }
}
