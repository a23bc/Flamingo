package L2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Surface {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f4183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f4184s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f4186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4187q;

    public o(n nVar, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f4186p = nVar;
        this.f4185o = z6;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i7;
        try {
            if (!f4184s) {
                int i8 = w2.t.f18881a;
                if (i8 >= 24 && ((i8 >= 26 || !("samsung".equals(w2.t.f18883c) || "XT1650".equals(w2.t.f18884d))) && ((i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i7 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i7 = 0;
                }
                f4183r = i7;
                f4184s = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4183r != 0;
    }

    public static o c(Context context, boolean z6) {
        boolean z7 = false;
        AbstractC1697a.i(!z6 || a(context));
        n nVar = new n("ExoPlayer:PlaceholderSurface");
        int i7 = z6 ? f4183r : 0;
        nVar.start();
        Handler handler = new Handler(nVar.getLooper(), nVar);
        nVar.f4179p = handler;
        nVar.f4178o = new w2.e(handler);
        synchronized (nVar) {
            nVar.f4179p.obtainMessage(1, i7, 0).sendToTarget();
            while (nVar.f4182s == null && nVar.f4181r == null && nVar.f4180q == null) {
                try {
                    nVar.wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = nVar.f4181r;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = nVar.f4180q;
        if (error != null) {
            throw error;
        }
        o oVar = nVar.f4182s;
        oVar.getClass();
        return oVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f4186p) {
            try {
                if (!this.f4187q) {
                    n nVar = this.f4186p;
                    nVar.f4179p.getClass();
                    nVar.f4179p.sendEmptyMessage(2);
                    this.f4187q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
