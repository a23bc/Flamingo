package L2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: o */
    public w2.e f4178o;

    /* JADX INFO: renamed from: p */
    public Handler f4179p;

    /* JADX INFO: renamed from: q */
    public Error f4180q;

    /* JADX INFO: renamed from: r */
    public RuntimeException f4181r;

    /* JADX INFO: renamed from: s */
    public o f4182s;

    public final void a(int i7) throws w2.f {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f4178o.getClass();
        w2.e eVar = this.f4178o;
        eVar.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1697a.e("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC1697a.e("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        eVar.f18842q = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, w2.e.f18839u, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z6 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i8 = w2.t.f18881a;
        AbstractC1697a.e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z6);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eVar.f18842q, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1697a.e("eglCreateContext failed", eGLContextEglCreateContext != null);
        eVar.f18843r = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = eVar.f18842q;
        if (i7 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1697a.e("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC1697a.e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        eVar.f18844s = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = eVar.f18841p;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z7 = true;
        }
        if (z7) {
            throw new w2.f(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        eVar.f18845t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(eVar);
        SurfaceTexture surfaceTexture2 = this.f4178o.f18845t;
        surfaceTexture2.getClass();
        this.f4182s = new o(this, surfaceTexture2, i7 != 0);
    }

    public final void b() {
        this.f4178o.getClass();
        w2.e eVar = this.f4178o;
        eVar.f18840o.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f18845t;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.f18841p, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.f18842q;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.f18842q;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.f18844s;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.f18842q, eVar.f18844s);
            }
            EGLContext eGLContext = eVar.f18843r;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.f18842q, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = eVar.f18842q;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.f18842q);
            }
            eVar.f18842q = null;
            eVar.f18843r = null;
            eVar.f18844s = null;
            eVar.f18845t = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e7) {
                    AbstractC1697a.n("Failed to initialize placeholder surface", e7);
                    this.f4180q = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e8) {
                    AbstractC1697a.n("Failed to initialize placeholder surface", e8);
                    this.f4181r = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (w2.f e9) {
                    AbstractC1697a.n("Failed to initialize placeholder surface", e9);
                    this.f4181r = new IllegalStateException(e9);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i7 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC1697a.n("Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
