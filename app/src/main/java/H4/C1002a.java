package h4;

import S5.r;
import S5.u;
import android.os.StatFs;
import java.io.File;

/* JADX INFO: renamed from: h4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1002a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f12704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f12705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f12706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D5.d f12709f;

    public final i a() {
        long jR;
        u uVar = this.f12704a;
        if (uVar == null) {
            throw new IllegalStateException("directory == null");
        }
        double d4 = this.f12706c;
        if (d4 > 0.0d) {
            try {
                File fileE = uVar.e();
                fileE.mkdir();
                StatFs statFs = new StatFs(fileE.getAbsolutePath());
                jR = i6.h.r((long) (d4 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f12707d, this.f12708e);
            } catch (Exception unused) {
                jR = this.f12707d;
            }
        } else {
            jR = 0;
        }
        return new i(jR, this.f12709f, this.f12705b, uVar);
    }
}
