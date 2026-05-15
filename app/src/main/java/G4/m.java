package g4;

import F5.x;
import S5.u;
import S5.y;

/* JADX INFO: loaded from: classes.dex */
public final class m extends x {

    /* JADX INFO: renamed from: o */
    public final u f12524o;

    /* JADX INFO: renamed from: p */
    public final S5.l f12525p;

    /* JADX INFO: renamed from: q */
    public final String f12526q;

    /* JADX INFO: renamed from: r */
    public final h4.h f12527r;

    /* JADX INFO: renamed from: s */
    public boolean f12528s;

    /* JADX INFO: renamed from: t */
    public y f12529t;

    public m(u uVar, S5.l lVar, String str, h4.h hVar) {
        this.f12524o = uVar;
        this.f12525p = lVar;
        this.f12526q = str;
        this.f12527r = hVar;
    }

    @Override // F5.x, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f12528s = true;
            y yVar = this.f12529t;
            if (yVar != null) {
                s4.e.a(yVar);
            }
            h4.h hVar = this.f12527r;
            if (hVar != null) {
                s4.e.a(hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F5.x
    public final M3.a d() {
        return null;
    }

    @Override // F5.x
    public final synchronized S5.i g() {
        if (this.f12528s) {
            throw new IllegalStateException("closed");
        }
        y yVar = this.f12529t;
        if (yVar != null) {
            return yVar;
        }
        y yVarE = M3.a.E(this.f12525p.i(this.f12524o));
        this.f12529t = yVarE;
        return yVarE;
    }
}
