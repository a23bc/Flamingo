package d0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import s5.InterfaceC1438c;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f11165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D0 f11166q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(boolean z6, D0 d02) {
        super(1);
        this.f11165p = z6;
        this.f11166q = d02;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y0.j jVar = (Y0.j) obj;
        boolean z6 = this.f11165p;
        Y4.o oVar = Y4.o.f8736a;
        if (!z6) {
            InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
            jVar.i(Y0.t.f8537i, oVar);
        }
        w0 w0Var = new w0(this.f11166q, 0);
        InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
        jVar.i(Y0.i.h, new Y0.a(null, w0Var));
        return oVar;
    }
}
