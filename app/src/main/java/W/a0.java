package w;

import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements InterfaceC1675h {

    /* JADX INFO: renamed from: a */
    public final q0 f18608a;

    /* JADX INFO: renamed from: b */
    public final o0 f18609b;

    /* JADX INFO: renamed from: c */
    public final Object f18610c;

    /* JADX INFO: renamed from: d */
    public final Object f18611d;

    /* JADX INFO: renamed from: e */
    public final r f18612e;

    /* JADX INFO: renamed from: f */
    public final r f18613f;

    /* JADX INFO: renamed from: g */
    public final r f18614g;
    public long h;

    /* JADX INFO: renamed from: i */
    public r f18615i;

    public a0(InterfaceC1679l interfaceC1679l, o0 o0Var, Object obj, Object obj2, r rVar) {
        this.f18608a = interfaceC1679l.d(o0Var);
        this.f18609b = o0Var;
        this.f18610c = obj2;
        this.f18611d = obj;
        this.f18612e = (r) o0Var.f18722a.b(obj);
        InterfaceC1182c interfaceC1182c = o0Var.f18722a;
        this.f18613f = (r) interfaceC1182c.b(obj2);
        this.f18614g = rVar != null ? AbstractC1671d.g(rVar) : ((r) interfaceC1182c.b(obj)).c();
        this.h = -1L;
    }

    @Override // w.InterfaceC1675h
    public final boolean a() {
        return this.f18608a.a();
    }

    @Override // w.InterfaceC1675h
    public final Object b(long j3) {
        if (AbstractC1676i.a(this, j3)) {
            return this.f18610c;
        }
        r rVarO = this.f18608a.o(j3, this.f18612e, this.f18613f, this.f18614g);
        int iB = rVarO.b();
        for (int i7 = 0; i7 < iB; i7++) {
            if (Float.isNaN(rVarO.a(i7))) {
                AbstractC1666O.b("AnimationVector cannot contain a NaN. " + rVarO + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return this.f18609b.f18723b.b(rVarO);
    }

    @Override // w.InterfaceC1675h
    public final long c() {
        if (this.h < 0) {
            this.h = this.f18608a.e(this.f18612e, this.f18613f, this.f18614g);
        }
        return this.h;
    }

    @Override // w.InterfaceC1675h
    public final o0 d() {
        return this.f18609b;
    }

    @Override // w.InterfaceC1675h
    public final Object e() {
        return this.f18610c;
    }

    @Override // w.InterfaceC1675h
    public final r f(long j3) {
        if (!AbstractC1676i.a(this, j3)) {
            return this.f18608a.w(j3, this.f18612e, this.f18613f, this.f18614g);
        }
        r rVar = this.f18615i;
        if (rVar != null) {
            return rVar;
        }
        r rVarF = this.f18608a.f(this.f18612e, this.f18613f, this.f18614g);
        this.f18615i = rVarF;
        return rVarF;
    }

    @Override // w.InterfaceC1675h
    public final /* synthetic */ boolean g(long j3) {
        return AbstractC1676i.a(this, j3);
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f18611d + " -> " + this.f18610c + ",initial velocity: " + this.f18614g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f18608a;
    }
}
