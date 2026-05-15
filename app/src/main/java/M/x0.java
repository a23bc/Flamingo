package M;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d5.EnumC0830a;
import f0.InterfaceC0878b0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import z.C2054o0;
import z.Z0;
import z.q1;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f4733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f4734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f4735q;

    public x0(InterfaceC1765B interfaceC1765B, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02) {
        this.f4733o = interfaceC1765B;
        this.f4734p = interfaceC0878b0;
        this.f4735q = interfaceC0878b02;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(K0.y yVar, c5.d dVar) {
        w0 w0Var = new w0(this.f4733o, this.f4734p, null);
        t0 t0Var = new t0(this.f4735q, 1);
        z.K k7 = q1.f20945a;
        Object objH = AbstractC1767D.h(new Z0(yVar, w0Var, t0Var, new C2054o0(yVar), null), dVar);
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        Y4.o oVar = Y4.o.f8736a;
        if (objH != enumC0830a) {
            objH = oVar;
        }
        return objH == enumC0830a ? objH : oVar;
    }
}
