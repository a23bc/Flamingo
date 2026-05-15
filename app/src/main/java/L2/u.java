package L2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f4208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f4209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f4211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4213g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4216k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4221q;

    public u(Context context) {
        DisplayManager displayManager;
        h hVar = new h();
        hVar.f4136a = new g();
        hVar.f4137b = new g();
        hVar.f4139d = -9223372036854775807L;
        this.f4207a = hVar;
        s sVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new s(this, displayManager);
        this.f4208b = sVar;
        this.f4209c = sVar != null ? t.f4202s : null;
        this.f4216k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f4212f = -1.0f;
        this.f4214i = 1.0f;
        this.f4215j = 0;
    }

    public static void a(u uVar, Display display) {
        uVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            uVar.f4216k = refreshRate;
            uVar.l = (refreshRate * 80) / 100;
        } else {
            AbstractC1697a.w("Unable to query display refresh rate");
            uVar.f4216k = -9223372036854775807L;
            uVar.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (w2.t.f18881a < 30 || (surface = this.f4211e) == null || this.f4215j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        r.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = w2.t.f18881a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f4211e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            L2.h r0 = r9.f4207a
            L2.g r2 = r0.f4136a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            L2.g r2 = r0.f4136a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            L2.g r2 = r0.f4136a
            long r4 = r2.f4133e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f4134f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f4212f
        L3b:
            float r4 = r9.f4213g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            goto L8d
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            L2.g r1 = r0.f4136a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            L2.g r1 = r0.f4136a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            L2.g r0 = r0.f4136a
            long r0 = r0.f4134f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f4213g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f4140e
            if (r0 < r1) goto L8d
        L87:
            r9.f4213g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.u.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = w2.t.f18881a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f4211e
            if (r0 == 0) goto L30
            int r1 = r3.f4215j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f4210d
            if (r1 == 0) goto L21
            float r1 = r3.f4213g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f4214i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.h = r1
            L2.r.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.u.d(boolean):void");
    }
}
