package d0;

import K0.C0236d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import s5.InterfaceC1438c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0 f10914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f10915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f10918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f10919u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(n0 n0Var, String str, String str2, String str3, InterfaceC1180a interfaceC1180a, InterfaceC1765B interfaceC1765B) {
        super(1);
        this.f10914p = n0Var;
        this.f10915q = str;
        this.f10916r = str2;
        this.f10917s = str3;
        this.f10918t = interfaceC1180a;
        this.f10919u = interfaceC1765B;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y0.j jVar = (Y0.j) obj;
        E0.K k7 = new E0.K(20, this.f10918t);
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        jVar.i(Y0.i.f8467u, new Y0.a(this.f10915q, k7));
        n0 n0Var = this.f10914p;
        o0 o0Var = (o0) n0Var.f11048a.f11061f.getValue();
        o0 o0Var2 = o0.f11054q;
        InterfaceC1765B interfaceC1765B = this.f10919u;
        if (o0Var == o0Var2) {
            jVar.i(Y0.i.f8465s, new Y0.a(this.f10916r, new J5.j(n0Var, interfaceC1765B, n0Var, 2)));
        } else if (n0Var.f11048a.d().f10847a.containsKey(o0Var2)) {
            jVar.i(Y0.i.f8466t, new Y0.a(this.f10917s, new C0236d(n0Var, 8, interfaceC1765B)));
        }
        return Y4.o.f8736a;
    }
}
