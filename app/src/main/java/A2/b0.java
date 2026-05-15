package A2;

import H2.C0186c;
import H2.InterfaceC0207y;
import android.util.Pair;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H2.W[] f227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0 f230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f231g;
    public final boolean[] h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0006g[] f232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J2.s f233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n0 f234k;
    public b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public H2.g0 f235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public J2.t f236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f237o;

    public b0(AbstractC0006g[] abstractC0006gArr, long j3, J2.s sVar, K2.e eVar, n0 n0Var, c0 c0Var, J2.t tVar) {
        this.f232i = abstractC0006gArr;
        this.f237o = j3;
        this.f233j = sVar;
        this.f234k = n0Var;
        H2.A a4 = c0Var.f238a;
        this.f226b = a4.f2973a;
        this.f230f = c0Var;
        this.f235m = H2.g0.f3185d;
        this.f236n = tVar;
        this.f227c = new H2.W[abstractC0006gArr.length];
        this.h = new boolean[abstractC0006gArr.length];
        n0Var.getClass();
        int i7 = t0.f443n;
        Pair pair = (Pair) a4.f2973a;
        Object obj = pair.first;
        H2.A a7 = a4.a(pair.second);
        m0 m0Var = (m0) n0Var.f379d.get(obj);
        m0Var.getClass();
        n0Var.f382g.add(m0Var);
        l0 l0Var = (l0) n0Var.f381f.get(m0Var);
        if (l0Var != null) {
            l0Var.f349a.e(l0Var.f350b);
        }
        m0Var.f360c.add(a7);
        InterfaceC0207y interfaceC0207yB = m0Var.f358a.b(a7, eVar, c0Var.f239b);
        n0Var.f378c.put(interfaceC0207yB, m0Var);
        n0Var.c();
        long j7 = c0Var.f241d;
        this.f225a = j7 != -9223372036854775807L ? new C0186c(interfaceC0207yB, true, 0L, j7) : interfaceC0207yB;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [H2.y, java.lang.Object] */
    public final long a(J2.t tVar, long j3, boolean z6, boolean[] zArr) {
        AbstractC0006g[] abstractC0006gArr;
        H2.W[] wArr;
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= tVar.f3733a) {
                break;
            }
            if (z6 || !tVar.a(this.f236n, i7)) {
                z7 = false;
            }
            this.h[i7] = z7;
            i7++;
        }
        int i8 = 0;
        while (true) {
            abstractC0006gArr = this.f232i;
            int length = abstractC0006gArr.length;
            wArr = this.f227c;
            if (i8 >= length) {
                break;
            }
            if (abstractC0006gArr[i8].f281p == -2) {
                wArr[i8] = null;
            }
            i8++;
        }
        b();
        this.f236n = tVar;
        c();
        long jN = this.f225a.n(tVar.f3735c, this.h, this.f227c, zArr, j3);
        for (int i9 = 0; i9 < abstractC0006gArr.length; i9++) {
            if (abstractC0006gArr[i9].f281p == -2 && this.f236n.b(i9)) {
                wArr[i9] = new x0(13);
            }
        }
        this.f229e = false;
        for (int i10 = 0; i10 < wArr.length; i10++) {
            if (wArr[i10] != null) {
                AbstractC1697a.i(tVar.b(i10));
                if (abstractC0006gArr[i10].f281p != -2) {
                    this.f229e = true;
                }
            } else {
                AbstractC1697a.i(tVar.f3735c[i10] == null);
            }
        }
        return jN;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            J2.t tVar = this.f236n;
            if (i7 >= tVar.f3733a) {
                return;
            }
            boolean zB = tVar.b(i7);
            J2.q qVar = this.f236n.f3735c[i7];
            if (zB && qVar != null) {
                qVar.e();
            }
            i7++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            J2.t tVar = this.f236n;
            if (i7 >= tVar.f3733a) {
                return;
            }
            boolean zB = tVar.b(i7);
            J2.q qVar = this.f236n.f3735c[i7];
            if (zB && qVar != null) {
                qVar.c();
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [H2.X, java.lang.Object] */
    public final long d() {
        if (!this.f228d) {
            return this.f230f.f239b;
        }
        long jI = this.f229e ? this.f225a.i() : Long.MIN_VALUE;
        return jI == Long.MIN_VALUE ? this.f230f.f242e : jI;
    }

    public final long e() {
        return this.f230f.f239b + this.f237o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [H2.X, java.lang.Object] */
    public final boolean f() {
        if (this.f228d) {
            return !this.f229e || this.f225a.i() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [H2.y, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g() {
        b();
        ?? r02 = this.f225a;
        try {
            boolean z6 = r02 instanceof C0186c;
            n0 n0Var = this.f234k;
            if (z6) {
                n0Var.f(((C0186c) r02).f3137o);
            } else {
                n0Var.f(r02);
            }
        } catch (RuntimeException e7) {
            AbstractC1697a.n("Period release failed.", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final J2.t h(float r34, t2.h0 r35) {
        /*
            Method dump skipped, instruction units count: 2227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b0.h(float, t2.h0):J2.t");
    }

    public final void i() {
        Object obj = this.f225a;
        if (obj instanceof C0186c) {
            long j3 = this.f230f.f241d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            C0186c c0186c = (C0186c) obj;
            c0186c.f3141s = 0L;
            c0186c.f3142t = j3;
        }
    }
}
