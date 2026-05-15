package I3;

import V.o;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class e implements H3.b {

    /* JADX INFO: renamed from: o */
    public final Context f3480o;

    /* JADX INFO: renamed from: p */
    public final String f3481p;

    /* JADX INFO: renamed from: q */
    public final o f3482q;

    /* JADX INFO: renamed from: r */
    public final boolean f3483r;

    /* JADX INFO: renamed from: s */
    public final Object f3484s = new Object();

    /* JADX INFO: renamed from: t */
    public d f3485t;

    /* JADX INFO: renamed from: u */
    public boolean f3486u;

    public e(Context context, String str, o oVar, boolean z6) {
        this.f3480o = context;
        this.f3481p = str;
        this.f3482q = oVar;
        this.f3483r = z6;
    }

    public final d b() {
        d dVar;
        synchronized (this.f3484s) {
            try {
                if (this.f3485t == null) {
                    b[] bVarArr = new b[1];
                    if (this.f3481p == null || !this.f3483r) {
                        this.f3485t = new d(this.f3480o, this.f3481p, bVarArr, this.f3482q);
                    } else {
                        this.f3485t = new d(this.f3480o, new File(this.f3480o.getNoBackupFilesDir(), this.f3481p).getAbsolutePath(), bVarArr, this.f3482q);
                    }
                    this.f3485t.setWriteAheadLoggingEnabled(this.f3486u);
                }
                dVar = this.f3485t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    @Override // H3.b
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        synchronized (this.f3484s) {
            try {
                d dVar = this.f3485t;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z6);
                }
                this.f3486u = z6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H3.b
    public final b x() {
        return b().c();
    }
}
