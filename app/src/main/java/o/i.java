package o;

import a.AbstractC0509a;
import q.b1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0509a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14616x;

    public i(j jVar) {
        this.f14613u = 0;
        this.f14616x = jVar;
        this.f14614v = false;
        this.f14615w = 0;
    }

    @Override // G1.O
    public final void a() {
        switch (this.f14613u) {
            case 0:
                int i7 = this.f14615w + 1;
                this.f14615w = i7;
                j jVar = (j) this.f14616x;
                if (i7 == jVar.f14617a.size()) {
                    AbstractC0509a abstractC0509a = jVar.f14620d;
                    if (abstractC0509a != null) {
                        abstractC0509a.a();
                    }
                    this.f14615w = 0;
                    this.f14614v = false;
                    jVar.f14621e = false;
                }
                break;
            default:
                if (!this.f14614v) {
                    ((b1) this.f14616x).f15264a.setVisibility(this.f14615w);
                }
                break;
        }
    }

    @Override // a.AbstractC0509a, G1.O
    public void b() {
        switch (this.f14613u) {
            case 1:
                this.f14614v = true;
                break;
        }
    }

    @Override // a.AbstractC0509a, G1.O
    public final void c() {
        switch (this.f14613u) {
            case 0:
                if (!this.f14614v) {
                    this.f14614v = true;
                    AbstractC0509a abstractC0509a = ((j) this.f14616x).f14620d;
                    if (abstractC0509a != null) {
                        abstractC0509a.c();
                    }
                    break;
                }
                break;
            default:
                ((b1) this.f14616x).f15264a.setVisibility(0);
                break;
        }
    }

    public i(b1 b1Var, int i7) {
        this.f14613u = 1;
        this.f14616x = b1Var;
        this.f14615w = i7;
        this.f14614v = false;
    }
}
