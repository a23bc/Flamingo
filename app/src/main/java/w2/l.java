package w2;

import C2.C0039k;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import y0.AbstractC1959I;
import y0.AbstractC1975h;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e */
    public static l f18859e;

    /* JADX INFO: renamed from: a */
    public int f18860a;

    /* JADX INFO: renamed from: b */
    public final Object f18861b;

    /* JADX INFO: renamed from: c */
    public Object f18862c;

    /* JADX INFO: renamed from: d */
    public Object f18863d;

    public l(Paint paint) {
        this.f18861b = paint;
        this.f18860a = 3;
    }

    public static void a(l lVar, int i7) {
        synchronized (lVar.f18863d) {
            try {
                if (lVar.f18860a == i7) {
                    return;
                }
                lVar.f18860a = i7;
                for (WeakReference weakReference : (CopyOnWriteArrayList) lVar.f18862c) {
                    K2.f fVar = (K2.f) weakReference.get();
                    if (fVar != null) {
                        fVar.a(i7);
                    } else {
                        ((CopyOnWriteArrayList) lVar.f18862c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized l b(Context context) {
        try {
            if (f18859e == null) {
                f18859e = new l(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18859e;
    }

    public int c() {
        int i7;
        synchronized (this.f18863d) {
            i7 = this.f18860a;
        }
        return i7;
    }

    public int d() {
        Paint.Cap strokeCap = ((Paint) this.f18861b).getStrokeCap();
        int i7 = strokeCap == null ? -1 : AbstractC1975h.f20239a[strokeCap.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int e() {
        Paint.Join strokeJoin = ((Paint) this.f18861b).getStrokeJoin();
        int i7 = strokeJoin == null ? -1 : AbstractC1975h.f20240b[strokeJoin.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void f(float f7) {
        ((Paint) this.f18861b).setAlpha((int) Math.rint(f7 * 255.0f));
    }

    public void g(int i7) {
        if (this.f18860a == i7) {
            return;
        }
        this.f18860a = i7;
        int i8 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f18861b;
        if (i8 >= 29) {
            paint.setBlendMode(AbstractC1959I.s(i7));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC1959I.B(i7)));
        }
    }

    public void h(long j3) {
        ((Paint) this.f18861b).setColor(AbstractC1959I.x(j3));
    }

    public void i(C1980m c1980m) {
        this.f18863d = c1980m;
        ((Paint) this.f18861b).setColorFilter(c1980m != null ? c1980m.f20246a : null);
    }

    public void j(int i7) {
        ((Paint) this.f18861b).setFilterBitmap(!(i7 == 0));
    }

    public void k(Shader shader) {
        this.f18862c = shader;
        ((Paint) this.f18861b).setShader(shader);
    }

    public void l(int i7) {
        ((Paint) this.f18861b).setStrokeCap(i7 == 2 ? Paint.Cap.SQUARE : i7 == 1 ? Paint.Cap.ROUND : i7 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void m(int i7) {
        ((Paint) this.f18861b).setStrokeJoin(i7 == 0 ? Paint.Join.MITER : i7 == 2 ? Paint.Join.BEVEL : i7 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void n(float f7) {
        ((Paint) this.f18861b).setStrokeWidth(f7);
    }

    public void o(int i7) {
        ((Paint) this.f18861b).setStyle(i7 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public l(Context context) {
        this.f18861b = new Handler(Looper.getMainLooper());
        this.f18862c = new CopyOnWriteArrayList();
        this.f18863d = new Object();
        this.f18860a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C0039k(4, this), intentFilter);
    }
}
