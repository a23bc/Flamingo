package T1;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class l extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.b f6871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f6872e;

    public l(android.support.v4.media.session.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f6871d = bVar;
        this.f6872e = threadPoolExecutor;
    }

    @Override // android.support.v4.media.session.b
    public final void y(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f6872e;
        try {
            this.f6871d.y(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void z(U3.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f6872e;
        try {
            this.f6871d.z(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
