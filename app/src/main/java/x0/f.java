package X0;

import L2.C0247a;
import R0.C0415x;
import V.m;
import Y0.o;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import f0.C0894j0;
import java.util.function.Consumer;
import n1.l;
import w5.AbstractC1767D;
import w5.s0;
import w5.w0;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f8245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f8246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0247a f8247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0415x f8248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B5.d f8249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f8250f;

    public f(o oVar, l lVar, B5.d dVar, C0247a c0247a, C0415x c0415x) {
        this.f8245a = oVar;
        this.f8246b = lVar;
        this.f8247c = c0247a;
        this.f8248d = c0415x;
        this.f8249e = new B5.d(dVar.f885o.h(g.f8251o));
        this.f8250f = new i(lVar.f14519d - lVar.f14517b, new e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(X0.f r11, android.view.ScrollCaptureSession r12, n1.l r13, e5.AbstractC0865c r14) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.f.a(X0.f, android.view.ScrollCaptureSession, n1.l, e5.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC1767D.t(this.f8249e, s0.f19571p, new a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        w0 w0VarT = AbstractC1767D.t(this.f8249e, null, new b(this, scrollCaptureSession, rect, consumer, null), 3);
        w0VarT.t(new B0.b(16, cancellationSignal));
        cancellationSignal.setOnCancelListener(new m(1, w0VarT));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC1959I.t(this.f8246b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f8250f.f8256b = 0.0f;
        C0247a c0247a = this.f8247c;
        ((C0894j0) c0247a.f4105p).setValue(Boolean.TRUE);
        runnable.run();
    }
}
