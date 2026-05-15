package w;

import f0.Z0;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Z0 {

    /* JADX INFO: renamed from: o */
    public final f0 f18624o;

    /* JADX INFO: renamed from: p */
    public AbstractC1210l f18625p;

    /* JADX INFO: renamed from: q */
    public AbstractC1210l f18626q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ c0 f18627r;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(c0 c0Var, f0 f0Var, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) {
        this.f18627r = c0Var;
        this.f18624o = f0Var;
        this.f18625p = (AbstractC1210l) interfaceC1182c;
        this.f18626q = (AbstractC1210l) interfaceC1182c2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l5.c, m5.l] */
    public final void b(d0 d0Var) {
        Object objB = this.f18626q.b(d0Var.c());
        boolean zG = this.f18627r.f18641c.g();
        f0 f0Var = this.f18624o;
        if (zG) {
            f0Var.e(this.f18626q.b(d0Var.a()), objB, (InterfaceC1652A) this.f18625p.b(d0Var));
        } else {
            f0Var.f(objB, (InterfaceC1652A) this.f18625p.b(d0Var));
        }
    }

    @Override // f0.Z0
    public final Object getValue() {
        b(this.f18627r.f18641c.f());
        return this.f18624o.f18671v.getValue();
    }
}
