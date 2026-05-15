package Q3;

import X3.i;
import X3.p;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e implements S3.b, O3.a, p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f6120x = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f6121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f6124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final S3.c f6125s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PowerManager.WakeLock f6128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6129w = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6127u = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f6126t = new Object();

    static {
        N3.p.i("DelayMetCommandHandler");
    }

    public e(Context context, int i7, String str, h hVar) {
        this.f6121o = context;
        this.f6122p = i7;
        this.f6124r = hVar;
        this.f6123q = str;
        this.f6125s = new S3.c(context, hVar.f6138p, this);
    }

    @Override // O3.a
    public final void a(String str, boolean z6) {
        N3.p.d().b(new Throwable[0]);
        b();
        int i7 = this.f6122p;
        h hVar = this.f6124r;
        Context context = this.f6121o;
        if (z6) {
            hVar.f(new g(hVar, b.c(context, this.f6123q), i7, 0));
        }
        if (this.f6129w) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.f(new g(hVar, intent, i7, 0));
        }
    }

    public final void b() {
        synchronized (this.f6126t) {
            try {
                this.f6125s.d();
                this.f6124r.f6139q.b(this.f6123q);
                PowerManager.WakeLock wakeLock = this.f6128v;
                if (wakeLock != null && wakeLock.isHeld()) {
                    N3.p pVarD = N3.p.d();
                    Objects.toString(this.f6128v);
                    pVarD.b(new Throwable[0]);
                    this.f6128v.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S3.b
    public final void c(ArrayList arrayList) {
        f();
    }

    @Override // S3.b
    public final void d(List list) {
        if (list.contains(this.f6123q)) {
            synchronized (this.f6126t) {
                try {
                    if (this.f6127u == 0) {
                        this.f6127u = 1;
                        N3.p.d().b(new Throwable[0]);
                        if (this.f6124r.f6140r.h(this.f6123q, null)) {
                            this.f6124r.f6139q.a(this.f6123q, this);
                        } else {
                            b();
                        }
                    } else {
                        N3.p.d().b(new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        StringBuilder sb = new StringBuilder();
        String str = this.f6123q;
        sb.append(str);
        sb.append(" (");
        sb.append(this.f6122p);
        sb.append(")");
        this.f6128v = i.a(this.f6121o, sb.toString());
        N3.p pVarD = N3.p.d();
        Objects.toString(this.f6128v);
        pVarD.b(new Throwable[0]);
        this.f6128v.acquire();
        W3.i iVarJ = this.f6124r.f6141s.f5642e.n().j(str);
        if (iVarJ == null) {
            f();
            return;
        }
        boolean zB = iVarJ.b();
        this.f6129w = zB;
        if (zB) {
            this.f6125s.c(Collections.singletonList(iVarJ));
        } else {
            N3.p.d().b(new Throwable[0]);
            d(Collections.singletonList(str));
        }
    }

    public final void f() {
        synchronized (this.f6126t) {
            try {
                if (this.f6127u < 2) {
                    this.f6127u = 2;
                    N3.p.d().b(new Throwable[0]);
                    Context context = this.f6121o;
                    String str = this.f6123q;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str);
                    h hVar = this.f6124r;
                    hVar.f(new g(hVar, intent, this.f6122p, 0));
                    if (this.f6124r.f6140r.e(this.f6123q)) {
                        N3.p.d().b(new Throwable[0]);
                        Intent intentC = b.c(this.f6121o, this.f6123q);
                        h hVar2 = this.f6124r;
                        hVar2.f(new g(hVar2, intentC, this.f6122p, 0));
                    } else {
                        N3.p.d().b(new Throwable[0]);
                    }
                } else {
                    N3.p.d().b(new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
