package w;

import f0.C0879c;
import f0.C0894j0;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f18639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0894j0 f18640b = C0879c.t(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f18641c;

    public c0(j0 j0Var, o0 o0Var, String str) {
        this.f18641c = j0Var;
        this.f18639a = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0 a(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) {
        C0894j0 c0894j0 = this.f18640b;
        b0 b0Var = (b0) c0894j0.getValue();
        j0 j0Var = this.f18641c;
        if (b0Var == null) {
            Object objB = interfaceC1182c2.b(j0Var.c());
            Object objB2 = interfaceC1182c2.b(j0Var.c());
            o0 o0Var = this.f18639a;
            r rVar = (r) o0Var.f18722a.b(objB2);
            rVar.d();
            f0 f0Var = new f0(j0Var, objB, rVar, o0Var);
            b0Var = new b0(this, f0Var, interfaceC1182c, interfaceC1182c2);
            c0894j0.setValue(b0Var);
            j0Var.f18695i.add(f0Var);
        }
        b0Var.f18626q = (AbstractC1210l) interfaceC1182c2;
        b0Var.f18625p = (AbstractC1210l) interfaceC1182c;
        b0Var.b(j0Var.f());
        return b0Var;
    }
}
