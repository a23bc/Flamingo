package L2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a */
    public final m f4190a;

    /* JADX INFO: renamed from: b */
    public final u f4191b;

    /* JADX INFO: renamed from: c */
    public boolean f4192c;

    /* JADX INFO: renamed from: f */
    public long f4195f;

    /* JADX INFO: renamed from: i */
    public boolean f4197i;

    /* JADX INFO: renamed from: d */
    public int f4193d = 0;

    /* JADX INFO: renamed from: e */
    public long f4194e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f4196g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f4198j = 1.0f;

    /* JADX INFO: renamed from: k */
    public w2.o f4199k = w2.o.f18873a;

    public q(Context context, m mVar) {
        this.f4190a = mVar;
        this.f4191b = new u(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x021a  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, L2.p r36) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.q.a(long, long, long, long, boolean, L2.p):int");
    }

    public final void b(boolean z6) {
        this.f4197i = z6;
        this.f4199k.getClass();
        this.h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void c(int i7) {
        this.f4193d = Math.min(this.f4193d, i7);
    }

    public final void d() {
        this.f4192c = true;
        this.f4199k.getClass();
        this.f4195f = w2.t.D(SystemClock.elapsedRealtime());
        u uVar = this.f4191b;
        uVar.f4210d = true;
        uVar.f4217m = 0L;
        uVar.f4220p = -1L;
        uVar.f4218n = -1L;
        s sVar = uVar.f4208b;
        if (sVar != null) {
            t tVar = uVar.f4209c;
            tVar.getClass();
            tVar.f4204p.sendEmptyMessage(2);
            Handler handlerJ = w2.t.j(null);
            DisplayManager displayManager = sVar.f4200a;
            displayManager.registerDisplayListener(sVar, handlerJ);
            u.a(sVar.f4201b, displayManager.getDisplay(0));
        }
        uVar.d(false);
    }

    public final void e() {
        this.f4192c = false;
        this.h = -9223372036854775807L;
        u uVar = this.f4191b;
        uVar.f4210d = false;
        s sVar = uVar.f4208b;
        if (sVar != null) {
            sVar.f4200a.unregisterDisplayListener(sVar);
            t tVar = uVar.f4209c;
            tVar.getClass();
            tVar.f4204p.sendEmptyMessage(3);
        }
        uVar.b();
    }

    public final void f(float f7) {
        u uVar = this.f4191b;
        uVar.f4212f = f7;
        h hVar = uVar.f4207a;
        hVar.f4136a.c();
        hVar.f4137b.c();
        hVar.f4138c = false;
        hVar.f4139d = -9223372036854775807L;
        hVar.f4140e = 0;
        uVar.c();
    }
}
