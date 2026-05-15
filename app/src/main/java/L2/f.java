package L2;

import A2.L;
import H2.C0196m;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.C0535h;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.s0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: m */
    public static final A3.d f4118m = new A3.d(1);

    /* JADX INFO: renamed from: a */
    public final e f4119a;

    /* JADX INFO: renamed from: b */
    public final q f4120b;

    /* JADX INFO: renamed from: c */
    public final v f4121c;

    /* JADX INFO: renamed from: d */
    public final c f4122d;

    /* JADX INFO: renamed from: e */
    public final w2.o f4123e;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArraySet f4124f;

    /* JADX INFO: renamed from: g */
    public C1487p f4125g;
    public L h;

    /* JADX INFO: renamed from: i */
    public w2.q f4126i;

    /* JADX INFO: renamed from: j */
    public Pair f4127j;

    /* JADX INFO: renamed from: k */
    public int f4128k;
    public int l;

    public f(C0196m c0196m) {
        e eVar = new e(this, (Context) c0196m.f3205c);
        this.f4119a = eVar;
        w2.o oVar = (w2.o) c0196m.f3209g;
        this.f4123e = oVar;
        q qVar = (q) c0196m.f3206d;
        this.f4120b = qVar;
        qVar.f4199k = oVar;
        this.f4121c = new v(new C0247a(0, this), qVar);
        c cVar = (c) c0196m.f3208f;
        AbstractC1697a.j(cVar);
        this.f4122d = cVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f4124f = copyOnWriteArraySet;
        this.l = 0;
        copyOnWriteArraySet.add(eVar);
    }

    public final void a(long j3, long j7) {
        v vVar;
        C0535h c0535h;
        int i7;
        if (this.f4128k != 0 || (i7 = (c0535h = (vVar = this.f4121c).f4227f).f9480c) == 0) {
            return;
        }
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long j8 = ((long[]) c0535h.f9482e)[c0535h.f9479b];
        Long l = (Long) vVar.f4226e.p(j8);
        q qVar = vVar.f4223b;
        if (l != null && l.longValue() != vVar.f4229i) {
            vVar.f4229i = l.longValue();
            qVar.c(2);
        }
        int iA = vVar.f4223b.a(j8, j3, j7, vVar.f4229i, false, vVar.f4224c);
        f fVar = (f) vVar.f4222a.f4105p;
        if (iA != 0 && iA != 1) {
            if (iA != 2 && iA != 3 && iA != 4) {
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
                return;
            }
            vVar.f4230j = j8;
            c0535h.m0();
            for (e eVar : fVar.f4124f) {
                eVar.f4116i.execute(new d(eVar, eVar.h, 1));
            }
            AbstractC1697a.j(null);
            throw null;
        }
        vVar.f4230j = j8;
        s0 s0Var = (s0) vVar.f4225d.p(c0535h.m0());
        if (s0Var != null && !s0Var.equals(s0.f16725e) && !s0Var.equals(vVar.h)) {
            vVar.h = s0Var;
            C1486o c1486o = new C1486o();
            c1486o.f16632r = s0Var.f16729a;
            c1486o.f16633s = s0Var.f16730b;
            c1486o.l = M.j("video/raw");
            fVar.f4125g = new C1487p(c1486o);
            for (e eVar2 : fVar.f4124f) {
                eVar2.f4116i.execute(new d(eVar2, eVar2.h, s0Var));
            }
        }
        boolean z6 = qVar.f4193d != 3;
        qVar.f4193d = 3;
        qVar.f4199k.getClass();
        qVar.f4195f = w2.t.D(SystemClock.elapsedRealtime());
        if (z6 && fVar.f4127j != null) {
            for (e eVar3 : fVar.f4124f) {
                eVar3.f4116i.execute(new d(eVar3, eVar3.h, 2));
            }
        }
        if (fVar.h != null) {
            if (fVar.f4125g == null) {
                new C1487p(new C1486o());
            }
            L l7 = fVar.h;
            fVar.f4123e.getClass();
            System.nanoTime();
            l7.d();
        }
        AbstractC1697a.j(null);
        throw null;
    }
}
