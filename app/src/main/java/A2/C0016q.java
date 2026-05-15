package A2;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: A2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0016q implements D4.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f409o;

    @Override // D4.j
    public final Object get() {
        switch (this.f409o) {
            case 0:
                return new C0011l();
            case 1:
                byte[] bArr = new byte[12];
                B2.k.f771i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                throw new IllegalStateException();
            case 3:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    objInvoke.getClass();
                    return (t2.r0) objInvoke;
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof I4.z) {
                    return (I4.z) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new I4.D((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new I4.A(executorServiceNewSingleThreadExecutor);
        }
    }
}
