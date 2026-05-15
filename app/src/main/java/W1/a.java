package W1;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f7730p;

    public a(f fVar) {
        this.f7730p = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j7 = this.f7729o;
            f fVar = this.f7730p;
            if (j7 != j3) {
                if (j7 >= 0 && j3 >= j7 + ((long) fVar.f7733o.available())) {
                    return -1;
                }
                fVar.c(j3);
                this.f7729o = j3;
            }
            if (i8 > fVar.f7733o.available()) {
                i8 = fVar.f7733o.available();
            }
            int i9 = fVar.read(bArr, i7, i8);
            if (i9 >= 0) {
                this.f7729o += (long) i9;
                return i9;
            }
        } catch (IOException unused) {
        }
        this.f7729o = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
