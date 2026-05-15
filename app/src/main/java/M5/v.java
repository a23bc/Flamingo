package M5;

import S5.C0425e;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class v extends C0425e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4930m;

    public v(w wVar) {
        this.f4930m = wVar;
    }

    @Override // S5.C0425e
    public final void j() {
        this.f4930m.e(9);
        o oVar = this.f4930m.f4932b;
        synchronized (oVar) {
            long j3 = oVar.f4879B;
            long j7 = oVar.f4878A;
            if (j3 < j7) {
                return;
            }
            oVar.f4878A = j7 + 1;
            oVar.f4880C = System.nanoTime() + ((long) 1000000000);
            oVar.f4898v.c(new I5.b(Z1.l.t(new StringBuilder(), oVar.f4893q, " ping"), oVar, 2), 0L);
        }
    }

    public final void k() throws SocketTimeoutException {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
