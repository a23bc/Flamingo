package L2;

import A2.C0013n;
import E4.G;
import E4.I;
import E4.b0;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import t2.C1480i;
import t2.C1486o;
import t2.C1487p;
import t2.q0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1487p f4112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4115g;
    public z h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f4116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f4117j;

    public e(f fVar, Context context) {
        this.f4117j = fVar;
        this.f4109a = context;
        this.f4110b = w2.t.A(context) ? 1 : 5;
        this.f4111c = new ArrayList();
        this.f4113e = -9223372036854775807L;
        this.h = z.f4236e;
        this.f4116i = f.f4118m;
    }

    public final void a(boolean z6) {
        this.f4114f = false;
        this.f4113e = -9223372036854775807L;
        f fVar = this.f4117j;
        if (fVar.l == 1) {
            fVar.f4128k++;
            fVar.f4121c.a();
            w2.q qVar = fVar.f4126i;
            AbstractC1697a.j(qVar);
            qVar.c(new B2.e(6, fVar));
        }
        if (z6) {
            q qVar2 = fVar.f4120b;
            u uVar = qVar2.f4191b;
            uVar.f4217m = 0L;
            uVar.f4220p = -1L;
            uVar.f4218n = -1L;
            qVar2.f4196g = -9223372036854775807L;
            qVar2.f4194e = -9223372036854775807L;
            qVar2.c(1);
            qVar2.h = -9223372036854775807L;
        }
    }

    public final void b(C1487p c1487p) throws A {
        f fVar = this.f4117j;
        AbstractC1697a.i(fVar.l == 0);
        C1480i c1480i = c1487p.f16714z;
        if (c1480i == null || !c1480i.d()) {
            c1480i = C1480i.h;
        }
        if (c1480i.f16483c != 7 || w2.t.f18881a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        AbstractC1697a.j(looperMyLooper);
        fVar.f4126i = fVar.f4123e.a(looperMyLooper, null);
        try {
            c cVar = fVar.f4122d;
            G g6 = I.f1870p;
            b0 b0Var = b0.f1913s;
            cVar.a();
            Pair pair = fVar.f4127j;
            if (pair == null) {
                throw null;
            }
            int i7 = ((w2.n) pair.second).f18871a;
            throw null;
        } catch (q0 e7) {
            throw new A(e7, c1487p);
        }
    }

    public final void c() {
        if (this.f4112d == null) {
            return;
        }
        new ArrayList().addAll(this.f4111c);
        C1487p c1487p = this.f4112d;
        c1487p.getClass();
        AbstractC1697a.j(null);
        C1480i c1480i = c1487p.f16714z;
        if (c1480i == null || !c1480i.d()) {
            C1480i c1480i2 = C1480i.h;
        }
        int i7 = c1487p.f16707s;
        AbstractC1697a.c("width must be positive, but is: " + i7, i7 > 0);
        int i8 = c1487p.f16708t;
        AbstractC1697a.c("height must be positive, but is: " + i8, i8 > 0);
        throw null;
    }

    public final void d(long j3, long j7) throws A {
        try {
            this.f4117j.a(j3, j7);
        } catch (C0013n e7) {
            C1487p c1487p = this.f4112d;
            if (c1487p == null) {
                c1487p = new C1487p(new C1486o());
            }
            throw new A(e7, c1487p);
        }
    }

    public final void e(Surface surface, w2.n nVar) {
        f fVar = this.f4117j;
        Pair pair = fVar.f4127j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((w2.n) fVar.f4127j.second).equals(nVar)) {
            return;
        }
        fVar.f4127j = Pair.create(surface, nVar);
        int i7 = nVar.f18871a;
    }
}
