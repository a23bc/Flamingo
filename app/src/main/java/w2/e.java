package w2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f18839u = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f18840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f18841p = new int[1];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EGLDisplay f18842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EGLContext f18843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EGLSurface f18844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SurfaceTexture f18845t;

    public e(Handler handler) {
        this.f18840o = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f18840o.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f18845t;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
